package ������Ʈ2;

import java.util.Scanner;

public class �⺻5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch�� ���� ���� ���ϱ�
		Scanner in =new Scanner(System.in);
		int rank;
		System.out.print("������ �Է����ּ��� : ");
		rank = in.nextInt();
		switch(rank) {
		//switch�� ��ũ�� �����Ѵ�.
		case 1 :
			System.out.println("1���Դϴ�.");
			//��ũ�� 1�� ��� "1���Դϴ�."�� ���
			break;//case1�� ����
		case 2 : 
			System.out.println("2���Դϴ�.");
			//��ũ�� 2�� ��� "2���Դϴ�."�� ���
			break;
		case 3 : 
			System.out.println("3���Դϴ�.");
			//��ũ�� 3�� ��� "3���Դϴ�."�� ���
			break;
		default : 
			System.out.println("Ż���Դϴ�.");
			//case1,2,3�� ��� �ƴ� ��쿡�� "Ż���Դϴ�."�� ���
		}
		in.close();
	}

}
