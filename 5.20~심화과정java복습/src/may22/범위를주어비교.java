package may22;
//Title : ������ �־� ��(ã��)
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class �������־�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_iVal;//iVal�̶� int�� ������ ����
		for(int k15_i = 0; k15_i < 300; k15_i++) {//for������ i���� 0~299���� 1�� ���ؼ� ����
			k15_iVal =5 *k15_i;//iVal�� �׷� i���� 5�� ���Ͽ� ������ ��� ������ ����
			if(k15_iVal >= 0&&k15_iVal < 10) System.out.printf("�� %d\n", k15_iVal);//iVal�� ���� 0���� 9������ �� �� iVal���� ���
			else if(k15_iVal >= 10&& k15_iVal < 100) System.out.printf("�� %d\n",k15_iVal);//iVal�� ���� 10���� 99������ �� �� iVal���� ���
			else if(k15_iVal >= 100&& k15_iVal < 1000) System.out.printf("�� %d\n",k15_iVal);//iVal�� ���� 100���� 999������ �� �� iVal���� ���
			else	System.out.printf("õ %d\n",k15_iVal);//�ִ� ���� ����� 1500�� ���� �������� �ڸ����� �������� õ���� ���
		}
	}

}
