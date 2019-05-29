package may20;
//Title : CastingEx4(강제적 형변환)
//Date : 2019.05.20
//Author : 이길준
//Comment : .....
public class CastingEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k15_i = 91234567;//해당 숫자를 int형으로 i에 저장
		float k15_f = (float)k15_i;//i값을 float형으로 형변환 하여 f에 저장
		int k15_i2 = (int)k15_f;//f값을 int형으로 형변환하여 i2에 저장
		
		double k15_d = (double)k15_i;//i값을 double로 형변환 하고, d에 저장
		int k15_i3 = (int)k15_d;//d값을 int형으로 형변환 하여 i3에 저장
		
		float k15_f2 = 1.666f;//f2에 해당 숫자를 float형으로 저장
		int k15_i4 = (int)k15_f2;//f2값을 int형으로 형변환하여 i4에 저장
		
		System.out.printf("i=%d\n", k15_i);//i값을 출력
		System.out.printf("f=%f i2=%d\n", k15_f, k15_i2);//f값과 i2값을 출력(float형에서 데이터가 손실이 일어남)
		System.out.printf("d=%f i3=%d\n", k15_d, k15_i3);//d값과 i3값을 출력(double형으로 변환되어 소수점이 붙음)
		System.out.printf("(int)%f = %d\n", k15_f2, k15_i4);//소수점 데이터를 int로 형변환 하여, 정수인 1만 출력
		
	}

}
