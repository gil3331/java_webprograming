package mayWeek;
//Title : �����Ⱦ�� �����
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class �����Ⱦ����� {

	public static void main(String[] args) throws IOException{//���ܻ��� �߻��� Ŭ���� Ż��
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//�ش� ��ġ�� ���� ����
		BufferedReader br = new BufferedReader(new FileReader(f));//���� ���ϸ����� ���� ������ ����
		
		String readtxt;//string ������ ���� ����
		int LineCnt=0;//int�� ���� ����
		int n=-1;//int�� ���� ����
		StringBuffer s = new StringBuffer();//stringbuffer�� ������ ����
		while(true) {//�ݺ��� ����
			
			char[] ch = new char [1000];//char������ 1���� �迭���� 1000������ ��
			n=br.read(ch);//���� ���ϸ����� ������ ����
			if(n == -1)break;//n���� -1�̸� �ݺ��� Ż��
			for(char c : ch) {//for������ char�� c�� ch�̸� for�� �ݺ����� ����
				if(c=='\n') {//c ���� �����̸�
					System.out.printf("[%s](***\n",s.toString());//�о�� �����͸� string������ ����
					s.delete(0, s.length());// �����Ѵ�.
				}else {//�׿��� ���� append�Ͽ� ����
					s.append(c);
				}
				LineCnt++;//for���� ������ ���� 1�� �����ش�.
			}
			System.out.printf("[%s]***\n",s.toString());// ��ü �ݺ��� ������ string������ ������ش�.
			
		}
		br.close();//���� ���� ������ ����
	}

}
