package mayWeek;
//Title : ���� �а���
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Buffered�а��� {

	public static void FileWrite() throws IOException{//���� ���� �߻��� �ش� Ŭ������ ����� throws IOException�� ����
		File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest1.txt");//�ش� ��ġ�� ������ �����ϱ� ���� �غ�
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));//���� ���϶����͸� import �� �����Ͽ� �غ�
		
		bw.write("�ȳ� ����");//���� ���϶����͸� ���ؼ� �ȳ� ������ Mytest1.txt�� �ۼ�
		bw.newLine();//���ο��� �������� n�̿ܿ��� �̷��� �ڵ带 ���� ������ ����
		bw.write("hello ���");//hello ��θ� ���Ͽ� �ۼ�
		bw.newLine();//���� �ǽ�
		
		bw.close();//���� ���϶����͸� ����
	}	
	public static void FileRead() throws IOException{//���ܻ��� �߻��� �ش� Ŭ���� Ż��
		
		File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest1.txt");//�ش� ��ġ�� ������ ����
		BufferedReader br = new BufferedReader(new FileReader(f));//�̹��� ���� ���ϸ����� import�ϰ� �����Ͽ� �غ�
		
		String readtxt;//string�� ���� ����
		
		while((readtxt = br.readLine())!=null) {//������ ���ؼ� readLine�� null�� �ƴ� ��(��������� ���� ������ ���� �� ����) ���� �ݺ��� ����
			System.out.printf("%s\n",readtxt);//������ ������ �о ��
		}
		br.close();//���� ���ϸ��� ����
	}
	public static void main(String[] args) throws IOException{//������ �޼������ ���ο��� �ҷ��ͼ� ����
		FileWrite();//���϶����� �޼��� �ҷ���
		FileRead();//���ϸ��� �޼��� �ҷ���
	}
	
}

	