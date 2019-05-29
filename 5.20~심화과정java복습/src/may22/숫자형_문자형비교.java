package may22;
//Title : 숫자형, 문자형 비교
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 숫자형_문자형비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_il;
		double k15_iD;
		
		k15_il = 10/3;
		k15_iD = 10/3.0;//프로그램적으로 il과 iD의 값은 철저하게 다르다.
		
		if (k15_il == k15_iD) System.out.printf("equal\n");//두 값이 같으면 euqal을 출력
		else System.out.printf("Not equal[%f][%f]\n",(double)k15_il, k15_iD);//다르면 Not equal을 출력하는데, 결과적으로 int형으로 계산하면, 정수값만 표현 되고,
																																//double형으로 계산하면 실수 값도 포함해서 산출되기 때문에 두 값은 다르다.
		
		if (k15_iD ==3.333333) System.out.printf("euqal\n");
		else System.out.printf("Not equal[3.333333][%f]\n",k15_iD);//실수출력의 연산자인 %f는 출력제한범위가 소수점 여섯째 자리가지이고,
																											 	 //출력값을 시각적으로 보면 그냥 3.333333인것 같지만, 실제 값으로 계속 .3이 이어지기 때문에
																												 //다른 값이라고 판단해야 한다.
		
		k15_iD = (int)k15_iD;//iD의 값을 int형으로 형변환 하면, 실수값이 버려지고, 정수형만 남는다.
		if (k15_il==k15_iD) System.out.printf("equal\n");//그렇기 때문에 il값이랑, iD의 값은 완전히 같은 값으로 나와 equal이 출력된다.
		else System.out.printf("Not equal [%f][%f]\n", (double)k15_il, k15_iD);
		
		System.out.printf("int로 인쇄 [%d][[%f]]\n",k15_il,k15_iD);//il의 경우는 애초에 int형이고, %d로 정수값 출력을 하여, 3이 나오지만, iD는 double형에 %f 출력을 받아 3.00000이 나옴
		System.out.printf("double로 인쇄 [%f][%f]\n",(double)k15_il,k15_iD);//il에 double을 주고 %f 값을 받아 3.00000형태로 출력하고, iD의 경우는 애초에 double선언에 %f로 3.00000이 나옴
		
		char k15_a = 'c';
		
		if(k15_a=='b')System.out.printf("a는 b이다\n");
		if(k15_a=='c')System.out.printf("a는 c이다\n");//지금은 c로 고정되어 있어 a는 c이다가 출력되지만,
		if(k15_a=='d')System.out.printf("a는 d이다\n");//char에서 c 값을 다른 문자로 바꾸면 출력값이 달라진다.
		
		String k15_aa = "abcd";
		
		if(k15_aa.equals("abcd")) System.out.printf("aa는 abcd이다.\n");//aa의 값이 "abcd"와 같다면 "aa는 abcd이다"를 출력 
		else System.out.printf("aa는 abcd가 아니다.\n");//아닌 경우는 aa는 abcd가 아니다를 출력
		
		boolean k15_bb = true;//참거짓 연산자인 boolean을 통해 bb의 경우를 true로 선언
		
		if(!!k15_bb) System.out.printf("bb가 아니고 아니면 참이다.\n");//!!=부정의 부정은 긍정이라는 개념(결론은 "bb이면은")으로 bb가 아니고 아니면 참이다를 출력  
		else System.out.printf("bb가 아니고 아니면 거짓이다.\n");//그렇기 때문에 ! 한개면 거짓이다가 출력된다.
				
	}

}
