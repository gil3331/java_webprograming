package mayWeek;
//Title : 삼성전자 추출
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 삼성전자추출 {

	public static void main(String[] args) throws IOException {//예외사항 발생시 클래스 탈출
		File f= new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//해당 위치의 파일을 지정
		BufferedReader br= new BufferedReader(new FileReader(f));//지정된 파일을 버퍼 파일리더로 읽음
		
		File f1= new File("C:\\Users\\lee gil joon\\workforder\\A005930.csv");//해당 위치의 파일을 지정
		BufferedWriter bw1= new BufferedWriter(new FileWriter(f1));//지정된 파일에 버퍼 파일라이터로 작성
		
		String readtxt;//string형으로 변수 선언
		int cnt=0; int wcnt=0;//int형으로 변수 선언
		while((readtxt=br.readLine())!=null) {//파일 읽기가 끝나면
			StringBuffer s = new StringBuffer();//sringbuffer로 변수를 선언하여
			
			String[] field = readtxt.split("%_%");// 구분자를 %_%로 잡아서 파일내용을 분류한다.
			
			if(field.length>2 && field[2].replace("^", "").trim().equals("A005930")) {// ^ 특수문자를 ""로 교체 후, 첫 문자가 A005930인 것
				s.append(field[0].replace("^", "").trim());//^를 ""로 교체
				
				for(int j=1; j< field.length;j++) {//for문 반복을 통해서
					s.append(","+field[j].replace("^", "").trim());// 처음부터 끝까지 ^를 ""로 교체한다.
				}
				
				bw1.write(field[2].replace("^", "").trim()); bw1.newLine();// 조건에 해당하는 줄을 버퍼를 이용하여 입력
				wcnt++;//작업이 완료되면 1씩 더하고
			}
			cnt++;//for문 반복이 한번 끝나면 1씩 더해준다.
		}
		
		br.close();//버퍼 파일리더 종료
		bw1.close();//버퍼 파일라이터 종료
		
		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);//작업이 완료되면 해당 문장을 출력
	}

}
