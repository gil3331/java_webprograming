package may23;
//Title : ������ ���_1
//Date : 2019.05.23
//Author : �̱���
//Comment : .....
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class ���������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k15_df = new DecimalFormat("###,###,###,###,###");//����(Ư�� �ݾ׿���) 3�ڸ� �̻� �Ѿ�� �޸�,�� ������ �ְ� ������ ����
		System.out.println("                   �� �� ��                     ");//������ ���
		System.out.println("--------------------------------------------------");//�� ���
		System.out.println("���λ�ȸ(�д缭����) 129-17-77924          ");//���λ�ȸ �̸� �� ����� ��ȣ ���
		System.out.println("�̻�ö 031 781 1596                                ");//����� �� ����� ��ȣ ���
		System.out.println("������ �д籸 ������ 269-3                          ");//����� �ּ� ���
		System.out.println("���̺�� : 12                                               ");//���̺� �� ���
		System.out.println("�ֹ���ȣ : 20160425 01 00041                ");//�ֹ���ȣ ���
		System.out.println("--------------------------------------------------");//�� ���
		int k15_iPrice = 21000;//�հ� ������ ������ ����
		System.out.printf("�ֹ��հ�                                    %s\n",k15_df.format(k15_iPrice));//�ֹ��հ谡 �� �հ� ����
		System.out.println("���αݾ�                                         0");//���� ���� ����
		System.out.printf("�����ݾ�                                    %s\n",k15_df.format(k15_iPrice));//���� �ݾ��� �� �հ� ����
		System.out.println("--------------------------------------------------");//�� ���
		System.out.printf("����              %d      ����               %s\n",0,k15_df.format((int)(k15_iPrice/1.1)));//������ 10%������ �հ谡���� 1.1�� ������ ����ȴ�.
		System.out.printf("ī��         %s      ����                %s\n",k15_df.format(k15_iPrice),k15_df.format((int)(k15_iPrice-(k15_iPrice/1.1))));//������ �հ谡�ݿ��� ������ ���� ���� ����
		System.out.println("����Ʈ            0      �鼼                    0     ");//����Ʈ �鼼 Ư���� ����
		System.out.printf("                         �����ݾ�           %s\n",k15_df.format(k15_iPrice));//���� �ݾ��� �� �հ� ����
		System.out.println("--------------------------------------------------");//�� ���
		SimpleDateFormat formatT = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");//��¥ ������ �ý��� �ð����� �ҷ��� ������ ����
		String format_time = formatT.format(System.currentTimeMillis());//������ ������ ������ �����Ͽ� ��밡���ϰ� �غ�
		System.out.println("             [�츮ī�� �ſ� ����]     ");//�츮ī�� �ſ� ���� ���
		System.out.printf("�� �� �� �� : %s\n",format_time);//���� �Ͻÿ� �Ʊ� ���� �ð� ������ �����Ͽ� ���
		System.out.println("ī �� �� ȣ : 55222059****2021                                         ");//ī���ȣ ���
		System.out.println("�� �� �� ȣ : 79753574    �Һΰ��� : 00 ");//���ι�ȣ ���
		System.out.printf("�� �� �� �� : %s\n",k15_df.format(k15_iPrice));//���αݾ��� �� �հ谡�� ���
		System.out.println("�� �� �� ȣ : 730461774   /   ��ī��� ");//���͹�ȣ ���
		System.out.println("����� ��ȣ : 129-17-77924");//����� ��ȣ ���
		System.out.println("--------------------------------------------------");//�� ���
		SimpleDateFormat formatOrderT = new SimpleDateFormat("yyyy-MM-dd   HH:mm");//�ι�°�� �� �ð� ������ �ٸ����� �ٽ� �ϳ� ���Ŀ� ���� �غ�
		String format_Order_time = formatOrderT.format(System.currentTimeMillis());	//����� �ð��� ������ ����
		System.out.printf("%s      CASHIER :          ***����\n",format_Order_time);//���⿡�� ����� �ð��� ���
		System.out.println("--------------------------------------------------");//�� ���
		System.out.println("���� �մϴ�.");//�����մϴ� ���
	}

}
