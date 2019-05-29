package 프로젝트1;

import java.util.Scanner;

public class 대학학점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c;
		String d;
		//d의 경우 숫자를 출력하는게 아닌, "졸업 가능 불가"의 글자를 출력해야 하기 때문에 String을 사용(int는 상수만!!)
		System.out.print("전공 이수 학점 : ");
		a = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		b = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		c = in.nextInt();
		d=((a+b+c>=140)&&(a>=70)&&(((b>=30)&&(c>=30))||(b+c>=80)))? "졸업 가능":"졸업 불가";
		System.out.print(d);
		
		in.close();
	}

}
