package ������Ʈ1;
import java.util.Scanner;
public class �⺻3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int total=x+y;
		int multiplication=x*y;
		//multiplication=mul=���ϱ�
		int minus=x-y;
		double divide=(double)x/(double)y;
		//������=divide=div�� ǥ��
		int mod = x%y;
		//mod�� ���� ���� ù��° �������� �ǹ���
		System.out.printf("%d*%d�� %d�Դϴ�.\n",x,y,multiplication);
		System.out.printf("%d+%d�� %d�Դϴ�.\n",x,y,total);
		System.out.printf("%d/%d�� %f�Դϴ�.\n",x,y,divide);
		System.out.printf("%d-%d�� %d�Դϴ�.\n",x,y,minus);
		System.out.printf("%d/%d�� �������� %d�Դϴ�.\n",x,y,mod);
		in.close();
		//Scanner in���� in�� ���� ���� �ʾұ� ������ in.close();�� ����Ͽ� in�� �ݾ��ش�.-��������
		
	}

}
