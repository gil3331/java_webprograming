package may24;
//Title : StringŬ������ �����ڿ� �޼���
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
public class PracticeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String("Hello");//s1�� ���� string�ν��Ͻ� ����
		System.out.printf("%s\n",s1);
		
		char[] c1 = {'H', 'e','l','l','o' };//�־��� ���ڿ��� ���� string�μ��Ͻ� ����
		String s2 = new String(c1);
		System.out.printf("%s\n",s2);
		
		StringBuffer sb =//stringbuffer�ν��Ͻ��� ���� ���ڿ��� ���� ����l string�ν��Ͻ� ����
				new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.printf("%s\n",s3);
		
		String s4 = "Hello";//������ ��ġ�� �ִ� ���ڸ� �˷���
		String n = "0123456";
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		System.out.printf("%s\n",c2);
		System.out.printf("%s\n",c3);
		
		String s5 = "Hello";//���ڿ�(str)�� �ڿ� �����δ�.
		String s6 = s5.concat("World");
		System.out.printf("%s\n",s5);
		System.out.printf("%s\n",s6);
		
		String s7 = "abcedfg";//������ ���ڿ��� ���ԵǾ����� �˻�
		boolean b = s7.contains("bc");
		System.out.printf("%s\n",b);
		
		String s8 = "Hello";//�Ű������� ���� ���ڿ��� string�ν��Ͻ��� ���ڿ� ��
		boolean b2 = s8.equals("Hello");
		boolean b3 = s8.equals("hello");
		System.out.printf("%s\n",b2);
		System.out.printf("%s\n",b3);
		
		String s9 = "Hello";//���ڿ��� string�ν��Ͻ��� ���ڿ��� ��ҹ��� ���о��� ��
		boolean b4 = s9.equalsIgnoreCase("HELLO");
		boolean b5 = s9.equalsIgnoreCase("heLLo");
		System.out.printf("%s\n",b4);
		System.out.printf("%s\n",b5);
		
		String s10 = "Hello";//�־��� ���ڰ� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ�� ����
		int idx1 = s10.indexOf("o");//�� ã���� -1�� ��� ������ �ش�.
		int idx2 = s10.indexOf("k");
		System.out.printf("%d\n",idx1);
		System.out.printf("%d\n",idx2);
		
		String s11 ="ABCDEFG";//�־��� ���ڿ��� �����ϴ��� Ȯ���Ͽ� �� ��ġ�� �˷��ش�.
		int idx = s11.indexOf("CD");//������ -1�� ��ȯ
		System.out.printf("%d\n",idx);
		
		String s12 = new String("abc");//���ڿ��� constant pool�� ����Ѵ�.
		String s13 = new String("abc");//���� ������ ���ڿ��� ���� ��� �� ���ڿ��� �ּҰ��� ��ȯ
		boolean b6 = (s12==s13);
		boolean b7 = s12.equals(s13);
		boolean b8 = (s12.intern()==s13.intern());
		System.out.printf("%s\n",b6);
		System.out.printf("%s\n",b7);
		System.out.printf("%s\n",b8);
		
		String s14 = "java.lang.Object";//������ ���� �Ǵ� �����ڵ带 ���ڿ��� ������ ���������� ã�Ƽ�
		int idx3 = s14.lastIndexOf(".");//��ġ�� �˷��ְ� ��ã���� -1 ��ȯ
		int idx4 = s14.indexOf(".");
		System.out.printf("%d\n",idx3);
		System.out.printf("%d\n",idx4);
		
		String s15 = "java.lang.java";//������ ���ڿ��� �ν��Ͻ��� ���ڿ� ���������� ã�Ƽ� ��ġ�� �˷���
		int idx5 = s15.lastIndexOf("java");//�� ã���� -1 ��ȯ
		int idx6 = s15.indexOf("java");
		System.out.printf("%d\n",idx5);
		System.out.printf("%d\n",idx6);
		
		String s16 = "Hello";//���ڿ��� ���̸� ����
		int length = s16.length();
		System.out.printf("%d\n",length);
		
		String s17 = "Hello";//���ڿ� ���� ���ڿ��� ���ο� ���ڿ��� �ٲ� ���ڿ� ��ȯ
		String s18 = s17.replace('H','c');
		System.out.printf("%s\n",s18);
		
		String s19 = "Hellollo";//���ڿ� ���� ���ڿ��� ���ο� ���ڿ��� ��� �ٲ� ���ڿ� ��ȯ
		String s20 = s19.replace("ll","LL");
		System.out.printf("%s\n",s20);
		
		String ab = "AABBAABB";//���ڿ� �߿��� ������ ���ڿ��� ��ġ�ϴ� ���� ���ο� ���ڿ��� ��� ����
		String r = ab.replaceAll("BB","bb");
		System.out.printf("%s\n",r);
		
		String ab1 = "AABBAABB";//ó���� ��ġ�ϴ� ���ڿ��� ���ο� ���ڿ��� ����
		String r1 = ab1.replaceFirst("BB","bb");
		System.out.printf("%s\n",r1);
		
		String animals = "dog,cat,bear";//���ڿ��� ������ �и��ڷ� ������ ���ڿ� �迭�� ��� ��ȯ
		String [] arr = animals.split(",");
		System.out.printf("%s,%s,%s\n",arr[0],arr[1],arr[2]);
		
		String animals1 = "dog,cat,bear";//���ڿ� ��ü�� ������ ���� �߶� �и��ڷ� ����
		String [] arr1 = animals1.split(",",2);
		System.out.printf("%s\n%s\n",arr1[0],arr1[1]);
		
		String s21 = "java.lang.Object";//�־��� ���ڿ��� �����ϴ��� ����
		boolean b9 = s21.startsWith("java");
		boolean b10 = s21.startsWith("lang");
		System.out.printf("%s\n",b9);
		System.out.printf("%s\n",b10);
		
		String s22 = "java.lang.Object";//�־��� ������ġ���� �� ��ġ ������ ���Ե� ���ڿ��� ��´�.
		String c = s22.substring(10);//������ġ�� ���ڴ� ������ ���Ե�����, �� ��ġ�� ���ڴ� ���� ����
		String p = s22.substring(5,9);
		System.out.printf("%s\n",c);
		System.out.printf("%s\n",p);
		
		String s23 = "Hello";//string�ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ
		String s24 = s23.toLowerCase();
		System.out.printf("%s\n",s24);
		
		String s25 = "Hello";//string �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ��ȯ
		String s26 = s25.toString();
		System.out.printf("%s\n",s26);
		
		String s27 = "Hello";//string�ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� ����ڷ� ��ȯ
		String s28 = s27.toUpperCase();
		System.out.printf("%s\n",s28);
		
		String s29 = "Hello";//���ڿ��� ���ʳ��� ������ ���� �ִ� ������ ���ش�.
		String s30 = s29.trim();
		System.out.printf("%s\n",s30);
		
		String b1 = String.valueOf(true);//������ ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ
		String c4 = String.valueOf('a');//���������� ���, toString()�� ȣ���� ����� ��ȯ��
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.printf("%s\n",b1); 
		System.out.printf("%s\n",c4);
		System.out.printf("%s\n",i);
		System.out.printf("%s\n",l);
		System.out.printf("%s\n",f);
		System.out.printf("%s\n",d);
		System.out.printf(date);
			
		
		
		
	
		
		
		
		
		
	}

}
