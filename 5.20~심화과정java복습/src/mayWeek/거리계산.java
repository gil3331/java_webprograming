package mayWeek;
//Title : 거리 계산
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class 거리계산 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터.txt");//해당 위치의 파일을 지정함
		BufferedReader br = new BufferedReader(new FileReader(f));//버퍼 파일리더를 import 및 선언하여 준비
		
		String readtxt;//string형 변수를 선언
		
		if((readtxt = br.readLine())==null) {//파일을 읽었을때, 파일의 내용이 비어있다면
			System.out.printf("빈 파일입니다\n");//빈 파일 입니다를 출력
			return;//return값으로 받을건 없음
		}
		String[] field_name = readtxt.split("\t");//1차원 배열의 string형 변수를 선언하고, tab을 기준으로 분류함.
		
		double lat = 37.3860521;//double형으로 현위치의 위도를 변수로 선언
		double lng=127.1214038;//double형으로 현위치의 경도를 변수로 선언
		
		int LineCnt = 0;//int형 변수를 선언
		while((readtxt=br.readLine())!=null){//while문을 통해서 파일의 내용이 끝나기 전까지 반복문으로 파일을 읽음
			String[] field = readtxt.split("\t");//아까와 마찬가지로 tab을 기준으로 파일 내용을 분류
			System.out.printf("**[%d번째 항목]***************\n",LineCnt);//몇 번째 항목인지를 씀
			System.out.printf(" %s : %s\n", field_name[9], field[9]);//배열에 맞춰 내용을 출력
			System.out.printf(" %s : %s\n", field_name[12], field[12]);//배열에 맞춰 내용을 출력
			System.out.printf(" %s : %s\n", field_name[13], field[13]);//배열에 맞춰 내용을 출력
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[12])-lat,2)//math를 통해서 시스템 상으로 현 위도와 경도를 뺌
									+ Math.pow(Double.parseDouble(field[13])-lng,2));
			System.out.printf("현재지점과 거리 : %f\n",dist);//그런 차이를 기록
			System.out.printf("*****************************\n");//**********로 구분하여 출력
			
			LineCnt++;//while문으로 한번 반복이 끝날 때마다 1씩 더해줌
		}
		br.close();//버퍼 파일리더를 종료
	}

}
