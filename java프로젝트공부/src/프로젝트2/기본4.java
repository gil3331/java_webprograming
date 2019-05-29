package 프로젝트2;

import java.util.Scanner;

public class 기본4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90이상이면 A,90이상이 아닐 때, 80이상이면 B, 그렇지 않을 때, 70이상이면 C 그 아래면 D 아니면, F로 결과 도출
		Scanner in =new Scanner(System.in);
		int data;
		System.out.print("점수를 입력해주세요 : ");
		data = in.nextInt();
		if(data>=90) {
			System.out.println("A 입니다.");
		}else if (data>=80){
				System.out.println("B입니다.");
		}else if (data>=70){
				System.out.println("C입니다.");
		}else if (data>=60){
				System.out.println("D입니다.");
		}else if (data<60){
				System.out.println("F입니다.");
		}
		in.close();	
	}


}
