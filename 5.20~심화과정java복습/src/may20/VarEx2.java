package may20;
//Title : 변수실습2
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class VarEx2 {//클래스 선언

	public static void main(String[] args) {//메인으로 프로그램 시작
		// TODO Auto-generated method stub
		int k15_x = 10;//int 형 변수 x를 10으로 초기화
		int k15_y = 20;//int 형 변수 y를 20으로 초기화
		int k15_tmp = 0;//int형 변수 tmp를 0으로 초기화
		
		System.out.println("x : "+ k15_x + " y : "+ k15_y);//x와 y 값을 각각 출력
		k15_tmp = k15_x;//tmp를 x로 선언
		k15_x = k15_y;//x값을 y값으로 선언
		k15_y = k15_tmp;//y값을 tmp값으로 선언
		
		System.out.println("x : "+ k15_x + " y : "+ k15_y);//다시 x와 y값을 각각 출력
	}

}
