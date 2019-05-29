package may20;

public class calculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator c1 = new calculator();
		calculator c2 = new calculator();
		
		int ret1 = c1.logic(3, 5);
		int ret2 = c2.logic(5, 7);
		System.out.println("resutl1: "+ret1);
		System.out.println("resutl2: "+ret2);
	}

}
