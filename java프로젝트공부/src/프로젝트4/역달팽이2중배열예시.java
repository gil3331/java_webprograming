package ������Ʈ4;

import java.util.Scanner;

public class ��������2�߹迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("��ĭ ���ٷ� �Է��ұ��?");
		int inputSize = in.nextInt(); //�Է� �ޱ�
		int vortax = inputSize; //�ʱⰪ������ ���� ������ �ҿ뵹�� ������ ���� ����
		int turnCount = 1; //�𼭸��� �� ������ 1�� ����
		int count = inputSize*inputSize; //ǥ�õ� ����
		String direction = "��"; //�ʱ� �������
		int i = 0,j = inputSize; //���� ��ǥ
		int[][] array = new int[vortax][vortax]; //�Է¹��� ���� ���� �迭 ����
		
		while(vortax>=0) {
			switch(direction) {
			case "��": //�������� �迭 ��ġ �̵�
				for(j=vortax-1; j>=inputSize-vortax; j--) { //����	
					array[j][i] = count; //���ڸ� �� �迭�� ��ġ�� ����
					count--;
				}
				j++;
				direction = "��"; //���� ������ �Ʒ�������
				break;
			case "��": //����
				for(i=vortax-1; i>inputSize-vortax-1; i--) {
					array[j][i] = count;
					count--;
				}
				i++;
				direction = "��"; //���� ������ ��������
				break;
			case "��": //������
				for(j=inputSize-vortax+1; j<vortax; j++) {
					array[j][i] = count;
					count--;
				}
				direction = "��"; //���� ���� ����
				j--;
				break;
			case "��": //�Ʒ���
				for(i=inputSize-vortax+1; i<vortax; i++) {
					array[j][i] = count;
					count--;
				}
				direction = "��"; //���� ���� ����
				i--;
				break;
			}
			turnCount++; //�� case�� �������ö����� �𼭸��� ���� ���̹Ƿ� 1�� ����
			if(turnCount % 4 == 0) {
				vortax--; //�ѹ��� �� ������ �𼭸��� 1�� ����
			}
		}	
		//��º�
		for (int k=0; k<inputSize; k++) {
			for (int l=0; l<inputSize; l++) {
				System.out.printf("%4d", array[l][k]);
			}
			System.out.println();
		}
		in.close();
	}

}
