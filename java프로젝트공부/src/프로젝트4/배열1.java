package 프로젝트4;

public class 배열1 {

	public static void main(String[] args) {//int[]란 배열로써, 기존 변수는 오로지 한 숫자, 한 문자만 선언이 가능했지만, 배열을 씀으로써, 선언 내에 여러 변수를 가질 수 있는 형태이다.
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};//int[]arr에 1,2,3,4,5라는 변수 집단을 선언해준다.
		int[]arr2=arr; //arr2는 arr과 같다.    new int[5];-새로 만들기 위해서는 new를 지정해야함.
		int[]arr3=arr2;//arr3은 arr2와 같다.
		arr3[0]=10;//arr3의 첫번째 배열값은 10이다.
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}//배열은 가장 마지막에 지정된 설정 값을 따라 감으로 주의가 필요함.(실제 출력이 10,10,10으로 나온다.)

}
