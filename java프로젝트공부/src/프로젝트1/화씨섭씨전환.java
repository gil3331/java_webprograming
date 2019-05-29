package 프로젝트1;

import java.util.Scanner;

public class 화씨섭씨전환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("화씨온도는 : ");
		//온도는 기본적으로 소수점도 표현됨으로 가급적이면 (float)이나, x값에 f를 붙혀 소수점으로 표현<(float)x값=x값f>
		float Fahrenheit = in.nextFloat();
		float Celsius = (float)5/9*(Fahrenheit-32);
		//화씨온도에서 섭씨온도 계산법=5/9*(화씨온도-32)
		//섭씨온도 공식에 나누기가 있어 소수점이 나올수 있기에 (float)강제 변환으로 소수점을 유지해준다.
		System.out.printf("화씨온도 %.1f는 섭씨온도 %.1f입니다.",(float)Fahrenheit, (float)Celsius);
		//소수점이 너무 길게 출력될수 있어서 %.1f로 소수점 한자리까지 출력되게 설정함.
		in.close();
	}

}
