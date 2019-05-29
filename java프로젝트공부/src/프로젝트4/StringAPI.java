package ������Ʈ4;

public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//startsWith(���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ��ϴ� ���)
		String str1="business";
		boolean startsWith = str1.startsWith("b");
		System.out.println("startWith : "+startsWith);
		
		//endsWith(���ڿ��� ������ ���ڷ� �������� �Ǵ��ϴ� ���)
		String str2="business";
		boolean endsWith = str2.endsWith("s");
		System.out.println("endsWith : "+endsWith);
		
		//replace(���ڿ��� �����Ǵ� ���ڰ� ������, ���� ������ ���ڷ� �ٲٴ� ���)
		String str5 = "A*B*C*D";
		String replace = str5.replace("*", "-");
		System.out.println("replace: " + replace);
		
		//touppercase(���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲٴ� ���)
		String str6 = "abcDEF";
		String toUppercase = str6.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
		
		//tolowercase(���ڿ��� �빮�ڸ� �ҹ��ڷ� �ٲٴ� ���)
		String str7 = "abcDEF";
		String toLowerCase = str7.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		//equalsIgnoreCase
		
		//indexOf(������ ���ڰ� ���ڿ��� ���°�� �ִ��� Ȯ���ϴ� ���)
		String str8 = "abcdef";
		int indexOf = str8.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		
		//Length(���ڿ��� ���̸� ��ȯ�ϴ� ���)
		String str9 = "abcdef";
		int length = str9.length();
		System.out.println("length: " + length);
		
		//Substring(���ڿ��� ������ ������ ���ϴ� ���ڸ� ��ȯ�ϴ� ���)
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 3);
		System.out.println("substring: " + substring);
		
		//valueOf(������ ��ü�� ���ð��� ��ȯ�ϴ� ���)
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
		
		//split
		String str11 = "A:B:C:D:abcd";
		String[] split = str11.split(":");
		System.out.println("split: " + split[4]);
		
		//equals(�� ������ ������ �������� �����ϴ� ���)
		String str3="business";
		String str4="business";
		boolean equals = str3.equals(str4);
		System.out.println("equals : "+equals);
		
		//charAt(���ڿ� ���� ������ ������ ���ڸ� ��ȯ�ϴ� ���)
		String str12 = "charAt";
		char charAt = str12.charAt(2);
		System.out.println("charAt: " + charAt);
		
		//trim(���ڿ��� ������ �����ִ� ���)
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);
		
		//substring(���ڿ��� ������ ������ ���ϴ� ���ڿ��� ��ȯ�ϴ� ���(���۹����� ���� �����ϰ�, ������ ������ ���� ���������ʴ´�.))
		String str13 = "ABCDEF";
		String substring1 = str13.substring(0, 2);
		System.out.println("substring: " + substring1);
		
		//contains(������ ���ڿ��� �Ǵٸ� ������ ���ڰ� ���ԵǾ��������� �Ǵ��ϴ� ���)
		String str14 = "abcd";
		String str15 = "c";
		boolean contains = str14.contains(str15);
		System.out.println("contains: " + contains);
		
		//concat(�������ڿ��� �Ǵٸ� ���� ���ڿ��� �������ִ� ���)
		String str16 = "Han";
		String str17 = "SeeJin";
		String concat = str16.concat(str17);
		System.out.println("concat: " + concat);
		
		//matches(�񱳴��� ������ ���ڿ��� �������� �Ǵ��ϴ� ���)
		int k = 123456;
		String str18 = String.format("%,d", k);
		String str19 = "123456";
		boolean matches = str18.matches(str19);
		System.out.println("matches: " + matches);
		
		//format(���Ĺ��ڿ��� �̿��ؼ� ����ȭ�� ���ڿ��� ��ȯ�ϴ� ���)
		int j = 123456789;
		String str20 = String.format("%,d", j);
		System.out.println("format: " + str20);
		
		//tostring(������ ���ڿ��� �״�� ������ִ� ���)
		String str = "1234";
		String toString = str.toString();
		System.out.println("toString: " + toString);
	}

}
