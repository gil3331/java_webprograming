package 프로젝트4;

import java.util.Scanner;

public class 역달팽이2중배열예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("몇칸 몇줄로 입력할까요?");
		int inputSize = in.nextInt(); //입력 받기
		int vortax = inputSize; //초기값유지를 위해 별도의 소용돌이 사이즈 변수 선언
		int turnCount = 1; //모서리를 돌 때마다 1씩 증가
		int count = inputSize*inputSize; //표시될 숫자
		String direction = "좌"; //초기 진행방향
		int i = 0,j = inputSize; //시작 좌표
		int[][] array = new int[vortax][vortax]; //입력받은 수에 따라 배열 선언
		
		while(vortax>=0) {
			switch(direction) {
			case "좌": //왼쪽으로 배열 위치 이동
				for(j=vortax-1; j>=inputSize-vortax; j--) { //범위	
					array[j][i] = count; //숫자를 각 배열의 위치에 저장
					count--;
				}
				j++;
				direction = "하"; //다음 방향은 아래쪽으로
				break;
			case "상": //위쪽
				for(i=vortax-1; i>inputSize-vortax-1; i--) {
					array[j][i] = count;
					count--;
				}
				i++;
				direction = "좌"; //다음 방향은 좌측으로
				break;
			case "우": //오른쪽
				for(j=inputSize-vortax+1; j<vortax; j++) {
					array[j][i] = count;
					count--;
				}
				direction = "상"; //다음 방향 설정
				j--;
				break;
			case "하": //아래쪽
				for(i=inputSize-vortax+1; i<vortax; i++) {
					array[j][i] = count;
					count--;
				}
				direction = "우"; //다음 방향 설정
				i--;
				break;
			}
			turnCount++; //각 case를 빠져나올때마다 모서리를 도는 것이므로 1씩 증가
			if(turnCount % 4 == 0) {
				vortax--; //한바퀴 돌 때마다 모서리값 1씩 감소
			}
		}	
		//출력부
		for (int k=0; k<inputSize; k++) {
			for (int l=0; l<inputSize; l++) {
				System.out.printf("%4d", array[l][k]);
			}
			System.out.println();
		}
		in.close();
	}

}
