package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_4
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
public class examtable_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable;");//쿼리문을 통해서 examtable의 정보를 모두 읽음
		
		System.out.printf("  이름	 학번	국어	영어	수학\n");//상위의 탭부분을 print를 통해서 따로 출력
		while(rset.next()) {//select로 받아온 정보를 아래의 print양식에 맞춰서 출력
			System.out.printf("%4s	%6d	%3d	%3d	%3d	\n", rset.getString(1), rset.getInt(2), rset.getInt(3),rset.getInt(4),rset.getInt(5));// 필드값으로 나눠서 getString으로 받아옴
		}
			rset.close();
			stmt.close();
			conn.close();
	}

}
