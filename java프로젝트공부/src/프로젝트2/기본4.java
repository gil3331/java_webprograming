package ������Ʈ2;

import java.util.Scanner;

public class �⺻4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90�̻��̸� A,90�̻��� �ƴ� ��, 80�̻��̸� B, �׷��� ���� ��, 70�̻��̸� C �� �Ʒ��� D �ƴϸ�, F�� ��� ����
		Scanner in =new Scanner(System.in);
		int data;
		System.out.print("������ �Է����ּ��� : ");
		data = in.nextInt();
		if(data>=90) {
			System.out.println("A �Դϴ�.");
		}else if (data>=80){
				System.out.println("B�Դϴ�.");
		}else if (data>=70){
				System.out.println("C�Դϴ�.");
		}else if (data>=60){
				System.out.println("D�Դϴ�.");
		}else if (data<60){
				System.out.println("F�Դϴ�.");
		}
		in.close();	
	}


}
