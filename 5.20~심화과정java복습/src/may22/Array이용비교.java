package may22;
//Title :Array�̿� ��
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class Array�̿�� {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    int [] k15_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};
    //�� ���� ������ ���� iLMD�� �����Ͽ� ������ �迭�� ����
    for(int k15_i =1; k15_i <13; k15_i++) {//�� ���� �ٸ� ���İ� ���������� 1~12���� 1�� ���Ͽ� ����
       System.out.printf("%d�� =>",k15_i);//������ i���� ���
       for(int k15_j =1;k15_j<32;k15_j++) {//��¥�� ���������� 1�� ���� 31�ϱ��� 1�� ���Ͽ� ����
          System.out.printf("%d",k15_j);//���� j���� ���
          
          if(k15_iLMD[k15_i-1]==k15_j)break;//���⼭ 1���� ��, 1�� ���� 0���� ���� �迭�� 0���� ������ �ϱ� ������
          //ó������ �����ϰ�, �� ���� j��(����)�� ������ �극��ũ�Ͽ�, ���� for���� Ż���Ѵ�.            
          System.out.printf(",");//�� ���ڿ� ���ؼ� ,�� ������ش�.
       }
       System.out.printf("\n");//�ſ��� �������� �Ǹ� ������ ���
    }
 }

}
