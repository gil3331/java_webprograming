package may20;
//Title : Overflow(과다형태)
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k15_sMin = -32768;//short형으로 -32768값을 sMin에 저장
		short k15_sMax = 32767;//short형으로 32767값을 sMax에 저장
		char k15_cMin = 0;//char형으로 0값을 cMin에 저장
		char k15_cMax = 65535;//char형으로 65535값을 cMax에 저장
		
		System.out.println("sMin = "+k15_sMin);//sMin을 출력
		System.out.println("sMin-1 = "+(short)(k15_sMin-1));//short형으로 출력하면 음수는 양수로 출력하여 1을 뺀 뒤 음수가 양수로 바뀜
		System.out.println("sMax = "+k15_sMax);//sMax를 출력
		System.out.println("sMax = "+(short)(k15_sMax+1));//short형으로 출력하면 양수는 음수로 출력하여 1을 더한 뒤 양수가 음수로 바뀜
		System.out.println("cMin = "+(int)k15_cMin);//cMin을 출력함
		System.out.println("cMin-1 = "+(int) --k15_cMin);//문자형인 cMin을 int형으로 바꾸고, 0에 1을 뺐을 때 본래 문자형에서의 65535 바이트제한이 나온다.
		System.out.println("cMax = "+(int)k15_cMax);//cMax를 출력함
		System.out.println("cMax+1 = "+(int) ++k15_cMax);//상위의 경우와 마찬가지로 65535에 1을 더해서 다시 0이 나온다.
		
	}

}
