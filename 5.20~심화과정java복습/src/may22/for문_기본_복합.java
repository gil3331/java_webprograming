package may22;
//Title : for��(�⺻, ����)
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class for��_�⺻_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#�⺻for��
		int k15_sum = 0;//sum�� 0������ �ʱ�ȭ
		for(int k15_i=0;k15_i < 10;k15_i++){//i�� 0�� ��, 10���� ������ i�� 1�� �������� �ݺ��� 
			k15_sum = k15_sum + k15_i;//sum���� sum�� �ʱⰪ�� i�� ��ȭ�Ǵ� ���ڸ� ���ؼ� ���� ������.
		}
		System.out.printf("sum %d\n",k15_sum);//sum�� �ʱⰪ�� ��� 0���� ���ԵǾ� i�� ������ �����Ͽ� 1~9���� ���� ������ ����� ���
		
		for(int k15_i =1 ; k15_i < 10; k15_i++) {//�������� n���� ǥ�� �ϱ� ���� for��(���ڸ� �� n��)
			System.out.printf("*********************************\n");
			System.out.printf("                 ������ %d ��                      \n",k15_i);//n���� ���
			System.out.printf("*********************************\n");
			for (int k15_j =1; k15_j < 10; k15_j++) {//�������� ���ڸ��� ǥ���ϱ� ���� for��
				System.out.printf(" %d * %d = %d \n", k15_i, k15_j, k15_i*k15_j);//���ڸ��� i������, ���ڸ��� j������, �׸��� ����� �ΰ��� ����
			}
			
		}
		
	}

}
