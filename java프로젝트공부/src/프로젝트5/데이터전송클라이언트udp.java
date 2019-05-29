package 프로젝트5;
import java.net.*;
import java.io.*;
public class 데이터전송클라이언트udp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket ds = new DatagramSocket();//소켓의 초기화
			InetAddress ia = InetAddress.getByName("192.168.23.92");//localhost
			String sendMSG = "가나다";//수신자에게 보내고자 하는 내용
			byte[] bf = sendMSG.getBytes();//상위의 내용을 버퍼단위로 보낸다.
			DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);//pipe socket
			//ia에 들어있는 IP주소와 9999라는 포트 정보를 통해 버퍼단위로 내용을 보낸다.
			
			ds.send(dp);
		}catch(Exception e) {
			System.out.println(e);}
		
	}

}
