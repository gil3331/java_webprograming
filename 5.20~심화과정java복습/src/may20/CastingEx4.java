package may20;
//Title : CastingEx4(������ ����ȯ)
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class CastingEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_i = 91234567;//�ش� ���ڸ� int������ i�� ����
		float k15_f = (float)k15_i;//i���� float������ ����ȯ �Ͽ� f�� ����
		int k15_i2 = (int)k15_f;//f���� int������ ����ȯ�Ͽ� i2�� ����
		
		double k15_d = (double)k15_i;//i���� double�� ����ȯ �ϰ�, d�� ����
		int k15_i3 = (int)k15_d;//d���� int������ ����ȯ �Ͽ� i3�� ����
		
		float k15_f2 = 1.666f;//f2�� �ش� ���ڸ� float������ ����
		int k15_i4 = (int)k15_f2;//f2���� int������ ����ȯ�Ͽ� i4�� ����
		
		System.out.printf("i=%d\n", k15_i);//i���� ���
		System.out.printf("f=%f i2=%d\n", k15_f, k15_i2);//f���� i2���� ���(float������ �����Ͱ� �ս��� �Ͼ)
		System.out.printf("d=%f i3=%d\n", k15_d, k15_i3);//d���� i3���� ���(double������ ��ȯ�Ǿ� �Ҽ����� ����)
		System.out.printf("(int)%f = %d\n", k15_f2, k15_i4);//�Ҽ��� �����͸� int�� ����ȯ �Ͽ�, ������ 1�� ���
		
	}

}
