package ��������������;

import java.util.ArrayList;
import java.util.List;

import ��������������.AgeoperationClass;
import ��������������.InputClass;
import ��������������.PrintClass;
import ��������������.TicketTypeClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputClass ic = new InputClass();

		TicketTypeClass ttc = new TicketTypeClass();

		AgeoperationClass aoc = new AgeoperationClass();

		PrintClass pc = new PrintClass();
		List<OrderListCollecion> data = new ArrayList<OrderListCollecion>();//�ݷ��� Ŭ������ ���� Ŭ������ �ε��ϰ� �ʱ�ȭ��.
		while (true) {//�ѹ��� ����ϰ� ������ �ý����� �ƴϱ� ������ while�ݺ����� �Ἥ ��� ���Ŀ� ��� ������ �Է��� �� �ְ���.
			ic.inputTypeCommand();
			if (ic.inputType == 99) {//99�� ����Ҷ� ���α׷� ���� ����
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
			//������ ��� ������ �ݷ��� Ŭ������ ������ �� �� �ְ� �����ϰ�,
//			orderList.setTicketType(ttc.ticketN);
//			orderList.setTypeName(ttc.typeN);
//			orderList.setCount(ic.inputCount);
//			orderList.setPrice(ttc.returnPricearr);
//			orderList.setAdvantage(aoc.ageTypeName);
			data.add(orderList);//�� �����͸� ������ ��
			
			
			System.out.printf("=================��������====================\n");
			for (OrderListCollecion order : data) {//for�ݺ����� ���Ͽ�, �ι�°�� ������ ������ �������� �ϰ�,
				System.out.printf("����:%s %s %d�� �Ѿ� : %d�� %s ����Դϴ�.\n", order.getTicketType(), order.getAdvantage(), order.getCount(),
						order.getPrice(),order.getTypeName() );//�ݷ��� Ŭ������ ���� ������ get���� �ҷ��´�.(get/set���� ������ ������ �ܺο��� ������ �Ұ����ϰ� �ϱ� ���� private�� ���� ���ִ� ������ �ε� �ϱ� ���ؼ��̴�.)
			}
			System.out.printf("===========================================\n");

		}
	}
	
}
