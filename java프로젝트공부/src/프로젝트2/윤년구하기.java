package ������Ʈ2;

import java.util.Scanner;

public class ���ⱸ�ϱ� {
    //* �Ʒ� �� ���� �� �ϳ��� �����ϸ� ����
	//year�� 4�� ������ ��������, 
	//100���δ� ������ �������� ����
	//year�� 400���� ������ ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int year;
		System.out.print("���ϴ� �⵵�� �Է��ϼ��� : ");
		year = in.nextInt();
		//year�� �Է��ϰ� �ϰ�,
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.print("���� �Դϴ�.");
		}//���Ŀ� �ϳ��� �´� ��쿡�� �������� ����ϰ�,
		else {
			System.out.print("��� �Դϴ�.");
		}//�ƴ� ��쿡�� ������� �����.
		in.close();
	}
}

