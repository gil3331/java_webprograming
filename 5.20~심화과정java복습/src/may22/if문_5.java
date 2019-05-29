package may22;

import java.util.Scanner;

//Title : if문_5
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class if문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner를 사용
		
		System.out.printf("점수를 기입해주세요 : ");//점수를 기입하라는 문구를 출력
		int k15_score = scanner.nextInt();//스케너를 통해 점수를 입력받음
		if(k15_score >=90) {//점수가 90을 넘는다면
			System.out.println("A등급");//A등급 문구를 출력
		}else if(k15_score >= 80 && k15_score < 90){//80점이상 90점 미만
			System.out.println("B등급");//B등급 문구를 출력
		}else if(k15_score >= 70 && k15_score < 80) {//70점 이상 80점 미만
			System.out.println("C등급");//C등급 문구를 출력
		}else {//70점 미만부턴
			System.out.println("F등급");//그냥 F등급 문구를 출력
		}
		scanner.close();//스케너를 종료
	}

}
