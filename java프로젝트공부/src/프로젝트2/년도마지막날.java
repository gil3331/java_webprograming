package 프로젝트2;

import java.util.Scanner;

public class 년도마지막날 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in =new Scanner(System.in);
		int year = 0, day= 0 ;
		System.out.print("원하는 연도를 입력하세요 : ");
		year = in.nextInt();
		System.out.printf("%d년은 다음과 같습니다.\n",year);
		if((year%4==0&&year%100!=0)||year%400==0){
			day = 29;
		}else {
			day=28;
		}	
		System.out.println("1월:31일");
		System.out.printf("2월:%d일\n",day);
		System.out.println("3월:31일");
		System.out.println("4월:30일");
		System.out.println("5월:31일");
		System.out.println("6월:31일");
		System.out.println("7월:30일");
		System.out.println("8월:31일");
		System.out.println("9월:30일");
		System.out.println("10월:31일");
		System.out.println("11월:30일");
		System.out.println("12월:31일");
		in.close();		
		}
}


