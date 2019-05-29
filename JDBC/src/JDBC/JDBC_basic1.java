package JDBC;
import java.sql.*;
import java.util.Scanner;

public class JDBC_basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String student_id,student_name,student_birth,student_address;

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentindex?useSSL=false&serverTimezone=UTC","root","861130");
		//localhost�� �ִ� studentindex�� �����϶�(root-ID/861130-PW)
		//INSERT INTO `student_table` (`number`, `name`, `birth`, `address`) VALUES ('1925341007', '�ڼ���', '840207', '�����');
		
		Statement stmt = conn.createStatement();//conn�� ���� ������(Ȥ�� ���̺� ���� ��ü��) �������Ѷ�
		
		System.out.println("�й� : ");
		student_id=in.nextLine();
		System.out.println("�̸� : ");
		student_name=in.nextLine();
		System.out.println("������� : ");
		student_birth=in.nextLine();
		System.out.println("�ּ� : ");
		student_address=in.nextLine();
		
		stmt.execute("INSERT INTO `student_table` (`number`, `name`, `birth`, `address`)"+ "VALUES ('"+student_id+"', '"+student_name+"', '"+student_birth+"', '"+student_address+"')");
		//student_table�� �ִ� �׸���� values ���� ���� �����ϴ� ó���� �϶�.
		ResultSet rset = stmt.executeQuery("select * from student_table");//���� ������ �ҷ��� student_table�� ��ȸ �Ͻÿ�.
		while(rset.next()) {//������ ���� �״�� ����, �� �ϳ��� �ڷḸ �޾ƿ��⶧���� �� �ޱ� ���Ͽ� while �ݺ����� ���
			System.out.println(rset.getInt(1)+","+//id�� int������ �޾ƿ���,
								rset.getString(2)+","+//�̸��� String������
								rset.getInt(3)+","+//��������� int������
								rset.getString(4));//�ּҸ� String������ �޾Ƽ� ����Ͻÿ�.
		}
		rset.close();
		stmt.close();
		conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
