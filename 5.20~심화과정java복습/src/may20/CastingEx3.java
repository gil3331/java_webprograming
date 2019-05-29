package may20;
//Title : CastingEx3(강제적 형변환)
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float k15_f = 9.1234567f;//float형으로 저장하는 경우 마무리로 f를 써줘야 한다.
		double k15_d = 9.1234567;//double형은 쓰지 않아도 됨.
		double k15_d2 = (double)k15_f;//f의 float 데이터를 받아서 double로 형변환 함.
		
		System.out.printf("f = %20.18f\n", k15_f);//소수점 18자리까지 표현하여 20자리까지 f값을 출력한다(나머지 여백은 0으로 표기).-float값의 제한으로 데이터 손실
		System.out.printf("d = %20.18f\n", k15_d);//정상적으로 출력하며 소수점 18자리까지 표현하여 20자리를 d값으로 출력
		System.out.printf("d2 = %20.18f\n", k15_d2);//double임에도 f값과 같아지는 이유는 초기 f값때 이미 데이터 손실이 일어났기 때문에 형변환 해도 의미가 없음
	}

}
