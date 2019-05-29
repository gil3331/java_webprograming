package 프로젝트2;

import java.util.Scanner;

public class 기본6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch를 통한 학점계산
		Scanner in =new Scanner(System.in);
		int point;
		System.out.print("점수를 입력해주세요 : ");
		point = in.nextInt();
		switch(point/10) {
		//if때 와는 다르게 어차피 십의 자리로만 파악하기 때문에 10을 나눈 몫으로 계산하여 case를 줄임
		case 10 :
		case 9 :
			//A는 90~100까지의 점수이므로, 10을 나눈 몫인 9와 10을 case로 한다.
			System.out.println("A입니다.");
			break;
		case 8 : //A가 아닌 경우 B가 되기 위해선 십의 자리가 8이 나와야함
			System.out.println("B입니다.");
			break;
		case 7 : //B가 아닌 경우 C가 되기 위해선 십의 자리가 7이 나와야함
			System.out.println("C입니다.");
			break;
		case 6: //C가 아닌 경우 D가 되려면 6이 나오면 되고,
			System.out.println("D입니다.");
			break;
		default : //그 외의 점수는 탈락으로 처리
			System.out.println("탈락입니다.");
		}
		in.close();
	}

}
