package may22;

import java.util.Scanner;

//Title : if문_3
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class if문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner를 사용
		
		System.out.printf("점수를 기입해주세요 : ");//점수를 기입하라는 문구를 출력
		int k15_score = scanner.nextInt();//스케너를 통해 점수를 입력받음
		if(k15_score > 60) {//점수가 60을 넘는다면
			System.out.println("합격입니다.");//합격입니다 문구를 출력
		}else {//60점 이하라면
			System.out.println("불합격입니다.");//불합격입니다. 문구를 출력
		}
		scanner.close();//스케너를 종료
	}

}
