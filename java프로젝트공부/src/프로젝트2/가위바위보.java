package ������Ʈ2;

import java.util.Scanner;

public class ���������� {
//����=0,����=1,��=2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int player1, player2 ;
		System.out.print("player1�� (����:0,����:1,��:2)=> ");
		player1 = in.nextInt();
		System.out.print("player2��  (����:0,����:1,��:2)=> ");
		player2 = in.nextInt();
		//player1�� player2�� ���� �ִ� ��츦 �Է��ϰ� �ϰ�,
		in.close();
		//����0<����1
		//����1<��2
		//*��2<����0 ���� ���ڰ� Ŀ�� ũ��񱳷δ� �ȵ�
		if(player1==player2) {
			System.out.print("���"); //00,11,22
			//���� ���� ������ ��츦 ������� ��µǰ� ��.
		}else if((player1==0)&&(player2==2)){
			System.out.print("player1�� �̰���ϴ�.");//02
		}else if((player1==2)&&(player2==0)){
			System.out.print("player2�� �̰���ϴ�.");//20
			//������ �κ��� �ٸ��κ��� a�� b���� ũ��, Ȥ�� b�� a���� ũ�ٷ� �ذ� ����������,
			//��2�� ����0�� ǥ���Ҽ� ��� ��츦 �������.
		}else if(player1>player2) {
			System.out.print("player1�� �̰���ϴ�.");//20
		}else if(player1<player2) {
			System.out.print("player2�� �̰���ϴ�.");//20
		}//player1�� player2�� �̱�� ��츦 ���ڰ� ū������ �����Ͽ�, �����.
		in.close();
	}
			
}

