package may22;
//Title : 비정형비교-1
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 비정형비교_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k15_i =1 ; k15_i < 13 ; k15_i++) {//매월에 해당하는 값을 i로 지정하여 1~12까지 1씩 더해지게 for문을 구성
			System.out.printf("%d월 =>",k15_i);//월에 i값이 들어가게 출력
			for(int k15_j = 1; k15_j < 32; k15_j ++) {//j값은 매일에 해당되는 값이 되게 하여 1부터 31까지 1씩 더해지게 for문 구성
				System.out.printf("%d,",k15_j);//일자가 출력
				//매월의 마지막 날짜가 다르고, 이해를 위해 가장 간단하고 확실하게 코딩
				if(k15_i == 1 && k15_j == 31)break;//1월의 마지막은 31일로 하여 break로 2월로 넘어감
				if(k15_i == 2 && k15_j == 28)break;//2월의 마지막은 28일로 하여 break로 3월로 넘어감
				if(k15_i == 3 && k15_j == 31)break;//3월의 마지막은 31일로 하여 break로 4월로 넘어감
				if(k15_i == 4 && k15_j == 30)break;//4월의 마지막은 30일로 하여 break로 5월로 넘어감
				if(k15_i == 5 && k15_j == 31)break;//5월의 마지막은 31일로 하여 break로 6월로 넘어감
				if(k15_i == 6 && k15_j == 30)break;//6월의 마지막은 30일로 하여 break로 7월로 넘어감
				if(k15_i == 7 && k15_j == 31)break;//7월의 마지막은 31일로 하여 break로 8월로 넘어감
				if(k15_i == 8 && k15_j == 31)break;//8월의 마지막은 31일로 하여 break로 9월로 넘어감
				if(k15_i == 9 && k15_j == 30)break;//9월의 마지막은 30일로 하여 break로 10월로 넘어감
				if(k15_i == 10 && k15_j == 31)break;//10월의 마지막은 31일로 하여 break로 11월로 넘어감
				if(k15_i == 11 && k15_j == 30)break;//11월의 마지막은 30일로 하여 break로 12월로 넘어감
				if(k15_i == 12 && k15_j == 31)break;//12월의 마지막은 31일로 하여 break로 for문을 종료
			}
			System.out.printf("\n");//각 월이 끝날 때 마다 개행을 출력
		}
	}

}
