package ������Ʈ1;

import java.util.Scanner;

public class ����0999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int x=in.nextInt();
		int y=x/100;
		//���� �ڸ� ����-���ڸ� ������ 100�� ���� ù�ڸ� ���� �� ���� �ڸ� ��
		int z=(x-y*100)/10;
		//���� �ڸ� ����-���ڸ� ������ �����(������� ��ü���� 100���� ���� ���� 100�� ���Ͽ� ���� �ڸ��� �Ұ�)�� ����, �� �� ���� 10���� ���� ���� �� ���� �ڸ� ��
		int a=x%10;
		//���� �ڸ� ����-��ü���� 10���� ��������, ������ ù�ڸ��� �������� �� ���� �ڸ� ��
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.printf("�� �ڸ����� �� : %d",y+z+a);
		in.close();
	}

}
