package may21;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Title : 환전 계산
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 환전계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_MyWon = 1000000;//백만원을 달러로 환전하기 위한 한화
		double k15_MoneyEx = 1238.21;//그 당시 달러 환율
		double k15_commission = 0.003;//환전 수수료
		
		int k15_usd = (int)(k15_MyWon/k15_MoneyEx);//전체 금액을 환율로 나누면서, int형으로 실수부분을 버림처리
		int k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx);//백만원에다가 us달러와 환율을 곱한 값을 뺌으로서, 잔액을 구함.
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                       수수료 없이 계산                                      *\n");
			
		System.out.printf("총 한화환전금액 : %d원 =>	미화 : %d달러, 잔돈 :  %d원\n",k15_MyWon, k15_usd, k15_remain);//결과 출력
		System.out.printf("***********************************************************\n");
		
		double k15_ComPerOne = k15_MoneyEx * k15_commission;//달러당 수수료는 환율에 환전 수수료를 곱하면 된다.
		
		double k15_totalcom = k15_usd * k15_ComPerOne;//총 수수료는 받아야할 달러에 달러당 수수료를 곱하면 된다.(1원 이하를 어떻게 처리할지 생각필요)
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                          수수료 계산                                          *\n");
			
		System.out.printf("총 수수료 : %f원 =>	미화 : %d달러, 달러당 수수료 :  %f원\n", k15_totalcom, k15_usd, k15_ComPerOne);//결과 출력
		System.out.printf("***********************************************************\n");
		
		int k15_i_totalcom;
		
		if(k15_totalcom != (double)((int)k15_totalcom))
			k15_i_totalcom = (int)k15_totalcom + 1;//총 수수료를 나눠구했을 때, 1원 미만으로 길게 붙기 때문에 반올림하는 케이스 
		else
			k15_i_totalcom = (int)k15_totalcom;//아닌 경우는 그냥 정수형 표현
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                     수수료 적용환전                                         *\n");
			
		System.out.printf("총 수수료 : %d원 =>	미화 : %d달러, 달러당 수수료 :  %f원\n", k15_i_totalcom, k15_usd, k15_ComPerOne);
		
		k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx - k15_i_totalcom);
		System.out.printf("총 한화환전금액 : %d원 =>	미화 : %d달러, 수수료징구 :  %d원, 잔돈 : %d\n", k15_MyWon, k15_usd, k15_i_totalcom, k15_remain);
		System.out.printf("***********************************************************\n");
		
		k15_usd = (int)(k15_MyWon/(k15_MoneyEx + k15_ComPerOne));//내 한화에서 달러 환율과 달러당 수수료를 더하여 나누면 환전 달러가 계산된다.
		k15_totalcom = k15_usd * k15_ComPerOne;//총 수수료는 환전 달러에 달러당 수수료를 곱한 값이다.
		
		if(k15_totalcom != (double)((int)k15_totalcom))
			k15_i_totalcom = (int)k15_totalcom + 1;// 상위의 식과 같게 나오지 않으면, 1을 더하여 반올림하고, 
		else
			k15_i_totalcom = (int)k15_totalcom;//같게 나오면 정상이니, 그냥 int형으로 저장한다.
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                            (정확한)수수료 적용환전                                      *\n");
		System.out.printf("총 수수료 : %d원 =>	미화 : %d달러, 달러당 수수료 :  %f원\n", k15_i_totalcom, k15_usd, k15_ComPerOne);//결과 출력
		
		k15_remain = (int)(k15_MyWon - k15_usd * k15_MoneyEx - k15_i_totalcom);//나머지 잔액은 원래의 한화 총액에 환전된 달러와, 달러환율을 곱하고, 거기에 수수료징구액을 뺀 값을 빼면 나온다.
		System.out.printf("총 한화환전금액 : %d원 =>	미화 : %d달러, 수수료징구 :  %d원, 잔돈 : %d원\n", k15_MyWon, k15_usd, k15_i_totalcom, k15_remain);
		System.out.printf("***********************************************************\n");
		
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//포멧을 적용하기 위한 포멧 선언(import도 필요!)
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                       콤마찍기, 날짜 적용                                  *\n");
		
		System.out.printf("총 수수료 : %s원 => 미화 : %s달러, 달러당 수수료 : %f원\n",
						k15_df.format(k15_i_totalcom),//각각의 변수에 format을 적용하여 표현
						k15_df.format(k15_usd),
						k15_ComPerOne);
		
		k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx - k15_i_totalcom);//나머지 잔액은 원래의 한화 총액에 환전된 달러와, 달러환율을 곱하고, 거기에 수수료징구액을 뺀 값을 빼면 나온다.
		System.out.printf("총 한화환전금액 : %s원 => 미화 : %s달러, 수수료징구 : %s원 잔돈 : %s원\n",
						k15_df.format(k15_MyWon), k15_df.format(k15_usd), k15_df.format(k15_i_totalcom),
						k15_df.format(k15_remain));
		
		Calendar k15_calt = Calendar.getInstance();//Calendar클래스를 가져오기 위함.
		SimpleDateFormat k15_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");//SimpleDateFormat클래스로 출력형식을 지정(이것도 역시 import 필요!)
		System.out.printf("최종실행시간 : %s\n", k15_sdt.format(k15_calt.getTime()));//만들어둔 calt변수로 현재 시간을 get하여 출력
		System.out.printf("***********************************************************\n");
		
	}

}
