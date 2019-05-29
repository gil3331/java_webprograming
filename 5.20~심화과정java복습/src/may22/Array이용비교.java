package may22;
//Title :Array이용 비교
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class Array이용비교 {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    int [] k15_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};
    //매 월의 마지막 날을 iLMD로 지정하여 일차원 배열로 저장
    for(int k15_i =1; k15_i <13; k15_i++) {//각 월은 다른 형식과 마찬가지로 1~12까지 1씩 더하여 구현
       System.out.printf("%d월 =>",k15_i);//구현된 i값을 출력
       for(int k15_j =1;k15_j<32;k15_j++) {//날짜도 마찬가지로 1일 부터 31일까지 1씩 더하여 구현
          System.out.printf("%d",k15_j);//계산된 j값을 출력
          
          if(k15_iLMD[k15_i-1]==k15_j)break;//여기서 1월일 때, 1을 빼야 0값이 나와 배열은 0부터 시작을 하기 때문에
          //처음부터 시작하고, 그 값이 j값(일자)과 같으면 브레이크하여, 내부 for문을 탈출한다.            
          System.out.printf(",");//각 날자에 한해서 ,를 출력해준다.
       }
       System.out.printf("\n");//매월의 마지막이 되면 개행을 출력
    }
 }

}
