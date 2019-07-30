package may31;
//Title : freewifi_2
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class freewifi_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException ,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		
		File f = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터.txt");//아까와는 다르게 이번엔 파일을 통해 파일 정보를 읽어와서 데이터베이스에 삽입
		BufferedReader br = new BufferedReader(new FileReader(f));//버퍼파일리더를 통해서 파일을 읽음
		
		String readtxt;//string 값으로 미리 변수를 선언
		
		if((readtxt = br.readLine())==null) {//읽는 정보가 1도 없으면 
			System.out.println("빈 파일입니다.");//빈 파일입니다를 출력
			return;
		}
		String[] field_name = readtxt.split("\t");//읽는 값에 대해서는 tab을 기준으로 분류
		
		int LineCnt = 1;//시작점을 1부터 시작
		while((readtxt = br.readLine())!=null) {//읽는 정보가 있다면
		String[] field = readtxt.split("\t");//tab을 기준으로 분류하고,
		String QueryTxt;//쿼리텍스트라는 변수를 선언한다.
		
		QueryTxt = String.format("insert into freewifi ("//freewifi의 테이블에 freewifi_1에서 만든 속성값과 일치하게 순서를 잡고,
				+"inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
				+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
				+ "manage_office, manage_office_phone, latitude, longitude, write_date)"//insert문을 작성
				+"values("//해당 값을 전부 string형으로 받으며,
				+ "'%s','%s','%s','%s','%s',"
				+ "'%s','%s','%s','%s','%s',"
				+ "'%s','%s','%s','%s','%s');",
				field[0],field[1],field[2],field[3],field[4],//split으로 나눠진 분류정보를 field 값으로 받는다.
				field[5],field[6],field[7],field[8],field[9],
				field[10],field[11],field[12],field[13],field[14]);
		stmt.execute(QueryTxt);//해당 쿼리를 실행
		System.out.printf("%d번째 항목 Insert OK [%s]\n", LineCnt, QueryTxt);//받아온 정보를 토대로 1번부터 쿼리문으로 insert하여 테이블을 채운다.
		
		LineCnt++;//하나 끝날 때마다, 그 다음 항목으로 넘어감
		
		}
		br.close();
		
		stmt.close();
		conn.close();
	}

}
