package may21;
//Title : �����ϱ�
//Date : 2019.05.21
//Author : �̱���
//Comment : .....
public class �����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_sum;
		k15_sum = 0;//���� �� ������ �׻� �ʱ�ȭ �ؾ� �Ѵ�.
		for (int k15_i=1; k15_i < 101; k15_i++)//1~100���� ���� ���� ���Ͽ� for���� ���
		{
			k15_sum= k15_sum+k15_i;//0���� ���۵Ǵ� sum�� 1~100���� �þ�� i�� ���ؼ� Ȯ��(����)
		}
		System.out.printf("#2 : %d\n", k15_sum);//��� �� Ȯ��
		System.out.printf("#2-2 : %d\n", k15_sum/100);//int������ �Ǿ� �־ �Ҽ��� ���ϴ� �ȳ���
		int [] k15_v = {1,2,3,4,5};//v���� int������ 1~5���� ���� �� �ְ� ����
		int k15_vSum;
		k15_vSum = 0;//vSum���� 0���� �ʱ�ȭ
		for (int k15_i = 0; k15_i<5 ; k15_i++) 
		{
			k15_vSum = k15_vSum + k15_v[k15_i];//1���� �迭�� 1~5���� ����
		}
		System.out.printf("#2-3 : %d\n", k15_vSum);//����� ���
	}

}
