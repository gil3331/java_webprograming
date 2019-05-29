package 프로젝트1;

import java.util.Scanner;

public class 정수의truefalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("정수는 : ");
		int x = in.nextInt();
		boolean ToF, y, z;
		ToF=(x%4==0&&x%5==0)? true : false;
		//ToF는 x를 4로 나눴을때, x를 5로 나눴을때 나머지가 0인 경우는 true, 아닌 경우는 false가 뜬다.
		y=(x%4==0||x%5==0) ? true : false;
		//y는 x를 4로 나눴을때 나머지가 0이거나, x를 5로 나눴을때 나머지가 0인 경우 true, 아닌 경우는 false가 뜬다.
		z=((x%4==0||x%5==0)&&(x%4==0&&x%5==0)) ? true : false;
		//z는 ToF와 y식이 모두 맞는 경우 true, 아닌 경우 false가 뜬다.
		System.out.println("1번조건은 : "+ToF);
		System.out.println("2번조건은 : "+y);
		System.out.println("3번조건은 : "+z);	
		in.close();
		
	}

}
