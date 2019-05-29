package may22;
//Title : 범위를 주어 비교(찾기)
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 범위를주어비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_iVal;//iVal이란 int형 변수를 선언
		for(int k15_i = 0; k15_i < 300; k15_i++) {//for문으로 i값을 0~299까지 1씩 더해서 연산
			k15_iVal =5 *k15_i;//iVal은 그런 i값에 5를 곱하여 연산한 결과 값으로 저장
			if(k15_iVal >= 0&&k15_iVal < 10) System.out.printf("일 %d\n", k15_iVal);//iVal의 값이 0에서 9까지면 일 에 iVal값을 출력
			else if(k15_iVal >= 10&& k15_iVal < 100) System.out.printf("십 %d\n",k15_iVal);//iVal의 값이 10에서 99까지면 십 에 iVal값을 출력
			else if(k15_iVal >= 100&& k15_iVal < 1000) System.out.printf("백 %d\n",k15_iVal);//iVal의 값이 100에서 999까지면 백 에 iVal값을 출력
			else	System.out.printf("천 %d\n",k15_iVal);//최대 연산 결과가 1500을 넘지 못함으로 자리값의 마지막은 천으로 출력
		}
	}

}
