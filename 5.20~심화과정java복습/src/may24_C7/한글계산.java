package may24_C7;

public class �ѱ۰�� {
	
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
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankBackword("�ѱ��ѱ�aa",15));
		System.out.printf("�ѱ���[%d]��\n",HanCount("�ѱ��ѱ�aa"));
		
	}
}
