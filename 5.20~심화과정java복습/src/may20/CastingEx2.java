package may20;
//Title : CastingEx2(������ ����ȯ)
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_i =10;//int������ 10�� i�� ����
		byte k15_b = (byte)k15_i;//b�� i���� ������ �޾� byte�� ����ȯ��.
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k15_i, k15_b);//����� ���
		
		k15_i = 300;//300�� i�� ����
		k15_b = (byte)k15_i;//�׷� i�� �޾Ƽ� byte�� ����ȯ
		System.out.printf("[int -> byte] i=%d -> b=%d%n", k15_i, k15_b);//����� ���
		
		k15_b = 10;//10�� b�� ����
		k15_i = (int)k15_b;//i�� b�� �ް�, int������ ����ȯ
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k15_b, k15_i);//����� ���
		
		k15_b = -2;//-2�� b�� ����
		k15_i = (int)k15_b;//i�� b�� �ް�, int������ ����ȯ
		System.out.printf("[byte -> int] b=%d -> i=%d%n", k15_b, k15_i);//����� ���
		
		System.out.println("i= " +Integer.toBinaryString(k15_i));//�Ű������� integer�� ����Ͽ� 2������ �ٲ�
	}

}
