package may22;

import java.util.Scanner;

//Title : if��_3
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class if��_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner�� ���
		
		System.out.printf("������ �������ּ��� : ");//������ �����϶�� ������ ���
		int k15_score = scanner.nextInt();//���ɳʸ� ���� ������ �Է¹���
		if(k15_score > 60) {//������ 60�� �Ѵ´ٸ�
			System.out.println("�հ��Դϴ�.");//�հ��Դϴ� ������ ���
		}else {//60�� ���϶��
			System.out.println("���հ��Դϴ�.");//���հ��Դϴ�. ������ ���
		}
		scanner.close();//���ɳʸ� ����
	}

}
