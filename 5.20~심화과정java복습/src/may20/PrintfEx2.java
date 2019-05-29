package may20;
//Title : 출력실습2
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_url = "www.codechobo.com";
		
		float k15_f1 = .10f;//float형 변수의 경우 마지막에 f를 써야 된다.
		float k15_f2 = 1e1f;
		float k15_f3 = 3.14e3f;
		double k15_d = 1.23456789;//double형 변수는 마지막에 쓰지 않아도 된다.
		
		System.out.printf("f1=%f, %e, %g%n", k15_f1, k15_f1, k15_f1);//%f의 고정 소수점 형식의 실수 출력
		System.out.printf("f2=%f, %e, %g%n", k15_f2, k15_f2, k15_f2);//%e는 부동 소수점 형식의 실수 출력
		System.out.printf("f3=%f, %e, %g%n", k15_f3, k15_f3, k15_f3);//%g는 %e,%f중 더 짧은 형식으로 출력
		
		System.out.printf("d=%f%n", k15_d);//고정 소수점 형식으로 실수 출력
		System.out.printf("d=%14.10f%n", k15_d);//14.10자리까지의 소수점 형식으로 실수 출력
		
		System.out.printf("[12345678901234567890]%n");//대괄호 째로 통째 출력
		System.out.printf("[%s]%n", k15_url);//문자열 출력
		System.out.printf("[%20s]%n", k15_url);//20자리까지의 문자열 출력
		System.out.printf("[%-20s]%n", k15_url);//앞으로 20자리까지의 문자열 출력하고, 앞에 남는 부분은 공백으로 출력
		System.out.printf("[%.8s]%n", k15_url);//앞에서부터 8자리까지의 문자열 출력
			
	}

}
