package may22;
//Title :sin함수 그래프
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class sin함수그래프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k15_fSin;//sin값을 double형으로 저장
		
		for(int k15_i=0; k15_i<360; k15_i++) {//0~359까지의 값으로 sin앞에 i값을 구현하고, 1씩 더해줌(360도까지 어떻게 나오는지)
			k15_fSin=Math.sin(k15_i *3.141592/180);//파이값에 180을 나누고 sin값인 i에 곱하면 라디안 값이 나옴 
			System.out.printf("%d sin ==> %f\n",k15_i, k15_fSin);//이건 결과값 출력
		}
		for(int k15_i=0; k15_i<360; k15_i++) {//360도까지 그리기 위한 for문을 구현
			k15_fSin=Math.sin(k15_i*3.141592/180);//라디안 값을 연산
			int k15_iSpace=(int)((1.0-k15_fSin)*50);//sin함수가 음수값이 있어서 1을 빼고, 굴곡이 선명해보이기 위해 50을 곱함
			for(int k15_j=0; k15_j < k15_iSpace;k15_j++) System.out.printf(" ");//j값을 통해서 공백을 만듬.
			System.out.printf("*[%f][%d]\n",k15_fSin,k15_iSpace);//결과 값을 출력
		}
	}

}
