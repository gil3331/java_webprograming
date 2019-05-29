package may20;
//Title : 변수실습3
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_name = "ja" + "va";//string형으로 변수 ja와 va를 받아 name에 저장
		String k15_str = k15_name + 8.0;//name변수 뒤에 8.0을 붙힘
		
		System.out.println(k15_name);//name변수를 출력
		System.out.println(k15_str);//str변수를 출력
		System.out.println(7 + " ");//숫자7뒤에 " "의 공백을 붙힘
		System.out.println(" " + 7);//" "의 공백 뒤에 숫자 7을 붙힘
		System.out.println(7 + "");//7뒤에 ""을 붙히나, 공백문자가 없어서 붙힐게 없음
		System.out.println("" + 7);//7앞에 ""을 붙히나, 상위와 같은 케이스임
		System.out.println("" + "");//공백이 존재하지 않아 붙힐게 없음
		System.out.println(7 + 7 + "");//숫자 7과 숫자 7이 더해짐
		System.out.println("" + 7 + 7);//앞에 ""이 존재함으로서 그 뒤가 다 문자로 7과 7이 붙음
		
	}

}
