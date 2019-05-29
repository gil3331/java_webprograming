package 프로젝트2;

import java.util.Scanner;

public class 가위바위보 {
//가위=0,바위=1,보=2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int player1, player2 ;
		System.out.print("player1은 (가위:0,바위:1,보:2)=> ");
		player1 = in.nextInt();
		System.out.print("player2은  (가위:0,바위:1,보:2)=> ");
		player2 = in.nextInt();
		//player1과 player2가 쓸수 있는 경우를 입력하게 하고,
		in.close();
		//가위0<바위1
		//바위1<보2
		//*보2<가위0 보는 숫자가 커서 크기비교로는 안됨
		if(player1==player2) {
			System.out.print("비김"); //00,11,22
			//같은 수가 나오는 경우를 비김으로 출력되게 함.
		}else if((player1==0)&&(player2==2)){
			System.out.print("player1이 이겼습니다.");//02
		}else if((player1==2)&&(player2==0)){
			System.out.print("player2이 이겼습니다.");//20
			//상위의 부분은 다른부분은 a는 b보다 크다, 혹은 b는 a보다 크다로 해결 가능하지만,
			//보2와 가위0를 표현할수 없어서 경우를 만들어줌.
		}else if(player1>player2) {
			System.out.print("player1이 이겼습니다.");//20
		}else if(player1<player2) {
			System.out.print("player2이 이겼습니다.");//20
		}//player1과 player2가 이기는 경우를 숫자가 큰쪽으로 설정하여, 출력함.
		in.close();
	}
			
}

