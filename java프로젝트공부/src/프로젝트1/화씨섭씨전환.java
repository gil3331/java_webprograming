package ������Ʈ1;

import java.util.Scanner;

public class ȭ��������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("ȭ���µ��� : ");
		//�µ��� �⺻������ �Ҽ����� ǥ�������� �������̸� (float)�̳�, x���� f�� ���� �Ҽ������� ǥ��<(float)x��=x��f>
		float Fahrenheit = in.nextFloat();
		float Celsius = (float)5/9*(Fahrenheit-32);
		//ȭ���µ����� �����µ� ����=5/9*(ȭ���µ�-32)
		//�����µ� ���Ŀ� �����Ⱑ �־� �Ҽ����� ���ü� �ֱ⿡ (float)���� ��ȯ���� �Ҽ����� �������ش�.
		System.out.printf("ȭ���µ� %.1f�� �����µ� %.1f�Դϴ�.",(float)Fahrenheit, (float)Celsius);
		//�Ҽ����� �ʹ� ��� ��µɼ� �־ %.1f�� �Ҽ��� ���ڸ����� ��µǰ� ������.
		in.close();
	}

}
