package 프로젝트2;

import java.util.Scanner;

public class 기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try{}의 경우에는 try안에 들어가는 식에 예외사항이 있는경우 보호를 하고
		//catch(Exception e){} catch안에 들어가는 식에 오류가 있는 경우, 처리하기 위한 코드를 적는다.
		Scanner in =new Scanner(System.in);
		int number1, number2;
		float div;
		try {
			System.out.print("1. 입력하세요 : ");
			number1=in.nextInt();
			System.out.print("2. 입력하세요 : ");
			number2=in.nextInt();
			div = (float)number1/number2;
			System.out.printf("%d / %d = %f\n",number1,number2,div);
		}catch(Exception e) {
			System.out.print("오류입니다.");
	}
	 in.close();
	}
}
