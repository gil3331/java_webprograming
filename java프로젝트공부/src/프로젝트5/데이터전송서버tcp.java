package ������Ʈ5;

import java.net.*;
import java.io.*;

public class ���������ۼ���tcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s1 = null;//server(������)�� ���� �������� socket(������)�� ����
		Socket s2;//�߽��ڿ� ���� socket(������)�� ����
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
				System.out.println("Ŭ���̾�Ʈ ����� ....");//������ �԰� ���ÿ� Ŭ���̾�Ʈ�� ����Ѵٴ� ��¹��� ������ ���
				s2 = s1.accept();//�߽��ڿ��Լ� �� ������ �޾Ƶ���
				System.out.println("Ŭ���̾�Ʈ ���� ����!");//���� �������� ������ ���
				os1 = s2.getOutputStream();//s2(�߽���)���Լ� ���� ������ os1�� ����ϰ�,
				os2 = new DataOutputStream(os1);//os2���� os1�� ������ �ʱ�ȭ �Ͽ� �޴´�.
				os2.writeUTF("Welcome to connect to TCP Server!(server->client)");//UTF�������� �ۼ��� ��ȣ ���� ������ �߽��ڿ��� ����
				is1 = s2.getInputStream();//s2(�߽����� ����)�� is1���� ����.
				is2 = new DataInputStream(is1);//is1���� is2�� �޾� �ʱ�ȭ��.
				String st = new String(is2.readUTF());//���� is2�� UTF�������� ����.
				System.out.println(st);//st�� �����.

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
