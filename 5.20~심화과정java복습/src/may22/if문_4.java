package may22;

import java.util.Scanner;
//Title : if��_4
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class if��_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner�� ���
		
		System.out.printf("���ڸ� �������ּ��� : ");//���ڸ� �����϶�� ������ ���
		int k15_num = scanner.nextInt();//���ɳʸ� ���� ���ڸ� �Է¹���
		if(k15_num > 0) {//���ڰ� 0�� �Ѵ´ٸ�
			System.out.println("����Դϴ�.");//����Դϴ� ������ ���
		}else if(k15_num < 0) {//���ڰ� 0���� �۴ٸ�
			System.out.println("�����Դϴ�.");//�����Դϴ�. ������ ���
		}else {//�� �ܿ��� 0�ۿ� ���� ������ else�� �ᵵ ��
			System.out.println("���Դϴ�.");//���Դϴ�. ������ ���
		}
		scanner.close();//���ɳʸ� ����
	}

}
