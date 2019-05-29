/*
  환율계산
 */
package 프로젝트2;

import java.util.Scanner;

public class 기본1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int kWon = 0;
		int left = 0;				
		double rate;//환율은 소수점도 나오기에 double로 표현
		System.out.printf("환율은 : ");//환율 직접입력
		rate = in.nextDouble();
		System.out.print("원화는 : ");//원화 직접입력
		kWon = in.nextInt();
	    double a = kWon/rate;//나누기로 가기때문에 double로 씀
		System.out.printf("원화 대비 달러는 : %d달러입니다.\n", (int)a);
		//나눠진 값이 소수점까지 출력되니 int로 강제 변환하여 정수로 출력
		double b = a-(int)a;
		//거스름돈을 알기 위해서 원래의 달러값에 정수의 달러값을 빼서 나머지 잔금부분을 계산
		System.out.printf("나머지 값은 : %f\n", b);
		double c = (double) b*rate;
		//거스름돈 계산을 위해서 상위의 달러 잔금부분을 다시 환율로 곱함
		left = (int)c % 10;
		//1의 자리 떨이를 위해 10으로 나눈 나머지를 사용
		System.out.printf("거스름 돈은 : %d원입니다.\n",(int)c - left);
		//한국돈에는 10원 단위까지만 있으므로, int로 정수변환 함과 동시에 left로 빼서 340원을 만듬 
		//달러 100달러,50달러,20달러,10달러,5달러,1달러별로 분류하기
		int hundred = (int)a/100;
		System.out.printf("백달러는 : %d장입니다.\n",hundred);
		//백달러는 간단하게 달러결과에서 100으로 나눈 몫이 곧 100달러가 몇장인지 알수 있음
		int fifty = ((int)a-((int)a-((int)a%100)))/50;
		System.out.printf("오십달러는 : %d장입니다.\n",fifty);
		//오십달러의 경우는 217달러에서 200을 빼고, 남은 17달러에 50을 나눈 나머지로 하여 뒤로 넘김
		int twenty = (((int)a-((int)a-((int)a%100)))%50)/20;
		System.out.printf("이십달러는 : %d장입니다.\n",twenty);
		//이십달러의 경우는 오십달러의 식을 그대로 가져온 뒤 50까지의 내용 뒤에 다시 20달러로 나눠본다.
		int ten = ((((int)a-((int)a-((int)a%100)))%50)%20)/10;
		System.out.printf("십달러는 : %d장입니다.\n",ten);
		//십달러도 이십달러의 식을 그대로 가져온 뒤 %20까지의 식을 나눈 나머지를 10으로 나눠 십달러가 몇장이 나오는지를 분석한다.
		int five = (((((int)a-((int)a-((int)a%100)))%50)%20)%10)/5;
		System.out.printf("오달러는 : %d장입니다.\n",five);
		//오달러 역시 십달러와 마찬가지로 식을 가져온뒤 %10까지의 나머지를 가지고 5로 나눠 몆장인지 파악한다.
		int one = ((((((int)a-((int)a-((int)a%100)))%50)%20)%10)%5)/1;
		System.out.printf("일달러는 : %d장입니다.\n",one);
		//일달러 역시 오달러와 마찬가지로 식을 가져온뒤 %5까지의 나머지를 가지고 1로 나눠 몆장인지 파악한다.
		in.close();
		
	}

}
