package may20;
//Title : ��½ǽ�1
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte k15_b = 1;//byte������ 1���� b�� ����
		short k15_s = 2;//short������ 2���� s�� ����
		char k15_c = 'A';//char������ A�� c�� ����
		
		int k15_finger = 10;//int������ 10���� finger�� ����
		long k15_big = 10000000000L;//long������ ���� ���� big�� ����(long������ ����ϱ� ���� ���� �ڿ� L�� ��-��½ÿ� �ȳ���)
		long k15_hex = 0xFFFFFFFFFFFFFFFFL;//long������ ���� ���� hex�� ����
		
		int k15_octNum = 010;//8���� 10, 10�����δ� 8
		int k15_hexNum = 0x10;//16�����δ� 10, 10�����δ� 16
		int k15_binNum = 0b10;//2���� 10 , 10�����δ� 2
		
		System.out.printf("b=%d%n", k15_b);//b�� ���
		System.out.printf("s=%d%n", k15_s);//s�� ���
		System.out.printf("c=%c, %d%n",  k15_c, (int)k15_c);//�������� ���� A�� ���, ���������� �ٲٸ� �ƽ�Ű �ڵ�� ��µǾ� 65�� ���
		System.out.printf("finger=[%5d]%n", k15_finger);//���ȣ ������ �տ� 5ĭ ������ �ΰ� finger���� ���
		System.out.printf("finger=[%-5d]%n", k15_finger);//���ȣ ������ �ڿ� 5ĭ ������ �ΰ� finger���� ���
		System.out.printf("finger=[%05d]%n", k15_finger);//���ȣ ������ �տ� 5ĭ ������ �ε�, finger���� �ڿ��� ���� �ۼ��Ͽ� ���� ��ĭ�� 0������ �޲�
		System.out.printf("big=%d%n", k15_big);//big���� ���
		System.out.printf("hex=%#x%n", k15_hex);//#�� ���λ簡 �Ǿ� 16���� ǥ��� ���, ������ �ҹ���x�� ǥ�� �Ǿ� �־ F�� f�� ��µ�
		System.out.printf("octNum=%o , %d%n", k15_octNum , k15_octNum);//%o�� 8���� ����� �ǰ�, %d�� 10���� ����� �ȴ�.
		System.out.printf("hexNum=%x , %d%n", k15_hexNum , k15_hexNum);//%x�� 16������ ���, %d�� 10���� ���
		System.out.printf("binNum=%s , %d%n", Integer.toBinaryString(k15_binNum), k15_binNum);//%s�� 2���� ���, %d�� 10���� ���
		
	}

}
