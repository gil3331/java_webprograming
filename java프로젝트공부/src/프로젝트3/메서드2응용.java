package ������Ʈ3;

import java.util.Scanner;

public class �޼���2���� {
	public static int ticket = 0, count = 0, type = 0, price = 0 ,residentnumber = 0, age = 0, ageType = 0,total = 0;
	public static String ticketName = " ", agetypeName = " ", typeName = " ";
	public static final int MERIT_DAY_ADULT = 27000, MERIT_DAY_TEEN = 23000, MERIT_DAY_BOY = 21500,MERIT_NIGHT_ADULT = 22500,MERIT_NIGHT_TEEN = 19500, MERIT_NIGHT_BOY = 18000,MULTI_DAY_ADULT = 43000;
	public static final int MULTI_DAY_TEEN = 36000, MULTI_DAY_BOY = 34000, MULTI_NIGHT_ADULT = 36000, MULTI_NIGHT_TEEN = 31000,MULTI_NIGHT_BOY = 28000, PREGNANT_DAY = 45000,PREGNANT_NIGHT = 36000;
	public static final int DAY_ADULT = 54000,DAY_TEEN = 46000,DAY_BOY = 43000,NIGHT_ADULT = 45000,NIGHT_TEEN = 39000,NIGHT_BOY = 36000,DISABLED_DAY_ADULT = 33000,DISABLED_DAY_TEEN = 28000,DISABLED_DAY_BOY = 26000, DISABLED_NIGHT_ADULT = 27000,DISABLED_NIGHT_TEEN = 24000, DISABLED_NIGHT_BOY = 23000;
	public static Scanner in=new Scanner(System.in);
	public static void ticket() {
		do {
			try {
				System.out.print("������ ���Ͻÿ� :\n 1.�ְ���\n 2.���ı�\n 99.����\n");
				ticket = in.nextInt();
				if (ticket != 1 && ticket != 2 && ticket != 99) {
					System.out.println("�߸��� �����Դϴ�.");
				}
			} catch (Exception e) {
				System.out.println("�߸��� �����Դϴ�.");
				in.nextLine();
			}
		} while (ticket != 1 && ticket != 2 && ticket != 99);//1�̳�, 2��, 99�� ������ ������ �ٽ� �������� ���ư�.
		
		}

