package may22;
//Title :case�� ��
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class case���� {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    for(int k15_i = 1; k15_i < 13; k15_i++) {//i���� ���� �ش��Ͽ� for������ 1~12���� 1�� ���Ѵ�.
       System.out.printf("%d�� =>",k15_i);//�׷� i���� ���
       
       LOOP:for(int k15_j=1; k15_j<32; k15_j++) {//LOOP��� ������ ���� for���� �������ְ�, ��¥ ���� j�� ���� �� 1�����ؼ� 31���� ����
          System.out.printf("%d,",k15_j);//�׷� j���� ���
          
          switch(k15_i) {//i���� 
          case 4: case 6:case 7:case 9:case 11://4,6,7,9,11���� ��,
             if(k15_j==30)break LOOP;//j���� 30�ϱ��� ����,LOOP(����for��)�� Ż��
             break;
          case 2://2���� ��
             if(k15_j==28)break LOOP;//28���� �Ǹ� LOOP(����for��)�� Ż��
             break;//LOOP��� ���� �������� �ʰ� ����ϸ� ��ü�� ������ ���� 31 �Ǳ� ������ �ݵ�� ������ �ʿ�!
          }
       }
       System.out.printf("\n");//�ſ� ������ ������ ���� ������ ���
    }
 }

}
