package ������Ʈ2;

import java.util.Scanner;

public class Ȧ¦�����ϱ� {
//�������� �� ���� �ٷ� ������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int score;
		System.out.print("���ڸ� �Է����ּ��� : ");
		score = in.nextInt();
		if(score%2==0) {
			System.out.println("¦�� �Դϴ�.");
			}else {
				System.out.println("Ȧ���Դϴ�.");
			}
	in.close();
	}
}
