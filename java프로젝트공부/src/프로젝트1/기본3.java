package 프로젝트1;
import java.util.Scanner;
public class 기본3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int total=x+y;
		int multiplication=x*y;
		//multiplication=mul=곱하기
		int minus=x-y;
		double divide=(double)x/(double)y;
		//나누기=divide=div로 표현
		int mod = x%y;
		//mod는 나눈 뒤의 첫번째 나머지를 의미함
		System.out.printf("%d*%d은 %d입니다.\n",x,y,multiplication);
		System.out.printf("%d+%d는 %d입니다.\n",x,y,total);
		System.out.printf("%d/%d는 %f입니다.\n",x,y,divide);
		System.out.printf("%d-%d는 %d입니다.\n",x,y,minus);
		System.out.printf("%d/%d의 나머지는 %d입니다.\n",x,y,mod);
		in.close();
		//Scanner in에서 in을 열고 닫지 않았기 때문에 in.close();를 사용하여 in을 닫아준다.-오류예방
		
	}

}
