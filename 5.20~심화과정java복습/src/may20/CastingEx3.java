package may20;
//Title : CastingEx3(������ ����ȯ)
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float k15_f = 9.1234567f;//float������ �����ϴ� ��� �������� f�� ����� �Ѵ�.
		double k15_d = 9.1234567;//double���� ���� �ʾƵ� ��.
		double k15_d2 = (double)k15_f;//f�� float �����͸� �޾Ƽ� double�� ����ȯ ��.
		
		System.out.printf("f = %20.18f\n", k15_f);//�Ҽ��� 18�ڸ����� ǥ���Ͽ� 20�ڸ����� f���� ����Ѵ�(������ ������ 0���� ǥ��).-float���� �������� ������ �ս�
		System.out.printf("d = %20.18f\n", k15_d);//���������� ����ϸ� �Ҽ��� 18�ڸ����� ǥ���Ͽ� 20�ڸ��� d������ ���
		System.out.printf("d2 = %20.18f\n", k15_d2);//double�ӿ��� f���� �������� ������ �ʱ� f���� �̹� ������ �ս��� �Ͼ�� ������ ����ȯ �ص� �ǹ̰� ����
	}

}
