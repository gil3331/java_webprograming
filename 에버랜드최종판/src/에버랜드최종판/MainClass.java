package 에버랜드최종판;

import java.util.ArrayList;
import java.util.List;

import 에버랜드최종판.AgeoperationClass;
import 에버랜드최종판.InputClass;
import 에버랜드최종판.PrintClass;
import 에버랜드최종판.TicketTypeClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputClass ic = new InputClass();

		TicketTypeClass ttc = new TicketTypeClass();

		AgeoperationClass aoc = new AgeoperationClass();

		PrintClass pc = new PrintClass();
		List<OrderListCollecion> data = new ArrayList<OrderListCollecion>();//콜랙션 클래스를 메인 클래스로 로드하고 초기화함.
		while (true) {//한번만 출력하고 끝나는 시스템이 아니기 때문에 while반복문을 써서 출력 이후에 계속 정보를 입력할 수 있게함.
			ic.inputTypeCommand();
			if (ic.inputType == 99) {//99는 퇴근할때 프로그램 끄는 내용
				break;
			}
			ic.inputIDCommand();
			ic.inputCountCommand();
			ic.inputAdvantageCommand();

			aoc.getAgeType(aoc.calcAge(ic.inputID));

			ttc.getTicketPrice(ic.inputType, aoc.returnAgeType, ic.inputAdvantage, ttc.ticketN, ttc.typeN);

			ttc.returnPricearr = ttc.returnPricearr * ic.inputCount;

			pc.PrintTicket(ttc.returnPricearr, ic.inputCount, ttc.ticketN, aoc.ageTypeName, ttc.typeN);

			
			OrderListCollecion orderList = new OrderListCollecion(ttc.ticketN,ttc.typeN,ic.inputCount,ttc.returnPricearr,aoc.ageTypeName);
			//상위의 결과 값들이 콜랙션 클래스에 정보로 들어갈 수 있게 지정하고,
//			orderList.setTicketType(ttc.ticketN);
//			orderList.setTypeName(ttc.typeN);
//			orderList.setCount(ic.inputCount);
//			orderList.setPrice(ttc.returnPricearr);
//			orderList.setAdvantage(aoc.ageTypeName);
			data.add(orderList);//그 데이터를 축적한 뒤
			
			
			System.out.printf("=================에버랜드====================\n");
			for (OrderListCollecion order : data) {//for반복문을 통하여, 두번째로 나오는 내용을 덧붙히게 하고,
				System.out.printf("권종:%s %s %d장 총액 : %d원 %s 우대입니다.\n", order.getTicketType(), order.getAdvantage(), order.getCount(),
						order.getPrice(),order.getTypeName() );//콜랙션 클래스에 받은 정보를 get으로 불러온다.(get/set으로 나누는 이유는 외부에서 조작이 불가능하게 하기 위해 private로 지정 되있는 정보를 로드 하기 위해서이다.)
			}
			System.out.printf("===========================================\n");

		}
	}
	
}
