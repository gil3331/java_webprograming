package may30;
//Title : JDBC �⺻���α׷�
//Date : 2019.05.30
//Author : �̱���
//Comment : .....
import java.sql.Connection;//java���� mysql�� �������ֱ� ���ؼ� ���̺귯���� mysql-connector-java.jar�� import ����� �ش� connection�� import�� �� �ִ�.
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {//Ŭ������ ã�� ���ϴ� ��� �ش� Ŭ������ Ż��, sql�� �̻��� ������ �ش� Ŭ������ Ż��
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql�� �ش�Ǵ� ����̹��� Ŭ������ ������ ��(��� cj�� connector�� ���� ���� ���� �߰��� �ۼ��ؾ��ϴ� ����)
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");//�ش� ������ �����ͺ��̽� ��(������ Ÿ�������� ������ �߻��Ͽ� �߰��� �ۼ�), ���� ���̵�, �н����� 
		Statement stmt = conn.createStatement();//������Ʈ��Ʈ�� ����(�ݵ�� �ܿ���)
		ResultSet rset = stmt.executeQuery("show databases;");//����ϰ��� �ϴ� ���� ������ �ۼ�
		
		while(rset.next()) {//�ݺ������� ÷���� ������ Ȯ��
			System.out.println("�� : "+rset.getString(1));//string������ ���� ó���� �ش��ϴ� ���� �ҷ���(��������� �����ͺ��̽� ���̴�.)
		}
		rset.close();//���� �ߴ� ������ �ݵ�� �� �ݾ���� �Ѵ�.
		stmt.close();//���� �ߴ� ������ �ݵ�� �� �ݾ���� �Ѵ�.
		conn.close();//���� �ߴ� ������ �ݵ�� �� �ݾ���� �Ѵ�.
	}

}
