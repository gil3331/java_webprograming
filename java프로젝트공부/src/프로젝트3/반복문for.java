package 프로젝트3;

public class 반복문for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {//i가 2일때 10보다 작으면, i에 1을 더하고,
			if(i%3!=0){//i가 3으로 나눠 떨어지지 않으면,
				for(int j=1;j<=9;j++) {//j가 1일때, 9보다 작으면, 아래처럼 출력하면서 하나씩 더해줌
			System.out.printf("%d*%d=%d\n",i,j,i*j);//ij를 출력하면서 i*j를 출력함.(10미만으로!!!!)
			}
			}
		}
		}
	}


