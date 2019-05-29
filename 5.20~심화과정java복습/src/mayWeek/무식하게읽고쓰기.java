package mayWeek;
//Title : 무식하게 읽고쓰기
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class 무식하게읽고쓰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\lee gil joon\\workforder\\Mytest.txt");//파일의 위치주소를 저장하는 변수
			FileWriter fw = new FileWriter(f);//상위의 주소에 Mytest.txt라고 하는 파일을 작성하고자 하는 변수
			
			fw.write("안녕 파일\n");//안녕 파일 개행이라는 문장을 작성
			fw.write("hello 헬로\n");//hello 헬로 개행이라는 문장을 작성
			
			fw.close();//파일작성을 종료
			
			FileReader fr = new FileReader(f);//파일 읽기 변수를 선언
			
			int n = -1;//int형 변수를 선언
			char [] ch;//char형 1차원 배열 변수를 선언
			
			while(true) {//반복문을 통하여
				ch = new char [100];//ch는 백개짜리 변수
				n = fr.read(ch);//n값은 파일을 읽어온 메모리 변수
				
				if(n == -1)break;//n값이 -1이면 브레이크로 반복문을 탈출
				
				for(int i =0; i<n; i++) {//char[n개]의 배열을 버퍼 없이 잡아내기 위하여 우선 배열에 이용할 for문을 사용
					System.out.printf("%c",ch[i]);//배열에 for문의 i를 사용하여 배열을 구성
				}
			}
			fr.close();//fr을 종료
			
			System.out.printf("\n FILE READ END");//fr(파일 읽기)이 끝나면 FILE READ END를 찍어줌 
		} catch (Exception e) {//try catch문을 통해서 오류 발생시 나 에러 라고 찍어주기
				System.out.printf("나 에러[%s]\n",e);
		}
	}

}
