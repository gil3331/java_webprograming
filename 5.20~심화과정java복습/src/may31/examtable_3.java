package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_3
//Date : 2019.05.31
//Author : �̱���
//Comment : .....
public class examtable_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ȿ��', 209901, 95, 100, 95);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����', 209902, 95, 95, 95);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����', 209903, 100, 100, 100);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('����', 209904, 100, 95, 90);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('�ҿ�', 209905, 80, 100, 70);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ť��', 209906, 100, 100, 70);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			stmt.execute("insert into examtable1 (name, studentid, kor, eng, mat) values ('ȭ��', 209907, 70, 70, 70);");//Ŭ���� �Ӽ���Ŀ� ���� �ش� ������ insert
			
			stmt.close();
			conn.close();
	}

}
