package may22;
//Title : ������, ������ ��
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class ������_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_il;
		double k15_iD;
		
		k15_il = 10/3;
		k15_iD = 10/3.0;//���α׷������� il�� iD�� ���� ö���ϰ� �ٸ���.
		
		if (k15_il == k15_iD) System.out.printf("equal\n");//�� ���� ������ euqal�� ���
		else System.out.printf("Not equal[%f][%f]\n",(double)k15_il, k15_iD);//�ٸ��� Not equal�� ����ϴµ�, ��������� int������ ����ϸ�, �������� ǥ�� �ǰ�,
																																//double������ ����ϸ� �Ǽ� ���� �����ؼ� ����Ǳ� ������ �� ���� �ٸ���.
		
		if (k15_iD ==3.333333) System.out.printf("euqal\n");
		else System.out.printf("Not equal[3.333333][%f]\n",k15_iD);//�Ǽ������ �������� %f�� ������ѹ����� �Ҽ��� ����° �ڸ������̰�,
																											 	 //��°��� �ð������� ���� �׳� 3.333333�ΰ� ������, ���� ������ ��� .3�� �̾����� ������
																												 //�ٸ� ���̶�� �Ǵ��ؾ� �Ѵ�.
		
		k15_iD = (int)k15_iD;//iD�� ���� int������ ����ȯ �ϸ�, �Ǽ����� ��������, �������� ���´�.
		if (k15_il==k15_iD) System.out.printf("equal\n");//�׷��� ������ il���̶�, iD�� ���� ������ ���� ������ ���� equal�� ��µȴ�.
		else System.out.printf("Not equal [%f][%f]\n", (double)k15_il, k15_iD);
		
		System.out.printf("int�� �μ� [%d][[%f]]\n",k15_il,k15_iD);//il�� ���� ���ʿ� int���̰�, %d�� ������ ����� �Ͽ�, 3�� ��������, iD�� double���� %f ����� �޾� 3.00000�� ����
		System.out.printf("double�� �μ� [%f][%f]\n",(double)k15_il,k15_iD);//il�� double�� �ְ� %f ���� �޾� 3.00000���·� ����ϰ�, iD�� ���� ���ʿ� double���� %f�� 3.00000�� ����
		
		char k15_a = 'c';
		
		if(k15_a=='b')System.out.printf("a�� b�̴�\n");
		if(k15_a=='c')System.out.printf("a�� c�̴�\n");//������ c�� �����Ǿ� �־� a�� c�̴ٰ� ��µ�����,
		if(k15_a=='d')System.out.printf("a�� d�̴�\n");//char���� c ���� �ٸ� ���ڷ� �ٲٸ� ��°��� �޶�����.
		
		String k15_aa = "abcd";
		
		if(k15_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�.\n");//aa�� ���� "abcd"�� ���ٸ� "aa�� abcd�̴�"�� ��� 
		else System.out.printf("aa�� abcd�� �ƴϴ�.\n");//�ƴ� ���� aa�� abcd�� �ƴϴٸ� ���
		
		boolean k15_bb = true;//������ �������� boolean�� ���� bb�� ��츦 true�� ����
		
		if(!!k15_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�.\n");//!!=������ ������ �����̶�� ����(����� "bb�̸���")���� bb�� �ƴϰ� �ƴϸ� ���̴ٸ� ���  
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");//�׷��� ������ ! �Ѱ��� �����̴ٰ� ��µȴ�.
				
	}

}
