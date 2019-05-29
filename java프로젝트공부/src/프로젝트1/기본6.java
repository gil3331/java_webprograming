package 프로젝트1;

import java.util.Scanner;

public class 기본6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int inputData;
		System.out.print("정수를 입력하세요 : ");
		inputData=in.nextInt();
		System.out.printf("입력하신수는 %s 입니다.\n", (inputData%2==0)? "짝수":"홀수");
		//%2를 통해서 나누기의 나머지 값이 0인 경우를 짝수, 1인 경우를 홀수로 하여 구분
		in.close();
	}

}
