package ��ü���⿡������������Ʈ;

import java.util.Scanner;

public class MainClass {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tryCount = 0;
		// �迭�� Ƚ���� ���� ��Ű�鼭, ������ �迭�� ������ ���ڸ� �÷��ֱ����� ������ ����
		InputClass ic = new InputClass();
		// ���� inputdata�� ��Ƶ� inputdata ��ü�ν�, �������� �ҷ����� ���ؼ�, �ʱ�ȭ ���� �޴´�.
		TicketTypeClass ttc = new TicketTypeClass();
		// ���� �����׿� �ٰ��� ticket ���������� ��Ƶ� ��ü�ν�, �������� �ҷ����� ���ؼ�, �ʱ�ȭ ���� ����.
		AgeOperationClass aoc = new AgeOperationClass();
		// inputclass���� �ֹι�ȣ�� ���� ������ �޾��� ��, ���̸� ��� �Ͽ�, ����, ����/���, û�ҳ�, �������� �з��ϱ� ���� ��ü�ν�, �������� �ҷ����� ���ؼ� �ʱ�ȭ ���� ����.
		PrintClass pc = new PrintClass();
		// �� �� ��ü���� ��� �������� �����Ͽ�, �������� ����� ����ϱ� ���� ��ü�ν�, �������� �ҷ����� ���ؼ� �ʱ�ȭ ���� ����.
		while (true) {// Ƽ�� �߱��� �ѹ��� �ϰ� ���� �ƴϱ� ������, ��ü�� ���� ������ while �ݺ����� ���� �ݺ� ��Ų��.
			ic.inputTypeCommand();// ���� Ŭ������ inputclass��(���� IC�� Ī��)�� inputtypecommand�� �ҷ���.
			if (ic.inputType == 99) {// ��� �߱� �ý����� �������� ���� ������, ���� �Է½� 99 �Է��� ���� ���α׷��� ���� �� �ְ���.
				break;
			}
			ic.inputIDCommand();// IC�� inputIDcommand�� �ҷ���.
			ic.inputCountCommand(tryCount);// IC���� �ο����� ���� countcommand�� �ҷ���.(��, inputcount�� ���ؼ��� �迭 ������ ������ trycount��
											// �����Ŵ.)
			ic.inputAdvantageCommand();// IC���� �����׿� ���� advantagecommand�� �ҷ���.

			aoc.getAgeType(aoc.calcAge(ic.inputID), tryCount);// ageoperationclass��(���� aoc)�� ���� �з��� �� ���� calcage�� ���� ���̸� �޾Ƽ� ����,
													// û�ҳ�, ����/���, ���̷� �з� �Ѵ�.

			ttc.getTicketPrice(ic.inputType, aoc.returnAgeType, ic.inputAdvantage, ttc.ticketN, ttc.typeN, tryCount);
			// tickettypeclass���� ���̺� ���Ǻ� �������� �з��ϱ� ���ؼ� IC �� AOC���� ������ �޾ƿ���, ������ ���� ������ ��������� ������.
			ttc.returnPricearr[tryCount] = ttc.returnPricearr[tryCount] * ic.inputCount[tryCount];// TTC���� ���� ��������� IC��
																									// inputcount�� ���Ͽ�,
																									// ���� ������ ������.

			pc.PrintTicket(ttc.returnPricearr, ic.inputCount, ttc.ticketN, aoc.ageTypeName, ttc.typeN, tryCount);
			// printclass�� printticket�� ���õ� ������ ��� �־� ������ó�� ����ϰ� ��.
			tryCount++;// ������ ��� �ڵ带 �����ϰ� ����, trycount�� 1���ϰ� �ؼ� �迭 ���� �ø���.
		}

	}

}
