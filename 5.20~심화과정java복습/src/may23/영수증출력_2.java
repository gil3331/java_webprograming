package may23;
//Title : ������ ���_2
//Date : 2019.05.23
//Author : �̱���
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class ���������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//�ݾ��� ������ �����Ͽ� �޸� ����
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy/MM/dd-ssss-HHmm");//�ð��� �ý��ۿ��� �ҷ��� ���� ����
		String format_time = formatT.format(System.currentTimeMillis());//�׷� ������ ������ �غ�
		
		SimpleDateFormat formatLT = new SimpleDateFormat("yyyyMMddHHmmss");//�ð��� �ý��ۿ��� �ҷ��� ���� ����
		String format_Ltime = formatLT.format(System.currentTimeMillis());//�׷� ������ ������ �غ�
		
		SimpleDateFormat formatFT = new SimpleDateFormat("yyyyMMdd  HHmmss");//�ð��� �ý��ۿ��� �ҷ��� ���� ����
		String format_Ftime = formatFT.format(System.currentTimeMillis());//�׷� ������ ������ �غ�
		
		String k15_itemname1, k15_itemname2;//item �̸��� �ΰ� ����
		String k15_itemcode1, k15_itemcode2;//item �ڵ带 �ΰ� ����
		int k15_price1, k15_price2;//item ������ �ΰ� ����
		int k15_num1, k15_num2;//item ������ �ΰ� ����
		
		k15_itemname1="�Ϸ絷�";//1�� ��ǰ �̸� ����
		k15_itemcode1="000010";//1�� ��ǰ �ڵ� ����
		k15_price1=8000;//1�� ��ǰ ���� ����
		k15_num1=1;//1�� ��ǰ ���� ����
		
		k15_itemname2="�ÿ쵿";//2�� ��ǰ �̸� ����
		k15_itemcode2="000006";//2�� ��ǰ �ڵ� ����
		k15_price2=8000;//2�� ��ǰ ���� ����
		k15_num2=2;//2�� ��ǰ ���� ����
		
		System.out.println("����(����) �ްԼ�");//������ ���
		System.out.println("������ֽð��ݸ������380-4");//����� �ּ� ���
		System.out.println("�ֺ��� 677-85-00239 TEL : 043-857-9229");//�����, ����� ��ȣ ����� ���� ���
		System.out.printf("[������]%s          POS��ȣ : 0002\n",format_Ftime);//ù��°�� ���� �ð� ���� ���
		System.out.println("--------------------------------------------------");//�� ���
		System.out.println("ǰ���ڵ�                    �ܰ�     ����     �ݾ�");//������ �� ����
		System.out.println("--------------------------------------------------");//�� ���
		System.out.printf("%s\n",k15_itemname1);//��ǰ1 �̸� ���
		System.out.printf("%s                     %s        %d    %s\n",k15_itemcode1, k15_df.format(k15_price1), k15_num1, k15_df.format(k15_price1*k15_num1));//ǰ���ڵ�, �ܰ� ,����, �ݾ��� ���
		System.out.printf("%s\n",k15_itemname2);//��ǰ2 �̸� ���
		System.out.printf("%s                     %s        %d   %s\n",k15_itemcode2, k15_df.format(k15_price2), k15_num2, k15_df.format(k15_price2*k15_num2));//ǰ���ڵ�, �ܰ� ,����, �ݾ��� ���
		System.out.println();//�������� ����
		int k15_taxPrice1, k15_taxPrice2;//���� �κ��� ���� ��������
		k15_taxPrice1 =(int)(k15_price1/1.1);//��ǰ 1�� ������ ����(����/1.1)
		k15_taxPrice2 =(int)(k15_price2/1.1);//��ǰ 2�� ������ ����(����/1.1)
		System.out.printf("���� ��ǰ �հ�                              %s\n", k15_df.format(k15_taxPrice1+k15_taxPrice2));//���� ��ǰ �հ�ϱ� ��ǰ1,2���� ����
		System.out.printf("��    ��    ��                               %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)-(k15_taxPrice1+k15_taxPrice2)));//�ΰ����� �հ�ݾ׿��� ������ǰ �հ踦 ���� ��
		System.out.printf("��          ��                              %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//�հ�ݾ��� ��ǰ1*���� + ��ǰ2*�����ϸ� ��
		System.out.println("026-��ī���                              00/00A");//��ī��� ���
		System.out.println("ī  ��  ��  ȣ :               5522-20**-****-BADD");//ī���ȣ ���
		System.out.printf("ī  ��  ��  �� :                            %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//ī�� ������ �� �հ�ݾ���
		System.out.println("��  ��  ��  �� :                            �Ͻú�");//�ŷ����� ���
		System.out.println("��  ��  ��  ȣ : 04-KICC                  75549250");//���ι�ȣ ���
		System.out.println("�� �� �� �� ȣ : ");//��������ȣ ���
		System.out.printf("��  ��  ��  �� :                            %s\n",k15_df.format((k15_price1*k15_num1)+(k15_price2*k15_num2)));//���� �ݾ��� �� �հ�ݾ�
		System.out.println("��    ��    �� :                                 0");//�Ž��� ���
		System.out.println("--------------------------------------------------");//�� ���
		System.out.println("�ֹ���ȣ :     0920");//�ֹ���ȣ ���
		System.out.println("--------------------------------------------------");//�� ���
		System.out.println("�Ǹſ� : 000002 ������2");//�Ǹſ� ���
		System.out.printf("%s\n",format_time);//�ι�° �ð� ���� ���
		System.out.printf("�������  : [00138705   %s]\n",format_Ltime);//������� ���(������ �ð� ������ ���)
	}
}