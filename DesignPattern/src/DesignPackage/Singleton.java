package DesignPackage;
//Title : singleton
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
public class Singleton {
		private static Singleton s = new Singleton();//private���� �����Ǿ� �־� �ٸ� Ŭ�������� ������ �Ұ��� ������,
																				  //getInstance()���� ��밡���ϱ� ���ؼ� static�� �ο�
				private Singleton() {//private���� ������ ������
			
			
		}
		public static Singleton getInstance() {//������ private������ �Ǿ� �־� ������ �� ������, static���� �Ǿ� �־ getInstance() ����
			if(s==null) {//s���� null�̸�
				s =new Singleton();//s�� new Singleton���� ����
			}
			return s;//s�� return�Ѵ�.
		}
	}


