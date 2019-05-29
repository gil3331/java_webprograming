package 프로젝트2;

import java.util.Scanner;

public class 기본3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int data;
		System.out.print("값을 입력해주세요 : ");
		data=in.nextInt();
		if(data%2==0) {
			//if조건에 출력값에 2를 나눴을때 나머지가 0이면 짝수로
			System.out.println("짝수 입니다.");
			}//아닌 경우는 홀수로 구분시킴
				else {
				System.out.println("홀수입니다.");
			}
		in.close();
	}

}
