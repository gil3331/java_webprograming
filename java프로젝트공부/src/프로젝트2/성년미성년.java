package ������Ʈ2;

import java.util.Scanner;

public class ����̼��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int residentNumber,age;
		System.out.print("�ֹε�Ϲ�ȣ ���ڸ��� �Է����ּ��� : ");
		residentNumber = in.nextInt();
		//�ֹι�ȣ�� �Է��ϰ� ��.
		age = residentNumber/10000;
		//���̴� �ֹι�ȣ �����ڸ��� ���� ���ڸ��̱� ������ 10000�� ���� ������ ǥ����.
		int date = residentNumber%100;
		System.out.println("���ڴ� : "+date);
		//�ֹι�ȣ�� ��¥�� %100���� ���� ������ �� ���ڸ��� �����.
        int month = ((residentNumber%10000)-date)/100;
		System.out.println("���� : "+month);
		//�ֹι�ȣ�� ���� �ֹι�ȣ���� �� ���ڸ��� �� ��, ����Ʈ�� �����, õ �����̱⿡ 100�� ���� ���� ����, ���ڸ��� ��°��� ����
		if(age<=19) {
			age = 2019 - (age + 2000);//2000���
			//2000����� ���� ���ڸ��� 00�̱⶧����, 2000�� ���ؼ� 2019�� ���ָ� ���̰� ���´�.
		}else {
			age = 2019 - (age + 1900);//1900���
			//1900����� ���� 90��� ����Ǳ� ������, �ϴ� 1900�� ���ϰ�, �ű⿡ 2019�� ���� ���̸� �����Ѵ�.
		}
		if (month>3 || (month==3&&date>7)) //������ 3�� 7�� �̱� ������ 3���� �Ѿ� ������ ��쳪, 3���� ��쿡 ��¥�� 7 �ʰ��� ��츦 ���ؼ� �� ���̸� ������if�� ����
			{
			age = age-1;
		}
		System.out.println("���̴� "+age);
		//�׷��� ���� ��� ���� 19�� �̻��� ���� ��������, �ƴ� ���� �̼������� �����Ͽ� �����.
		if(age>=19) {
			System.out.println("���� �Դϴ�.");
		}else {
		    System.out.println("�̼��� �Դϴ�.");
		}
		in.close();	
	}

}
