package 프로젝트5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class 파일처리2동영상복사 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			byte[]buffer =new byte[1024*8];//사진보낼때와는 별개로 파일이 크기때문에 기본형인 byte 단위가 아닌,한번에 1MB*8단위를 읽고 쓰게 한다.
			InputStream in = null;
			OutputStream out = null;
			in = new FileInputStream("C:\\Users\\lee gil joon\\Desktop\\KakaoTalk_Video_20190319_1004_53_847.mp4");//복사하고자 하는 대상의 주소
			out = new FileOutputStream("C:\\Users\\lee gil joon\\Desktop\\copy.mp4");//복사된 대상을 어디에 쓸지에 대한 주소
	
			long start = System.currentTimeMillis();//시간체크 스타트
			while(true) {//1byte만 복사할게 아니기때문에 끝까지 다 복사하기 위해서 while 반복문 사용
			
				int count = in.read(buffer);//해당 단위에 대한 사이즈로 읽고,
				if(count== -1) {//-1까지 가면 끝
					break;
				}
				out.write(buffer,0,count);//그렇게 읽은 값을 써준다.
				}
				long end = System.currentTimeMillis();//시간체크 종료
				System.out.println(end - start);//시간체크 출력
				
				in.close();
				out.close();
				
				}catch(Exception e){
					e.printStackTrace();
				}
					
			}
		
	}
