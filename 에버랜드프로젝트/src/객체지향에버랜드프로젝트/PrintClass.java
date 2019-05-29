package 객체지향에버랜드프로젝트;

public class PrintClass {

	int[] count;
	int[] returnPrice;

	PrintClass() {
		count = new int[20];
		returnPrice = new int[20];

	}

	public void PrintTicket(int[] returnPrice, int[] count, String[] TicketN, String[] AgeTN, String[] TypeN,int tryCount) {
	//외부에서 정보와 변수를 받아오기 위해서 printticket메서드에 각종 변수들을 지정하여 정보를 받고,
			System.out.printf("=================에버랜드====================\n");
		for (int i = 0; i <= tryCount; i++) {//i값을 배열로 받아 상위의 메서드에서 받은 변수를 아래의 출력값으로 출력함.
			System.out.printf("권종:%s %s %d장 총액 : %d원 %s 우대입니다.\n", TicketN[i], AgeTN[i], count[i], returnPrice[i],TypeN[i]);
			System.out.printf("===========================================\n");
		}

	}

}
