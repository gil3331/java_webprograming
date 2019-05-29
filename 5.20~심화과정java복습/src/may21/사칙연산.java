package may21;
//Title : 사칙연산
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_ii;//int형 변수 선언
		k15_ii = 1+2;//더하기로 변수를 초기화
		System.out.printf("#1-1 : %d\n", k15_ii);//결과를 출력
		k15_ii = 1+2*3;//여기가 나름 중요한데, 괄호가 되어있지 않아도 자바의 우선연산처리 방식으로 곱샘이 먼저 된다.
		System.out.printf("#1-2 : %d\n", k15_ii);//결과를 출력
	}

}
