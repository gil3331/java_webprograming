package ������Ʈ2;

import java.util.Scanner;

public class ���ں񱳷�ū�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x, y;//x�� y�� �������� �����ϰ�,
		System.out.print("���ڸ� �Է����ּ��� : ");
		x = in.nextInt();
		System.out.print("���ڸ� �Է����ּ��� : ");
		y = in.nextInt();
		//x�� y�� �����Ͽ��� ��,
		if(x>=y) {//x�� y���� ū ���� 
			System.out.printf("ū ���� %d �Դϴ�.",x);
			//x���� ����� �� ū ���� ǥ�� 
			}else {//x�� y���� ���� ��쿡��,
				System.out.printf("ū ����%d �Դϴ�.",y);
			//y���� ����� �� ū ���� ǥ��
			}
		in.close();
	}
	
}
