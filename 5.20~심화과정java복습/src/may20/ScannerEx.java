package may20;

import java.util.Scanner;//scanner를 사용하기 위하여 import함.

//Title : 변수실습5
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//scanner를 사용
		
		System.out.print("두자리 정수를 입력해주세요. >");
		
		String k15_input = scanner.nextLine();//input변수에 scanner를 통해서 데이터를 받음
		int k15_num = Integer.parseInt(k15_input);//위에서 받은 input데이터가 string형의 문자이기 때문에, int형으로 바꿔줌
		
		System.out.println("입력내용 : "+k15_input);//입력내용으로 input데이터를 출력
		System.out.printf("num=%d%n", k15_num);//숫자로서의 num(숫자형으로 변환된 input데이터)변수를 출력
	scanner.close();
	}

}
