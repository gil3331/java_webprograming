package mayWeek;
//Title : ������ �������� ���� ����
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ���������������������� {

	public static void main(String[] args) throws IOException {//���ܻ����� �߻��ϸ� Ŭ���� Ż��
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//�ش� �ּ��� ������ ����
		BufferedReader br = new BufferedReader(new FileReader(f));//������ ������ ���۷� ����
		
			File f1 = new File("C:\\Users\\lee gil joon\\workforder\\StockDailyPrice.csv");//�ش� �ּ��� ������ ����
	BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//������ ���Ͽ� ���۷� �ۼ�
	
	String readtxt;//string������ ���� ����
	
	int cnt = 0; int wcnt = 0;//int������ ���� ����
	while((readtxt = br.readLine())!=null) {//������ �д� ���� ������
		StringBuffer s = new StringBuffer();//stringbuffer�� ������ �����Ͽ�
		String[] field = readtxt.split("%_%");//1���� �迭 �������� ������ %_%�� �������� ���� ������ �з�
		
			if(field.length>2&&field[2].replace("^","").trim().substring(0,1).equals("A")) {//Ư�����ڵ��� ""���� ��ü�ϰ�, ù���ڰ� A�ΰ��� ���
				s.append(field[0].replace("^","").trim());//ó������ �������� ^���ڸ� ���� �Ѵ�.
				for (int j =1; j<field.length;j++) {//for���� ���ؼ� �ݺ��� �ǽ�
					s.append(","+field[j].replace("^","").trim());//�ش�Ǵ� Ư�����ڸ� ��� ""���� ��ü
				}
				bw1.write(s.toString());bw1.newLine();//���ǿ� �ش�Ǵ� ���� ���� ���϶����͸� ���ؼ� �ۼ��ϰ�
				wcnt++;//������ 1�� ������
			}
			cnt++;//�ݺ��� ����� 1�� ������
	}
	br.close();//���� ���ϸ��� ����
	bw1.close();//���� ���϶����� ����
	System.out.printf("Program End[%d][%d]\n",cnt,wcnt);//������ ���� �Ǿ����� �����
	}
	
}
