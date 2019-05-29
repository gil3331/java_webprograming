package mayWeek;
//Title : 파일분리 데이터보정
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 파일분리_데이터보정 {

	public static void main(String[] args)throws IOException {//예외 사항 발생시 클래스 탈출
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터.txt");//해당 위치의 파일을 지정
		BufferedReader br = new BufferedReader(new FileReader(f));//버퍼 파일리더로 import하고 변수로 선언
		
		File f1 = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터_SKT.txt");//해당 위치에 파일을 생성하고자 지정
		File f2 = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터_KT.txt");//해당 위치에 파일을 생성하고자 지정
		File f3 = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터_LGU.txt");//해당 위치에 파일을 생성하고자 지정
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//버퍼 파일라이터를 import하고 변수로 선언
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2));//버퍼 파일라이터를 import하고 변수로 선언
		BufferedWriter bw3 = new BufferedWriter(new FileWriter(f3));//버퍼 파일라이터를 import하고 변수로 선언
		
		String readtxt;//string형으로 변수 선언
		
		if((readtxt = br.readLine())==null) {//파일이 비었으면 
			System.out.printf("빈 파일입니다\n");//빈 파일입니다 출력
		}
		
		bw1.write(readtxt);bw1.newLine();//버퍼 파일라이터로 파일을 작성하며, 개행을 실시
		bw2.write(readtxt);bw2.newLine();//버퍼 파일라이터로 파일을 작성하며, 개행을 실시
		bw3.write(readtxt);bw3.newLine();//버퍼 파일라이터로 파일을 작성하며, 개행을 실시
		
		int LineCnt = 0;//int형 변수를 선언
		while((readtxt = br.readLine())!=null) {//파일의 내용이 끝날때 까지 while문으로 반복하여 파일을 읽음
			
			String[] field = readtxt.split("\t");//tab을 기준으로 파일 내용을 분류하고 1차원 배열 string형 변수로 저장
			
			if(field[5].trim().equals("SKT")) {//field의 배열 값 5의 자리에 skt가 들어가면
				bw1.write(readtxt);bw1.newLine();//작성 및 개행
			}else if(field[5].trim().equals("KT")) {//field의 배열 값 5의 자리에 kt가 들어가면
				bw2.write(readtxt);bw2.newLine();//작성 및 개행
			}else if(field[5].trim().equals("LGU+")) {//field의 배열 값 5의 자리에 lgu+가 들어가면
				bw3.write(readtxt);bw3.newLine();//작성 및 개행
			}else if(field[5].trim().equals("LG U+")) {//field의 배열 값 5의 자리에 lg u+가 들어가면
				
			}else {//skt,kt,lgu+등에 해당되지 않는 경우에는
				System.out.printf("알 수 없는 통신사[%d번째 항목][%s]***\n",LineCnt,field[5]);//알수없는 통신사로 통일하여 출력	
				}
			LineCnt++;//한번 반복이 끝날때 마다 1씩 더해줌
			}
		br.close();//버퍼 파일리더 종료
		bw1.close();//버퍼 파일 라이터 종료
		bw2.close();//버퍼 파일 라이터 종료
		bw3.close();//버퍼 파일 라이터 종료
			
	}
	
}
