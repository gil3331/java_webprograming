package ������Ʈ2;

import java.util.Scanner;

public class �⺻2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try{}�� ��쿡�� try�ȿ� ���� �Ŀ� ���ܻ����� �ִ°�� ��ȣ�� �ϰ�
		//catch(Exception e){} catch�ȿ� ���� �Ŀ� ������ �ִ� ���, ó���ϱ� ���� �ڵ带 ���´�.
		Scanner in =new Scanner(System.in);
		int number1, number2;
		float div;
		try {
			System.out.print("1. �Է��ϼ��� : ");
			number1=in.nextInt();
			System.out.print("2. �Է��ϼ��� : ");
			number2=in.nextInt();
			div = (float)number1/number2;
			System.out.printf("%d / %d = %f\n",number1,number2,div);
		}catch(Exception e) {
			System.out.print("�����Դϴ�.");
	}
	 in.close();
	}
}
