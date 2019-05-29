package mayWeek;
//Title : 실제 파일에 응용
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class 실제파일에응용 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//\는 특수문자이므로 \\두개를 써야한다.
		File f = new File("C:\\Users\\lee gil joon\\workforder\\전국무료와이파이표준데이터.csv");//해당 위치에서 와이파이데이터 파일을 지정
		BufferedReader br = new BufferedReader(new FileReader(f));//버퍼 파일리더를 import 및 선언하여 준비
		
		String readtxt;//string형 변수를 선언
		
		//한줄을 먼저 읽어야 필드명을 알 수 있다.
		if((readtxt = br.readLine())==null) {//파일을 읽었을때, null이 나오면
			System.out.printf("빈 파일입니다\n");//빈 파일 입니다를 출력
			return;//특별히 리턴 값을 받지 않음
		}
		String[] field_name = readtxt.split(",");//1차원 배열로 string형 변수를 선언하고, ","를 기준으로 나눈다. 
		
		int LineCnt = 0;//int 형 변수 선언
		while((readtxt = br.readLine())!=null) {//파일이 끝날때 까지 반복문을 통해 파일을 읽고
			
			String[] field = readtxt.split(",");//1차원 배열로 string형 변수를 선언하며, split으로 ,를 기준 삼아 분류하고,
			System.out.printf("**[%d번째 항목]***************\n",LineCnt);//n번째 항목이라고 적어 준다.
			for(int j=0; j<field_name.length;j++) {//길이로 책정하여 for문으로 배열 값을 구성하고,
				System.out.printf("%s : %s\n", field_name[j],field[j]);//배열에 맞춰 필드 이름과 필드 내용을 출력한다.(파일 읽는게 끝날 때 까지)
			}
			System.out.printf("*****************************\n");// 한번 반복이 끝날때 마다 ***********를 찍어준다.
			if(LineCnt==100)break;//100째에 달하면 for문을 탈출한다.
			LineCnt++;//포문을 한번씩 종료할 때마다 1씩 더해준다.
		}
		br.close();//버퍼 파일리더를 종료
	}

}
