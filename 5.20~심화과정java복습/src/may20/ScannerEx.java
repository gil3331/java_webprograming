package may20;

import java.util.Scanner;//scanner�� ����ϱ� ���Ͽ� import��.

//Title : �����ǽ�5
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner�� ���
		
		System.out.print("���ڸ� ������ �Է����ּ���. >");
		
		String k15_input = scanner.nextLine();//input������ scanner�� ���ؼ� �����͸� ����
		int k15_num = Integer.parseInt(k15_input);//������ ���� input�����Ͱ� string���� �����̱� ������, int������ �ٲ���
		
		System.out.println("�Է³��� : "+k15_input);//�Է³������� input�����͸� ���
		System.out.printf("num=%d%n", k15_num);//���ڷμ��� num(���������� ��ȯ�� input������)������ ���
	scanner.close();
	}

}
