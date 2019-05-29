package may21;
//Title : 소비자가 세금계산
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 소비자가세금계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_custom = 280;//소비자 가격
		int k15_taxrate = 3;//세금 비율 3%
		
		int k15_taxval, k15_netval;//세전가격과 순가격 선언
		
		k15_netval = (int)(k15_custom/(1 + k15_taxrate/100.0));// 순가격은 소비자 가격에 세금비율을 계산하여 산출
		k15_taxval = k15_custom - k15_netval;//세전 가격은 소비자 가격에서 순가격을 빼면 산출이 가능하다.
		
		System.out.printf("***************************************************\n");
		System.out.printf("*                         소비자가 중심 세금 계산                            *\n");
			
		System.out.printf("소비자가격 : %d	세전가격 : %d	세금 : %d\n",k15_custom, k15_netval, k15_taxval);
		System.out.printf("***************************************************");
	}

}
