package mayWeek;
//Title : 감잡은 내용으로 파일 정제
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 감잡은내용으로파일정제 {

	public static void main(String[] args) throws IOException {//예외사항이 발생하면 클래스 탈출
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//해당 주소의 파일을 지정
		BufferedReader br = new BufferedReader(new FileReader(f));//지정된 파일을 버퍼로 읽음
		
			File f1 = new File("C:\\Users\\lee gil joon\\workforder\\StockDailyPrice.csv");//해당 주소의 파일을 지정
	BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));//지정된 파일에 버퍼로 작성
	
	String readtxt;//string형으로 변수 선언
	
	int cnt = 0; int wcnt = 0;//int형으로 변수 선언
	while((readtxt = br.readLine())!=null) {//파일을 읽는 것이 끝나면
		StringBuffer s = new StringBuffer();//stringbuffer로 변수를 선언하여
		String[] field = readtxt.split("%_%");//1차원 배열 변수에서 구분자 %_%를 기준으로 파일 내용을 분류
		
			if(field.length>2&&field[2].replace("^","").trim().substring(0,1).equals("A")) {//특수문자들을 ""으로 교체하고, 첫문자가 A인것을 잡고
				s.append(field[0].replace("^","").trim());//처음부터 끝까지의 ^문자를 제거 한다.
				for (int j =1; j<field.length;j++) {//for문을 통해서 반복을 실시
					s.append(","+field[j].replace("^","").trim());//해당되는 특수문자를 모두 ""으로 교체
				}
				bw1.write(s.toString());bw1.newLine();//조건에 해당되는 줄을 버퍼 파일라이터를 통해서 작성하고
				wcnt++;//끝나면 1씩 더해줌
			}
			cnt++;//반복문 종료시 1씩 더해줌
	}
	br.close();//버퍼 파일리더 종료
	bw1.close();//버퍼 파일라이터 종료
	System.out.printf("Program End[%d][%d]\n",cnt,wcnt);//끝나면 종료 되었음을 찍어줌
	}
	
}
