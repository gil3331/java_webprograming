package ������Ʈ3;

import java.util.Scanner;

public class �޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in = new Scanner(System.in);
		int year = 0, dayOfWeek = 0, days = 0, month = 0, totalDay = 0, day=0;
		String dayName = " ";
		System.out.print("���ϴ� �⵵�� : ");
		year = in.nextInt();
		System.out.print("���ϴ� �� : ");
		month = in.nextInt();
		System.out.print("���ϴ� �� : ");
		day = in.nextInt();
		days = (year - 1900) * 365;
		for (int i = 1900; i < year; i++)
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// ����
				days++;
			}

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			if (month >= 3) {
				days++;
			}
		}
		switch (month) {
		case 12:
			days = days + 30;
		case 11:
			days = days + 31;
		case 10:
			days = days + 30;
		case 9:
			days = days + 31;
		case 8:
			days = days + 31;
		case 7:
			days = days + 30;
		case 6:
			days = days + 31;
		case 5:
			days = days + 30;
		case 4:
			days = days + 31;
		case 3:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days = days + 29;
			} else {
				days = days + 28;
			}
		case 2:
			days = days + 31;
		}

		switch (month) {
		case 12:
			totalDay = 31;
			break;
		case 11:
			totalDay = 30;
			break;
		case 10:
			totalDay = 31;
			break;
		case 9:
			totalDay = 30;
			break;
		case 8:
			totalDay = 31;
			break;
		case 7:
			totalDay = 31;
			break;
		case 6:
			totalDay = 30;
			break;
		case 5:
			totalDay = 31;
			break;
		case 4:
			totalDay = 30;
			break;
		case 3:
			totalDay = 31;
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				totalDay = 29;
			} else {
				totalDay = 28;
			}
			break;
		case 1:
			totalDay = 31;
			break;
		}
		dayOfWeek = (days % 7) + 1;
		if (dayOfWeek == 1) {
			dayName = "��";

		} else if (dayOfWeek == 2) {
			dayName = "ȭ";

		} else if (dayOfWeek == 3) {
			dayName = "��";

		} else if (dayOfWeek == 4) {
			dayName = "��";

		} else if (dayOfWeek == 5) {
			dayName = "��";

		} else if (dayOfWeek == 6) {
			dayName = "��";

		} else if (dayOfWeek == 7) {
			dayName = "��";
		}

		System.out.printf("%s�����̳׿�\n", dayName);

		System.out.printf("%d�� %d�� %d�� �޷�\n", year, month,day);
		System.out.printf("%2s %1.2s %1.2s %1.2s %1.2s %1.2s %1.2s\n", "��", "��", "ȭ", "��", "��", "��", "��");
		for (int i = 1; i <= totalDay;) {

			for (int k = 1; k <= 7; k++) { //8
				if (i <= totalDay) { //2
					if (dayOfWeek > 0 && dayOfWeek < 7) {
						System.out.print("   ");
						dayOfWeek--;
					} else {
						System.out.printf("%3d", i);
						i++;
					}
				}
			}

			System.out.println();

		}

		in.close();
	}

}
