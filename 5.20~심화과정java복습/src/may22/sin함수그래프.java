package may22;
//Title :sin�Լ� �׷���
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class sin�Լ��׷��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k15_fSin;//sin���� double������ ����
		
		for(int k15_i=0; k15_i<360; k15_i++) {//0~359������ ������ sin�տ� i���� �����ϰ�, 1�� ������(360������ ��� ��������)
			k15_fSin=Math.sin(k15_i *3.141592/180);//���̰��� 180�� ������ sin���� i�� ���ϸ� ���� ���� ���� 
			System.out.printf("%d sin ==> %f\n",k15_i, k15_fSin);//�̰� ����� ���
		}
		for(int k15_i=0; k15_i<360; k15_i++) {//360������ �׸��� ���� for���� ����
			k15_fSin=Math.sin(k15_i*3.141592/180);//���� ���� ����
			int k15_iSpace=(int)((1.0-k15_fSin)*50);//sin�Լ��� �������� �־ 1�� ����, ������ �����غ��̱� ���� 50�� ����
			for(int k15_j=0; k15_j < k15_iSpace;k15_j++) System.out.printf(" ");//j���� ���ؼ� ������ ����.
			System.out.printf("*[%f][%d]\n",k15_fSin,k15_iSpace);//��� ���� ���
		}
	}

}
