package 프로젝트1;

import java.util.Scanner;

public class 소문자대문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		char c;
		char d;
		c=in.nextLine().charAt(0);
		d=in.nextLine().charAt(0);
		c = (char) (c - 32);
		//알파벳 - 32= 소문자를 대문자로 바꿈
		System.out.println("대문자는 "+ c);
		d=(char) (d + 32);
		//알파벳 + 32= 대문자를 소문자로 바굼
		System.out.println("소문자는 "+ d);
		in.close();
		
	}

}
