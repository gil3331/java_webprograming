package 프로젝트1;

public class 기본4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		//x를 1이라 선언
		int y;
		y=(x==1)?30:20;
		//y를 (x는 1이냐 라고 물어보며), 1인경우 y가 30이 되며, 1이 아닌 경우는 y가 20이라 표현함.
		//x==1는 true이므로, y에 30을 대입한다.
		System.out.println(y);
		y=(x>5)?x++:x+50;
		//x>5는 거짓이므로 y에 x+50의 값을 대입한다.
		System.out.println(x);
		System.out.println(y);
		//x와 y값 출력
	}

}
