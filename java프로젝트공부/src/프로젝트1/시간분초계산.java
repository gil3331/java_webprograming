package ������Ʈ1;

import java.util.Scanner;

public class �ð����ʰ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.printf("�� ���� ������ �Է��ϼ��� : ");
		int second = in.nextInt();
		int minute;
		int hour;
		hour=second/3600;
		second = second - (3600 * hour);
		minute=second/60;
		//�ʸ� 60���� ������ ��
		second=second- (60*minute);
		
		//���� 60���� ������ �ð�
		
		//������ ������ ���� '������' ��
		System.out.printf("%d�ð� %d�� %d��\n",hour,minute,second);
		//�ð� �� �ʷ� ����ϱ� ���� �� �κп� %d�� ����ϰ�, �������� �ð�, ��, ������ �ʷ� �����
		in.close();
		
		
		
	}

}
