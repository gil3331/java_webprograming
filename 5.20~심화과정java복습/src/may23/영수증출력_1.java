package may23;
//Title : 영수증 출력_1
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class 영수증출력_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//숫자(특히 금액에서) 3자리 이상 넘어갈때 콤마,를 찍을수 있게 포멧을 지정
		System.out.println("                   영 수 증                     ");//영수증 출력
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.println("종로상회(분당서현점) 129-17-77924          ");//종로상회 이름 및 사업자 번호 출력
		System.out.println("이상철 031 781 1596                                ");//사업주 및 사업주 번호 출력
		System.out.println("성남시 분당구 서현동 269-3                          ");//사업장 주소 출력
		System.out.println("테이블명 : 12                                               ");//테이블 명 출력
		System.out.println("주문번호 : 20160425 01 00041                ");//주문번호 출력
		System.out.println("--------------------------------------------------");//줄 출력
		int k15_iPrice = 21000;//합계 가격을 변수로 지정
		System.out.printf("주문합계                                    %s\n",k15_df.format(k15_iPrice));//주문합계가 곧 합계 가격
		System.out.println("할인금액                                         0");//할인 가격 없음
		System.out.printf("받을금액                                    %s\n",k15_df.format(k15_iPrice));//받을 금액이 곧 합계 가격
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.printf("현금              %d      과세               %s\n",0,k15_df.format((int)(k15_iPrice/1.1)));//과세는 10%임으로 합계가격을 1.1로 나누면 산출된다.
		System.out.printf("카드         %s      세액                %s\n",k15_df.format(k15_iPrice),k15_df.format((int)(k15_iPrice-(k15_iPrice/1.1))));//세액은 합계가격에서 과세를 빼면 산출 가능
		System.out.println("포인트            0      면세                    0     ");//포인트 면세 특별히 없음
		System.out.printf("                         영수금액           %s\n",k15_df.format(k15_iPrice));//영수 금액이 곧 합계 가격
		System.out.println("--------------------------------------------------");//줄 출력
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");//날짜 포멧을 시스템 시간으로 불러와 포멧을 지정
		String format_time = formatT.format(System.currentTimeMillis());//지정된 포멧을 변수로 지정하여 사용가능하게 준비
		System.out.println("             [우리카드 신용 승인]     ");//우리카드 신용 승인 출력
		System.out.printf("승 인 일 시 : %s\n",format_time);//승인 일시에 아까 만든 시간 포멧을 적용하여 사용
		System.out.println("카 드 번 호 : 55222059****2021                                         ");//카드번호 출력
		System.out.println("승 인 번 호 : 79753574    할부개월 : 00 ");//승인번호 출력
		System.out.printf("승 인 금 액 : %s\n",k15_df.format(k15_iPrice));//승인금액이 곧 합계가격 출력
		System.out.println("가 맹 번 호 : 730461774   /   비씨카드사 ");//가맹번호 출력
		System.out.println("사업자 번호 : 129-17-77924");//사업자 번호 출력
		System.out.println("--------------------------------------------------");//줄 출력
		SimpleDateFormat formatOrderT = new SimpleDateFormat("yyyy-MM-dd   HH:mm");//두번째로 들어갈 시간 포멧이 다름으로 다시 하나 형식에 맞춰 준비
		String format_Order_time = formatOrderT.format(System.currentTimeMillis());	//포멧된 시간을 변수로 선언
		System.out.printf("%s      CASHIER :          ***직원\n",format_Order_time);//여기에서 포멧된 시간을 사용
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.println("감사 합니다.");//감사합니다 출력
	}

}
