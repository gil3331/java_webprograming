package ������Ʈ5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ����ó��2�����󺹻� {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			byte[]buffer =new byte[1024*8];//�����������ʹ� ������ ������ ũ�⶧���� �⺻���� byte ������ �ƴ�,�ѹ��� 1MB*8������ �а� ���� �Ѵ�.
			InputStream in = null;
			OutputStream out = null;
			in = new FileInputStream("C:\\Users\\lee gil joon\\Desktop\\KakaoTalk_Video_20190319_1004_53_847.mp4");//�����ϰ��� �ϴ� ����� �ּ�
			out = new FileOutputStream("C:\\Users\\lee gil joon\\Desktop\\copy.mp4");//����� ����� ��� ������ ���� �ּ�
	
			long start = System.currentTimeMillis();//�ð�üũ ��ŸƮ
			while(true) {//1byte�� �����Ұ� �ƴϱ⶧���� ������ �� �����ϱ� ���ؼ� while �ݺ��� ���
			
				int count = in.read(buffer);//�ش� ������ ���� ������� �а�,
				if(count== -1) {//-1���� ���� ��
					break;
				}
				out.write(buffer,0,count);//�׷��� ���� ���� ���ش�.
				}
				long end = System.currentTimeMillis();//�ð�üũ ����
				System.out.println(end - start);//�ð�üũ ���
				
				in.close();
				out.close();
				
				}catch(Exception e){
					e.printStackTrace();
				}
					
			}
		
	}
