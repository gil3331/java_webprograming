package may21;
//Title : ������ ���� �� ������ ������
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class ����������_������������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_ii = 1000 / 3;//int������ ����Ǿ� �־ 333.33333...�� ������ �ʴ´�.
		System.out.printf("#3-1 : %d\n", k15_ii);//����� ���
		k15_ii = 1000 % 3;//1000�� 3���� ������ �� ������ ������ ���� �����Ѵ�.
		System.out.printf("#3-2 : %d\n", k15_ii);//����� ���

		for (int k15_i = 0; k15_i < 20; k15_i++) {//for���� ����Ͽ� 0~19���� ����
			System.out.printf(" #3-3 : %d", k15_i);//����� ���
			if (((k15_i + 1) % 5) == 0) {//�׷� i���� 1�� ���ϸ鼭(ó������ 0�� ������ �ٷ� ������ �ϱ� ������ 1�� ����), 5�� ������ ��, 0�� ������ ������ �ǽ�
				System.out.printf("\n");//���� ���
			}
		}
	}

}
