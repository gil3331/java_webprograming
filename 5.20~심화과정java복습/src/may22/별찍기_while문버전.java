package may22;
//Title : while��(�����)
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class �����_while������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_iA, k15_iB;// iA�� iB��� ������ ����(int��)
		k15_iA = 0;// iA�� 0������ �ʱ�ȭ
		while (true) {// �ݺ��� ������ true�� ��,
			k15_iB = 0;// iB�� 0������ �ʱ�ȭ
			while (true) {// �ݺ��� ������ true�� ��,
				System.out.printf("*");// *�� ���
				if (k15_iA == k15_iB)break;// iA�� iB���� ������ while���� ���߰�,
				k15_iB++;// iB�� 1�� ����.
			}
			System.out.printf("\n");// ���� �ݺ����� ������, �������� ���
			k15_iA++;// iA���� 1�� ������
			if (k15_iA == 30)break;// iA���� 30�� ���ϸ�, �ܺ� while���� ����
		}
	}
}
