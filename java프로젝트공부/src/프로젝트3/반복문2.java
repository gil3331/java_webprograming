package 프로젝트3;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=2;
		while(row<10) {//row가 2일때, row가 10보다 작으면, 
			System.out.print(row+" ");//row와 공백을 출력하고,
			int column=1;
			while(column<10) {//column이 1일때, 10보다 작으면,
				
				System.out.print(column+" , ");//column과 공백을 출력하면서,
				column++;//column을 1을 더한다.(9까지만!!!)
			}row++;//row에 1을 더한다.(9까지만!!!)
			System.out.println();
		}
	}

}
