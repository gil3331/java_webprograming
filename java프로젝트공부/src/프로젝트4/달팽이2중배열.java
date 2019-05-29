package 프로젝트4;

public class 달팽이2중배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];

		int a = 0;//첫 배열
		int b = 0;//두번째 배열
		int a_min = 0;
		int a_max = 4;
		int b_min = 0;
		int b_max = 4;
		int first = 1;//1~25까지 늘어날 수

		for (int i = 0; i < 3; i++) {//i는 전체 배열식을 2번 반복하기 위한 구조
			for (b = b_min; b <= b_max; b++) {//a열이 0인 상황에 b가 0~4까지 늘어남.[0][0~4]
				array[a][b] = first;//시작되는 숫자로써, 25까지 갈 예정
				first++;//상위의 식이 끝날 때마다, 1씩 증가함(~5).
			}
			b = b - 1;//상위 식이 끝났을때, b가 5까지 늘어나서 배열을 넘어감으로, b-1로 4를 유지해준다.
			a_min++;//a min를 1더해줘서 아래의 식에서 a를 통해 아래 줄로 내려감.
                                            
			for (a = a_min; a <= a_max; a++) {//b가 4인 상황에 a 값이 1~4까지 늘어남[1~4][4]
				array[a][b] = first;//(5부터 시작)
				first++;//상위 식이 끝날때 마다 1씩 증가함(6~9)
			}
			a = a - 1;//상위 식이 끝나면 a값이 5이므로 1을 빼서 배열 내로 유지시킴.
			b_max--;//아래의 식부터 b값이 3으로 차감이 되야 함으로 b max를 1빼줌.

			for (b = b_max; b >= b_min; b--) {//b=bmax(3)와 a값(4)을 기준으로 b를 1씩 차감시킴[4][3~0]
				array[a][b] = first;//(9부터 시작)
				first++;//상위 식이 끝날때 마다 1씩 증가함(10~13)
			}
			b = b + 1;//b값이 -1까지 갔으므로 1을 더해서 0값으로 만들어줌.
			a_max--;//아래의 식에서 a값이 3으로 차감 되야 함으로 a max를 1빼줌.

			for (a = a_max; a >= a_min; a--) {//a=a max(3)과 b값이 0일때를 기준으로, a를 1씩 차감시킴[3~1-a min=1][0]
				array[a][b] = first;//(13부터 시작)
				first++;//상위 식이 끝날때 마다 1씩 증가함(14~16)
			}
			a = a + 1;//상위 식의 마지막에 a값이 0이 나오므로 1을 더해줌.
			b_min++;//b min에 1을 더해줘서 [1][1]부터 두번째를 반복하게 해줌.
		}

		// 출력부
		for (int yyy = 0; yyy < 5; yyy++) {
			for (int zzz = 0; zzz < 5; zzz++) {
				System.out.printf("%3d", array[yyy][zzz]);
			}
			System.out.println();
		}
	}
}