package may24;
//Title : String클래스의 생성자와 메서드
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
public class PracticeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String("Hello");//s1을 갖는 string인스턴스 생성
		System.out.printf("%s\n",s1);
		
		char[] c1 = {'H', 'e','l','l','o' };//주어진 문자열을 갖는 string인서턴스 생성
		String s2 = new String(c1);
		System.out.printf("%s\n",s2);
		
		StringBuffer sb =//stringbuffer인스턴스가 갖는 문자열과 같은 내용릐 string인스턴스 생성
				new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.printf("%s\n",s3);
		
		String s4 = "Hello";//지정된 위치에 있는 문자를 알려줌
		String n = "0123456";
		char c2 = s4.charAt(1);
		char c3 = n.charAt(1);
		System.out.printf("%s\n",c2);
		System.out.printf("%s\n",c3);
		
		String s5 = "Hello";//문자열(str)을 뒤에 덧붙인다.
		String s6 = s5.concat("World");
		System.out.printf("%s\n",s5);
		System.out.printf("%s\n",s6);
		
		String s7 = "abcedfg";//지정된 문자열이 포함되었는지 검사
		boolean b = s7.contains("bc");
		System.out.printf("%s\n",b);
		
		String s8 = "Hello";//매개변수로 받은 문자열과 string인스턴스의 문자열 비교
		boolean b2 = s8.equals("Hello");
		boolean b3 = s8.equals("hello");
		System.out.printf("%s\n",b2);
		System.out.printf("%s\n",b3);
		
		String s9 = "Hello";//문자열과 string인스턴스의 문자열을 대소문자 구분없이 비교
		boolean b4 = s9.equalsIgnoreCase("HELLO");
		boolean b5 = s9.equalsIgnoreCase("heLLo");
		System.out.printf("%s\n",b4);
		System.out.printf("%s\n",b5);
		
		String s10 = "Hello";//주어진 문자가 문자열에 존재하는지 확인하여 위치를 제공
		int idx1 = s10.indexOf("o");//못 찾으면 -1을 결과 값으로 준다.
		int idx2 = s10.indexOf("k");
		System.out.printf("%d\n",idx1);
		System.out.printf("%d\n",idx2);
		
		String s11 ="ABCDEFG";//주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다.
		int idx = s11.indexOf("CD");//없으면 -1을 반환
		System.out.printf("%d\n",idx);
		
		String s12 = new String("abc");//문자열을 constant pool에 등록한다.
		String s13 = new String("abc");//같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환
		boolean b6 = (s12==s13);
		boolean b7 = s12.equals(s13);
		boolean b8 = (s12.intern()==s13.intern());
		System.out.printf("%s\n",b6);
		System.out.printf("%s\n",b7);
		System.out.printf("%s\n",b8);
		
		String s14 = "java.lang.Object";//지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서
		int idx3 = s14.lastIndexOf(".");//위치를 알려주고 못찾으면 -1 반환
		int idx4 = s14.indexOf(".");
		System.out.printf("%d\n",idx3);
		System.out.printf("%d\n",idx4);
		
		String s15 = "java.lang.java";//지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치를 알려줌
		int idx5 = s15.lastIndexOf("java");//못 찾으면 -1 반환
		int idx6 = s15.indexOf("java");
		System.out.printf("%d\n",idx5);
		System.out.printf("%d\n",idx6);
		
		String s16 = "Hello";//문자열의 길이를 제공
		int length = s16.length();
		System.out.printf("%d\n",length);
		
		String s17 = "Hello";//문자열 중의 문자열을 새로운 문자열로 바꾼 문자열 반환
		String s18 = s17.replace('H','c');
		System.out.printf("%s\n",s18);
		
		String s19 = "Hellollo";//문자열 중의 문자열을 새로운 문자열로 모두 바꾼 문자열 반환
		String s20 = s19.replace("ll","LL");
		System.out.printf("%s\n",s20);
		
		String ab = "AABBAABB";//문자열 중에서 지정된 문자열과 일치하는 것을 새로운 문자열로 모두 변경
		String r = ab.replaceAll("BB","bb");
		System.out.printf("%s\n",r);
		
		String ab1 = "AABBAABB";//처음에 일치하는 문자열만 새로운 문자열로 변경
		String r1 = ab1.replaceFirst("BB","bb");
		System.out.printf("%s\n",r1);
		
		String animals = "dog,cat,bear";//문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환
		String [] arr = animals.split(",");
		System.out.printf("%s,%s,%s\n",arr[0],arr[1],arr[2]);
		
		String animals1 = "dog,cat,bear";//문자열 전체를 지정된 수로 잘라서 분리자로 구분
		String [] arr1 = animals1.split(",",2);
		System.out.printf("%s\n%s\n",arr1[0],arr1[1]);
		
		String s21 = "java.lang.Object";//주어진 문자열로 시작하는지 검증
		boolean b9 = s21.startsWith("java");
		boolean b10 = s21.startsWith("lang");
		System.out.printf("%s\n",b9);
		System.out.printf("%s\n",b10);
		
		String s22 = "java.lang.Object";//주어진 시작위치부터 끝 위치 범위에 포함된 문자열을 얻는다.
		String c = s22.substring(10);//시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함 안함
		String p = s22.substring(5,9);
		System.out.printf("%s\n",c);
		System.out.printf("%s\n",p);
		
		String s23 = "Hello";//string인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환
		String s24 = s23.toLowerCase();
		System.out.printf("%s\n",s24);
		
		String s25 = "Hello";//string 인스턴스에 저장되어 있는 문자열을 반환
		String s26 = s25.toString();
		System.out.printf("%s\n",s26);
		
		String s27 = "Hello";//string인스턴스에 저장되어 있는 모든 문자열을 대분자로 변환
		String s28 = s27.toUpperCase();
		System.out.printf("%s\n",s28);
		
		String s29 = "Hello";//문자열의 왼쪽끝과 오른쪽 끝에 있는 공백을 없앤다.
		String s30 = s29.trim();
		System.out.printf("%s\n",s30);
		
		String b1 = String.valueOf(true);//지정된 값을 문자열로 변환하여 반환
		String c4 = String.valueOf('a');//참조변수의 경우, toString()을 호출한 결과를 반환함
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
