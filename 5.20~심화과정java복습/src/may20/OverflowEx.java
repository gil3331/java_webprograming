package may20;
//Title : Overflow(��������)
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short k15_sMin = -32768;//short������ -32768���� sMin�� ����
		short k15_sMax = 32767;//short������ 32767���� sMax�� ����
		char k15_cMin = 0;//char������ 0���� cMin�� ����
		char k15_cMax = 65535;//char������ 65535���� cMax�� ����
		
		System.out.println("sMin = "+k15_sMin);//sMin�� ���
		System.out.println("sMin-1 = "+(short)(k15_sMin-1));//short������ ����ϸ� ������ ����� ����Ͽ� 1�� �� �� ������ ����� �ٲ�
		System.out.println("sMax = "+k15_sMax);//sMax�� ���
		System.out.println("sMax = "+(short)(k15_sMax+1));//short������ ����ϸ� ����� ������ ����Ͽ� 1�� ���� �� ����� ������ �ٲ�
		System.out.println("cMin = "+(int)k15_cMin);//cMin�� �����
		System.out.println("cMin-1 = "+(int) --k15_cMin);//�������� cMin�� int������ �ٲٰ�, 0�� 1�� ���� �� ���� ������������ 65535 ����Ʈ������ ���´�.
		System.out.println("cMax = "+(int)k15_cMax);//cMax�� �����
		System.out.println("cMax+1 = "+(int) ++k15_cMax);//������ ���� ���������� 65535�� 1�� ���ؼ� �ٽ� 0�� ���´�.
		
	}

}
