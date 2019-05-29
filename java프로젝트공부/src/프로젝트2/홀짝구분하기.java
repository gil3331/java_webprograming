package 프로젝트2;

import java.util.Scanner;

public class 홀짝구분하기 {
//수업에서 한 내용 바로 도입함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int score;
		System.out.print("숫자를 입력해주세요 : ");
		score = in.nextInt();
		if(score%2==0) {
			System.out.println("짝수 입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
	in.close();
	}
}
