package may21;
//Title : 소수점 이하 반올림 버림 처리
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 소수점이하반올림버림처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_MyVal = 14/5;//int형으로 정수 변수 선언
		System.out.printf("#5-1 : %d\n", k15_MyVal);//14 나누기 5 한걸 결과로 출력
		
		double k15_MyValF;//double형으로 실수 변수 선언
		
		k15_MyValF = 14/5;//놀랍게도 결과는 정수(실수형식이지만)로 나온다.
		System.out.printf("#5-2 : %f\n", k15_MyValF);
		
		k15_MyValF = 14.0/5;//우리가 실제로 원하는 실수 형태의 결과는 여기서 나오며, 프로그램적으로 위의 식과는 개념자체가 다르다.
		System.out.printf("#5-3 : %f\n", k15_MyValF);
		
		k15_MyValF = (14.0)/5+0.5;//프로그램 우선 연산처리에 의해 더하고 나누는게 아닌, 나누고 더하는 식이 된다.
		System.out.printf("#5-4 : %f\n", k15_MyValF);
		
		k15_MyVal = (int)((14.0)/5+0.5);//위와 같지만, int형으로 강제 형변환 함으로써, 정수 값만 나오고 실수는 제외처리된다.
		System.out.printf("#5-5 : %d\n", k15_MyVal);
	}

}
