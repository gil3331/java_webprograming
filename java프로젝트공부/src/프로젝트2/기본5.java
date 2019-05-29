package 프로젝트2;

import java.util.Scanner;

public class 기본5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch를 통한 순위 구하기
		Scanner in =new Scanner(System.in);
		int rank;
		System.out.print("순위를 입력해주세요 : ");
		rank = in.nextInt();
		switch(rank) {
		//switch에 랭크를 기입한다.
		case 1 :
			System.out.println("1등입니다.");
			//랭크가 1일 경우 "1등입니다."를 출력
			break;//case1을 종료
		case 2 : 
			System.out.println("2등입니다.");
			//랭크가 2일 경우 "2등입니다."를 출력
			break;
		case 3 : 
			System.out.println("3등입니다.");
			//랭크가 3일 경우 "3등입니다."를 출력
			break;
		default : 
			System.out.println("탈락입니다.");
			//case1,2,3이 모두 아닌 경우에는 "탈락입니다."로 출력
		}
		in.close();
	}

}
