package ������Ʈ5;
import java.net.*; 
import java.io.*; 
public class ����������Ŭ���̾�ƮTCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s1; //�����ڿ��� ������ ���� ������
			InputStream is1; 
			DataInputStream is2; 
			OutputStream os1; 
			DataOutputStream os2; 
			
			String sendString = "I love JEJUDO!(client -> server)";//���� �������� �ϴ� �޼���
			 s1 = new Socket("192.168.23.93", 5432); //�������� ��ü�� IP(�ּ�) �� Port(ȣ��)�� ���� ����(������)�� ������
			 is1 = s1.getInputStream(); //�����ڰ� ������ ������ �ް�,
			 is2 = new DataInputStream(is1); //is1�� ���� ������ is2�� �ֽ�ȭ �ϰ�,
			 String st = new String(is2.readUTF()); //is2�� ���� ������ UTFŸ������ �о,
			 System.out.println(st); //String ������ ����� ����.
			 os1 = s1.getOutputStream(); //�����ڿ��� ������ ���� ������ �ް�,
			 os2 = new DataOutputStream(os1); //os1�� ���� ������ os2�� �ֽ�ȭ �Ͽ�
			 os2.writeUTF("<���� ����>" + sendString + "<���� ��ħ>"); //UTF�� �Ͽ� ������ �������� �ϴ� �޼����� ����
			 
			 os2.close();
			 os1.close();
			 is2.close();
			 is2.close();
			 s1.close();
		}catch(ConnectException connExc) {
			System.err.println("���� ���� ����");
		}catch(IOException e) {e.printStackTrace();}
	}

}
