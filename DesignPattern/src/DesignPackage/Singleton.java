package DesignPackage;
//Title : singleton
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
public class Singleton {
		private static Singleton s = new Singleton();//private으로 구성되어 있어 다른 클래스에서 참조가 불가능 하지만,
																				  //getInstance()에서 사용가능하기 위해서 static을 부여
				private Singleton() {//private으로 구성된 생성자
			
			
		}
		public static Singleton getInstance() {//본래는 private설정이 되어 있어 참조할 수 없지만, static으로 되어 있어서 getInstance() 가능
			if(s==null) {//s값이 null이면
				s =new Singleton();//s는 new Singleton으로 선언
			}
			return s;//s를 return한다.
		}
	}


