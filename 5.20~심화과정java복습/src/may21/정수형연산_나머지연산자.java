package may21;
//Title : 정수형 연산 및 나머지 연산자
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 정수형연산_나머지연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_ii = 1000 / 3;//int형으로 선언되어 있어서 333.33333...이 나오지 않는다.
		System.out.printf("#3-1 : %d\n", k15_ii);//결과를 출력
		k15_ii = 1000 % 3;//1000을 3으로 나눴을 때 나오는 나머지 값을 산출한다.
		System.out.printf("#3-2 : %d\n", k15_ii);//결과를 출력

		for (int k15_i = 0; k15_i < 20; k15_i++) {//for문을 사용하여 0~19까지 연산
			System.out.printf(" #3-3 : %d", k15_i);//결과를 출력
			if (((k15_i + 1) % 5) == 0) {//그런 i값에 1을 더하면서(처음부터 0이 나오면 바로 개행을 하기 때문에 1을 더함), 5로 나눴을 때, 0이 나오면 개행을 실시
				System.out.printf("\n");//개행 출력
			}
		}
	}

}
