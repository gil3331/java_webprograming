package ������Ʈ1;

import java.util.Scanner;

public class �ҹ��ڴ빮�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		char c;
		char d;
		c=in.nextLine().charAt(0);
		d=in.nextLine().charAt(0);
		c = (char) (c - 32);
		//���ĺ� - 32= �ҹ��ڸ� �빮�ڷ� �ٲ�
		System.out.println("�빮�ڴ� "+ c);
		d=(char) (d + 32);
		//���ĺ� + 32= �빮�ڸ� �ҹ��ڷ� �ٱ�
		System.out.println("�ҹ��ڴ� "+ d);
		in.close();
		
	}

}
