package 프로젝트4;

public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 5;//최종 변수를 5로 선언하고,
		int[][] array = new int[N][N];//2중 배열구조에서 [N][N]이라는 구조로 배열을 선언한다.5*5이므로 1~25의 숫자로 배열이 구성됨.
		int count = 1;//카운트 값이 1일때,
		for (int k = 0; k < N; k++) {//0으로 시작하는 k값이 N(5)과 같기 전까지 1씩 더해짐(열 값)
			for (int i = 0; i < N; i++) {//0으로 시작하는 i값이 N(5)과 같기 전까지 1씩 더해짐(행값)
				array[k][i] = count;//[k][i]로 이뤄지는 2중 배열에 각 자리 마다 카운트로 지정함.
				count++;//위의 식이 끝날때 마다, count값이 1씩 더해짐
			}
			k++;//위의 식이 끝날때 마다, k값이 1씩 더해짐.
			if (k >= N) break;//k값이 N보다 크거나 같을때, 멈춤.
				for (int i = N-1; i >= 0; i--) {//i가 N-1이므로 뒷 수 부터 시작하며, 자리값이 1씩 감소하므로서 역순이 된다.
					array[k][i] = count;//이런 상위의 식으로 count값을 부여함.
					count++;//상위 식이 끝날때 마다, count에 1을 더함.
				}
			
		}
		for (int k = 0; k < N; k++) {//위의 식들이 적용된 현 식을 따라서
			for (int i = 0; i < N; i++) {
				System.out.printf("%3d", array[k][i]);//각 수에 3포인트의 거리를 두고 2중 배열을 출력함.
			}
			System.out.println();
		}

	}

}
