package may23;
//Title : ������ ���_3
//Date : 2019.05.23
//Author : �̱���
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class ���������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//�ݾ��� ��������
			
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy-MM-dd  HH:mm");//�ð��� ���� ����
		String format_time = formatT.format(System.currentTimeMillis());//����� �ð��� ������ ����
		
		String k15_star = "";		// ���� ������� ������ ���δ�
		int k15_no_TaxItem=0;		// TaxFree �׸���� �Ѱ���
		int k15_yes_TaxItem=0;		// Tax �׸���� �Ѱ���
		int k15_Price_noTax;		// �ΰ����� �ο����� ���� Tax �׸���� �Ѱ���
		int k15_total_tax;			// �� �ΰ���	
		
		String [] k15_itemname = {"��������","����","����","���̹���","�׸��ͽ�","����ͽ�","��ä��","����"//��ǰ�� 30�� 1���� �迭�� ����(30�� ��ȭ?!)
				,"������","���","���","�Ƚ�","����","�ᳪ��","��","�а�","������","��","�����","�ż�Ư��",
				"������̿�ä��","���ڱ�","�����","����Ĩ","�ұ���","�����","�Ƹ޸�ī��","������","TOP��","��ġ��"};
		
		int [] k15_price= {1,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,100000,1000000};//��ǰ�� ���� 1���� �迭�� ����
		int [] k15_num= {1,4,6,8,10,1,3,5,7,9,1,2,3,4,5,6,7,8,9,10,11,15,13,17,19,20,12,14,16,18};//��ǰ�� ���� 1���� �迭�� ����
		boolean [] k15_taxfree= {true,true,false,true,true,false,false,true,false,true,true,false,false,true,false,true,true,false,false,true,false,true,
				true,false,false,true,false,true,false,true};//��ǰ�� ���� �鼼 1���� �迭�� ����
				
		String [] k15_array = new String[k15_itemname.length];//��ǰ���� length�� ���� �Ǵ��Ͽ� 1���� �迭�� ����
		
		for(int n=0; n<k15_itemname.length; n++) {//��ǰ�� ���� ������ ���ؼ� length�� ��
			String nowitem = k15_itemname[n];//nowitem���� ��ǰ ���� �غ�
			for(int m=0; m<=14-k15_itemname[n].getBytes().length; m++) {//getBytes�� ���ں� ����Ʈ üũ
				nowitem = nowitem + " ";//��ǰ�� ���ڸ� ������ �������� �Ų�
			}
			k15_array[n] = String.format("%s",nowitem);//array�� ��ǰ���� ����
		}
		
		System.out.println("�̸�Ʈ ������ (031)888-1234");//�̸�Ʈ ������ ���
		System.out.println("206-86-50913 �̰���");//����� ��ȣ �� ����ָ� ���
		System.out.println("������ �д籸 ���ڵ� 112����");//����� �ּ� ���
		System.out.println();//���� ���
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�(30�ϳ�)");//������~ ���
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī������)");//��ȯ/ȯ��~ ���
		System.out.println("üũī��/�ſ�ī�� û����� �ݿ���");//üũī��/�ſ�ī��~���
		System.out.println("�ִ� 3~5�� �ҿ� (�ָ�, ����������)");//�ִ� 3~���
		System.out.println();//���� ���
		System.out.printf("[������]%s     POS : 0009-2418\n",format_time);//������ ��� �� �ð� ���� ���
		System.out.println("-----------------------------------------------");//�� ���
		System.out.println("    �� ǰ ��             �� ��   ����    �� ��");//������ ��� �� ���
		System.out.println("-----------------------------------------------");//�� ���
				for(int k15_i=0; k15_i<k15_itemname.length; k15_i++) {//��ǰ�� ���̷� ��ǰ Ȯ��
			if(k15_taxfree[k15_i] == false) {//�鼼��ǰ�� ���
				k15_star = "*";//��ȣ�� *�� ����
				k15_no_TaxItem = k15_no_TaxItem + k15_price[k15_i]*k15_num[k15_i];//�鼼��ǰ�� ���� ��� ����
			}
			else {//���� ��ǰ�� ���
				k15_star = "";//���� ����....
				k15_yes_TaxItem = k15_yes_TaxItem + k15_price[k15_i]*k15_num[k15_i];//������ǰ�� ���� ��� ����
			}
			System.out.printf("%2d%1s %s %10s %5s %10s\n", k15_i+1,k15_star,k15_array[k15_i],//������Ŀ� ���缭 ��ǰ�� ��ȣ, ��ǰ��, �ܰ�, ����, ��ǰ�� �հ踦 ��� 
																	k15_df.format(k15_price[k15_i]), k15_num[k15_i], 
																	k15_df.format(k15_price[k15_i]*k15_num[k15_i]));
		}
		double k15_Tax = k15_yes_TaxItem / 11;//�ΰ��� 1��
		
		if((k15_Tax*10)%10 >= 0)//������ ���� ���
			k15_total_tax = (int)k15_Tax + 1;//�� �ΰ��� ���� ����
		else
			k15_total_tax = (int)k15_Tax;//�ΰ��� ���� ����
		k15_Price_noTax = k15_yes_TaxItem - k15_total_tax;//�鼼��ǰ ���� ����
		System.out.printf("            %s         %11s\n", "(*)�� ��  �� ǰ", k15_df.format(k15_no_TaxItem));//�鼼��ǰ ���� ���
		System.out.printf("               %s         %11s\n", "�� ��  �� ǰ", k15_df.format(k15_Price_noTax));//������ǰ ���� ���
		System.out.printf("               %s         %11s\n", "��   ��   ��", k15_df.format(k15_total_tax));//�ΰ��� ���� ���
		System.out.printf("               %s         %11s\n", "��        ��", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//�հ谡�� ���
		System.out.printf("�� �� �� �� �� ��                   %11s\n", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//�������ݾ� ���
		System.out.println("-----------------------------------------------");//�� ���
		System.out.printf("0024 ��  ��                 5417**8890/07850246\n");//ī���ȣ ���
		System.out.printf("ī�����                    %s /%11s\n", "�Ͻú�", k15_df.format(k15_no_TaxItem + k15_yes_TaxItem));//ī����� ���
		System.out.println("-----------------------------------------------");//�� ���
		System.out.println("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");//����Ʈ ��Ȳ ���
		}
}