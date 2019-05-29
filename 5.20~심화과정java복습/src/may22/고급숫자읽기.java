package may22;
//Title :고급숫자읽기
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 고급숫자읽기 {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    int k15_iNumVal=1001034567;//int형으로 숫자를 변수 선언
    String k15_sNumVal=String.valueOf(k15_iNumVal);//숫자를 문자의 자리값을 통해서 숫자자리를 구분하기 위해 string형으로 만든 후 변수에 저장
    String k15_sNumVoice="";
    System.out.printf("==>%s[%d자리]\n",k15_sNumVal,k15_sNumVal.length());//length를 통해서 자리값을 구분하고, [출력값으로] 지정
    int k15_i, k15_j;
    String[] k15_units= {"영","일","이","삼","사","오","육","칠","팔","구"};//결과에서 [배열 칸-숫자에 들어갈 값을] 작성
    String[] k15_unitX= {"","십","백","천","만","십","백","천","억","십"};//결과에서 [배열 칸-자리단위에 들어갈 값을] 작성
    k15_i=0;
    k15_j=k15_sNumVal.length()-1;
    
    while(true) {//반복문을 선언
       if(k15_i >= k15_sNumVal.length())break;//length값이 i보다 크거나 같으면 브레이크를 통해서 반복문 탈출
       
       System.out.printf("%s[%s]",//출력형식 지정
             k15_sNumVal.substring(k15_i,k15_i+1),//substring으로 i값과 i+1을 한값을 지정
             k15_units[Integer.parseInt(k15_sNumVal.substring(k15_i,k15_i+1))]);//그런 결과값을 integer로 지정하여 구현
       
       if(k15_sNumVal.substring(k15_i,k15_i+1).equals("0")) {//substring의 값이 0과 같을 때, 0을 구현
          if(k15_unitX[k15_j].equals("만")||k15_unitX[k15_j].equals("억")) {//j값이 만단위이면 만을, 억단위이면 억을 구현
             k15_sNumVoice=k15_sNumVoice + ""+k15_unitX[k15_j];//상위의 구현을 서로 붙혀서 sNumVoice로 저장
          }else {
             //아무것도 하지 않음
          }   
       }else {//위의 if가 아니라면,
          k15_sNumVoice=k15_sNumVoice//sNumVoice가 sNumVoice에 units을 붙히고, unitX의 j값을 붙혀서 구현
                +k15_units[Integer.parseInt(k15_sNumVal.substring(k15_i,k15_i+1))]
                +k15_unitX[k15_j];
       }
       k15_i++; k15_j--;//i는 1씩 증가, j는 1씩 감소
    System.out.printf("\n %s[%s]\n",k15_sNumVal,k15_sNumVoice);//그런 결과값을 형식에 맞춰 출력하고, 개행한다.
    }
 }

}