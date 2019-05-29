package 프로젝트5;
import java.net.*; 
import java.io.*; 
public class 데이터전송클라이언트TCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s1; //수신자와의 연결을 위한 파이프
			InputStream is1; 
			DataInputStream is2; 
			OutputStream os1; 
			DataOutputStream os2; 
			
			String sendString = "I love JEJUDO!(client -> server)";//내가 보내고자 하는 메세지
			 s1 = new Socket("192.168.23.93", 5432); //수신자의 구체적 IP(주소) 및 Port(호수)를 통해 접점(파이프)을 설정함
			 is1 = s1.getInputStream(); //수신자가 보내온 내용을 받고,
			 is2 = new DataInputStream(is1); //is1에 받은 내용을 is2로 최신화 하고,
			 String st = new String(is2.readUTF()); //is2에 받은 내용을 UTF타입으로 읽어서,
			 System.out.println(st); //String 형으로 출력해 본다.
			 os1 = s1.getOutputStream(); //수신자에게 보내기 위한 내용을 받고,
			 os2 = new DataOutputStream(os1); //os1에 받은 내용을 os2로 최신화 하여
			 os2.writeUTF("<전송 시작>" + sendString + "<전송 마침>"); //UTF로 하여 상위의 보내고자 하는 메세지를 보냄
			 
			 os2.close();
			 os1.close();
			 is2.close();
			 is2.close();
			 s1.close();
		}catch(ConnectException connExc) {
			System.err.println("서버 연결 실패");
		}catch(IOException e) {e.printStackTrace();}
	}

}
