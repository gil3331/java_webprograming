package 프로젝트3;

import java.util.Scanner;

public class 요일구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in = new Scanner(System.in);
		int year = 0, dayOfWeek = 0, days = 0, month = 0, day = 0;
		String dayname = " ";//요일 문자 표시를 위해서 string으로 문자열 표현
		System.out.print("원하는 년도는 : ");
		year = in.nextInt();
		System.out.print("원하는 월 : ");
		month = in.nextInt();
		System.out.print("원하는 일 : ");
		day = in.nextInt();
		days = (year - 1900) * 365;//1900년 부터 원하는 해까지를 빼고, 365일을 곱하면, 그 사이의 날짜가 나옴.
		for (int i = 1900; i < year; i++)//1900년 부터 쭉 1씩 더해지며, 기입하는 원하는 년도 전까지 쭉 더한다.
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				// 윤년
				days++;//윤년일때는 데이를 1을 더한다.
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
			dayname = "월";

		} else if (dayOfWeek == 1) {
			dayname = "화";

		} else if (dayOfWeek == 2) {
			dayname = "수";

		} else if (dayOfWeek == 3) {
			dayname = "목";

		} else if (dayOfWeek == 4) {
			dayname = "금";

		} else if (dayOfWeek == 5) {
			dayname = "토";

		} else if (dayOfWeek == 6) {
			dayname = "일";
		}
		System.out.printf("1900년부터 %d까지 %d일 지났습니다.\n", year, days);
		System.out.printf("%s요일이네요\n", dayname);

		in.close();

	}

}
