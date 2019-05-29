package ������Ʈ3;

import java.util.Scanner;

public class �޼���2���븮���� {
	public static Scanner in =new Scanner(System.in);
	public static String ticketName = " ",typeName = " ",ageTypeName=" ";
	public static int inputCount=0;
	//�Է� �޼���
	public static int inputTypeCommand() {
		int inputType = 0;
		do {
			try {
				System.out.print("������ ���Ͻÿ� :\n 1.�ְ���\n 2.���ı�\n 99.����\n");// ticket�� ������ �����ϱ� ���� �ְ��� ���ı����� �����.
				inputType = in.nextInt();// Ƽ�� ���� ����
				if (inputType != 1 && inputType != 2 && inputType != 99) {
					System.out.println("�ùٸ� ������ �ƴմϴ�.");
				}
			} catch (Exception e) {
				System.out.println("�߸��� �����Դϴ�.");
				
			}in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);
		return inputType;
	}
	public static int inputIDCommand() {
		int inputID = 0;
		String inputID_str;
		boolean isDigit = true;
		do {
			do {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���\n");
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
		
		do {
			try {
			System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
			inputCount = in.nextInt();// ������ �������� ����
			}catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount <= 0 || inputCount >= 10);
		return inputCount;
	}
	public static int inputAdvantageCommand() {
		int inputAdvantage = 0;
		do {
			try {
			
			System.out.print("�������� �Է��ϼ��� : \n0(�Ϲ�)\n1(�����)\n2(������)\n3(���ڳ�)\n4(�ӻ��)\n");// �������� �����ϴ� ��¹�����, ����
																						// �������� �ִ�����
																						// ���
			inputAdvantage = in.nextInt();// ������ ����
			}catch(Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage != 1 && inputAdvantage != 2 && inputAdvantage != 3 && inputAdvantage != 4 && inputAdvantage != 0);
		return inputAdvantage;
	}
	
	//ó�� �޼���
	public static int calcAge(int memberID) {
		int returnAge = 0;
		memberID = memberID / 10000;// �ֹι�ȣ�� ���ؼ� ���̸� ���ϱ� ���� �켱 �ֹι�ȣ�� 10000���� ���� ������ ��.
		if (returnAge <= 19) {
			returnAge = 2019 - (returnAge + 2000) + 1;// 2000����� ���� ���ڸ��� 00���� �����ϱ� ������ ���̿� 2000�� ���ϰ�, 2019�� ���� ���̰� ����
		} else {
			returnAge = 2019 - (returnAge + 1900) + 1;// 1900����� ���� ���� ������� 1900�� ���� ��, 2019�� ���ָ� ���̰� ����.
		}
		return returnAge;
	}
	public static int getAgeType(int memberAge) {
		int returnAgeType = 0;
		if (memberAge < 3) {// ���������� ������ ���̰� 3�� �̸��� ���� ���̷� �з��Ͽ�, ǥ���� ���� �ƴ���.
			returnAgeType = 0;// ���̰� ���ǿ� �ش��ϴ� ��츦 0���� ����
			ageTypeName = "����";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 ���̷� ����
		}
		if (memberAge >= 3 && memberAge < 13 || memberAge > 65) {// �������� �������� ���̰� 3�� �̻��̸鼭 ���̰� 13�� �̸��̰ų�, 65���� �Ѵ� ��� ���� Ȥ�� �������� �з��ϰ�
												// �Ǿ�����.
			returnAgeType = 1;// ���̰� ���ǿ� �ش��ϴ� ��츦 1�� ����
			ageTypeName = "����/���";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 �������� ����
		}
		if (memberAge >= 13 && memberAge < 19) {// �������� ������ ���̰� 13�� �̻��̸鼭, 19�� �̸��̸�, û�ҳ��� ������.
			returnAgeType = 2;// ���̰� ���ǿ� �ش��ϴ� ��츦 2�� ����
			ageTypeName = "û�ҳ�";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 û�ҳ����� ����
		}
		if (memberAge >= 19 && memberAge <= memberAge) {// �������� ������ 19�� �̻��̸鼭 65�� ���Ϸδ� �������� ������.
			returnAgeType = 3;// ���̰� ���ǿ� �ش��ϴ� ��츦 3���� ����
			ageTypeName = "����";
		}
		return returnAgeType;
	}
	public static int getTicketPrice(int inputType, int returnAgeType, int inputAdvantage) {
		int returnPrice = 0;
		
		if (inputType == 1) {
			ticketName = "���ϱ�";// ticket�� 1�� ��츦 "���ϱ�"�̶�� ������ �ο�
			switch (returnAgeType) {// switch�� ���̿� �ش��ϴ� Ÿ���� �ְ�,
			case 0:// ���� Ÿ���� 0�϶�, �� ������ ���
				returnPrice = 0;// ǥ���� ������.
				typeName="����";
				break;

			case 1: // 1�϶�, ������ ���
				switch (inputAdvantage) {// ���� Ÿ���� 1�� ���(������ ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� ������ ���
					returnPrice = 43000;
					typeName="�Ϲ� ����";
					break;
				case 1: // �������� ����� ������ ���
					returnPrice = 26000;
					typeName="����� ����";
					break;
				case 2: // �������� ������ ������ ���
					returnPrice = 21500;
					typeName="������ ����";
					break;
				case 3: // �������� ���ڳ� ������ ���
					returnPrice = 34000;
					typeName="���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // ���� Ÿ���� 2�϶�, û�ҳ��� ���
				switch (inputAdvantage) {// ���� Ÿ���� 2�� ���(û�ҳ��� ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� û�ҳ��� ���
					returnPrice = 46000;
					typeName="�Ϲ� û�ҳ�";
					break;
				case 1: // �������� ����� û�ҳ��� ���
					returnPrice = 28000;
					typeName="����� û�ҳ�";
					break;
				case 2: // �������� ������ û�ҳ��� ���
					returnPrice = 23000;
					typeName="������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPrice = 36000;
					typeName="���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPrice = 54000;
					typeName="�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPrice = 33000;
					typeName="����� ����";
					break;
				case 2: // ������ ������ ���
					returnPrice = 27000;
					typeName="������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPrice = 43000;
					typeName="���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPrice = 45000;
					typeName="�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			}
		}
		if (inputType == 2) {
			ticketName = "���ı�";// ticket�� 2�� ��츦 "���ı�"�� ������ �ο���.
			switch (returnAgeType) {
			case 0: // ������ ���
				returnPrice = 0;
				typeName="����";
				break;

			case 1: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPrice = 36000;
					typeName="�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPrice = 23000;
					typeName="����� ����";
					break;
				case 2: // ������ ������ ���
					returnPrice = 18000;
					typeName="������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPrice = 28000;
					typeName="���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // û�ҳ��� ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� û�ҳ��� ���
					returnPrice = 39000;
					typeName="�Ϲ� û�ҳ�";
					break;
				case 1: // ����� û�ҳ��� ���
					returnPrice = 24000;
					typeName="����� û�ҳ�";
					break;
				case 2: // ������ û�ҳ��� ���
					returnPrice = 19500;
					typeName="������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPrice = 31000;
					typeName="���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPrice = 45000;
					typeName="�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPrice = 27000;
					typeName="����� ����";
					break;
				case 2: // ������ ������ ���
					returnPrice = 22500;
					typeName="������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPrice = 36000;
					typeName="���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPrice = 36000;
					typeName="�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
			}
			return returnPrice;
		}
		return returnPrice;
		}
	
	//��� �޼���
	public static void printTicket(int outputPrice) {
		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", outputPrice);
		System.out.printf("=================��������====================\n");
		System.out.printf("����:%s %s %d�� �Ѿ� : %d�� %s ����Դϴ�.\n", ticketName, ageTypeName, inputCount, outputPrice, typeName);
		System.out.printf("===========================================\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputType = 0, inputID = 0, inputCount = 0, inputAdvantage = 0;		
		int outputPrice = 0;		
		int age=0, ageType=0;
		while (true) {
			// 1�̳�, 2��, 99�� ������ ������ �ٽ� �������� ���ư�.
			inputType = inputTypeCommand();
			if (inputType == 99) {// ����ѹ��� 99�� ������ ����.
				break;
			}
			inputID = inputIDCommand();
			inputCount = inputCountCommand();
			inputAdvantage = inputAdvantageCommand();
			age = calcAge(inputID);
			ageType = getAgeType(age);
			outputPrice = getTicketPrice(inputType, ageType, inputAdvantage);
			outputPrice = outputPrice * inputCount;
			printTicket(outputPrice);


			
						
		}
		in.close();
	}

}
