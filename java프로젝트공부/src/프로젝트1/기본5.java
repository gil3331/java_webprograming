package ������Ʈ1;
import java.util.Scanner;
public class �⺻5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("���θ� �Է��ϼ��� : ");
		int x=in.nextInt();
		//��´�� �ؿ��� x�� �����Ͽ�, ���ڸ� ����Ҽ� �ְ���(����)
		System.out.print("���θ� �Է��ϼ��� : ");
		int y=in.nextInt();
		//��´�� �ؿ��� y�� �����Ͽ�, ���ڸ� ����Ҽ� �ְ���(����)
		int total=x*y;
		//������� �̸� total=x*y��� �����Ͽ� ��½� ������
		System.out.printf("���̴� %d �Դϴ�.\n",total);
		in.close();
	}

}