	public static void residentNumber() {

		do {
			System.out.print("�ֹι�ȣ ���ڸ��� �Է��Ͻÿ� : ");// �ֹι�ȣ ������ ���� ��¹�
			residentnumber = in.nextInt();// �ֹι�ȣ ����
		} while (residentnumber > 999999);
	}
	public static void ticketCount() {
		do {
			System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
			count = in.nextInt();// ������ �������� ����
		} while (count <= 0 || count >= 10);//0���ϰų�, 10�̻��̸� ������ �������� ����

	}
	public static void ageAndagetype() {
		age = residentnumber / 10000;// �ֹι�ȣ�� ���ؼ� ���̸� ���ϱ� ���� �켱 �ֹι�ȣ�� 10000���� ���� ������ ��.
		if (age <= 19) {
			age = 2019 - (age + 2000) + 1;// 2000����� ���� ���ڸ��� 00���� �����ϱ� ������ ���̿� 2000�� ���ϰ�, 2019�� ���� ���̰� ����
		} else {
			age = 2019 - (age + 1900) + 1;// 1900����� ���� ���� ������� 1900�� ���� ��, 2019�� ���ָ� ���̰� ����.
		}
		System.out.println("���̴�" + age + "��");// ���� ���
		if (age < 3) {// ���������� ������ ���̰� 3�� �̸��� ���� ���̷� �з��Ͽ�, ǥ���� ���� �ƴ���.
			ageType = 0;// ���̰� ���ǿ� �ش��ϴ� ��츦 0���� ����
			agetypeName = "����";// ���̰� ���ǿ� �ش��ϴ� ��츦 ���̷� ����
		}
		if (age >= 3 && age < 13 || age > 65) {// �������� �������� ���̰� 3�� �̻��̸鼭 ���̰� 13�� �̸��̰ų�, 65���� �Ѵ� ��� ���� Ȥ�� �������� �з��ϰ�
												// �Ǿ�����.
			ageType = 1;// ���̰� ���ǿ� �ش��ϴ� ��츦 1�� ����
			agetypeName = "����";// ���̰� ���ǿ� �ش��ϴ� ��츦 �������� ����
		}
		if (age >= 13 && age < 19) {// �������� ������ ���̰� 13�� �̻��̸鼭, 19�� �̸��̸�, û�ҳ��� ������.
			ageType = 2;// ���̰� ���ǿ� �ش��ϴ� ��츦 2�� ����
			agetypeName = "û�ҳ�";// ���̰� ���ǿ� �ش��ϴ� ��츦 û�ҳ����� ����
		}
		if (age >= 19 && age <= 65) {// �������� ������ 19�� �̻��̸鼭 65�� ���Ϸδ� �������� ������.
			ageType = 3;// ���̰� ���ǿ� �ش��ϴ� ��츦 3���� ����
			agetypeName = "����";// ���̰� ���ǿ� �ش��ϴ� ��츦 �������� ����
		}
		System.out.println(agetypeName);// ������ ���� � ������ ��������� �Ǵ��ϴ� ��¹�

	}
	public static void ableType() {
		do {
			System.out.print("�������� �Է��ϼ��� : \n0(�Ϲ�)\n1(�����)\n2(������)\n3(���ڳ�)\n4(�ӻ��)\n");// �������� �����ϴ� ��¹�����, ����
																						// �������� �ִ����� ���

			type = in.nextInt();// ������ ����
		} while (type != 1 && type != 2 && type != 3 && type != 4 && type != 0);// ������ ���ڰ� �ƴϸ� �ٽ� ���������� ����

		// 0(�ڵ� ����),1(�����),2(������),3(���ڳ�),4(�ӻ��)
		// ���� �з��� ���� �Ǵ� if switch ���չ�
		if (type == 0) {
			typeName = "�Ϲ�";
		} // ��������0�϶�, "�Ϲ�"�̶�� ������ �ο���.
		if (type == 1) {
			typeName = "�����";
		} // ��������1�϶�, "�����"�̶�� ������ �ο���.
		if (type == 2) {
			typeName = "������";
		} // ��������2�϶�, "������"�̶�� ������ �ο���.
		if (type == 3) {
			typeName = "���ڳ�";
		} // ��������3�϶�, "���ڳ�"�̶�� ������ �ο���.
		if (type == 4) {
			typeName = "�ӻ��";
		} // ��������4�϶�, "�ӻ��"�̶�� ������ �ο���.
		if (ticket == 1) {
			ticketName = "���ϱ�";// ticket�� 1�� ��츦 "���ϱ�"�̶�� ������ �ο�
			switch (ageType) {// switch�� ���̿� �ش��ϴ� Ÿ���� �ְ�,
			case 0:// ���� Ÿ���� 0�϶�, �� ������ ���
				price = 0;// ǥ���� ������.
				break;

			case 1: // 1�϶�, ������ ���
				switch (type) {// ���� Ÿ���� 1�� ���(������ ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� ������ ���
					price = DAY_BOY;
					break;
				case 1: // �������� ����� ������ ���
					price = DISABLED_DAY_BOY;
					break;
				case 2: // �������� ������ ������ ���
					price = MERIT_DAY_BOY;
					break;
				case 3: // �������� ���ڳ� ������ ���
					price = MULTI_DAY_BOY;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 2: // ���� Ÿ���� 2�϶�, û�ҳ��� ���
				switch (type) {// ���� Ÿ���� 2�� ���(û�ҳ��� ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� û�ҳ��� ���
					price = DAY_TEEN;
					break;
				case 1: // �������� ����� û�ҳ��� ���
					price = DISABLED_DAY_TEEN;
					break;
				case 2: // �������� ������ û�ҳ��� ���
					price = MERIT_DAY_TEEN;
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					price = MULTI_DAY_TEEN;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 3: // ������ ���
				switch (type) {
				case 0:// �Ϲ� ������ ���
					price = DAY_ADULT;

					break;
				case 1: // ����� ������ ���
					price = DISABLED_DAY_ADULT;
					break;
				case 2: // ������ ������ ���
					price = MERIT_DAY_ADULT;

					break;
				case 3: // ���ڳ� ������ ���
					price = MULTI_DAY_ADULT;
					break;
				case 4: // �ӻ�� ������ ���
					price = PREGNANT_DAY;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketName = "���ı�";// ticket�� 2�� ��츦 "���ı�"�� ������ �ο���.
			switch (ageType) {
			case 0: // ������ ���
				price = 0;
				break;

			case 1: // ������ ���
				switch (type) {
				case 0:// �Ϲ� ������ ���
					price = NIGHT_BOY;
					break;
				case 1: // ����� ������ ���
					price = DISABLED_NIGHT_BOY;
					break;
				case 2: // ������ ������ ���
					price = MERIT_NIGHT_BOY;
					break;
				case 3: // ���ڳ� ������ ���
					price = MULTI_NIGHT_BOY;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 2: // û�ҳ��� ���
				switch (type) {
				case 0:// �Ϲ� û�ҳ��� ���
					price = NIGHT_TEEN;
					break;
				case 1: // ����� û�ҳ��� ���
					price = DISABLED_NIGHT_TEEN;
					break;
				case 2: // ������ û�ҳ��� ���
					price = MERIT_NIGHT_TEEN;
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					price = MULTI_NIGHT_TEEN;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 3: // ������ ���
				switch (type) {
				case 0:// �Ϲ� ������ ���
					price = NIGHT_ADULT;

					break;
				case 1: // ����� ������ ���
					price = DISABLED_NIGHT_ADULT;
					break;
				case 2: // ������ ������ ���
					price = MERIT_NIGHT_ADULT;
					break;
				case 3: // ���ڳ� ������ ���
					price = MULTI_NIGHT_ADULT;
					break;
				case 4: // �ӻ�� ������ ���
					price = PREGNANT_NIGHT;
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
			}
		}
	}
	public static void result() {
		total = count * price;
		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", total);
		System.out.printf("=================��������====================\n");
		System.out.printf("����:%s %s %d�� �Ѿ� : %d�� %s ����Դϴ�.\n", ticketName, agetypeName, count, total, typeName);
		System.out.printf("===========================================\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {//������ ������ �� ó���ϸ� �ٽ� �̰����� ���ƿ�.
			ticket();
			if (ticket == 99) {//����ѹ��� 99�� ������ ����.
				break;
				}
			residentNumber();
			ticketCount();
			ageAndagetype();
			ableType();
			result();			
		}
			in.close();	
	}
	
}
		
	


