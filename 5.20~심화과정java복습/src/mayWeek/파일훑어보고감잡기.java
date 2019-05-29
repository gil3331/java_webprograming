package mayWeek;
//Title : 파일훑어보고 감잡기
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class 파일훑어보고감잡기 {

	public static void main(String[] args) throws IOException{//예외사항 발생시 클래스 탈출
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\THTSKS010H00.dat");//해당 위치의 파일 지정
		BufferedReader br = new BufferedReader(new FileReader(f));//버퍼 파일리더를 통해 파일을 읽음
		
		String readtxt;//string 형으로 변수 선언
		int LineCnt=0;//int형 변수 선언
		int n=-1;//int형 변수 선언
		StringBuffer s = new StringBuffer();//stringbuffer를 변수로 선언
		while(true) {//반복문 진행
			
			char[] ch = new char [1000];//char형으로 1차원 배열에서 1000단위로 봄
			n=br.read(ch);//버퍼 파일리더로 파일을 읽음
			if(n == -1)break;//n값이 -1이면 반복을 탈출
			for(char c : ch) {//for문에서 char형 c가 ch이면 for문 반복문을 진행
				if(c=='\n') {//c 값이 개행이면
					System.out.printf("[%s](***\n",s.toString());//읽어온 데이터를 string형으로 구현
					s.delete(0, s.length());// 삭제한다.
				}else {//그외의 경우는 append하여 받음
					s.append(c);
				}
				LineCnt++;//for문이 끝날때 마다 1씩 더해준다.
			}
			System.out.printf("[%s]***\n",s.toString());// 전체 반복문 끝날때 string형으로 출력해준다.
			
		}
		br.close();//버퍼 파일 리더를 종료
	}

}
