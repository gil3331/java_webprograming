package ������Ʈ3;

public class �޼���3 {//for���� �޼��带 ���� ������
	
	public static int calcPow(int pow1,int pow2) {//�޼��� ������ pow1,2��� ������ �������ְ�,
		int result=1;//��� ���� 1�϶�,
		for (int i=0;i<pow2;i++) {//i=0�϶�, pow2���� ������, result ���� pow1�� ���ϰ�, i�� 1�� �����ش�.
			result = result*pow1;
		}
		return result;//���� ��ġ��, result��� ����� �����Ѵ�.
	}
	public static int calculator(int a,int b , String c) {//calculator��� �޼��� ������ int a,b String c�� ������ �������ְ�,
		int result =0;//result���� 0�϶�, 
		if(c.equals("+")) {//string c�� "+"�̸�
			result=a+b;//a�� b�� ���ϰ�,
		}else if(c.equals("-")) {//string c�� "-"�̸�
			result=a-b;//a�� b�� ����,
		}else if(c.equals("*")) {//string c�� "*"�̸�
			result=a*b;//a�� b�� ���ϰ�,
		}else if(c.equals("/")) {//string c�� "/"�̸�
			result=a/b;//a�� b�� ������.
		
		}
		return result;//������ ���Ĵ�� ����� �� ��, result�� �����Ѵ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculator(20,10, "+"));//calculator�޼��� ������ ������ 20,10�϶�, �� ���� ���� ��� ���� �����.
		System.out.println(calculator(20,10, "-"));//calculator�޼��� ������ ������ 20,10�϶�, �� ���� �� ��� ���� �����.
		System.out.println(calculator(20,10, "*"));//calculator�޼��� ������ ������ 20,10�϶�, �� ���� ���� ��� ���� �����.
		System.out.println(calculator(20,10, "/"));//calculator�޼��� ������ ������ 20,10�϶�, �� ���� ���� ��� ���� �����.
	}

}
