package may22;

import java.util.Scanner;

//Title : if��_5
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class if��_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner�� ���
		
		System.out.printf("������ �������ּ��� : ");//������ �����϶�� ������ ���
		int k15_score = scanner.nextInt();//���ɳʸ� ���� ������ �Է¹���
		if(k15_score >=90) {//������ 90�� �Ѵ´ٸ�
			System.out.println("A���");//A��� ������ ���
		}else if(k15_score >= 80 && k15_score < 90){//80���̻� 90�� �̸�
			System.out.println("B���");//B��� ������ ���
		}else if(k15_score >= 70 && k15_score < 80) {//70�� �̻� 80�� �̸�
			System.out.println("C���");//C��� ������ ���
		}else {//70�� �̸�����
			System.out.println("F���");//�׳� F��� ������ ���
		}
		scanner.close();//���ɳʸ� ����
	}

}
