package 프로젝트5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class 파일처리1사진복사 {


		public static void main(String[] args){
			// TODO Auto-generated method stub
			try {
				
				InputStream in = null;
				OutputStream out = null;
				in = new FileInputStream("C:\\Users\\lee gil joon\\Desktop\\KakaoTalk_20190317_202821273.jpg");//복사를 하는 대상의 주소
				out = new FileOutputStream("C:\\Users\\lee gil joon\\Desktop\\copy.jpg");//복사한 파일을 붙여넣는 주소 및 복사된 파일의 명칭
		
				long start = System.currentTimeMillis();//복사하는 과정이 얼마나 걸리는지를 체크하기 위한 시작문
				while(true) {//while을 쓰지 않으면 파일의 실제 구조중 하나인 1byte에 한하는 정보만 리딩하고, 쓰기 때문에 파일이 다 리딩쓰기가 될때까지 반복문으로 반복해준다.
				
					int data = in.read();//in에 들어가 있는 파일을 읽고,(파일 로딩개념)
					if(data== -1) {//in의 data가 -1이 될때까지 읽은 뒤 멈추고,
						break;
					}
					out.write(data);//그 전까지는 out주소에 데이터를 기록한다.(복사개념)
					}
					long end = System.currentTimeMillis();//복사하는 과정이 얼마나 걸리는지를 체크하기 위한 종료문
					System.out.println(end - start);//시작부터 종료까지 걸린 시간 출력(마이크로 초 단위)
					
					in.close();
					out.close();
					
					}catch(Exception e){
						e.printStackTrace();
					}
						
				}
			
		}

