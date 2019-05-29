package 에버랜드최종판;

import java.util.Scanner;

public class InputClass {

	public static Scanner in = null;
	int inputType;//
	int inputID;
	int inputCount;
	int inputAdvantage;
	String inputID_str;

	InputClass() {// 해당 클래스에 필요한 변수 및 배열을 초기화 시키고, 배열 수의 제한을 둠.
		in = new Scanner(System.in);
		inputType = 0;
		inputCount =0;
		inputID_str = " ";
		inputAdvantage = 0;
	}

	public void inputTypeCommand() {
		do {
			try {
				System.out.print("권종을 택하시오 :\n 1.주간권\n 2.오후권\n 99.종료\n");// ticket의 종류를 설명하기 위해 주간권 오후권으로 출력함과 동시에, 99로
																			// 종료를 할수 있게 출력함.
				inputType = in.nextInt();// 티켓 종류 기입
				if (inputType != 1 && inputType != 2 && inputType != 99) {// 상위의 inputdata가 1이나, 2이나, 99가 아니라면,
					System.out.println("올바른 형식이 아닙니다.");// 올바른 형식이 아니라고 출력하게 함.
				}
			} catch (Exception e) {// 숫자로 기입되는게 아닌, 특수문자, 문자의 경우를 입력할때,
				System.out.println("잘못된 형식입니다.");// 잘못된 형식이라 출력하여, 잡아주게 함.

			}
			in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);// 1,2,99의 입력이 아닐시에는 do~while문을 통해 초기 프린트 값으로 돌아감.

	}

	public int inputIDCommand() {

		boolean isDigit = true;
		do {
			do {
				System.out.print("주민번호 앞자리를 입력하세요 : \n");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6);// 6자리가 아닐시 오류로 잡기 위하여, 주민번호를 문자열로 받게 함.
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);// 다시 해당 문자열의 주민번호를 숫자로 전환함.
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false);
		return inputID;
	}

	public void inputCountCommand() {

		do {
			try {
				System.out.println("몇 장을 주문하시겠습니까? : ");
				inputCount = in.nextInt();// 몇장을 구매할지 기입
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount <= 0 || inputCount >= 10);// 티켓 수는 1~9장 정도로 정하고, 그 이상은 주문하지 못하게 함.

	}

	public void inputAdvantageCommand() {

		do {
			try {

				System.out.print("우대사항을 입력하세요 : \n0(일반)\n1(장애인)\n2(유공자)\n3(다자녀)\n4(임산부)\n");// 우대사항을 적게하는 출력문이자, 무슨
																							// 우대사항이 있는지를
																							// 출력
				inputAdvantage = in.nextInt();// 우대사항 기입
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage != 1 && inputAdvantage != 2 && inputAdvantage != 3 && inputAdvantage != 4
				&& inputAdvantage != 0);// do~while을 통해 우대사항 기입이 1,2,3,4가 아닐시 do로 돌아감.

	}

	protected void fianlize() throws Throwable {
		in.close();
	}

}