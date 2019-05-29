package 프로젝트3;

public class 메서드3 {//for문과 메서드를 통한 제곱식
	
	public static int calcPow(int pow1,int pow2) {//메서드 내에서 pow1,2라는 변수를 선언해주고,
		int result=1;//결과 값이 1일때,
		for (int i=0;i<pow2;i++) {//i=0일때, pow2보다 작으면, result 값을 pow1과 곱하고, i에 1을 더해준다.
			result = result*pow1;
		}
		return result;//식을 마치고, result라고 결과를 도출한다.
	}
	public static int calculator(int a,int b , String c) {//calculator라는 메서드 내에서 int a,b String c를 변수로 선언해주고,
		int result =0;//result값이 0일때, 
		if(c.equals("+")) {//string c가 "+"이면
			result=a+b;//a와 b를 더하고,
		}else if(c.equals("-")) {//string c가 "-"이면
			result=a-b;//a와 b를 빼고,
		}else if(c.equals("*")) {//string c가 "*"이면
			result=a*b;//a와 b를 곱하고,
		}else if(c.equals("/")) {//string c가 "/"이면
			result=a/b;//a와 b를 나눈다.
		
		}
		return result;//상위의 수식대로 계산을 한 뒤, result를 도출한다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculator(20,10, "+"));//calculator메서드 내에서 변수가 20,10일때, 두 수를 더한 결과 값을 출력함.
		System.out.println(calculator(20,10, "-"));//calculator메서드 내에서 변수가 20,10일때, 두 수를 뺀 결과 값을 출력함.
		System.out.println(calculator(20,10, "*"));//calculator메서드 내에서 변수가 20,10일때, 두 수를 곱한 결과 값을 출력함.
		System.out.println(calculator(20,10, "/"));//calculator메서드 내에서 변수가 20,10일때, 두 수를 나눈 결과 값을 출력함.
	}

}
