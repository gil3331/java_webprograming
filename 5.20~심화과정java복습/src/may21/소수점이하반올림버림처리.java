package may21;
//Title : �Ҽ��� ���� �ݿø� ���� ó��
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class �Ҽ������Ϲݿø�����ó�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_MyVal = 14/5;//int������ ���� ���� ����
		System.out.printf("#5-1 : %d\n", k15_MyVal);//14 ������ 5 �Ѱ� ����� ���
		
		double k15_MyValF;//double������ �Ǽ� ���� ����
		
		k15_MyValF = 14/5;//����Ե� ����� ����(�Ǽ�����������)�� ���´�.
		System.out.printf("#5-2 : %f\n", k15_MyValF);
		
		k15_MyValF = 14.0/5;//�츮�� ������ ���ϴ� �Ǽ� ������ ����� ���⼭ ������, ���α׷������� ���� �İ��� ������ü�� �ٸ���.
		System.out.printf("#5-3 : %f\n", k15_MyValF);
		
		k15_MyValF = (14.0)/5+0.5;//���α׷� �켱 ����ó���� ���� ���ϰ� �����°� �ƴ�, ������ ���ϴ� ���� �ȴ�.
		System.out.printf("#5-4 : %f\n", k15_MyValF);
		
		k15_MyVal = (int)((14.0)/5+0.5);//���� ������, int������ ���� ����ȯ �����ν�, ���� ���� ������ �Ǽ��� ����ó���ȴ�.
		System.out.printf("#5-5 : %d\n", k15_MyVal);
	}

}
