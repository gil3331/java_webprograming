package may31;
//Title : freewifi_2
//Date : 2019.05.31
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class freewifi_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException ,IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.102/kopoctc?serverTimezone=UTC","root","asdf1234");
		Statement stmt = conn.createStatement();
		
		File f = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����.txt");//�Ʊ�ʹ� �ٸ��� �̹��� ������ ���� ���� ������ �о�ͼ� �����ͺ��̽��� ����
		BufferedReader br = new BufferedReader(new FileReader(f));//�������ϸ����� ���ؼ� ������ ����
		
		String readtxt;//string ������ �̸� ������ ����
		
		if((readtxt = br.readLine())==null) {//�д� ������ 1�� ������ 
			System.out.println("�� �����Դϴ�.");//�� �����Դϴٸ� ���
			return;
		}
		String[] field_name = readtxt.split("\t");//�д� ���� ���ؼ��� tab�� �������� �з�
		
		int LineCnt = 1;//�������� 1���� ����
		while((readtxt = br.readLine())!=null) {//�д� ������ �ִٸ�
		String[] field = readtxt.split("\t");//tab�� �������� �з��ϰ�,
		String QueryTxt;//�����ؽ�Ʈ��� ������ �����Ѵ�.
		
		QueryTxt = String.format("insert into freewifi ("//freewifi�� ���̺� freewifi_1���� ���� �Ӽ����� ��ġ�ϰ� ������ ���,
				+"inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
				+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
				+ "manage_office, manage_office_phone, latitude, longitude, write_date)"//insert���� �ۼ�
				+"values("//�ش� ���� ���� string������ ������,
				+ "'%s','%s','%s','%s','%s',"
				+ "'%s','%s','%s','%s','%s',"
				+ "'%s','%s','%s','%s','%s');",
				field[0],field[1],field[2],field[3],field[4],//split���� ������ �з������� field ������ �޴´�.
				field[5],field[6],field[7],field[8],field[9],
				field[10],field[11],field[12],field[13],field[14]);
		stmt.execute(QueryTxt);//�ش� ������ ����
		System.out.printf("%d��° �׸� Insert OK [%s]\n", LineCnt, QueryTxt);//�޾ƿ� ������ ���� 1������ ���������� insert�Ͽ� ���̺��� ä���.
		
		LineCnt++;//�ϳ� ���� ������, �� ���� �׸����� �Ѿ
		
		}
		br.close();
		
		stmt.close();
		conn.close();
	}

}
