package may22;
//Title : switch_case��
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class switch_case�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_jumin = "123456-1234567";//�ֹι�ȣ�� ����
		switch(k15_jumin.charAt(7)) {//charAt(7)�� ���ʺ��� �����ؼ� 8��°(0~���� ����)�ڸ��� ����
			case '1' ://8��° �ڸ��� 1�̸�
				System.out.printf("20������ �¾ ���ڻ��\n");//20������ �¾ ���ڻ�� ���
				//break;    #Ű����Ʈ�� case1���� case2�� �Ѿ ��, break�� ���� ������ case1�� ��� case2���� �����Ͽ�, �Ʒ��� ��¹��� ���
			case '2' ://8��° �ڸ��� 2�̸�
				System.out.printf("20������ �¾ ���ڻ��\n");//20���� �� �¾ ���ڻ�� ���
				break;//�극��ũ�� ���� case3�� �Ѿ
			case '3' : //8��° �ڸ��� 3�̸�
				System.out.printf("20������ �¾ ���ڻ��\n");//20���� �� �¾ ���ڻ�� ���
				break;//�극��ũ�� ���� case4�� �Ѿ
			case '4' ://8��° �ڸ��� 4�̸�
				System.out.printf("20������ �¾ ���ڻ��\n");//20���� �� �¾ ���ڻ�� ���
				break;//�극��ũ�� default�� �Ѿ
			default ://8��° �ڸ��� 1~4�� �ƴ϶�� 
				System.out.printf("���\n");//�� ������� ���
				break;//�극��ũ�� switch���� ����
		}
	}

}
