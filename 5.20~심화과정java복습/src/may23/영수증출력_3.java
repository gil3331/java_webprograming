package may23;
//Title : 영수증 출력_3
//Date : 2019.05.23
//Author : 이길준
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class 영수증출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//금액의 포멧지정
			
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy-MM-dd  HH:mm");//시간의 포멧 지정
		String format_time = formatT.format(System.currentTimeMillis());//포멧된 시간을 변수로 저장
		
		String k15_star = "";		// 별을 찍어줄지 말지에 쓰인다
		int k15_no_TaxItem=0;		// TaxFree 항목들의 총가격
		int k15_yes_TaxItem=0;		// Tax 항목들의 총가격
		int k15_Price_noTax;		// 부가세가 부여되지 않은 Tax 항목들의 총가격
		int k15_total_tax;			// 총 부가세	
		
		String [] k15_itemname = {"초코파이","오이","포도","송이버섯","그린믹스","레드믹스","쌈채소","삼겹살"//상품명 30개 1차원 배열로 저장(30개 실화?!)
				,"항정살","목살","등심","안심","보쌈","콩나물","쌀","밀감","오렌지","귤","양상추","신선특란",
				"계란말이용채소","감자깡","새우깡","초코칩","쌀국수","삼양라면","아메리카노","녹차라떼","TOP라떼","삼치살"};
		
		int [] k15_price= {1,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,100000,1000000};//상품별 가격 1차원 배열로 저장
		int [] k15_num= {1,4,6,8,10,1,3,5,7,9,1,2,3,4,5,6,7,8,9,10,11,15,13,17,19,20,12,14,16,18};//상품별 수량 1차원 배열로 저장
		boolean [] k15_taxfree= {true,true,false,true,true,false,false,true,false,true,true,false,false,true,false,true,true,false,false,true,false,true,
				true,false,false,true,false,true,false,true};//상품별 과세 면세 1차원 배열로 저장
				
		String [] k15_array = new String[k15_itemname.length];//상품명을 length로 길이 판단하여 1차원 배열로 저장
		
		for(int n=0; n<k15_itemname.length; n++) {//상품명에 대한 라인을 위해서 length로 비교
			String nowitem = k15_itemname[n];//nowitem으로 상품 명을 준비
			for(int m=0; m<=14-k15_itemname[n].getBytes().length; m++) {//getBytes로 글자별 바이트 체크
				nowitem = nowitem + " ";//상품명별 모자른 공간을 공백으로 매꿈
			}
			k15_array[n] = String.format("%s",nowitem);//array에 상품명을 저장
		}
		
		System.out.println("이마트 정자점 (031)888-1234");//이마트 정자점 출력
		System.out.println("206-86-50913 이갑수");//사업자 번호 및 사업주명 출력
		System.out.println("성남시 분당구 정자동 112번지");//사업장 주소 출력
		System.out.println();//개행 출력
		System.out.println("영수증 미지참시 교환/환불 불가(30일내)");//영수증~ 출력
		System.out.println("교환/환율 구매점에서 가능(결제카드지참)");//교환/환불~ 출력
		System.out.println("체크카드/신용카드 청구취소 반영은");//체크카드/신용카드~출력
		System.out.println("최대 3~5일 소요 (주말, 공휴일제외)");//최대 3~출력
		System.out.println();//개행 출력
		System.out.printf("[정상등록]%s     POS : 0009-2418\n",format_time);//정상등록 출력 및 시간 포멧 출력
		System.out.println("-----------------------------------------------");//줄 출력
		System.out.println("    상 품 명             단 가   수량    금 액");//영수증 상단 텝 출력
		System.out.println("-----------------------------------------------");//줄 출력
				for(int k15_i=0; k15_i<k15_itemname.length; k15_i++) {//상품명 길이로 상품 확인
			if(k15_taxfree[k15_i] == false) {//면세상품인 경우
				k15_star = "*";//번호에 *을 지정
				k15_no_TaxItem = k15_no_TaxItem + k15_price[k15_i]*k15_num[k15_i];//면세상품에 대한 계산 산출
			}
			else {//과세 상품인 경우
				k15_star = "";//딱히 없다....
				k15_yes_TaxItem = k15_yes_TaxItem + k15_price[k15_i]*k15_num[k15_i];//과세상품에 대한 계산 산출
			}
			System.out.printf("%2d%1s %s %10s %5s %10s\n", k15_i+1,k15_star,k15_array[k15_i],//출력형식에 맞춰서 상품별 번호, 상품명, 단가, 수량, 상품별 합계를 출력 
																	k15_df.format(k15_price[k15_i]), k15_num[k15_i], 
																	k15_df.format(k15_price[k15_i]*k15_num[k15_i]));
		}
		double k15_Tax = k15_yes_TaxItem / 11;//부가세 1차
		
		if((k15_Tax*10)%10 >= 0)//과세에 대한 계산
			k15_total_tax = (int)k15_Tax + 1;//상세 부가세 가격 산출
		else
			k15_total_tax = (int)k15_Tax;//부가세 가격 산출
		k15_Price_noTax = k15_yes_TaxItem - k15_total_tax;//면세물품 가격 산출
		System.out.printf("            %s         %11s\n", "(*)면 세  물 품", k15_df.format(k15_no_TaxItem));//면세물품 가격 출력
		System.out.printf("               %s         %11s\n", "과 세  물 품", k15_df.format(k15_Price_noTax));//과세물품 가격 출력
		System.out.printf("               %s         %11s\n", "부   가   세", k15_df.format(k15_total_tax));//부가세 가격 출력
		System.out.printf("               %s         %11s\n", "합        계", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//합계가격 출력
		System.out.printf("결 제 대 상 금 액                   %11s\n", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//결제대상금액 출력
		System.out.println("-----------------------------------------------");//줄 출력
		System.out.printf("0024 하  나                 5417**8890/07850246\n");//카드번호 출력
		System.out.printf("카드결제                    %s /%11s\n", "일시불", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//카드결제 출력
		System.out.println("-----------------------------------------------");//줄 출력
		System.out.println("이*준 고객님의 포인트 현황입니다.");//포인트 현황 출력
		}
}