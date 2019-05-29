package may21;
//Title : 누적하기
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 누적하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_sum;
		k15_sum = 0;//누적 및 루프는 항상 초기화 해야 한다.
		for (int k15_i=1; k15_i < 101; k15_i++)//1~100까지 구해 보기 위하여 for문을 사용
		{
			k15_sum= k15_sum+k15_i;//0부터 시작되는 sum과 1~100까지 늘어나는 i를 더해서 확인(누적)
		}
		System.out.printf("#2 : %d\n", k15_sum);//결과 값 확인
		System.out.printf("#2-2 : %d\n", k15_sum/100);//int형으로 되어 있어서 소수점 이하는 안나옴
		int [] k15_v = {1,2,3,4,5};//v값을 int형으로 1~5까지 넣을 수 있게 선언
		int k15_vSum;
		k15_vSum = 0;//vSum값을 0으로 초기화
		for (int k15_i = 0; k15_i<5 ; k15_i++) 
		{
			k15_vSum = k15_vSum + k15_v[k15_i];//1차원 배열로 1~5까지 더함
		}
		System.out.printf("#2-3 : %d\n", k15_vSum);//결과를 출력
	}

}
