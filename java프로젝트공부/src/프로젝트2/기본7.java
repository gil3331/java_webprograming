package ������Ʈ2;

import java.util.Scanner;

public class �⺻7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch�� ���ؼ� ���� ������
		Scanner in =new Scanner(System.in);
		String inputdata;
		System.out.print("�ܾ �Է����ּ��� : ");
		inputdata = in.next();//inputdata�� ���ؼ� �ܾ �Է��ϰ� ��
		switch(inputdata) {
		case "apple" :
			System.out.println("�˻���� :����Դϴ�.");
			//apple�� ������, ������ �ǹ̰� ������ ��.
			break;
		case "���" : 
			System.out.println("�˻���� :apple�Դϴ�.");
			//����� ������, apple��� �ǹ̰� ������ ��.
			break;
		case "police" : 
			System.out.println("�˻���� :�����Դϴ�.");
			//police�� ������, �����̶�� �ǹ̰� ������ ��.
			break;
		case "����" : 
			System.out.println("�˻���� :police�Դϴ�.");
			//������ ������, police��� �ǹ̰� ������ ��.
			break;
		case "effort" : 
			System.out.println("�˻���� :����Դϴ�.");
			//effort�� ������, ����̶�� �ǹ̰� ������ ��.
			break;
		case "���" : 
			System.out.println("�˻���� :effort�Դϴ�.");
			//����� ������, effort��� �ǹ̰� ������ ��.
			break;
		default : //������ �Է°��� ������ �������� ������ ��µǰ� ��. 
			System.out.println("�˻���� : ��");
		}
		in.close();
	}

}
