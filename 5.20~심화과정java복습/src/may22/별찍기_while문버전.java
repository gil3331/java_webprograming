package may22;
//Title : while문(별찍기)
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 별찍기_while문버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_iA, k15_iB;// iA와 iB라는 변수를 선언(int형)
		k15_iA = 0;// iA를 0값으로 초기화
		while (true) {// 반복문 조건이 true일 때,
			k15_iB = 0;// iB를 0값으로 초기화
			while (true) {// 반복문 조건이 true일 때,
				System.out.printf("*");// *을 출력
				if (k15_iA == k15_iB)break;// iA와 iB값이 같으면 while문을 멈추고,
				k15_iB++;// iB를 1씩 더함.
			}
			System.out.printf("\n");// 내부 반복문이 끝나면, 개행으로 출력
			k15_iA++;// iA값을 1씩 더해줌
			if (k15_iA == 30)break;// iA값이 30에 달하면, 외부 while문을 종료
		}
	}
}
