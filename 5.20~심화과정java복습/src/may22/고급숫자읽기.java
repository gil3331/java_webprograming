package may22;
//Title :��޼����б�
//Date : 2019.05.22
//Author : �̱���
//Comment : .....
public class ��޼����б� {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    int k15_iNumVal=1001034567;//int������ ���ڸ� ���� ����
    String k15_sNumVal=String.valueOf(k15_iNumVal);//���ڸ� ������ �ڸ����� ���ؼ� �����ڸ��� �����ϱ� ���� string������ ���� �� ������ ����
    String k15_sNumVoice="";
    System.out.printf("==>%s[%d�ڸ�]\n",k15_sNumVal,k15_sNumVal.length());//length�� ���ؼ� �ڸ����� �����ϰ�, [��°�����] ����
    int k15_i, k15_j;
    String[] k15_units= {"��","��","��","��","��","��","��","ĥ","��","��"};//������� [�迭 ĭ-���ڿ� �� ����] �ۼ�
    String[] k15_unitX= {"","��","��","õ","��","��","��","õ","��","��"};//������� [�迭 ĭ-�ڸ������� �� ����] �ۼ�
    k15_i=0;
    k15_j=k15_sNumVal.length()-1;
    
    while(true) {//�ݺ����� ����
       if(k15_i >= k15_sNumVal.length())break;//length���� i���� ũ�ų� ������ �극��ũ�� ���ؼ� �ݺ��� Ż��
       
       System.out.printf("%s[%s]",//������� ����
             k15_sNumVal.substring(k15_i,k15_i+1),//substring���� i���� i+1�� �Ѱ��� ����
             k15_units[Integer.parseInt(k15_sNumVal.substring(k15_i,k15_i+1))]);//�׷� ������� integer�� �����Ͽ� ����
       
       if(k15_sNumVal.substring(k15_i,k15_i+1).equals("0")) {//substring�� ���� 0�� ���� ��, 0�� ����
          if(k15_unitX[k15_j].equals("��")||k15_unitX[k15_j].equals("��")) {//j���� �������̸� ����, ������̸� ���� ����
             k15_sNumVoice=k15_sNumVoice + ""+k15_unitX[k15_j];//������ ������ ���� ������ sNumVoice�� ����
          }else {
             //�ƹ��͵� ���� ����
          }   
       }else {//���� if�� �ƴ϶��,
          k15_sNumVoice=k15_sNumVoice//sNumVoice�� sNumVoice�� units�� ������, unitX�� j���� ������ ����
                +k15_units[Integer.parseInt(k15_sNumVal.substring(k15_i,k15_i+1))]
                +k15_unitX[k15_j];
       }
       k15_i++; k15_j--;//i�� 1�� ����, j�� 1�� ����
    System.out.printf("\n %s[%s]\n",k15_sNumVal,k15_sNumVoice);//�׷� ������� ���Ŀ� ���� ����ϰ�, �����Ѵ�.
    }
 }

}