package ������Ʈ1;

import java.util.Scanner;

public class ��������if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c;
		System.out.print("���� �̼� ���� : ");
		a = in.nextInt();
		System.out.print("���� �̼� ���� : ");
		b = in.nextInt();
		System.out.print("�Ϲ� �̼� ���� : ");
		c = in.nextInt();
		if(a+b+c>=140&&a>=70&&((b>=30&&c>=30)||b+c>=80)) {
			System.out.print("���� ����");
			}else {
			System.out.print("���� �Ұ�");
			}
		
		
		in.close();
	}

}
