package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_2
//Date : 2019.05.31
//Author : �̱���
//Comment : .....
public class examtable_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		
			Statement stmt = conn.createStatement();
			
			stmt.execute("delete from examtable1;");//���̺� ������� drop �ƴ�?!
			//stmt.execute("drop from examtable1;");//drop ������
			stmt.close();
			conn.close();
	}

}
