package may30;
//Title : JDBC 기본프로그램
//Date : 2019.05.30
//Author : 이길준
//Comment : .....
import java.sql.Connection;//java에서 mysql을 연결해주기 위해서 라이브러리로 mysql-connector-java.jar을 import 해줘야 해당 connection을 import할 수 있다.
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {//클래스를 찾지 못하는 경우 해당 클래스를 탈출, sql에 이상이 있으면 해당 클래스를 탈출
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql에 해당되는 드라이버를 클래스로 가지고 옴(가운데 cj는 connector의 버전 업에 따라 추가로 작성해야하는 구문)
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");//해당 서버의 데이터베이스 명(서버의 타임존에서 에러가 발생하여 추가로 작성), 유저 아이디, 패스워드 
		Statement stmt = conn.createStatement();//스테이트먼트를 생성(반드시 외우자)
		ResultSet rset = stmt.executeQuery("show databases;");//사용하고자 하는 실행 쿼리를 작성
		
		while(rset.next()) {//반복문으로 첨부터 끝까지 확인
			System.out.println("값 : "+rset.getString(1));//string값으로 제일 처음에 해당하는 값을 불러옴(결론적으로 데이터베이스 명이다.)
		}
		rset.close();//오픈 했던 내용은 반드시 다 닫아줘야 한다.
		stmt.close();//오픈 했던 내용은 반드시 다 닫아줘야 한다.
		conn.close();//오픈 했던 내용은 반드시 다 닫아줘야 한다.
	}

}
