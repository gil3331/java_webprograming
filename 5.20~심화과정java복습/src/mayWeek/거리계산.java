package mayWeek;
//Title : �Ÿ� ���
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class �Ÿ���� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����.txt");//�ش� ��ġ�� ������ ������
		BufferedReader br = new BufferedReader(new FileReader(f));//���� ���ϸ����� import �� �����Ͽ� �غ�
		
		String readtxt;//string�� ������ ����
		
		if((readtxt = br.readLine())==null) {//������ �о�����, ������ ������ ����ִٸ�
			System.out.printf("�� �����Դϴ�\n");//�� ���� �Դϴٸ� ���
			return;//return������ ������ ����
		}
		String[] field_name = readtxt.split("\t");//1���� �迭�� string�� ������ �����ϰ�, tab�� �������� �з���.
		
		double lat = 37.3860521;//double������ ����ġ�� ������ ������ ����
		double lng=127.1214038;//double������ ����ġ�� �浵�� ������ ����
		
		int LineCnt = 0;//int�� ������ ����
		while((readtxt=br.readLine())!=null){//while���� ���ؼ� ������ ������ ������ ������ �ݺ������� ������ ����
			String[] field = readtxt.split("\t");//�Ʊ�� ���������� tab�� �������� ���� ������ �з�
			System.out.printf("**[%d��° �׸�]***************\n",LineCnt);//�� ��° �׸������� ��
			System.out.printf(" %s : %s\n", field_name[9], field[9]);//�迭�� ���� ������ ���
			System.out.printf(" %s : %s\n", field_name[12], field[12]);//�迭�� ���� ������ ���
			System.out.printf(" %s : %s\n", field_name[13], field[13]);//�迭�� ���� ������ ���
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[12])-lat,2)//math�� ���ؼ� �ý��� ������ �� ������ �浵�� ��
									+ Math.pow(Double.parseDouble(field[13])-lng,2));
			System.out.printf("���������� �Ÿ� : %f\n",dist);//�׷� ���̸� ���
			System.out.printf("*****************************\n");//**********�� �����Ͽ� ���
			
			LineCnt++;//while������ �ѹ� �ݺ��� ���� ������ 1�� ������
		}
		br.close();//���� ���ϸ����� ����
	}

}
