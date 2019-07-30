package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_1
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
public class examtable_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {//class를 찾지 못할 경우, sql에 문제가 발생할 경우 클래스 탈출
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql드라이버 소환
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");//해당 주소에 맞는 mysql에 접속
		
			Statement stmt = conn.createStatement();//상태 조회
			
			stmt.execute("create table examtable1("+//examtable1 테이블을 생성
			"name varchar(20),"+//이름에는 바차로 20
			"studentid int not null primary key,"+//학생번호에는 pk를 지정하며 not null을 선정
			"kor int,"+//국어점수
			"eng int,"+//영어점수
			"mat int)"+//수학점수
			"DEFAULT CHARSET = utf8;");//따로 지정 안한다면, 기본 글자 양식을 utf8로 지정
			
			stmt.close();//스테이트먼트 종료
			conn.close();//커넥션 종료
	}

}
