package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_4
//Date : 2019.05.31
//Author : �̱���
//Comment : .....
public class examtable_4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable;");//�������� ���ؼ� examtable�� ������ ��� ����
		
		System.out.printf("  �̸�	 �й�	����	����	����\n");//������ �Ǻκ��� print�� ���ؼ� ���� ���
		while(rset.next()) {//select�� �޾ƿ� ������ �Ʒ��� print��Ŀ� ���缭 ���
			System.out.printf("%4s	%6d	%3d	%3d	%3d	\n", rset.getString(1), rset.getInt(2), rset.getInt(3),rset.getInt(4),rset.getInt(5));// �ʵ尪���� ������ getString���� �޾ƿ�
		}
			rset.close();
			stmt.close();
			conn.close();
	}

}
