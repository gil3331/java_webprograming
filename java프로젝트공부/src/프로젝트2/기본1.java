/*
  ȯ�����
 */
package ������Ʈ2;

import java.util.Scanner;

public class �⺻1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int kWon = 0;
		int left = 0;				
		double rate;//ȯ���� �Ҽ����� �����⿡ double�� ǥ��
		System.out.printf("ȯ���� : ");//ȯ�� �����Է�
		rate = in.nextDouble();
		System.out.print("��ȭ�� : ");//��ȭ �����Է�
		kWon = in.nextInt();
	    double a = kWon/rate;//������� ���⶧���� double�� ��
		System.out.printf("��ȭ ��� �޷��� : %d�޷��Դϴ�.\n", (int)a);
		//������ ���� �Ҽ������� ��µǴ� int�� ���� ��ȯ�Ͽ� ������ ���
		double b = a-(int)a;
		//�Ž������� �˱� ���ؼ� ������ �޷����� ������ �޷����� ���� ������ �ܱݺκ��� ���
		System.out.printf("������ ���� : %f\n", b);
		double c = (double) b*rate;
		//�Ž����� ����� ���ؼ� ������ �޷� �ܱݺκ��� �ٽ� ȯ���� ����
		left = (int)c % 10;
		//1�� �ڸ� ���̸� ���� 10���� ���� �������� ���
		System.out.printf("�Ž��� ���� : %d���Դϴ�.\n",(int)c - left);
		//�ѱ������� 10�� ���������� �����Ƿ�, int�� ������ȯ �԰� ���ÿ� left�� ���� 340���� ���� 
		//�޷� 100�޷�,50�޷�,20�޷�,10�޷�,5�޷�,1�޷����� �з��ϱ�
		int hundred = (int)a/100;
		System.out.printf("��޷��� : %d���Դϴ�.\n",hundred);
		//��޷��� �����ϰ� �޷�������� 100���� ���� ���� �� 100�޷��� �������� �˼� ����
		int fifty = ((int)a-((int)a-((int)a%100)))/50;
		System.out.printf("���ʴ޷��� : %d���Դϴ�.\n",fifty);
		//���ʴ޷��� ���� 217�޷����� 200�� ����, ���� 17�޷��� 50�� ���� �������� �Ͽ� �ڷ� �ѱ�
		int twenty = (((int)a-((int)a-((int)a%100)))%50)/20;
		System.out.printf("�̽ʴ޷��� : %d���Դϴ�.\n",twenty);
		//�̽ʴ޷��� ���� ���ʴ޷��� ���� �״�� ������ �� 50������ ���� �ڿ� �ٽ� 20�޷��� ��������.
		int ten = ((((int)a-((int)a-((int)a%100)))%50)%20)/10;
		System.out.printf("�ʴ޷��� : %d���Դϴ�.\n",ten);
		//�ʴ޷��� �̽ʴ޷��� ���� �״�� ������ �� %20������ ���� ���� �������� 10���� ���� �ʴ޷��� ������ ���������� �м��Ѵ�.
		int five = (((((int)a-((int)a-((int)a%100)))%50)%20)%10)/5;
		System.out.printf("���޷��� : %d���Դϴ�.\n",five);
		//���޷� ���� �ʴ޷��� ���������� ���� �����µ� %10������ �������� ������ 5�� ���� �p������ �ľ��Ѵ�.
		int one = ((((((int)a-((int)a-((int)a%100)))%50)%20)%10)%5)/1;
		System.out.printf("�ϴ޷��� : %d���Դϴ�.\n",one);
		//�ϴ޷� ���� ���޷��� ���������� ���� �����µ� %5������ �������� ������ 1�� ���� �p������ �ľ��Ѵ�.
		in.close();
		
	}

}
