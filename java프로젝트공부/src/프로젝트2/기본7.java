package 프로젝트2;

import java.util.Scanner;

public class 기본7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch를 통해서 사전 만들어보기
		Scanner in =new Scanner(System.in);
		String inputdata;
		System.out.print("단어를 입력해주세요 : ");
		inputdata = in.next();//inputdata를 통해서 단어를 입력하게 함
		switch(inputdata) {
		case "apple" :
			System.out.println("검색결과 :사과입니다.");
			//apple을 썼을때, 사과라는 의미가 나오게 함.
			break;
		case "사과" : 
			System.out.println("검색결과 :apple입니다.");
			//사과를 썼을때, apple라는 의미가 나오게 함.
			break;
		case "police" : 
			System.out.println("검색결과 :경찰입니다.");
			//police을 썼을때, 경찰이라는 의미가 나오게 함.
			break;
		case "경찰" : 
			System.out.println("검색결과 :police입니다.");
			//경찰을 썼을때, police라는 의미가 나오게 함.
			break;
		case "effort" : 
			System.out.println("검색결과 :노력입니다.");
			//effort를 썼을때, 노력이라는 의미가 나오게 함.
			break;
		case "노력" : 
			System.out.println("검색결과 :effort입니다.");
			//노력을 썼을때, effort라는 의미가 나오게 함.
			break;
		default : //상위의 입력값을 제외한 나머지는 모름으로 출력되게 함. 
			System.out.println("검색결과 : 모름");
		}
		in.close();
	}

}
