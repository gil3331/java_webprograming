package ������Ʈ3;

import java.util.Scanner;

public class ���ϱ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in = new Scanner(System.in);
		int year = 0, dayOfWeek = 0, days = 0, month = 0, day = 0;
		String dayname = " ";//���� ���� ǥ�ø� ���ؼ� string���� ���ڿ� ǥ��
		System.out.print("���ϴ� �⵵�� : ");
		year = in.nextInt();
		System.out.print("���ϴ� �� : ");
		month = in.nextInt();
		System.out.print("���ϴ� �� : ");
		day = in.nextInt();
		days = (year - 1900) * 365;//1900�� ���� ���ϴ� �ر����� ����, 365���� ���ϸ�, �� ������ ��¥�� ����.
		for (int i = 1900; i < year; i++)//1900�� ���� �� 1�� ��������, �����ϴ� ���ϴ� �⵵ ������ �� ���Ѵ�.
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// ����
				days++;//�����϶��� ���̸� 1�� ���Ѵ�.
			}

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			if (month >= 3) {
				days++;
			}
		}
		switch (month) {
		case 12:
			days = days+30;
		case 11:
			days = days+31;
		case 10:
			days = days+30;
		case 9:
			days = days+31;
		case 8:
			days = days+31;
		case 7:
			days = days+30;
		case 6:
			days = days+31;
		case 5:
			days = days+30;
		case 4:
			days = days+31;
		case 3:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		days =days +29;}else {days=days+28;
		}
		case 2:
			days = days+31;
		}
		days = days + day - 1;
		dayOfWeek = days % 7;
		if (dayOfWeek == 0) {
			dayname = "��";

		} else if (dayOfWeek == 1) {
			dayname = "ȭ";

		} else if (dayOfWeek == 2) {
			dayname = "��";

		} else if (dayOfWeek == 3) {
			dayname = "��";

		} else if (dayOfWeek == 4) {
			dayname = "��";

		} else if (dayOfWeek == 5) {
			dayname = "��";

		} else if (dayOfWeek == 6) {
			dayname = "��";
		}
		System.out.printf("1900����� %d���� %d�� �������ϴ�.\n", year, days);
		System.out.printf("%s�����̳׿�\n", dayname);

		in.close();

	}

}
