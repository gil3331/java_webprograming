package may23;
//Title : 달력인쇄
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
public class 달력인쇄 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_iWeekday = 5;//각 날짜들의 위치를 잡기 위한 변수
		int[] k15_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };//매월의 마지막날을 일차원 배열로 순서대로 저장(윤년기준임)
		for (int k15_iMon = 0; k15_iMon < 12; k15_iMon++) {//매월에 대해서 0~11까지 총 12개월의 월을 구성
			System.out.printf("\n\n               %d월\n", k15_iMon + 1);//실제로는 0월이 없기 때문에 0~11까지 1씩 더해서 1~12월로 구성
			System.out.printf("=====================================\n");//n월 아래에 줄을 형성
			System.out.printf("   일   월   화   수   목   금   토\n");//요일구성
			for (int k15_i = 1; k15_i <= k15_iEnd[k15_iMon]; k15_i++) {//날짜를 i값으로 지정하여 매월의 배열에 End로
																												 //날짜의 마지막을 체크하면서 i를 1씩 더해주는 for문 구성 

				if (k15_i == 1) {
					for (int i = 0; i < k15_iWeekday; i++) {//이 부분이 중요한데, 날짜가 1일인 상황에서 1월 1일 기준이 금요일이어야 함으로 
						System.out.print("     ");//앞에 0~4까지의 자리에 공백을 넣어서 1일을 밀어줌.
					}
				}

				System.out.printf("%5d", k15_i);//날짜를 날짜 for문 조건에 맞춰 출력

				k15_iWeekday++;//날짜들의 위치를 잡는 변수를 1씩 더해서 각 날짜의 위치를 조정함

				if (k15_iWeekday == 7) {//날짜가 토요일을 지날 때, 다시 일요일부터 시작하기 위하여 
					k15_iWeekday = 0;//0값으로 초기화 해준다.
					System.out.println();//해당 for문이 끝나면 개행을 하여 n월을 구분해준다.
				}
			}
		}
	}

}
