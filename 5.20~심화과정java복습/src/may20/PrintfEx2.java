package may20;
//Title : ��½ǽ�2
//Date : 2019.05.20
//Author : �̱���
//Comment : .....
public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_url = "www.codechobo.com";
		
		float k15_f1 = .10f;//float�� ������ ��� �������� f�� ��� �ȴ�.
		float k15_f2 = 1e1f;
		float k15_f3 = 3.14e3f;
		double k15_d = 1.23456789;//double�� ������ �������� ���� �ʾƵ� �ȴ�.
		
		System.out.printf("f1=%f, %e, %g%n", k15_f1, k15_f1, k15_f1);//%f�� ���� �Ҽ��� ������ �Ǽ� ���
		System.out.printf("f2=%f, %e, %g%n", k15_f2, k15_f2, k15_f2);//%e�� �ε� �Ҽ��� ������ �Ǽ� ���
		System.out.printf("f3=%f, %e, %g%n", k15_f3, k15_f3, k15_f3);//%g�� %e,%f�� �� ª�� �������� ���
		
		System.out.printf("d=%f%n", k15_d);//���� �Ҽ��� �������� �Ǽ� ���
		System.out.printf("d=%14.10f%n", k15_d);//14.10�ڸ������� �Ҽ��� �������� �Ǽ� ���
		
		System.out.printf("[12345678901234567890]%n");//���ȣ °�� ��° ���
		System.out.printf("[%s]%n", k15_url);//���ڿ� ���
		System.out.printf("[%20s]%n", k15_url);//20�ڸ������� ���ڿ� ���
		System.out.printf("[%-20s]%n", k15_url);//������ 20�ڸ������� ���ڿ� ����ϰ�, �տ� ���� �κ��� �������� ���
		System.out.printf("[%.8s]%n", k15_url);//�տ������� 8�ڸ������� ���ڿ� ���
			
	}

}
