package may31;
//Title : freewifi_3
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class freewifi_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException ,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		
		double lat = 37.3860521; double lng = 127.1214038;//위도와 경도를 따로 지정하여 double 값으로 변수 선언
		
		String QueryTxt;
		QueryTxt = String.format("select * from freewifi where SQRT(POWER( latitude-%f.2) + POWER(longitude-%f.2)) = "//위도와 경도를 각각 계산하여, 
				+ "(select MIN(SQRT(POWER(latitude-%f.2)+POWER(POWER)(longitude-%f.2)))from freewifi);",lat,lng,lat,lng);//나온 결과값을 기준으로 
		QueryTxt = "select * from freewifi";//freewifi테이블에서 전체 정보를 조회
		//QueryTxt = "select * from freewifi where service_provider = 'SKT'"; //서비스 제공자가 skt인 항목에 대해서 모두 조회
		//QueryTxt = "select * from freewifi where inst_country = '수원시'"; //소재지가 수원시인 항목에 대해서 모두 조회
		
		ResultSet rset = stmt.executeQuery(QueryTxt);//결과 값을 변수로 하여 저장
		int iCnt=0;//0번째 항목부터 시작
		while(rset.next()) {//이미 mysql을 통해서 데이터가 나누어져있기 때문에 각 필드값을 기준으로 받아옴
			System.out.printf("*(%d)********************************************************\n",iCnt++);
			System.out.printf("설치장소명	: %s\n",rset.getString(1));
			System.out.printf("설치장소상세	: %s\n",rset.getString(2));
			System.out.printf("설치시도명	: %s\n",rset.getString(3));
			System.out.printf("설치시군구명 : %s\n",rset.getString(4));
			System.out.printf("설치시설구분 : %s\n",rset.getString(5));
			System.out.printf("서비스제공사명: %s\n",rset.getString(6));
			System.out.printf("와이파이SSID : %s\n",rset.getString(7));
			System.out.printf("설치년월 : %s\n",rset.getString(8));
			System.out.printf("소재지도로명주소 : %s\n",rset.getString(9));
			System.out.printf("소재지지번주소 : %s\n",rset.getString(10));
			System.out.printf("관리기관명	: %s\n",rset.getString(11));
			System.out.printf("관리기관전화번호  : %s\n",rset.getString(12));
			System.out.printf("위도 : %s\n",rset.getString(13));
			System.out.printf("경도 : %s\n",rset.getString(14));
			System.out.printf("데이터기준일자	   : %s\n",rset.getString(15));
			System.out.printf("****************************************************************\n");
		}
		rset.close();
		stmt.close();
		conn.close();
	}

}
