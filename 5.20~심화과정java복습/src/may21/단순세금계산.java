package may21;
//Title : �ܼ� ���ݰ��
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class �ܼ����ݰ�� {
	
		public static int k15_taxcal(int k15_val, int k15_rate) {//���� ���ǰ��� val��, ���ݺ����� rate�� ����
			int k15_ret;
			
			if(((double)k15_val*(double)k15_rate/100.0) == k15_val*k15_rate/100)
				k15_ret=k15_val*k15_rate/100;//������ ������ �� �������� ���
			else
				k15_ret = k15_val*k15_rate/100 + 1;//������ ������ �� ������ �ʴ� ��� +1���� ���Ѵ�.
			
			return k15_ret;// �� ��쿡�� ���� ����� return������ ����
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_val = 271;//���� ���ǰ�
		int k15_rate = 3;//���� 3�ۼ�Ʈ
		
		int k15_tax = k15_taxcal(k15_val, k15_rate);
		System.out.printf("***************************************************\n");
		System.out.printf("*                                  �ܼ� ���� ���                                *\n");
		System.out.printf("���� ���ݰ�� : %f\n", k15_val*k15_rate/100.0);//rate�ʿ��� double�������� �����Ͽ� �Ǽ��� ��� ����
		
		System.out.printf("�������� : %d ���� : %d �����԰��� : %d\n", k15_val, k15_tax, k15_val + k15_tax);
		System.out.printf("***************************************************");
	}

}
