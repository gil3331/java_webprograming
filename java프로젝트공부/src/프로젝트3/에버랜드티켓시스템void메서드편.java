package ������Ʈ3;
/**
 * @title �������� Ƽ�� �߸� ���α׷�
 * @author YD Kim
 */
import java.util.Scanner;

public class ��������Ƽ�Ͻý���void�޼����� {
	// ����
	public static Scanner in = new Scanner(System.in);
	
	// �Է� �޼���
	public static int inputTypeCommand() {
		int inputType = 0;
		// ���� �Է�
		do {
			try {
				System.out.print("������ �����ϼ���\n1. �ְ���\n2. �߰���\n99. ����__");
				inputType = in.nextInt();
				if (inputType != 1 && inputType != 2 && inputType != 99) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} catch (Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);
		return inputType;
	}
	public static int inputIDCommand() {
		int inputID = 0;
		// �ֹι�ȣ �Է�
		String inputID_str;
		boolean isDigit = true;
		do {
			do {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���\n__");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6);
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false);
		return inputID;
	}
	public static int inputCountCommand() {
		int inputCount = 0;
		// ���� �Է�
		do {
			try {
				System.out.print("�� ���� �ֹ��Ͻðڽ��ϱ�?\n__");
				inputCount = in.nextInt();
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount < 1 || inputCount > 9);
		return inputCount;
	}
	public static int inputAdvantageCommand() {
		int inputAdvantage = 0;
		// ������ �Է�
		do {
			try {
				System.out.print("�������� �Է��ϼ���.\n1. ����(���̴� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��\n__");
				inputAdvantage = in.nextInt();
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage < 1 || inputAdvantage > 5);
		return inputAdvantage;
	}
	
	// ó�� �޼���
	public static int calcAge(int memberID) {
		int returnAge = 0;
		memberID = memberID / 10000;
		if (memberID <= 19) {
			returnAge = 2019 - (memberID + 2000) + 1;
		} else {
			returnAge = 2019 - (memberID + 1900) + 1;
		}
		return returnAge;
	}
	public static int getAgeType(int memberAge) {
		int returnAgeType = 0;
		if (memberAge >= 13 && memberAge <= 18) { // û�ҳ�
			returnAgeType = 1;
		} else if ((memberAge >= 3 && memberAge <= 12) || memberAge >= 65) { // ���� or ���
			returnAgeType = 2;
		} else if (memberAge <= 2) { // 3������ ����
			returnAgeType = 3;
		}
		return returnAgeType;
	}
	public static int getTicketPrice(int inputType, int ageType, int inputAdvantage) {
		int returnPrice = 0;
		if (inputType == 1) { // �ְ���
			switch (ageType) { // ����
			case 0: // ����
				switch (inputAdvantage) {
				case 1:
					returnPrice = 54000;
					break;
				case 2: // �����
					returnPrice = 33000;
					break;
				case 3: // ����������
					returnPrice = 27000;
					break;
				case 4: // ���ڳ�
					returnPrice = 43000;
					break;
				case 5: // �ӻ��
					returnPrice = 45000;
					break;
				}
			case 1: // û�ҳ�
				returnPrice = 46000;
				break;
			case 2: // ����/���
				returnPrice = 43000;
				break;
			case 3: // ����
				returnPrice = 0;
				break;
			}
		} else if (inputType == 2) { // �߰���
			switch (ageType) {
			case 0:
				returnPrice = 45000;
				break;
			case 1:
				returnPrice = 39000;
				break;
			case 2:
				returnPrice = 36000;
				break;
			case 3:
				returnPrice = 0;
				break;
			}
		}
		return returnPrice;
	}
	
	// ��� �޼���
	public static void printTicket(int outputPrice) {
		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n\n", outputPrice);
		System.out.println("======================== �������� ========================");
		System.out.printf("%5s %5s X %5d %10d��   %s\n", "�ְ���", "�", 2, 105000, "����� ��� ����");
		System.out.println("=======================================================");
	}
	
	public static void main(String[] args) {
		// ����
		int inputType = 0, inputID = 0, inputCount = 0, inputAdvantage = 0; // Ű����� ���� �Է¹޴� �� ����
		int outputPrice = 0; // ���� ��� �ݾ� ����
		int age, ageType = 0;
		in = new Scanner(System.in);
		while (true) {
			// �Է�
			inputType = inputTypeCommand();
			if (inputType == 99) {
				break;
			}
			inputID = inputIDCommand();
			inputCount = inputCountCommand();
			inputAdvantage = inputAdvantageCommand();
			// ó��
			// ���� ���
			age = calcAge(inputID); // inputID : 911212
			// ageType : 0(����), 1(û�ҳ�), 2(����/���), 3(����)
			ageType = getAgeType(age);
			// ����ó��
			outputPrice = getTicketPrice(inputType, ageType, inputAdvantage);
			// ���� ó��
			outputPrice = outputPrice * inputCount;
			// ���
			printTicket(outputPrice);
		}
		in.close();
	}
}
