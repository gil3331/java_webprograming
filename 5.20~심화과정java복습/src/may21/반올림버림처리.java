package may21;
//Title : �ݿø� ���� ó��
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class �ݿø�����ó�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_ii = 12345;
		int k15_j = (k15_ii/10)*10;//�ش� ���ڿ��� 10�� ���� 1�� �ڸ� ���� ���������, 10�� ���Ͽ� 1�� �ڸ��� ����ó��
		System.out.printf("#4-1 : %d\n",k15_j);//��� ���
		
		k15_ii = 12345;
		k15_j = ((k15_ii+5)/10)*10;//���� ������, �ʱ⿡ 5�� ���Ͽ�, 1�� �ڸ��� �ݿø��ϰ�, ���� �� �ٽ� 10�� ����.
		
		System.out.printf("#4-2 : %d\n", k15_j);//��� ���
		
		k15_ii = 12344;
		k15_j = ((k15_ii+5)/10)*10;//���� ���̳�, ���ڸ��� 10�� ������ ������ ����ü ����� �����Ͽ�, 12340�� ����
		
		System.out.printf("#4-3 : %d\n", k15_j);//��� ���
		
		k15_ii = 12350;
		k15_j = ((k15_ii + 50)/100)*100;//100�� �ڸ� �ݿø�
		
		System.out.printf("#4-4 : %d\n", k15_j);
		
		k15_ii = 12350;
		k15_j = ((k15_ii)/100)*100;//100�� �ڸ� �̸� ����
		
		System.out.printf("#4-5 : %d\n", k15_j);
		
		k15_ii = 12500;
		k15_j = ((k15_ii + 500)/1000)*1000;//1000�� �ڸ� �ݿø�
		
		System.out.printf("#4-6 : %d\n", k15_j);
		
		k15_ii = 12500;
		k15_j = ((k15_ii)/1000)*1000;//1000�� �ڸ� ����
		
		System.out.printf("#4-7 : %d\n", k15_j);
		
		}
}
