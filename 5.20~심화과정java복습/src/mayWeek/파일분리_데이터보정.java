package mayWeek;
//Title : ���Ϻи� �����ͺ���
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ���Ϻи�_�����ͺ��� {

	public static void main(String[] args)throws IOException {//���� ���� �߻��� Ŭ���� Ż��
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����.txt");//�ش� ��ġ�� ������ ����
		BufferedReader br = new BufferedReader(new FileReader(f));//���� ���ϸ����� import�ϰ� ������ ����
		
		File f1 = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����_SKT.txt");//�ش� ��ġ�� ������ �����ϰ��� ����
		File f2 = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����_KT.txt");//�ش� ��ġ�� ������ �����ϰ��� ����
		File f3 = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����_LGU.txt");//�ش� ��ġ�� ������ �����ϰ��� ����
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//���� ���϶����͸� import�ϰ� ������ ����
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2));//���� ���϶����͸� import�ϰ� ������ ����
		BufferedWriter bw3 = new BufferedWriter(new FileWriter(f3));//���� ���϶����͸� import�ϰ� ������ ����
		
		String readtxt;//string������ ���� ����
		
		if((readtxt = br.readLine())==null) {//������ ������� 
			System.out.printf("�� �����Դϴ�\n");//�� �����Դϴ� ���
		}
		
		bw1.write(readtxt);bw1.newLine();//���� ���϶����ͷ� ������ �ۼ��ϸ�, ������ �ǽ�
		bw2.write(readtxt);bw2.newLine();//���� ���϶����ͷ� ������ �ۼ��ϸ�, ������ �ǽ�
		bw3.write(readtxt);bw3.newLine();//���� ���϶����ͷ� ������ �ۼ��ϸ�, ������ �ǽ�
		
		int LineCnt = 0;//int�� ������ ����
		while((readtxt = br.readLine())!=null) {//������ ������ ������ ���� while������ �ݺ��Ͽ� ������ ����
			
			String[] field = readtxt.split("\t");//tab�� �������� ���� ������ �з��ϰ� 1���� �迭 string�� ������ ����
			
			if(field[5].trim().equals("SKT")) {//field�� �迭 �� 5�� �ڸ��� skt�� ����
				bw1.write(readtxt);bw1.newLine();//�ۼ� �� ����
			}else if(field[5].trim().equals("KT")) {//field�� �迭 �� 5�� �ڸ��� kt�� ����
				bw2.write(readtxt);bw2.newLine();//�ۼ� �� ����
			}else if(field[5].trim().equals("LGU+")) {//field�� �迭 �� 5�� �ڸ��� lgu+�� ����
				bw3.write(readtxt);bw3.newLine();//�ۼ� �� ����
			}else if(field[5].trim().equals("LG U+")) {//field�� �迭 �� 5�� �ڸ��� lg u+�� ����
				
			}else {//skt,kt,lgu+� �ش���� �ʴ� ��쿡��
				System.out.printf("�� �� ���� ��Ż�[%d��° �׸�][%s]***\n",LineCnt,field[5]);//�˼����� ��Ż�� �����Ͽ� ���	
				}
			LineCnt++;//�ѹ� �ݺ��� ������ ���� 1�� ������
			}
		br.close();//���� ���ϸ��� ����
		bw1.close();//���� ���� ������ ����
		bw2.close();//���� ���� ������ ����
		bw3.close();//���� ���� ������ ����
			
	}
	
}
