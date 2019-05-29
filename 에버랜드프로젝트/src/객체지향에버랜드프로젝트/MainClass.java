package 객체지향에버랜드프로젝트;

import java.util.Scanner;

public class MainClass {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tryCount = 0;
		// 배열의 횟수를 제한 시키면서, 각각의 배열식 변수의 숫자를 늘려주기위한 변수로 지정
		InputClass ic = new InputClass();
		// 각종 inputdata를 모아둔 inputdata 객체로써, 메인으로 불러오기 위해서, 초기화 값을 받는다.
		TicketTypeClass ttc = new TicketTypeClass();
		// 각종 우대사항에 근거한 ticket 가격정보를 모아둔 객체로써, 메인으로 불러오기 위해서, 초기화 값을 받음.
		AgeOperationClass aoc = new AgeOperationClass();
		// inputclass에서 주민번호에 대한 정보를 받았을 때, 나이를 계산 하여, 아이, 소인/경로, 청소년, 성인으로 분류하기 위한 객체로써, 메인으로 불러오기 위해서 초기화 값을 받음.
		PrintClass pc = new PrintClass();
		// 각 종 객체에서 모든 정보들을 취합하여, 최종적인 결과를 출력하기 위한 객체로써, 메인으로 불러오기 위해서 초기화 값을 받음.
		while (true) {// 티켓 발권을 한번만 하고 말게 아니기 때문에, 전체에 대한 내용을 while 반복문을 통해 반복 시킨다.
			ic.inputTypeCommand();// 메인 클래스에 inputclass내(이하 IC로 칭함)의 inputtypecommand를 불러옴.
			if (ic.inputType == 99) {// 계속 발권 시스템을 돌릴수는 없기 때문에, 권종 입력시 99 입력을 통해 프로그램을 끝낼 수 있게함.
				break;
			}
			ic.inputIDCommand();// IC의 inputIDcommand를 불러옴.
			ic.inputCountCommand(tryCount);// IC내의 인원수에 대한 countcommand를 불러옴.(단, inputcount에 한해서는 배열 구조가 들어감으로 trycount를
											// 적용시킴.)
			ic.inputAdvantageCommand();// IC내의 우대사항에 대한 advantagecommand를 불러옴.

			aoc.getAgeType(aoc.calcAge(ic.inputID), tryCount);// ageoperationclass내(이하 aoc)의 나이 분류를 그 위의 calcage를 통해 나이를 받아서 성인,
													// 청소년, 소인/경로, 아이로 분류 한다.

			ttc.getTicketPrice(ic.inputType, aoc.returnAgeType, ic.inputAdvantage, ttc.ticketN, ttc.typeN, tryCount);
			// tickettypeclass에서 나이별 조건별 우대사항을 분류하기 위해서 IC 및 AOC에서 정보를 받아오고, 정보를 토대로 최종적 우대조건을 도출함.
			ttc.returnPricearr[tryCount] = ttc.returnPricearr[tryCount] * ic.inputCount[tryCount];// TTC내의 최종 우대조건을 IC의
																									// inputcount를 곱하여,
																									// 최종 가격을 도출함.

			pc.PrintTicket(ttc.returnPricearr, ic.inputCount, ttc.ticketN, aoc.ageTypeName, ttc.typeN, tryCount);
			// printclass의 printticket에 관련된 정보를 모두 넣어 영수증처럼 출력하게 함.
			tryCount++;// 상위의 모든 코드를 수행하고 나면, trycount를 1더하게 해서 배열 수를 올린다.
		}

	}

}
