package 프로젝트2;

import java.util.Scanner;

public class 윤년구하기 {
    //* 아래 두 가지 중 하나만 만족하면 윤년
	//year가 4로 나누어 떨어지고, 
	//100으로는 나누어 떨어지지 않음
	//year가 400으로 나누어 떨어짐
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int year;
		System.out.print("원하는 년도를 입력하세요 : ");
		year = in.nextInt();
		//year를 입력하게 하고,
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.print("윤년 입니다.");
		}//공식에 하나라도 맞는 경우에는 윤년으로 출력하고,
		else {
			System.out.print("평년 입니다.");
		}//아닌 경우에는 평년으로 출력함.
		in.close();
	}
}

