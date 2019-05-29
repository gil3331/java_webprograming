package may20;
//Title : CastingEx2(강제적 형변환)
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_i =10;//int형으로 10을 i에 저장
		byte k15_b = (byte)k15_i;//b를 i에서 변수로 받아 byte로 형변환함.
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k15_i, k15_b);//결과를 출력
		
		k15_i = 300;//300을 i에 저장
		k15_b = (byte)k15_i;//그런 i를 받아서 byte로 형변환
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k15_i, k15_b);//결과를 출력
		
		k15_b = 10;//10을 b에 저장
		k15_i = (int)k15_b;//i에 b를 받고, int형으로 형변환
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k15_b, k15_i);//결과를 출력
		
		k15_b = -2;//-2를 b에 저장
		k15_i = (int)k15_b;//i에 b를 받고, int형으로 형변환
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k15_b, k15_i);//결과를 출력
		
		System.out.println("i= " +Integer.toBinaryString(k15_i));//매개변수에 integer를 사용하여 2진수로 바꿈
	}

}
