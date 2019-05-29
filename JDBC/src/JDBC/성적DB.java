package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class 성적DB {

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
			Statement stmt = conn.createStatement();// conn에 대한 내역서(혹은 테이블 내용 자체를) 생성시켜라

			while (true) {
				try {
					System.out.println("이름(종료는 end) : ");
					student_name = in.nextLine();
					if (student_name.equals("end")) {
						break;
					}

					System.out.println("영어 : ");
					english = in.nextDouble();
					System.out.println("수학 : ");
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
			System.out.println("이름  영어   수학    총점    평균");
			ResultSet rset = stmt.executeQuery("select * from student_score");// 상위 식으로 불러온 student_table을 조회 하시오.
			while (rset.next()) {// 상위의 식을 그대로 쓰면, 단 하나의 자료만 받아오기때문에 다 받기 위하여 while 반복문을 사용
				System.out.println(rset.getString(1) + "," + // id를 int형으로 받아오고,
						rset.getDouble(2) + "," + // 이름을 String형으로
						rset.getDouble(3) + "," + // 생년월일을 int형으로
						rset.getDouble(4) + "," + rset.getDouble(5));// 주소를 String형으로 받아서 출력하시오.
				English_average_score = (English_average_score + rset.getInt(2));
				Math_average_score = (Math_average_score + rset.getInt(3));
				count++;
			}
			System.out.println("과목 평균");
			System.out.printf("영어 : %.1f\n", English_average_score / count);
			System.out.printf("수학 : %.1f", Math_average_score / count);
			rset.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
