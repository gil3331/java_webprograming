package ������Ʈ1;

public class �⺻4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		//x�� 1�̶� ����
		int y;
		y=(x==1)?30:20;
		//y�� (x�� 1�̳� ��� �����), 1�ΰ�� y�� 30�� �Ǹ�, 1�� �ƴ� ���� y�� 20�̶� ǥ����.
		//x==1�� true�̹Ƿ�, y�� 30�� �����Ѵ�.
		System.out.println(y);
		y=(x>5)?x++:x+50;
		//x>5�� �����̹Ƿ� y�� x+50�� ���� �����Ѵ�.
		System.out.println(x);
		System.out.println(y);
		//x�� y�� ���
	}

}
