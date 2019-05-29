package may24_C7;

public class 한글계산 {
	
	private static Object HanBlankForeword(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static Object HanBlankBackword(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static Object HanCount(String string) {
		// TODO Auto-generated method stub
		string = string.getBytes()-string.length()
		return string ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("한글abcd",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("한글한글aa",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankBackword("한글aa",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankBackword("한글한글aa",15));
		System.out.printf("한글은[%d]개\n",HanCount("한글한글aa"));
		
	}
}
