package ������Ʈ2;

import java.util.Scanner;

public class �⺻6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch�� ���� �������
		Scanner in =new Scanner(System.in);
		int point;
		System.out.print("������ �Է����ּ��� : ");
		point = in.nextInt();
		switch(point/10) {
		//if�� �ʹ� �ٸ��� ������ ���� �ڸ��θ� �ľ��ϱ� ������ 10�� ���� ������ ����Ͽ� case�� ����
		case 10 :
		case 9 :
			//A�� 90~100������ �����̹Ƿ�, 10�� ���� ���� 9�� 10�� case�� �Ѵ�.
			System.out.println("A�Դϴ�.");
			break;
		case 8 : //A�� �ƴ� ��� B�� �Ǳ� ���ؼ� ���� �ڸ��� 8�� ���;���
			System.out.println("B�Դϴ�.");
			break;
		case 7 : //B�� �ƴ� ��� C�� �Ǳ� ���ؼ� ���� �ڸ��� 7�� ���;���
			System.out.println("C�Դϴ�.");
			break;
		case 6: //C�� �ƴ� ��� D�� �Ƿ��� 6�� ������ �ǰ�,
			System.out.println("D�Դϴ�.");
			break;
		default : //�� ���� ������ Ż������ ó��
			System.out.println("Ż���Դϴ�.");
		}
		in.close();
	}

}
