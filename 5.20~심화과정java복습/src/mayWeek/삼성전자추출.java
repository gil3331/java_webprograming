package mayWeek;
//Title : �Ｚ���� ����
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class �Ｚ�������� {

	public static void main(String[] args) throws IOException {//���ܻ��� �߻��� Ŭ���� Ż��
		File f= new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//�ش� ��ġ�� ������ ����
		BufferedReader br= new BufferedReader(new FileReader(f));//������ ������ ���� ���ϸ����� ����
		
		File f1= new File("C:\\Users\\lee gil joon\\workforder\\A005930.csv");//�ش� ��ġ�� ������ ����
		BufferedWriter bw1= new BufferedWriter(new FileWriter(f1));//������ ���Ͽ� ���� ���϶����ͷ� �ۼ�
		
		String readtxt;//string������ ���� ����
		int cnt=0; int wcnt=0;//int������ ���� ����
		while((readtxt=br.readLine())!=null) {//���� �бⰡ ������
			StringBuffer s = new StringBuffer();//sringbuffer�� ������ �����Ͽ�
			
			String[] field = readtxt.split("%_%");// �����ڸ� %_%�� ��Ƽ� ���ϳ����� �з��Ѵ�.
			
			if(field.length>2 && field[2].replace("^", "").trim().equals("A005930")) {// ^ Ư�����ڸ� ""�� ��ü ��, ù ���ڰ� A005930�� ��
				s.append(field[0].replace("^", "").trim());//^�� ""�� ��ü
				
				for(int j=1; j< field.length;j++) {//for�� �ݺ��� ���ؼ�
					s.append(","+field[j].replace("^", "").trim());// ó������ ������ ^�� ""�� ��ü�Ѵ�.
				}
				
				bw1.write(field[2].replace("^", "").trim()); bw1.newLine();// ���ǿ� �ش��ϴ� ���� ���۸� �̿��Ͽ� �Է�
				wcnt++;//�۾��� �Ϸ�Ǹ� 1�� ���ϰ�
			}
			cnt++;//for�� �ݺ��� �ѹ� ������ 1�� �����ش�.
		}
		
		br.close();//���� ���ϸ��� ����
		bw1.close();//���� ���϶����� ����
		
		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);//�۾��� �Ϸ�Ǹ� �ش� ������ ���
	}

}
