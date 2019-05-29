package may20;
//Title : CastingEx1(강제적 형변환)
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k15_d = 85.4;//double형으로 실수 변수를 선언
		int k15_score = (int)k15_d;//그런 double형을 int형으로 강제 형변환
		
		System.out.println("score = "+k15_score);//score변수의 경우 int형으로 강제 형변환 되어 정수값만 나옴
		System.out.println("d = "+k15_d);//실수형으로 85.4 정상 출력됨
	}

}
