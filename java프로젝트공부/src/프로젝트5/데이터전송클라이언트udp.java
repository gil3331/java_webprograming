package ������Ʈ5;
import java.net.*;
import java.io.*;
public class ����������Ŭ���̾�Ʈudp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket ds = new DatagramSocket();//������ �ʱ�ȭ
			InetAddress ia = InetAddress.getByName("192.168.23.92");//localhost
			String sendMSG = "������";//�����ڿ��� �������� �ϴ� ����
			byte[] bf = sendMSG.getBytes();//������ ������ ���۴����� ������.
			DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);//pipe socket
			//ia�� ����ִ� IP�ּҿ� 9999��� ��Ʈ ������ ���� ���۴����� ������ ������.
			
			ds.send(dp);
		}catch(Exception e) {
			System.out.println(e);}
		
	}

}
