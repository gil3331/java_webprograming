package may22;

import java.text.DecimalFormat;
//Title :ĭ ���� �μ�
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class ĭ�����μ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_item="���";//��ǰ �� ��� �ο�
		int k15_unit_price =5000;//������ 5000������ ����
		int k15_num =500;//���� 500��
		int k15_total=0;//���ȿ��� �� total�� �����, ������� �ʴ� �ɱ�?(k15_unit_price*k15_num �� �̰ɷ�?)
		
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//������ import�Ͽ�, ������ ����
		
		System.out.printf("============================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");//��³����� �� ������ �̷��� ����
		System.out.printf("============================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",//��������� ���⿡ ���缭 ǰ���� item��, ������ price, ������ num, �հ�� ���ݰ� ������ ����(?!)
						k15_item,k15_df.format(k15_unit_price),k15_df.format(k15_num),k15_df.format(k15_unit_price*k15_num));
		System.out.printf("============================================================\n");
	}

}
