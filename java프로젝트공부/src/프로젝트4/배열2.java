package 프로젝트4;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello,my,name,is";//String의 문자열을 선언함.
		String[] result;//String[]으로 문자열 배열을 지정한 결과값을 선언함.
		result=str.split(",");//지정된 문자열 배열 값 내에 ,를 기준으로 나누게 명령함.
		System.out.println(result[0]);//지정된 결과 값의 첫번째(0번째가 컴퓨팅 사고 방식에선 첫번째 지정값) 지정 값을 출력함.
	}

}
