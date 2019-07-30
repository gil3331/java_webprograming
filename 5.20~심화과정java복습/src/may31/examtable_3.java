package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_3
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
public class examtable_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('효민', 209901, 95, 100, 95);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('보람', 209902, 95, 95, 95);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('은정', 209903, 100, 100, 100);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('지연', 209904, 100, 95, 90);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('소연', 209905, 80, 100, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('큐리', 209906, 100, 100, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('화영', 209907, 70, 70, 70);");//클래스 속성양식에 맞춰 해당 정보를 insert
			
			stmt.close();
			conn.close();
	}

}
