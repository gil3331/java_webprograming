package may23;
//Title : 구구단 인쇄(가로3단)
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
public class 구구단인쇄_가로3단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int k15_i =1 ; k15_i < 10; k15_i=k15_i+3) {//구구단의 n단을 표시 하기 위한 for문(앞자리 및 n단)
			System.out.printf("***********\t***********\t***********\n");//n단 사이의 별을 출력
			System.out.printf("구구단 %d 단     구구단 %d 단     구구단 %d 단 \t\n",k15_i,k15_i+1, k15_i+2);//3단으로 출력해야할 때, 오른쪽으로 각단의 차이가 1씩 남으로 그 값을 지정하면 끝
			System.out.printf("***********\t***********\t***********\n");//n단 사이의 별을 출력
			for (int k15_j =1; k15_j < 10; k15_j++) {//구구단의 뒷자리를 표시하기 위한 for문
				System.out.printf(" %d * %d = %2d      %d * %d = %2d     %d * %d = %2d \n", k15_i, k15_j, k15_i*k15_j,//삼단으로 출력해야 하기 때문에 세줄로 형식을 잡아주면 장땡
						k15_i+1, k15_j, (k15_i+1)*k15_j, k15_i+2,k15_j,(k15_i+2)*k15_j);//앞자리는 i값으로, 뒷자리는 j값으로, 그리고 결과는 두개를 곱함
				
			}
			
		}
	}

}
