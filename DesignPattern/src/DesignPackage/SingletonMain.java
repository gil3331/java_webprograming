package DesignPackage;
//Title : SingletonMain
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Singleton s = new Singleton();  private으로 되어 있어서 불러올 수 없으니 에러가 난다.
			Singleton s1 = Singleton.getInstance();//getInstance로 불러오게 되어 오류 없이 사용가능
			Singleton s2 = Singleton.getInstance();//getInstance로 불러오게 되어 오류 없이 사용가능
			Singleton s3 = Singleton.getInstance();//getInstance로 불러오게 되어 오류 없이 사용가능
			Singleton s4 = Singleton.getInstance();//getInstance로 불러오게 되어 오류 없이 사용가능
			
			System.out.println(s1);//s1값 출력
			System.out.println(s2);//s2값 출력
			System.out.println(s3);//s3값 출력
			System.out.println(s4);//s4값 출력
					
	}

}
