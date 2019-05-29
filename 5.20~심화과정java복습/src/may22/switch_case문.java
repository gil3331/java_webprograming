package may22;
//Title : switch_case문
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class switch_case문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k15_jumin = "123456-1234567";//주민번호를 기입
		switch(k15_jumin.charAt(7)) {//charAt(7)은 왼쪽부터 시작해서 8번째(0~부터 시작)자리를 추출
			case '1' ://8번째 자리가 1이면
				System.out.printf("20세기전 태어난 남자사람\n");//20세기전 태어난 남자사람 출력
				//break;    #키포인트는 case1에서 case2로 넘어갈 때, break가 없기 때문에 case1의 경우 case2까지 실행하여, 아래의 출력문도 출력
			case '2' ://8번째 자리가 2이면
				System.out.printf("20세기전 태어난 여자사람\n");//20세기 전 태어난 여자사람 출력
				break;//브레이크를 통해 case3로 넘어감
			case '3' : //8번째 자리가 3이면
				System.out.printf("20세기후 태어난 남자사람\n");//20세기 후 태어난 남자사람 출력
				break;//브레이크를 통해 case4로 넘어감
			case '4' ://8번째 자리가 4이면
				System.out.printf("20세기후 태어난 여자사람\n");//20세기 후 태어난 여자사람 출력
				break;//브레이크로 default로 넘어감
			default ://8번째 자리가 1~4가 아니라면 
				System.out.printf("사람\n");//걍 사람으로 출력
				break;//브레이크로 switch문을 나감
		}
	}

}
