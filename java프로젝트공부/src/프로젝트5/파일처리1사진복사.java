package ������Ʈ5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ����ó��1�������� {


		public static void main(String[] args){
			// TODO Auto-generated method stub
			try {
				
				InputStream in = null;
				OutputStream out = null;
				in = new FileInputStream("C:\\Users\\lee gil joon\\Desktop\\KakaoTalk_20190317_202821273.jpg");//���縦 �ϴ� ����� �ּ�
				out = new FileOutputStream("C:\\Users\\lee gil joon\\Desktop\\copy.jpg");//������ ������ �ٿ��ִ� �ּ� �� ����� ������ ��Ī
		
				long start = System.currentTimeMillis();//�����ϴ� ������ �󸶳� �ɸ������� üũ�ϱ� ���� ���۹�
				while(true) {//while�� ���� ������ ������ ���� ������ �ϳ��� 1byte�� ���ϴ� ������ �����ϰ�, ���� ������ ������ �� �������Ⱑ �ɶ����� �ݺ������� �ݺ����ش�.
				
					int data = in.read();//in�� �� �ִ� ������ �а�,(���� �ε�����)
					if(data== -1) {//in�� data�� -1�� �ɶ����� ���� �� ���߰�,
						break;
					}
					out.write(data);//�� �������� out�ּҿ� �����͸� ����Ѵ�.(���簳��)
					}
					long end = System.currentTimeMillis();//�����ϴ� ������ �󸶳� �ɸ������� üũ�ϱ� ���� ���Ṯ
					System.out.println(end - start);//���ۺ��� ������� �ɸ� �ð� ���(����ũ�� �� ����)
					
					in.close();
					out.close();
					
					}catch(Exception e){
						e.printStackTrace();
					}
						
				}
			
		}

