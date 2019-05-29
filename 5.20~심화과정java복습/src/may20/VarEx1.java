package may20;
//	Title : 변수실습1
//	Date : 2019.05.20
//	Author : 이길준
//	Comment : .....
public class VarEx1 {		//클래스선언

	public static void main(String[] args) {//메인으로부터 프로그램 시작
		// TODO Auto-generated method stub
		int k15_year = 0;//year라는 int형 변수를 선언하고, 0값으로 초기화
		int k15_age = 14;//age라는 int형 변수를 선언하고, 14값으로 초기화
		
		System.out.println("결과1 : "+ k15_year);//year의 값을 결과 1로 받아 출력
		System.out.println("결과2 : "+k15_age);//age의 값을 결과 2로 받아 출력
		
		k15_year = k15_year + 2000;//변수 year의 값에 2000을 더하고, 그 값을 year로 저장
		k15_age = k15_age + 1;//변수 age의 값에 1을 더하고, 그 값을 age로 저장
		
		System.out.println("결과3 : "+k15_year);//다시 year 값을 출력
		System.out.println("결과4 : "+k15_age);//다시 age값을 출력
	}

}
