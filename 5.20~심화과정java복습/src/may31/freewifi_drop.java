package may31;
//Title : freewifi_drop
//Date : 2019.05.31
//Author : 이길준
//Comment : .....
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class freewifi_drop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
	Statement stmt = conn.createStatement();
	
	stmt.execute("drop table freewifi;"	);//그냥 freewifi 테이블 날림(혹은 삭제)
	stmt.close();
	conn.close();	
	
	}

}
