package may20;
//Title : 출력실습1
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k15_b = 1;//byte형으로 1값을 b에 저장
		short k15_s = 2;//short형으로 2값을 s에 저장
		char k15_c = 'A';//char형으로 A를 c에 저장
		
		int k15_finger = 10;//int형으로 10값을 finger에 저장
		long k15_big = 10000000000L;//long형으로 적힌 값을 big에 저장(long형으로 사용하기 위해 제일 뒤에 L을 씀-출력시엔 안나옴)
		long k15_hex = 0xFFFFFFFFFFFFFFFFL;//long형으로 적힌 값을 hex에 저장
		
		int k15_octNum = 010;//8진수 10, 10진수로는 8
		int k15_hexNum = 0x10;//16진수로는 10, 10진수로는 16
		int k15_binNum = 0b10;//2진수 10 , 10진수로는 2
		
		System.out.printf("b=%d%n", k15_b);//b값 출력
		System.out.printf("s=%d%n", k15_s);//s값 출력
		System.out.printf("c=%c, %d%n",  k15_c, (int)k15_c);//문자형의 경우는 A로 출력, 숫자형으로 바꾸면 아스키 코드로 출력되어 65로 출력
		System.out.printf("finger=[%5d]%n", k15_finger);//대괄호 내에서 앞에 5칸 공백을 두고 finger값을 출력
		System.out.printf("finger=[%-5d]%n", k15_finger);//대괄호 내에서 뒤에 5칸 공백을 두고 finger값을 출력
		System.out.printf("finger=[%05d]%n", k15_finger);//대괄호 내에서 앞에 5칸 공백을 두되, finger값을 뒤에서 부터 작성하여 남은 세칸에 0값으로 메꿈
		System.out.printf("big=%d%n", k15_big);//big값을 출력
		System.out.printf("hex=%#x%n", k15_hex);//#이 접두사가 되어 16진수 표기로 출력, 형식이 소문자x로 표기 되어 있어서 F는 f로 출력됨
		System.out.printf("octNum=%o , %d%n", k15_octNum , k15_octNum);//%o로 8진수 출력이 되고, %d로 10진수 출력이 된다.
		System.out.printf("hexNum=%x , %d%n", k15_hexNum , k15_hexNum);//%x로 16진수로 출력, %d로 10진수 출력
		System.out.printf("binNum=%s , %d%n", Integer.toBinaryString(k15_binNum), k15_binNum);//%s로 2진수 출력, %d로 10진수 출력
		
	}

}
