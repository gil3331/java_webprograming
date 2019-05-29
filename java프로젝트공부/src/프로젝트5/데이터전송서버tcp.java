package 프로젝트5;

import java.net.*;
import java.io.*;

public class 데이터전송서버tcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s1 = null;//server(수신자)에 대한 파이프로 socket(파이프)을 지정
		Socket s2;//발신자에 대한 socket(파이프)로 지정
		OutputStream os1;
		DataOutputStream os2;
		InputStream is1;
		DataInputStream is2;

		try {
			s1 = new ServerSocket(5433);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("클라이언트 대기중 ....");//컴파일 함과 동시에 클라이언트를 대기한다는 출력문을 나한테 출력
				s2 = s1.accept();//발신자에게서 온 정보를 받아들임
				System.out.println("클라이언트 전송 성공!");//전송 성공임을 나한테 출력
				os1 = s2.getOutputStream();//s2(발신자)에게서 받은 내용을 os1에 기록하고,
				os2 = new DataOutputStream(os1);//os2에서 os1의 내용을 초기화 하여 받는다.
				os2.writeUTF("Welcome to connect to TCP Server!(server->client)");//UTF형식으로 작성한 괄호 안의 내용을 발신자에게 보냄
				is1 = s2.getInputStream();//s2(발신자의 내용)를 is1으로 받음.
				is2 = new DataInputStream(is1);//is1값을 is2로 받아 초기화함.
				String st = new String(is2.readUTF());//받은 is2를 UTF형식으로 읽음.
				System.out.println(st);//st를 출력함.

				is1.close();
				is2.close();
				os1.close();
				os2.close();
				s2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
