package ������Ʈ1;

import java.util.Scanner;

public class ���Ǳ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		//����=������*������*����*PI(3.14)
		
		float PI=(float)3.14;
		//PI�� �Ҽ����̱� ������ (float)���� ��ȯ ������� ǥ��
		System.out.print("������� �ظ��� ��������?");
		int radius = in.nextInt();
		//Ư���� ������ �ʱ⶧���� ����� �Է½��� ���
		System.out.print("������� ���̴�?");
		int height = in.nextInt();
		//Ư���� ������ �ʱ⶧���� ����� �Է½��� ���
		float total = (float)(radius*radius*height)*PI;
		//���� ����=������*������*����*PI(3.14)
		System.out.printf("������� ���Ǵ�? %.1f\n",total);
		//�Ŀ� PI�� ������ �־� �Ҽ����� ���ð��̱� ������ %.1f�� �Ҽ����� ǥ����(.1�� ���� �Ҽ��� ���ڸ������� ǥ��)
		in.close();
	}

}
