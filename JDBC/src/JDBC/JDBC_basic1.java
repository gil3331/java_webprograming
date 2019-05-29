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
		//localhost에 있는 studentindex에 접속하라(root-ID/861130-PW)
		//INSERT INTO `student_table` (`number`, `name`, `birth`, `address`) VALUES ('1925341007', '박성우', '840207', '서울시');
		
		Statement stmt = conn.createStatement();//conn에 대한 내역서(혹은 테이블 내용 자체를) 생성시켜라
		
		System.out.println("학번 : ");
		student_id=in.nextLine();
		System.out.println("이름 : ");
		student_name=in.nextLine();
		System.out.println("생년월일 : ");
		student_birth=in.nextLine();
		System.out.println("주소 : ");
		student_address=in.nextLine();
		
		stmt.execute("INSERT INTO `student_table` (`number`, `name`, `birth`, `address`)"+ "VALUES ('"+student_id+"', '"+student_name+"', '"+student_birth+"', '"+student_address+"')");
		//student_table에 있는 항목들을 values 값에 맞춰 삽입하는 처리를 하라.
		ResultSet rset = stmt.executeQuery("select * from student_table");//상위 식으로 불러온 student_table을 조회 하시오.
		while(rset.next()) {//상위의 식을 그대로 쓰면, 단 하나의 자료만 받아오기때문에 다 받기 위하여 while 반복문을 사용
			System.out.println(rset.getInt(1)+","+//id를 int형으로 받아오고,
								rset.getString(2)+","+//이름을 String형으로
								rset.getInt(3)+","+//생년월일을 int형으로
								rset.getString(4));//주소를 String형으로 받아서 출력하시오.
		}
		rset.close();
		stmt.close();
		conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
