package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ����DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			String student_name;
			double english = 0;
			double math = 0;
			double totalscore = 0;
			double average = 0;
			int count = 0;
			double English_average_score=0;
			double Math_average_score = 0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/studentindex?useSSL=false&serverTimezone=UTC", "root", "861130");
			Statement stmt = conn.createStatement();// conn�� ���� ������(Ȥ�� ���̺� ���� ��ü��) �������Ѷ�

			while (true) {
				try {
					System.out.println("�̸�(����� end) : ");
					student_name = in.nextLine();
					if (student_name.equals("end")) {
						break;
					}

					System.out.println("���� : ");
					english = in.nextDouble();
					System.out.println("���� : ");
					math = in.nextDouble();
					totalscore = english + math;
					average = totalscore / 2;

					stmt.execute("INSERT INTO `student_score` (`name`, `english`, `math`, `totalscore`,`average`)"
							+ "VALUES ('" + student_name + "', '" + english + "', '" + math + "', '" + totalscore
							+ "','" + average + "')");
				} catch (Exception e) {
					e.printStackTrace();
				}
				in.nextLine();
			}
			System.out.println("�̸�  ����   ����    ����    ���");
			ResultSet rset = stmt.executeQuery("select * from student_score");// ���� ������ �ҷ��� student_table�� ��ȸ �Ͻÿ�.
			while (rset.next()) {// ������ ���� �״�� ����, �� �ϳ��� �ڷḸ �޾ƿ��⶧���� �� �ޱ� ���Ͽ� while �ݺ����� ���
				System.out.println(rset.getString(1) + "," + // id�� int������ �޾ƿ���,
						rset.getDouble(2) + "," + // �̸��� String������
						rset.getDouble(3) + "," + // ��������� int������
						rset.getDouble(4) + "," + rset.getDouble(5));// �ּҸ� String������ �޾Ƽ� ����Ͻÿ�.
				English_average_score = (English_average_score + rset.getInt(2));
				Math_average_score = (Math_average_score + rset.getInt(3));
				count++;
			}
			System.out.println("���� ���");
			System.out.printf("���� : %.1f\n", English_average_score / count);
			System.out.printf("���� : %.1f", Math_average_score / count);
			rset.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
