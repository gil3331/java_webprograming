package 프로젝트1;

public class 기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //이하 내용은 이름 나이 생일 인사말 작성법 입니다.
        System.out.println("이름 : 이길준\n" + 
      		  			 "나이 : 29\n"+
      		  			 "생일 : 9월2일\n"+
      		  			 "인사말 : 안녕하세요 데이터 융합 전공의 이길준입니다.");
      	System.out.println("---------------------------------------------");
        //버스카드 표현법
        //현재돈=int로 표현   거리=m단위 short표현    위치=double로 표현   구분=byte 
        //int current balance=30000(현재 잔액표현)
        
      	//시간당 거리 표현법
        //step1 int로 변수를 설정
        //step2 println 및 printf로 출력
        int mach;
        //mach=마하
        int distance;
        //distance=거리
        mach=340;
        distance=mach*60*60;
        System.out.println("1시간 동안 가는 거리 : "+distance + "m");
        System.out.printf("1시간 동안 가는 거리 : %d"+ "m\n",distance);
        System.out.println("---------------------------------------------");
        
        //현재잔액 표현법
        int currentBalance;
        currentBalance=15000;
        final int CURRENT_BUS_PRICE=1250;
        int chargemoney=5000;
        System.out.println("현재 잔액은 : "+currentBalance +"원");
         //카드 찍음currentBalance=currentBalance - CURRENT_BUS_PRICE
        currentBalance=currentBalance - CURRENT_BUS_PRICE;
        		System.out.println("현재 잔액은 : "+currentBalance +"원");
        //충전
        currentBalance=currentBalance + chargemoney;
        System.out.println("현재 잔액은 : "+currentBalance +"원");
        System.out.println("---------------------------------------------");
        char ga1 ='가';
        char ga2 ='\uac00';
        char ga3 ='로';
        boolean a = true;
        boolean b = false;
        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(ga3);
        System.out.println(a + "가 아니면" + b + "이다.");
        System.out.println("---------------------------------------------");
        
        //강제 형태 변환 방법 = 숫자or활자에 원하는 형태를 (형태)로 표현
        int data;
        float floatData;
        floatData=(float)122.5;
        data=(int)floatData;
        System.out.println(data);
        int i;
        double d;
        i=(int)(7/(double)4.2);
        System.out.println(i);
        d=7/4;
        System.out.println(d);
        //d가 double로 표현되있어 소수로 표현가능
        d=7/(double)4;
        System.out.println(d);
        
	}

}
