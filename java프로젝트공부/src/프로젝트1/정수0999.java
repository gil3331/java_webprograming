package 프로젝트1;

import java.util.Scanner;

public class 정수0999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int x=in.nextInt();
		int y=x/100;
		//백의 자리 구성-세자리 값에서 100을 나눈 첫자리 몫이 곧 백의 자리 수
		int z=(x-y*100)/10;
		//십의 자리 구성-세자리 값에서 백단위(백단위는 전체값을 100으로 나눈 몫을 100을 곱하여 백의 자리를 소거)를 빼고, 그 뺀 값을 10으로 나눈 몫이 곧 십의 자리 수
		int a=x%10;
		//일의 자리 구성-전체값을 10으로 나눴을때, 나오는 첫자리의 나머지가 곧 일의 자리 수
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.printf("각 자리수의 합 : %d",y+z+a);
		in.close();
	}

}
