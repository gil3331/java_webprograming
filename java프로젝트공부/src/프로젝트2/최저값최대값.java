package 프로젝트2;

import java.util.Scanner;

public class 최저값최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c,d,e;
		System.out.print("숫자를 입력해주세요 : ");
		a = in.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		b = in.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		c = in.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		d = in.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		e = in.nextInt();
		if(a>=b&&a>=c&&a>=d&&a>=e) {
			System.out.printf("최대값은%d 입니다.\n ",a);
			//최대 값을 구하는 것이기 때문에 a가 최대로 나오는 경우를 모두 if조건에 담고, a가 최대값이 되게 만듬
		}else if(b>=c&&b>=d&&b>=e&&b>=a) {
			System.out.printf("최대값은%d 입니다.\n ",b);
			}//a가 최대값이 아닐때, b가 최대값이 되는 모든 경우의 수를 if조건에 담고, b가 최대값이 되게 함.
			else if(c>=d&&c>=e&&c>=a&&c>=b) {
				System.out.printf("최대값은%d 입니다.\n ",c);
			}//a,b가 아닌 경우 c가 되는 if조건에 담고, c가 최대값이 되게 함 
				else if(d>=e&&d>=a&&d>=b&&d>=c) {
					System.out.printf("최대값은%d 입니다.\n ",d);
				}//a,b,c가 아닐때, d가되는 경우 조건에 담고, d가 최대가 되게 함.
				else if(e>=a&&e>=b&&e>=c&&e>=d) {
					System.out.printf("최대값은%d 입니다.\n ",e);
				}//a,b,c,d가 아닐때, e가되는 경우 조건에 담고 e가 되게 함.
		if(a<=b&&a<=c&&a<=d&&a<=e) {
			System.out.printf("최소값은%d 입니다.\n ",a);
		}//최대값과 반대로 공식을 사용 하여, 최소값을 표현함.
		else if(b<=c&&b<=d&&b<=e&&b<=a) {
			System.out.printf("최소값은%d 입니다.\n ",b);
			}
		else if(c<=d&&c<=e&&c<=a&&c<=b) {
				System.out.printf("최소값은%d 입니다.\n ",c);
				}else if(d<=e&&d<=a&&d<=b&&d<=c) {
					System.out.printf("최소값은%d 입니다.\n ",d);
				}else if(e<=a&&e<=b&&e<=c&&e<=d) {
					System.out.printf("최소값은%d 입니다.\n ",e);
				}
		in.close();			
		}
		
}
			


