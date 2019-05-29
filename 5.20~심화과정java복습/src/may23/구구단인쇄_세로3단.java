package may23;
//Title : 구구단 인쇄(세로3단)
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
public class 구구단인쇄_세로3단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int k15_i =1 ; k15_i < 4; k15_i=k15_i+1) {//구구단의 n단을 표시 하기 위한 for문(앞자리 및 n단)
			System.out.printf("***********\t***********\t***********\n");//n단 사이의 별을 출력
			System.out.printf("구구단 %d 단     구구단 %d 단     구구단 %d 단 \t\n",k15_i,k15_i+3, k15_i+6);//삼단으로 출력할것이기 때문에 그걸 위한 프레임을 구성
																															//중요한 점은 세로로 출력한다고 해서 세로로 계산할게 아니고, 가로 형태에서 각 단 별 차이를 파악하여 구성해야함.
			System.out.printf("***********\t***********\t***********\n");//n단 사이의 별을 출력
			for (int k15_j =1; k15_j < 10; k15_j++) {//구구단의 뒷자리를 표시하기 위한 for문
				System.out.printf(" %d * %d = %2d      %d * %d = %2d     %d * %d = %2d \n", k15_i, k15_j, k15_i*k15_j,//삼단이기 때문에 출력구성을 세 칸으로 잡아서 구성하면 장땡
						k15_i+3, k15_j, (k15_i+3)*k15_j, k15_i+6,k15_j,(k15_i+6)*k15_j);//앞자리는 i값으로, 뒷자리는 j값으로, 그리고 결과는 두개를 곱함
				
			}
			
		}
	}

}
