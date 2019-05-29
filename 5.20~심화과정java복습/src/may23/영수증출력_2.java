package may23;
//Title : 영수증 출력_2
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class 영수증출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//금액의 포멧을 지정하여 콤마 구현
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy/MM/dd-ssss-HHmm");//시간을 시스템에서 불러와 포멧 구성
		String format_time = formatT.format(System.currentTimeMillis());//그런 포멧을 변수로 준비
		
		SimpleDateFormat formatLT = new SimpleDateFormat("yyyyMMddHHmmss");//시간을 시스템에서 불러와 포멧 구성
		String format_Ltime = formatLT.format(System.currentTimeMillis());//그런 포멧을 변수로 준비
		
		SimpleDateFormat formatFT = new SimpleDateFormat("yyyyMMdd  HHmmss");//시간을 시스템에서 불러와 포멧 구성
		String format_Ftime = formatFT.format(System.currentTimeMillis());//그런 포멧을 변수로 준비
		
		String k15_itemname1, k15_itemname2;//item 이름을 두개 선언
		String k15_itemcode1, k15_itemcode2;//item 코드를 두개 선언
		int k15_price1, k15_price2;//item 가격을 두개 선언
		int k15_num1, k15_num2;//item 수량을 두개 선언
		
		k15_itemname1="하루돈까스";//1번 상품 이름 지정
		k15_itemcode1="000010";//1번 상품 코드 지정
		k15_price1=8000;//1번 상품 가격 지정
		k15_num1=1;//1번 상품 수량 지정
		
		k15_itemname2="냉우동";//2번 상품 이름 지정
		k15_itemcode2="000006";//2번 상품 코드 지정
		k15_price2=8000;//2번 상품 가격 지정
		k15_num2=2;//2번 상품 수량 지정
		
		System.out.println("충주(양평) 휴게소");//사업장명 출력
		System.out.println("충북충주시가금면용전리380-4");//사업장 주소 출력
		System.out.println("최병권 677-85-00239 TEL : 043-857-9229");//사업주, 사업자 번호 사업자 전번 출력
		System.out.printf("[정상등록]%s          POS번호 : 0002\n",format_Ftime);//첫번째로 들어가는 시간 포멧 출력
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.println("품목코드                    단가     수량     금액");//영수증 텝 구성
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.printf("%s\n",k15_itemname1);//상품1 이름 출력
		System.out.printf("%s                     %s        %d    %s\n",k15_itemcode1, k15_df.format(k15_price1), k15_num1, k15_df.format(k15_price1*k15_num1));//품목코드, 단가 ,수량, 금액을 출력
		System.out.printf("%s\n",k15_itemname2);//상품2 이름 출력
		System.out.printf("%s                     %s        %d   %s\n",k15_itemcode2, k15_df.format(k15_price2), k15_num2, k15_df.format(k15_price2*k15_num2));//품목코드, 단가 ,수량, 금액을 출력
		System.out.println();//개행으로 구분
		int k15_taxPrice1, k15_taxPrice2;//세금 부분을 위한 변수선언
		k15_taxPrice1 =(int)(k15_price1/1.1);//상품 1의 과세를 구성(원가/1.1)
		k15_taxPrice2 =(int)(k15_price2/1.1);//상품 2의 과세를 구성(원가/1.1)
		System.out.printf("과세 물품 합계                              %s\n", k15_df.format(k15_taxPrice1+k15_taxPrice2));//과세 물품 합계니깐 상품1,2과세 더함
		System.out.printf("부    가    세                               %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)-(k15_taxPrice1+k15_taxPrice2)));//부가세는 합계금액에서 과세물품 합계를 빼면 끝
		System.out.printf("합          계                              %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//합계금액은 상품1*수량 + 상품2*수량하면 끝
		System.out.println("026-비씨카드사                              00/00A");//비씨카드사 출력
		System.out.println("카  드  번  호 :               5522-20**-****-BADD");//카드번호 출력
		System.out.printf("카  드  매  출 :                            %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//카드 매출이 곧 합계금액임
		System.out.println("거  래  구  분 :                            일시불");//거래구분 출력
		System.out.println("승  인  번  호 : 04-KICC                  75549250");//승인번호 출력
		System.out.println("가 맹 점 번 호 : ");//가맹점번호 출력
		System.out.printf("받  은  금  액 :                            %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//받은 금액이 곧 합계금액
		System.out.println("거    스    름 :                                 0");//거스름 출력
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.println("주문번호 :     0920");//주문번호 출력
		System.out.println("--------------------------------------------------");//줄 출력
		System.out.println("판매원 : 000002 편의점2");//판매원 출력
		System.out.printf("%s\n",format_time);//두번째 시간 포멧 출력
		System.out.printf("연동모듈  : [00138705   %s]\n",format_Ltime);//연동모듈 출력(마지막 시간 포멧을 출력)
	}
}