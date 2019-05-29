package may22;
//Title :피라미드 찍기
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 피라미드찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_n,k15_m;//변수선언
		k15_m=20;k15_n=1;
		
		while(true) {
			for(int k15_i=0;k15_i<k15_m;k15_i++) System.out.printf(" ");//초기부터 시작되는 공백을 위해서 m값을 기준으로 i가 작으면 공백을 출력하고,  아래의 식에서
			for(int k15_i=0;k15_i<k15_n;k15_i++) System.out.printf("*");//별은 초기 한개부터 시작되며, i값을 기준으로 n값이 크면 별을 한개씩 출력하고, 아래의 식에서
			System.out.printf("\n");//개행을 출력
			
			k15_m=k15_m-1;//m값을 1씩 뺌에 따라 공백을 줄여나감.
			k15_n=k15_n+2;//별이 두개씩 늘어나기 때문에 별의 기준인 n값을 2씩 더한다.
			
			if(k15_m<0) break;//m값이 -1이 되면 브레이크 하여 반복문을 탈출한다.
		}
	}

}
