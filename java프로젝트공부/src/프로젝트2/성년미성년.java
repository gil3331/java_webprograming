package 프로젝트2;

import java.util.Scanner;

public class 성년미성년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int residentNumber,age;
		System.out.print("주민등록번호 앞자리를 입력해주세요 : ");
		residentNumber = in.nextInt();
		//주민번호를 입력하게 함.
		age = residentNumber/10000;
		//나이는 주민번호 여섯자리중 앞의 두자리이기 때문에 10000을 나눈 몫으로 표현함.
		int date = residentNumber%100;
		System.out.println("일자는 : "+date);
		//주민번호의 날짜는 %100으로 나눈 나머지 뒷 두자리로 출력함.
        int month = ((residentNumber%10000)-date)/100;
		System.out.println("월은 : "+month);
		//주민번호의 월은 주민번호에서 앞 두자리를 뺀 뒤, 데이트를 지우고, 천 단위이기에 100을 나눈 몫을 쓰면, 두자리의 출력값이 나옴
		if(age<=19) {
			age = 2019 - (age + 2000);//2000년대
			//2000년대의 경우는 앞자리가 00이기때문에, 2000을 더해서 2019를 빼주면 나이가 나온다.
		}else {
			age = 2019 - (age + 1900);//1900년대
			//1900년대의 경우는 90대로 산출되기 때문에, 일단 1900을 더하고, 거기에 2019를 빼서 나이를 산출한다.
		}
		if (month>3 || (month==3&&date>7)) //오늘이 3월 7일 이기 때문에 3월이 넘어 버리는 경우나, 3월일 경우에 날짜가 7 초과인 경우를 통해서 만 나이를 구분함if로 구분
			{
			age = age-1;
		}
		System.out.println("나이는 "+age);
		//그렇게 나온 결과 값이 19세 이상인 경우는 성년으로, 아닌 경우는 미성년으로 구분하여 출력함.
		if(age>=19) {
			System.out.println("성년 입니다.");
		}else {
		    System.out.println("미성년 입니다.");
		}
		in.close();	
	}

}
