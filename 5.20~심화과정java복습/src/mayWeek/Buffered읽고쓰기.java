package mayWeek;
//Title : 버퍼 읽고쓰기
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Buffered읽고쓰기 {

	public static void FileWrite() throws IOException{//예외 사항 발생시 해당 클래스를 벗어나는 throws IOException을 선언
		File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest1.txt");//해당 위치에 파일을 생성하기 위해 준비
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));//버퍼 파일라이터를 import 및 선언하여 준비
		
		bw.write("안녕 파일");//버퍼 파일라이터를 통해서 안녕 파일을 Mytest1.txt에 작성
		bw.newLine();//내부에서 역슬레쉬 n이외에도 이렇게 코드를 통해 개행이 가능
		bw.write("hello 헬로");//hello 헬로를 파일에 작성
		bw.newLine();//개행 실시
		
		bw.close();//버퍼 파일라이터를 닫음
	}	
	public static void FileRead() throws IOException{//예외사항 발생시 해당 클래스 탈출
		
		File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest1.txt");//해당 위치의 파일을 지정
		BufferedReader br = new BufferedReader(new FileReader(f));//이번엔 버퍼 파일리더를 import하고 선언하여 준비
		
		String readtxt;//string형 변수 선언
		
		while((readtxt = br.readLine())!=null) {//변수를 통해서 readLine이 null이 아닐 때(결론적으로 파일 끝까지 읽을 때 까지) 까지 반복을 실행
			System.out.printf("%s\n",readtxt);//파일의 내용을 읽어서 찍어냄
		}
		br.close();//버퍼 파일리더 종료
	}
	public static void main(String[] args) throws IOException{//나눠진 메서드들을 메인에서 불러와서 실행
		FileWrite();//파일라이터 메서드 불러옴
		FileRead();//파일리더 메서드 불러옴
	}
	
}

	