package may21;
//Title : 단순 세금계산
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 단순세금계산 {
	
		public static int k15_taxcal(int k15_val, int k15_rate) {//세전 물건값을 val로, 세금비율을 rate로 선언
			int k15_ret;
			
			if(((double)k15_val*(double)k15_rate/100.0) == k15_val*k15_rate/100)
				k15_ret=k15_val*k15_rate/100;//세금을 나눠서 뚝 떨어지는 경우
			else
				k15_ret = k15_val*k15_rate/100 + 1;//세율을 나눠서 딱 떨이지 않는 경우 +1원을 더한다.
			
			return k15_ret;// 각 경우에서 나온 결과를 return값으로 저장
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_val = 271;//세전 물건값
		int k15_rate = 3;//세금 3퍼센트
		
		int k15_tax = k15_taxcal(k15_val, k15_rate);
		System.out.printf("***************************************************\n");
		System.out.printf("*                                  단순 세금 계산                                *\n");
		System.out.printf("실제 세금계산 : %f\n", k15_val*k15_rate/100.0);//rate쪽에서 double형식으로 연산하여 실수로 결과 도출
		
		System.out.printf("세전가격 : %d 세금 : %d 세포함가격 : %d\n", k15_val, k15_tax, k15_val + k15_tax);
		System.out.printf("***************************************************");
	}

}
