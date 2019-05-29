package may22;
//Title :띄어쓰기
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 띄어쓰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k15_i=0; k15_i<10;k15_i++) {//i값이 0부터 시작하여 9까지 1씩 더해서 산출됨.
				for(int k15_j=0;k15_j<k15_i;k15_j++) System.out.printf(" ");//여기서 j값은 공백을 위함인데, j값이 i보다 작으면 공백을 출력하고, 1씩 더한다.
				System.out.printf("%d\n",k15_i);//i값 하나 출력하면서 개행(j가 0일때 공백 i도 0이므로 공백 없음/그 뒤부터 공백이 하나씩 시작)
		}
	}

}
