package may22;
//Title :숫자읽기
//Date : 2019.05.22
//Author : 이길준
//Comment : .....
public class 숫자읽기 {

 public static void main(String[] args) {
    // TODO Auto-generated method stub
    String [] k15_units= {"영","일","이","삼","사","오","육","칠","팔","구"};//영부터 구까지의 string형 문자를 1차원 배열에 저장
    for(int k15_i=0;k15_i<101;k15_i++) {//0부터 100까지 1씩 증가하여 i에 저장
       if(k15_i>=0&&k15_i<10) {//i값이 0~9까지는 
          System.out.printf("일의 자리 : %s\n",k15_units[k15_i]);//일의 자리로 표현
       }
       else if(k15_i>=10&&k15_i<100) {//i값이 10이상이고 100미만인 경우
          int k15_i10,k15_i0;//변수선언
          k15_i10=k15_i/10;//십의 자리 판단하는 식(해당 값을 10나누면 십의자리 값)
          k15_i0=k15_i%10;//일의 자리 판단하는 식(해당 값에 10을 나눈 나머지가 곧 일의자리 값)
          if(k15_i0==0) {//일의 자리가 0일 때
             System.out.printf("십의 자리 : %s십\n",k15_units[k15_i10]);//십의 자리 값에 영 부터 구까지의 string형 문자를 부여
          }else {//나머지가 0이 아닌 경우(일의 자리가 있는 경우)
             System.out.printf("십의자리 : %s십%s\n",k15_units[k15_i10],k15_units[k15_i0]);//십의 자리 값과 일의자리 값을 각각 넣어 string형 문자를 부여
          }
          System.out.printf("==>%d\n",k15_i);//i값을 산출
       }
    }
 }

}