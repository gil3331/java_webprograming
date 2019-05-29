package may22;
//Title : 비정형비교-2,3
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 비정형비교2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비정형 비교2
//		for(int k15_i =1 ; k15_i < 13 ; k15_i++) {//매월에 해당하는 값을 i로 지정하여 1~12까지 1씩 더해지게 for문을 구성
//			System.out.printf("%d월 =>",k15_i);//월에 i값이 들어가게 출력
//			for(int k15_j = 1; k15_j < 32; k15_j ++) {//j값은 매일에 해당되는 값이 되게 하여 1부터 31까지 1씩 더해지게 for문 구성
//				System.out.printf("%d,",k15_j);//일자가 출력
//				
//				if(k15_i==4|| k15_i==6||k15_i==7||k15_i==9||k15_i==11) {//다만 월이 4,6,7,9,11 인 경우에는
//						if(k15_j==30) break;//일자에 30을 마지막으로 브레이크함.
//				}
//				if(k15_i==2) {//그 외의 2월이면,
//						if(k15_j==28)break;//28일을 마지막으로 브레이크함.
//				}
//			}
//			System.out.printf("\n");//매월의 마지막날이 끝날 때마다 개행을 출력
//		}
		
		
		//비정형 비교3
		for(int k15_i =1 ; k15_i < 13 ; k15_i++) {//매월에 해당하는 값을 i로 지정하여 1~12까지 1씩 더해지게 for문을 구성
			System.out.printf("%d월 =>",k15_i);//월에 i값이 들어가게 출력
			for(int k15_j = 1; k15_j < 32; k15_j ++) {//j값은 매일에 해당되는 값이 되게 하여 1부터 31까지 1씩 더해지게 for문 구성
				System.out.printf("%d,",k15_j);//일자가 출력
				
				if((k15_i==4||k15_i==6||k15_i==7||k15_i==9||k15_i==11)&&(k15_j==30))break;//아까와는 다르게 if문 하나에 월의 경우와 일의 경우를 한줄로 처리
				if(k15_i==2&&k15_j==28)break;//2월도 마찬가지로 if문 하나에 처리
			}//코드가 좀더 짧아진것 같지만, 가독성이 떨어져 비정형 비교2처럼 하는 것을 권장함
			System.out.printf("\n");//매월의 마지막날을 기준으로 개행을 출력
		}
			
	}

}
