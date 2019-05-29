package may22;
//Title : for문(기본, 복합)
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class for문_기본_복합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#기본for문
		int k15_sum = 0;//sum을 0값으로 초기화
		for(int k15_i=0;k15_i < 10;k15_i++){//i가 0일 때, 10보다 작으면 i를 1씩 더해줌의 반복문 
			k15_sum = k15_sum + k15_i;//sum값은 sum의 초기값과 i의 변화되는 숫자를 더해서 값을 산출함.
		}
		System.out.printf("sum %d\n",k15_sum);//sum의 초기값은 계속 0으로 기입되어 i의 값으로 산출하여 1~9까지 더한 값으로 결과를 출력
		
		for(int k15_i =1 ; k15_i < 10; k15_i++) {//구구단의 n단을 표시 하기 위한 for문(앞자리 및 n단)
			System.out.printf("*********************************\n");
			System.out.printf("                 구구단 %d 단                      \n",k15_i);//n단을 출력
			System.out.printf("*********************************\n");
			for (int k15_j =1; k15_j < 10; k15_j++) {//구구단의 뒷자리를 표시하기 위한 for문
				System.out.printf(" %d * %d = %d \n", k15_i, k15_j, k15_i*k15_j);//앞자리는 i값으로, 뒷자리는 j값으로, 그리고 결과는 두개를 곱함
			}
			
		}
		
	}

}
