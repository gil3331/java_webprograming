package mayWeek;
//Title : �����ϰ� �а���
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class �����ϰ��а��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest.txt");//������ ��ġ�ּҸ� �����ϴ� ����
			FileWriter fw = new FileWriter(f);//������ �ּҿ� Mytest.txt��� �ϴ� ������ �ۼ��ϰ��� �ϴ� ����
			
			fw.write("�ȳ� ����\n");//�ȳ� ���� �����̶�� ������ �ۼ�
			fw.write("hello ���\n");//hello ��� �����̶�� ������ �ۼ�
			
			fw.close();//�����ۼ��� ����
			
			FileReader fr = new FileReader(f);//���� �б� ������ ����
			
			int n = -1;//int�� ������ ����
			char [] ch;//char�� 1���� �迭 ������ ����
			
			while(true) {//�ݺ����� ���Ͽ�
				ch = new char [100];//ch�� �鰳¥�� ����
				n = fr.read(ch);//n���� ������ �о�� �޸� ����
				
				if(n == -1)break;//n���� -1�̸� �극��ũ�� �ݺ����� Ż��
				
				for(int i =0; i<n; i++) {//char[n��]�� �迭�� ���� ���� ��Ƴ��� ���Ͽ� �켱 �迭�� �̿��� for���� ���
					System.out.printf("%c",ch[i]);//�迭�� for���� i�� ����Ͽ� �迭�� ����
				}
			}
			fr.close();//fr�� ����
			
			System.out.printf("\n FILE READ END");//fr(���� �б�)�� ������ FILE READ END�� ����� 
		} catch (Exception e) {//try catch���� ���ؼ� ���� �߻��� �� ���� ��� ����ֱ�
				System.out.printf("�� ����[%s]\n",e);
		}
	}

}
