package 프로젝트1;

import java.util.Scanner;

public class 대학학점if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c;
		System.out.print("전공 이수 학점 : ");
		a = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		b = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		c = in.nextInt();
		if(a+b+c>=140&&a>=70&&((b>=30&&c>=30)||b+c>=80)) {
			System.out.print("졸업 가능");
			}else {
			System.out.print("졸업 불가");
			}
		
		
		in.close();
	}

}
