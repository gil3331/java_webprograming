package may21;
//Title : 반올림 버림 처리
//Date : 2019.05.21
//Author : 이길준
//Comment : .....
public class 반올림버림처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_ii = 12345;
		int k15_j = (k15_ii/10)*10;//해당 숫자에서 10을 나눠 1의 자리 값을 덜어버리고, 10을 곱하여 1의 자리를 버림처리
		System.out.printf("#4-1 : %d\n",k15_j);//결과 출력
		
		k15_ii = 12345;
		k15_j = ((k15_ii+5)/10)*10;//위랑 같으나, 초기에 5를 더하여, 1의 자리를 반올림하고, 나눈 뒤 다시 10을 곱함.
		
		System.out.printf("#4-2 : %d\n", k15_j);//결과 출력
		
		k15_ii = 12344;
		k15_j = ((k15_ii+5)/10)*10;//같은 식이나, 뒷자리가 10의 단위로 오르지 못한체 결과를 도출하여, 12340이 나옴
		
		System.out.printf("#4-3 : %d\n", k15_j);//결과 출력
		
		k15_ii = 12350;
		k15_j = ((k15_ii + 50)/100)*100;//100의 자리 반올림
		
		System.out.printf("#4-4 : %d\n", k15_j);
		
		k15_ii = 12350;
		k15_j = ((k15_ii)/100)*100;//100의 자리 미만 버림
		
		System.out.printf("#4-5 : %d\n", k15_j);
		
		k15_ii = 12500;
		k15_j = ((k15_ii + 500)/1000)*1000;//1000의 자리 반올림
		
		System.out.printf("#4-6 : %d\n", k15_j);
		
		k15_ii = 12500;
		k15_j = ((k15_ii)/1000)*1000;//1000의 자리 버림
		
		System.out.printf("#4-7 : %d\n", k15_j);
		
		}
}
