package ������Ʈ1;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c;
		String d;
		//d�� ��� ���ڸ� ����ϴ°� �ƴ�, "���� ���� �Ұ�"�� ���ڸ� ����ؾ� �ϱ� ������ String�� ���(int�� �����!!)
		System.out.print("���� �̼� ���� : ");
		a = in.nextInt();
		System.out.print("���� �̼� ���� : ");
		b = in.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		c = in.nextInt();
		d=((a+b+c>=140)&&(a>=70)&&(((b>=30)&&(c>=30))||(b+c>=80)))? "���� ����":"���� �Ұ�";
		System.out.print(d);
		
		in.close();
	}

}
