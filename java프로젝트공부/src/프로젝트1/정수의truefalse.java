package ������Ʈ1;

import java.util.Scanner;

public class ������truefalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("������ : ");
		int x = in.nextInt();
		boolean ToF, y, z;
		ToF=(x%4==0&&x%5==0)? true : false;
		//ToF�� x�� 4�� ��������, x�� 5�� �������� �������� 0�� ���� true, �ƴ� ���� false�� ���.
		y=(x%4==0||x%5==0) ? true : false;
		//y�� x�� 4�� �������� �������� 0�̰ų�, x�� 5�� �������� �������� 0�� ��� true, �ƴ� ���� false�� ���.
		z=((x%4==0||x%5==0)&&(x%4==0&&x%5==0)) ? true : false;
		//z�� ToF�� y���� ��� �´� ��� true, �ƴ� ��� false�� ���.
		System.out.println("1�������� : "+ToF);
		System.out.println("2�������� : "+y);
		System.out.println("3�������� : "+z);	
		in.close();
		
	}

}
