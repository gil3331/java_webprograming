package 프로젝트1;
import java.util.Scanner;
public class 기본5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("가로를 입력하세요 : ");
		int x=in.nextInt();
		//출력대상 밑에서 x를 선언하여, 숫자를 기록할수 있게함(가로)
		System.out.print("세로를 입력하세요 : ");
		int y=in.nextInt();
		//출력대상 밑에서 y를 선언하여, 숫자를 기록할수 있게함(세로)
		int total=x*y;
		//출력전에 미리 total=x*y라고 선언하여 출력시 적용함
		System.out.printf("넓이는 %d 입니다.\n",total);
		in.close();
	}

}
