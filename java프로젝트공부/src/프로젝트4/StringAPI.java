package 프로젝트4;

public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//startsWith(문자열이 지정된 문자로 시작하는지 판단하는 기능)
		String str1="business";
		boolean startsWith = str1.startsWith("b");
		System.out.println("startWith : "+startsWith);
		
		//endsWith(문자열이 지정된 문자로 끝나는지 판단하는 기능)
		String str2="business";
		boolean endsWith = str2.endsWith("s");
		System.out.println("endsWith : "+endsWith);
		
		//replace(문자열에 지정되는 문자가 있으면, 새로 지정된 문자로 바꾸는 기능)
		String str5 = "A*B*C*D";
		String replace = str5.replace("*", "-");
		System.out.println("replace: " + replace);
		
		//touppercase(문자열에 소문자를 대문자로 바꾸는 기능)
		String str6 = "abcDEF";
		String toUppercase = str6.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
		
		//tolowercase(문자열의 대문자를 소문자로 바꾸는 기능)
		String str7 = "abcDEF";
		String toLowerCase = str7.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		//equalsIgnoreCase
		
		//indexOf(지정한 문자가 문자열의 몇번째에 있는지 확인하는 기능)
		String str8 = "abcdef";
		int indexOf = str8.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		
		//Length(문자열의 길이를 반환하는 기능)
		String str9 = "abcdef";
		int length = str9.length();
		System.out.println("length: " + length);
		
		//Substring(문자열의 지정된 범위에 속하는 문자를 반환하는 기능)
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 3);
		System.out.println("substring: " + substring);
		
		//valueOf(지정된 객체의 원시값을 반환하는 기능)
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
		
		//equals(두 변수간 선언값이 같은지를 구분하는 기능)
		String str3="business";
		String str4="business";
		boolean equals = str3.equals(str4);
		System.out.println("equals : "+equals);
		
		//charAt(문자열 속의 지정된 순서의 문자를 반환하는 기능)
		String str12 = "charAt";
		char charAt = str12.charAt(2);
		System.out.println("charAt: " + charAt);
		
		//trim(문자열의 공백을 없애주는 기능)
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);
		
		//substring(문자열에 지정한 범위에 속하는 문자열을 반환하는 기능(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.))
		String str13 = "ABCDEF";
		String substring1 = str13.substring(0, 2);
		System.out.println("substring: " + substring1);
		
		//contains(지정된 문자열에 또다른 지정된 문자가 포함되어있을때를 판단하는 기능)
		String str14 = "abcd";
		String str15 = "c";
		boolean contains = str14.contains(str15);
		System.out.println("contains: " + contains);
		
		//concat(지정문자열과 또다른 지정 문자열을 결합해주는 기능)
		String str16 = "Han";
		String str17 = "SeeJin";
		String concat = str16.concat(str17);
		System.out.println("concat: " + concat);
		
		//matches(비교대상과 지정된 문자열이 같은지를 판단하는 기능)
		int k = 123456;
		String str18 = String.format("%,d", k);
		String str19 = "123456";
		boolean matches = str18.matches(str19);
		System.out.println("matches: " + matches);
		
		//format(서식문자열을 이용해서 서식화된 문자열을 반환하는 기능)
		int j = 123456789;
		String str20 = String.format("%,d", j);
		System.out.println("format: " + str20);
		
		//tostring(지정된 문자열을 그대로 출력해주는 기능)
		String str = "1234";
		String toString = str.toString();
		System.out.println("toString: " + toString);
	}

}
