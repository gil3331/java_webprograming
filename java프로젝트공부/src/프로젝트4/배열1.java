package ������Ʈ4;

public class �迭1 {

	public static void main(String[] args) {//int[]�� �迭�ν�, ���� ������ ������ �� ����, �� ���ڸ� ������ ����������, �迭�� �����ν�, ���� ���� ���� ������ ���� �� �ִ� �����̴�.
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};//int[]arr�� 1,2,3,4,5��� ���� ������ �������ش�.
		int[]arr2=arr; //arr2�� arr�� ����.    new int[5];-���� ����� ���ؼ��� new�� �����ؾ���.
		int[]arr3=arr2;//arr3�� arr2�� ����.
		arr3[0]=10;//arr3�� ù��° �迭���� 10�̴�.
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}//�迭�� ���� �������� ������ ���� ���� ���� ������ ���ǰ� �ʿ���.(���� ����� 10,10,10���� ���´�.)

}
