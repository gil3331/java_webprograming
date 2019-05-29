package 프로젝트5;
import java.io.*;
public class 파일처리3파일내용출력 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	    try {
			RandomAccessFile raf;//주어진 이름의 파일을 raf라고 명명하고,
		    String readStr;//readStr을 문자열로 받는다.
		    raf = new RandomAccessFile("C:\\Users\\lee gil joon\\Desktop\\Text.txt","rw");
		    //raf는 randomaccessfile(파일주소)로 받아 초기화 하고
		    while((readStr = raf.readLine())!=null) {//1바이트만 읽어올게 아니기 때문에 while 반복으로 다 읽을때까지 반복시켜 읽는다.
		    	 readStr = new String(readStr.getBytes("ISO-8859-1"),"EUC_KR");
		    	 //읽은 값을 string으로 초기화 해서 받는데, ISO-8859-1로 받은 제어문자를 EUC_KR(문자타입)로 인코딩 하여 받는다.
		    	 System.out.println(readStr);//상위의 인코딩된 리딩값을 출력한다.
		    }
		    raf.writeBytes("bbb");//해당 파일에 bbb라 쓰게함.
		    raf.close();
		    
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
		  }
		}
