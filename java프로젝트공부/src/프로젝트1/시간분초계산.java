package 프로젝트1;

import java.util.Scanner;

public class 시간분초계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.printf("초 단위 정수를 입력하세요 : ");
		int second = in.nextInt();
		int minute;
		int hour;
		hour=second/3600;
		second = second - (3600 * hour);
		minute=second/60;
		//초를 60으로 나누면 분
		second=second- (60*minute);
		
		//분을 60으로 나누면 시간
		
		//분으로 나누고 남은 '나머지' 초
		System.out.printf("%d시간 %d분 %d초\n",hour,minute,second);
		//시간 분 초로 출력하기 위해 각 부분에 %d를 사용하고, 조건으로 시간, 분, 나머지 초로 계산함
		in.close();
		
		
		
	}

}
