package ������Ʈ2;

import java.util.Scanner;

public class �⵵�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in =new Scanner(System.in);
		int year = 0, day= 0 ;
		System.out.print("���ϴ� ������ �Է��ϼ��� : ");
		year = in.nextInt();
		System.out.printf("%d���� ������ �����ϴ�.\n",year);
		if((year%4==0&&year%100!=0)||year%400==0){
			day = 29;
		}else {
			day=28;
		}	
		System.out.println("1��:31��");
		System.out.printf("2��:%d��\n",day);
		System.out.println("3��:31��");
		System.out.println("4��:30��");
		System.out.println("5��:31��");
		System.out.println("6��:31��");
		System.out.println("7��:30��");
		System.out.println("8��:31��");
		System.out.println("9��:30��");
		System.out.println("10��:31��");
		System.out.println("11��:30��");
		System.out.println("12��:31��");
		in.close();		
		}
}


