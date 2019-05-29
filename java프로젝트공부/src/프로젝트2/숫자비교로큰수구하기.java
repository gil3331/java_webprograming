package 프로젝트2;

import java.util.Scanner;

public class 숫자비교로큰수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x, y;//x와 y의 미지수를 선언하고,
		System.out.print("숫자를 입력해주세요 : ");
		x = in.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		y = in.nextInt();
		//x와 y를 기입하였을 때,
		if(x>=y) {//x가 y보다 큰 경우는 
			System.out.printf("큰 수는 %d 입니다.",x);
			//x값을 출력한 뒤 큰 수로 표현 
			}else {//x가 y보다 작은 경우에는,
				System.out.printf("큰 수는%d 입니다.",y);
			//y값을 출력한 뒤 큰 수로 표현
			}
		in.close();
	}
	
}
