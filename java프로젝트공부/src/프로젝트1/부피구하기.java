package 프로젝트1;

import java.util.Scanner;

public class 부피구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		//부피=반지름*반지름*높이*PI(3.14)
		
		float PI=(float)3.14;
		//PI는 소수점이기 때문에 (float)강제 변환 방식으로 표현
		System.out.print("원기둥의 밑면의 반지름은?");
		int radius = in.nextInt();
		//특별히 구하지 않기때문에 상수값 입력식을 사용
		System.out.print("원기둥의 높이는?");
		int height = in.nextInt();
		//특별히 구하지 않기때문에 상수값 입력식을 사용
		float total = (float)(radius*radius*height)*PI;
		//부피 계산법=반지름*반지름*높이*PI(3.14)
		System.out.printf("원기둥의 부피는? %.1f\n",total);
		//식에 PI가 곱해져 있어 소수점이 나올것이기 때문에 %.1f로 소수점을 표현함(.1을 통해 소수점 한자리까지만 표현)
		in.close();
	}

}
