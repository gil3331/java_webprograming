package may22;
//Title :case문 비교
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class case문비교 {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    for(int k15_i = 1; k15_i < 13; k15_i++) {//i값은 월에 해당하여 for문으로 1~12까지 1씩 더한다.
       System.out.printf("%d월 =>",k15_i);//그런 i값을 출력
       
       LOOP:for(int k15_j=1; k15_j<32; k15_j++) {//LOOP라는 명으로 내부 for문을 지정해주고, 날짜 값을 j로 저장 및 1씩더해서 31까지 만듬
          System.out.printf("%d,",k15_j);//그런 j값을 출력
          
          switch(k15_i) {//i값이 
          case 4: case 6:case 7:case 9:case 11://4,6,7,9,11월일 때,
             if(k15_j==30)break LOOP;//j값이 30일까지 가면,LOOP(내부for문)를 탈출
             break;
          case 2://2월일 때
             if(k15_j==28)break LOOP;//28일이 되면 LOOP(내부for문)를 탈출
             break;//LOOP라고 따로 지정하지 않고 사용하면 전체가 마지막 날이 31 되기 때문에 반드시 지정이 필요!
          }
       }
       System.out.printf("\n");//매월 마지막 날까지 가면 개행을 출력
    }
 }

}
