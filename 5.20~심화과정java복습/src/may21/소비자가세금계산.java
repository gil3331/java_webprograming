package may21;
//Title : �Һ��ڰ� ���ݰ��
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class �Һ��ڰ����ݰ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_custom = 280;//�Һ��� ����
		int k15_taxrate = 3;//���� ���� 3%
		
		int k15_taxval, k15_netval;//�������ݰ� ������ ����
		
		k15_netval = (int)(k15_custom/(1 + k15_taxrate/100.0));// �������� �Һ��� ���ݿ� ���ݺ����� ����Ͽ� ����
		k15_taxval = k15_custom - k15_netval;//���� ������ �Һ��� ���ݿ��� �������� ���� ������ �����ϴ�.
		
		System.out.printf("***************************************************\n");
		System.out.printf("*                         �Һ��ڰ� �߽� ���� ���                            *\n");
			
		System.out.printf("�Һ��ڰ��� : %d	�������� : %d	���� : %d\n",k15_custom, k15_netval, k15_taxval);
		System.out.printf("***************************************************");
	}

}
