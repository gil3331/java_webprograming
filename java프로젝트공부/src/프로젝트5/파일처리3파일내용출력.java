package ������Ʈ5;
import java.io.*;
public class ����ó��3���ϳ������ {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	    try {
			RandomAccessFile raf;//�־��� �̸��� ������ raf��� ����ϰ�,
		    String readStr;//readStr�� ���ڿ��� �޴´�.
		    raf = new RandomAccessFile("C:\\Users\\lee gil joon\\Desktop\\Text.txt","rw");
		    //raf�� randomaccessfile(�����ּ�)�� �޾� �ʱ�ȭ �ϰ�
		    while((readStr = raf.readLine())!=null) {//1����Ʈ�� �о�ð� �ƴϱ� ������ while �ݺ����� �� ���������� �ݺ����� �д´�.
		    	 readStr = new String(readStr.getBytes("ISO-8859-1"),"EUC_KR");
		    	 //���� ���� string���� �ʱ�ȭ �ؼ� �޴µ�, ISO-8859-1�� ���� ����ڸ� EUC_KR(����Ÿ��)�� ���ڵ� �Ͽ� �޴´�.
		    	 System.out.println(readStr);//������ ���ڵ��� �������� ����Ѵ�.
		    }
		    raf.writeBytes("bbb");//�ش� ���Ͽ� bbb�� ������.
		    raf.close();
		    
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
		  }
		}
