package ������Ʈ3;

import java.util.Scanner;



public class ��������Ƽ�Ͻý���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		in = new Scanner(System.in);
		int ticket = 0, count = 0, type = 0, price = 0;// ticket=���ϱ�,���ı�/count=�ο���/type=����Ÿ��/price=�������� ����
		int residentnumber =0, age = 0, ageType = 0;// residentnumber�� �ֹι�ȣ, age�� ����, agetype�� �����̳�, û�ҳ� ���� ���ڷ� �����ϰ� ����
		int total = 0;// total�� ��� ���ǿ� ���յǴ� ���� ������ �ǹ���.
		String ticketName = " ", agetypeName = " ", typeName = " ";// ticket�� ���ϱ�,���ı��� ���ڷ� �����ϱ� ���Ͽ� string���� ����ϰ� �����ϰ�,
																	// �ʱ�ȭ ���� ""�� ����.
		System.out.print("������ ���Ͻÿ� :\n 1.�ְ���\n 2.���ı�\n");// ticket�� ������ �����ϱ� ���� �ְ��� ���ı����� �����.
		ticket = in.nextInt();// Ƽ�� ���� ����
		if(ticket!=1&&ticket!=2) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			System.exit(0);
		}
		System.out.print("�ֹι�ȣ ���ڸ��� �Է��Ͻÿ� : ");// �ֹι�ȣ ������ ���� ��¹�
		residentnumber = in.nextInt();// �ֹι�ȣ ����
		

				
		
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
		count = in.nextInt();// ������ �������� ����
		if(count<=0) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			System.exit(0);
		}
		age = residentnumber / 10000;// �ֹι�ȣ�� ���ؼ� ���̸� ���ϱ� ���� �켱 �ֹι�ȣ�� 10000���� ���� ������ ��.
		if (age <= 19) {
			age = 2019 - (age + 2000)+1;// 2000����� ���� ���ڸ��� 00���� �����ϱ� ������ ���̿� 2000�� ���ϰ�, 2019�� ���� ���̰� ����
		} else {
			age = 2019 - (age + 1900)+1;// 1900����� ���� ���� ������� 1900�� ���� ��, 2019�� ���ָ� ���̰� ����.
		}
		System.out.println("���̴�" + age + "��");// ���� ���
		if (age < 3) {// ���������� ������ ���̰� 3�� �̸��� ���� ���̷� �з��Ͽ�, ǥ���� ���� �ƴ���.
			ageType = 0;// ���̰� ���ǿ� �ش��ϴ� ��츦 0���� ����
			agetypeName = "����";// ���̰� ���ǿ� �ش��ϴ� ��츦 ���̷� ����
		}
		if (age >= 3 && age < 13 || age > 65) {// �������� �������� ���̰� 3�� �̻��̸鼭 ���̰� 13�� �̸��̰ų�, 65���� �Ѵ� ��� ���� Ȥ�� �������� �з��ϰ� �Ǿ�����.
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
		System.out.print("�������� �Է��ϼ��� : \n0(�Ϲ�)\n1(�����)\n2(������)\n3(���ڳ�)\n4(�ӻ��)\n");// �������� �����ϴ� ��¹�����, ���� �������� �ִ�����
																					// ���
		type = in.nextInt();// ������ ����
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
					price = 43000;
					break;
				case 1: // �������� ����� ������ ���
					price = 26000;
					break;
				case 2: // �������� ������ ������ ���
					price = 21500;
					break;
				case 3: // �������� ���ڳ� ������ ���
					price = 34000;
					break;
					default : 
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 2: // ���� Ÿ���� 2�϶�, û�ҳ��� ���
				switch (type) {// ���� Ÿ���� 2�� ���(û�ҳ��� ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� û�ҳ��� ���
					price = 46000;
					break;
				case 1: // �������� ����� û�ҳ��� ���
					price = 28000;
					break;
				case 2: // �������� ������ û�ҳ��� ���
					price = 23000;
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					price = 36000;
					break;
				default : 
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 3: // ������ ���
				switch (type) {
				case 0:// �Ϲ� ������ ���
					price = 54000;

					break;
				case 1: // ����� ������ ���
					price = 33000;
					break;
				case 2: // ������ ������ ���
					price = 27000;

					break;
				case 3: // ���ڳ� ������ ���
					price = 43000;
					break;
				case 4: // �ӻ�� ������ ���
					price = 45000;
					break;
				default : 
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
					price = 36000;
					break;
				case 1: // ����� ������ ���
					price = 23000;
					break;
				case 2: // ������ ������ ���
					price = 18000;
					break;
				case 3: // ���ڳ� ������ ���
					price = 28000;
					break;
				default : 
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 2: // û�ҳ��� ���
				switch (type) {
				case 0:// �Ϲ� û�ҳ��� ���
					price = 39000;
					break;
				case 1: // ����� û�ҳ��� ���
					price = 24000;
					break;
				case 2: // ������ û�ҳ��� ���
					price = 19500;
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					price = 31000;
					break;
				default : 
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			case 3: // ������ ���
				switch (type) {
				case 0:// �Ϲ� ������ ���
					price = 45000;

					break;
				case 1: // ����� ������ ���
					price = 27000;
					break;
				case 2: // ������ ������ ���
					price = 22500;
					break;
				case 3: // ���ڳ� ������ ���
					price = 36000;
					break;
				case 4: // �ӻ�� ������ ���
					price = 36000;
					break;
				default : 
					System.out.println("�ùٸ� ������ �ƴ�");
					System.exit(0);
					break;
				}
				break;
			}
		}
		total = count * price;
		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", total);
		System.out.printf("=================��������====================\n");
		System.out.printf("����:%s %s %d�� �Ѿ� : %d�� %s ����Դϴ�.\n", ticketName, agetypeName, count, total, typeName);
		System.out.printf("===========================================\n");
		in.close();
	}

}
