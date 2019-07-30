package may31;
//Title : freewifi_1
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class freewifi_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		
		stmt.execute("create table freewifi(inst_place varchar(50), inst_place_detail varchar(200), "//freewifi 테이블을 생성한 뒤, 각 속성값에 대한
				+ "inst_city varchar(50), inst_country varchar(50), inst_place_flag varchar(50),"//varchar의 바이트 값을 괄호에 맞게 설정하여 생성
				+ "service_provider varchar(50), wifi_ssid varchar(100), inst_date varchar(50),"
				+ "place_addr_road varchar(200), place_addr_land varchar(200), manage_office varchar(50),"
				+ "manage_office_phone varchar(50), latitude double, longitude double,"
				+ "write_date date"
				+ ") DEFAULT CHARSET=utf8;"//따로 지정하지 않는다면, 글자 양식은 utf8로 지정하여 생성
				);
		stmt.close();
		conn.close();	
		
	}

}







