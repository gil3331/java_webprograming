package may22;
//Title :�Ƕ�̵� ���
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class �Ƕ�̵���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_n,k15_m;//��������
		k15_m=20;k15_n=1;
		
		while(true) {
			for(int k15_i=0;k15_i<k15_m;k15_i++) System.out.printf(" ");//�ʱ���� ���۵Ǵ� ������ ���ؼ� m���� �������� i�� ������ ������ ����ϰ�,  �Ʒ��� �Ŀ���
			for(int k15_i=0;k15_i<k15_n;k15_i++) System.out.printf("*");//���� �ʱ� �Ѱ����� ���۵Ǹ�, i���� �������� n���� ũ�� ���� �Ѱ��� ����ϰ�, �Ʒ��� �Ŀ���
			System.out.printf("\n");//������ ���
			
			k15_m=k15_m-1;//m���� 1�� ���� ���� ������ �ٿ�����.
			k15_n=k15_n+2;//���� �ΰ��� �þ�� ������ ���� ������ n���� 2�� ���Ѵ�.
			
			if(k15_m<0) break;//m���� -1�� �Ǹ� �극��ũ �Ͽ� �ݺ����� Ż���Ѵ�.
		}
	}

}
