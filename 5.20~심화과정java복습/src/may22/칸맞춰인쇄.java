package may22;

import java.text.DecimalFormat;
//Title :칸 맞춰 인쇄
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 칸맞춰인쇄 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_item="사과";//물품 명 사과 부여
		int k15_unit_price =5000;//가격은 5000원으로 설정
		int k15_num =500;//갯수 500개
		int k15_total=0;//교안에선 왜 total을 만들고, 사용하지 않는 걸까?(k15_unit_price*k15_num 왜 이걸로?)
		
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//포멧을 import하여, 포멧을 지정
		
		System.out.printf("============================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");//출력내용의 탭 내용을 이렇게 구성
		System.out.printf("============================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",//출력형식을 여기에 맞춰서 품목의 item명, 가격의 price, 수량의 num, 합계는 가격과 수량을 곱함(?!)
						k15_item,k15_df.format(k15_unit_price),k15_df.format(k15_num),k15_df.format(k15_unit_price*k15_num));
		System.out.printf("============================================================\n");
	}

}
