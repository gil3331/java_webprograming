package ������Ʈ1;

import java.util.Scanner;

public class �⺻6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int inputData;
		System.out.print("������ �Է��ϼ��� : ");
		inputData=in.nextInt();
		System.out.printf("�Է��Ͻż��� %s �Դϴ�.\n", (inputData%2==0)? "¦��":"Ȧ��");
		//%2�� ���ؼ� �������� ������ ���� 0�� ��츦 ¦��, 1�� ��츦 Ȧ���� �Ͽ� ����
		in.close();
	}

}
