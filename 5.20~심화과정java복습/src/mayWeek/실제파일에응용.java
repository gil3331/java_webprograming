package mayWeek;
//Title : ���� ���Ͽ� ����
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class �������Ͽ����� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//\�� Ư�������̹Ƿ� \\�ΰ��� ����Ѵ�.
		File f = new File("C:\\Users\\lee gil joon\\workforder\\���������������ǥ�ص�����.csv");//�ش� ��ġ���� �������̵����� ������ ����
		BufferedReader br = new BufferedReader(new FileReader(f));//���� ���ϸ����� import �� �����Ͽ� �غ�
		
		String readtxt;//string�� ������ ����
		
		//������ ���� �о�� �ʵ���� �� �� �ִ�.
		if((readtxt = br.readLine())==null) {//������ �о�����, null�� ������
			System.out.printf("�� �����Դϴ�\n");//�� ���� �Դϴٸ� ���
			return;//Ư���� ���� ���� ���� ����
		}
		String[] field_name = readtxt.split(",");//1���� �迭�� string�� ������ �����ϰ�, ","�� �������� ������. 
		
		int LineCnt = 0;//int �� ���� ����
		while((readtxt = br.readLine())!=null) {//������ ������ ���� �ݺ����� ���� ������ �а�
			
			String[] field = readtxt.split(",");//1���� �迭�� string�� ������ �����ϸ�, split���� ,�� ���� ��� �з��ϰ�,
			System.out.printf("**[%d��° �׸�]***************\n",LineCnt);//n��° �׸��̶�� ���� �ش�.
			for(int j=0; j<field_name.length;j++) {//���̷� å���Ͽ� for������ �迭 ���� �����ϰ�,
				System.out.printf("%s : %s\n", field_name[j],field[j]);//�迭�� ���� �ʵ� �̸��� �ʵ� ������ ����Ѵ�.(���� �д°� ���� �� ����)
			}
			System.out.printf("*****************************\n");// �ѹ� �ݺ��� ������ ���� ***********�� ����ش�.
			if(LineCnt==100)break;//100°�� ���ϸ� for���� Ż���Ѵ�.
			LineCnt++;//������ �ѹ��� ������ ������ 1�� �����ش�.
		}
		br.close();//���� ���ϸ����� ����
	}

}
