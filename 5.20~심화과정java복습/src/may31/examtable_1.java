package may31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Title : examtable_1
//Date : 2019.05.31
//Author : �̱���
//Comment : .....
public class examtable_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {//class�� ã�� ���� ���, sql�� ������ �߻��� ��� Ŭ���� Ż��
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql����̹� ��ȯ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");//�ش� �ּҿ� �´� mysql�� ����
		
			Statement stmt = conn.createStatement();//���� ��ȸ
			
			stmt.execute("create table examtable1("+//examtable1 ���̺��� ����
			"name varchar(20),"+//�̸����� ������ 20
			"studentid int not null primary key,"+//�л���ȣ���� pk�� �����ϸ� not null�� ����
			"kor int,"+//��������
			"eng int,"+//��������
			"mat int)"+//��������
			"DEFAULT CHARSET = utf8;");//���� ���� ���Ѵٸ�, �⺻ ���� ����� utf8�� ����
			
			stmt.close();//������Ʈ��Ʈ ����
			conn.close();//Ŀ�ؼ� ����
	}

}
