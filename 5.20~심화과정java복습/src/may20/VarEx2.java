package may20;
//Title : �����ǽ�2
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class VarEx2 {//Ŭ���� ����

	public static void main(String[] args) {//�������� ���α׷� ����
		// TODO Auto-generated method stub
		int k15_x = 10;//int �� ���� x�� 10���� �ʱ�ȭ
		int k15_y = 20;//int �� ���� y�� 20���� �ʱ�ȭ
		int k15_tmp = 0;//int�� ���� tmp�� 0���� �ʱ�ȭ
		
		System.out.println("x : "+ k15_x + " y : "+ k15_y);//x�� y ���� ���� ���
		k15_tmp = k15_x;//tmp�� x�� ����
		k15_x = k15_y;//x���� y������ ����
		k15_y = k15_tmp;//y���� tmp������ ����
		
		System.out.println("x : "+ k15_x + " y : "+ k15_y);//�ٽ� x�� y���� ���� ���
	}

}
