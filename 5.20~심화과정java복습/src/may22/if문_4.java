package may22;

import java.util.Scanner;
//Title : if문_4
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class if문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner를 사용
		
		System.out.printf("숫자를 기입해주세요 : ");//숫자를 기입하라는 문구를 출력
		int k15_num = scanner.nextInt();//스케너를 통해 숫자를 입력받음
		if(k15_num > 0) {//숫자가 0을 넘는다면
			System.out.println("양수입니다.");//양수입니다 문구를 출력
		}else if(k15_num < 0) {//숫자가 0보다 작다면
			System.out.println("음수입니다.");//음수입니다. 문구를 출력
		}else {//그 외에는 0밖에 없기 때문에 else만 써도 됨
			System.out.println("영입니다.");//영입니다. 문구를 출력
		}
		scanner.close();//스케너를 종료
	}

}
