package DesignPackage;
//Title : SingletonMain
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Singleton s = new Singleton();  private���� �Ǿ� �־ �ҷ��� �� ������ ������ ����.
			Singleton s1 = Singleton.getInstance();//getInstance�� �ҷ����� �Ǿ� ���� ���� ��밡��
			Singleton s2 = Singleton.getInstance();//getInstance�� �ҷ����� �Ǿ� ���� ���� ��밡��
			Singleton s3 = Singleton.getInstance();//getInstance�� �ҷ����� �Ǿ� ���� ���� ��밡��
			Singleton s4 = Singleton.getInstance();//getInstance�� �ҷ����� �Ǿ� ���� ���� ��밡��
			
			System.out.println(s1);//s1�� ���
			System.out.println(s2);//s2�� ���
			System.out.println(s3);//s3�� ���
			System.out.println(s4);//s4�� ���
					
	}

}
