package may21;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Title : ȯ�� ���
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class ȯ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_MyWon = 1000000;//�鸸���� �޷��� ȯ���ϱ� ���� ��ȭ
		double k15_MoneyEx = 1238.21;//�� ��� �޷� ȯ��
		double k15_commission = 0.003;//ȯ�� ������
		
		int k15_usd = (int)(k15_MyWon/k15_MoneyEx);//��ü �ݾ��� ȯ���� �����鼭, int������ �Ǽ��κ��� ����ó��
		int k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx);//�鸸�����ٰ� us�޷��� ȯ���� ���� ���� �����μ�, �ܾ��� ����.
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                       ������ ���� ���                                      *\n");
			
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� =>	��ȭ : %d�޷�, �ܵ� :  %d��\n",k15_MyWon, k15_usd, k15_remain);//��� ���
		System.out.printf("***********************************************************\n");
		
		double k15_ComPerOne = k15_MoneyEx * k15_commission;//�޷��� ������� ȯ���� ȯ�� �����Ḧ ���ϸ� �ȴ�.
		
		double k15_totalcom = k15_usd * k15_ComPerOne;//�� ������� �޾ƾ��� �޷��� �޷��� �����Ḧ ���ϸ� �ȴ�.(1�� ���ϸ� ��� ó������ �����ʿ�)
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                          ������ ���                                          *\n");
			
		System.out.printf("�� ������ : %f�� =>	��ȭ : %d�޷�, �޷��� ������ :  %f��\n", k15_totalcom, k15_usd, k15_ComPerOne);//��� ���
		System.out.printf("***********************************************************\n");
		
		int k15_i_totalcom;
		
		if(k15_totalcom != (double)((int)k15_totalcom))
			k15_i_totalcom = (int)k15_totalcom + 1;//�� �����Ḧ ���������� ��, 1�� �̸����� ��� �ٱ� ������ �ݿø��ϴ� ���̽� 
		else
			k15_i_totalcom = (int)k15_totalcom;//�ƴ� ���� �׳� ������ ǥ��
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                     ������ ����ȯ��                                         *\n");
			
		System.out.printf("�� ������ : %d�� =>	��ȭ : %d�޷�, �޷��� ������ :  %f��\n", k15_i_totalcom, k15_usd, k15_ComPerOne);
		
		k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx - k15_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� =>	��ȭ : %d�޷�, ������¡�� :  %d��, �ܵ� : %d\n", k15_MyWon, k15_usd, k15_i_totalcom, k15_remain);
		System.out.printf("***********************************************************\n");
		
		k15_usd = (int)(k15_MyWon/(k15_MoneyEx + k15_ComPerOne));//�� ��ȭ���� �޷� ȯ���� �޷��� �����Ḧ ���Ͽ� ������ ȯ�� �޷��� ���ȴ�.
		k15_totalcom = k15_usd * k15_ComPerOne;//�� ������� ȯ�� �޷��� �޷��� �����Ḧ ���� ���̴�.
		
		if(k15_totalcom != (double)((int)k15_totalcom))
			k15_i_totalcom = (int)k15_totalcom + 1;// ������ �İ� ���� ������ ������, 1�� ���Ͽ� �ݿø��ϰ�, 
		else
			k15_i_totalcom = (int)k15_totalcom;//���� ������ �����̴�, �׳� int������ �����Ѵ�.
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                            (��Ȯ��)������ ����ȯ��                                      *\n");
		System.out.printf("�� ������ : %d�� =>	��ȭ : %d�޷�, �޷��� ������ :  %f��\n", k15_i_totalcom, k15_usd, k15_ComPerOne);//��� ���
		
		k15_remain = (int)(k15_MyWon - k15_usd * k15_MoneyEx - k15_i_totalcom);//������ �ܾ��� ������ ��ȭ �Ѿ׿� ȯ���� �޷���, �޷�ȯ���� ���ϰ�, �ű⿡ ������¡������ �� ���� ���� ���´�.
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� =>	��ȭ : %d�޷�, ������¡�� :  %d��, �ܵ� : %d��\n", k15_MyWon, k15_usd, k15_i_totalcom, k15_remain);
		System.out.printf("***********************************************************\n");
		
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//������ �����ϱ� ���� ���� ����(import�� �ʿ�!)
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                                       �޸����, ��¥ ����                                  *\n");
		
		System.out.printf("�� ������ : %s�� => ��ȭ : %s�޷�, �޷��� ������ : %f��\n",
						k15_df.format(k15_i_totalcom),//������ ������ format�� �����Ͽ� ǥ��
						k15_df.format(k15_usd),
						k15_ComPerOne);
		
		k15_remain = (int)(k15_MyWon-k15_usd*k15_MoneyEx - k15_i_totalcom);//������ �ܾ��� ������ ��ȭ �Ѿ׿� ȯ���� �޷���, �޷�ȯ���� ���ϰ�, �ű⿡ ������¡������ �� ���� ���� ���´�.
		System.out.printf("�� ��ȭȯ���ݾ� : %s�� => ��ȭ : %s�޷�, ������¡�� : %s�� �ܵ� : %s��\n",
						k15_df.format(k15_MyWon), k15_df.format(k15_usd), k15_df.format(k15_i_totalcom),
						k15_df.format(k15_remain));
		
		Calendar k15_calt = Calendar.getInstance();//CalendarŬ������ �������� ����.
		SimpleDateFormat k15_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");//SimpleDateFormatŬ������ ��������� ����(�̰͵� ���� import �ʿ�!)
		System.out.printf("��������ð� : %s\n", k15_sdt.format(k15_calt.getTime()));//������ calt������ ���� �ð��� get�Ͽ� ���
		System.out.printf("***********************************************************\n");
		
	}

}
