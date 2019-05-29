package ��ü���⿡������������Ʈ;

public class TicketTypeClass {

	String[] ticketN;
	String[] typeN;
	int returnPricearr[];

	TicketTypeClass() {
		ticketN = new String[20];
		typeN = new String[20];
		returnPricearr = new int[20];

	}

	public void getTicketPrice(int ticket, int returnAgeType, int inputAdvantage, String[] ticketName,
			String[] typeName, int tryCount) {
		// �� Ŭ������ ������ ���� �ܺ��� �������� �䱸������, Ŭ�������� �ܺ��� ����, �������� ���� �� �ְ� �������� �ο��Ѵ�.
		if (ticket == 1) {
			ticketN[tryCount] = "���ϱ�";// ticket�� 1�� ��츦 "���ϱ�"�̶�� ������ �ο�
			switch (returnAgeType) {// switch�� ���̿� �ش��ϴ� Ÿ���� �ְ�,
			case 0:// ���� Ÿ���� 0�϶�, �� ������ ���
				returnPricearr[tryCount] = 0;// ǥ���� ������.
				typeN[tryCount] = "����";
				break;

			case 1: // 1�϶�, ������ ���
				switch (inputAdvantage) {// ���� Ÿ���� 1�� ���(������ ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� ������ ���
					returnPricearr[tryCount] = 43000;
					typeN[tryCount] = "�Ϲ� ����";
					break;
				case 1: // �������� ����� ������ ���
					returnPricearr[tryCount] = 26000;
					typeN[tryCount] = "����� ����";
					break;
				case 2: // �������� ������ ������ ���
					returnPricearr[tryCount] = 21500;
					typeN[tryCount] = "������ ����";
					break;
				case 3: // �������� ���ڳ� ������ ���
					returnPricearr[tryCount] = 34000;
					typeN[tryCount] = "���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // ���� Ÿ���� 2�϶�, û�ҳ��� ���
				switch (inputAdvantage) {// ���� Ÿ���� 2�� ���(û�ҳ��� ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� û�ҳ��� ���
					returnPricearr[tryCount] = 46000;
					typeN[tryCount] = "�Ϲ� û�ҳ�";
					break;
				case 1: // �������� ����� û�ҳ��� ���
					returnPricearr[tryCount] = 28000;
					typeN[tryCount] = "����� û�ҳ�";
					break;
				case 2: // �������� ������ û�ҳ��� ���
					returnPricearr[tryCount] = 23000;
					typeN[tryCount] = "������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr[tryCount] = 54000;
					typeN[tryCount] = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr[tryCount] = 33000;
					typeN[tryCount] = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr[tryCount] = 27000;
					typeN[tryCount] = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr[tryCount] = 43000;
					typeN[tryCount] = "���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPricearr[tryCount] = 45000;
					typeN[tryCount] = "�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketN[tryCount] = "���ı�";// ticket�� 2�� ��츦 "���ı�"�� ������ �ο���.
			switch (returnAgeType) {
			case 0: // ������ ���
				returnPricearr[tryCount] = 0;
				typeN[tryCount] = "����";
				break;

			case 1: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr[tryCount] = 23000;
					typeN[tryCount] = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr[tryCount] = 18000;
					typeN[tryCount] = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr[tryCount] = 28000;
					typeN[tryCount] = "���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // û�ҳ��� ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� û�ҳ��� ���
					returnPricearr[tryCount] = 39000;
					typeN[tryCount] = "�Ϲ� û�ҳ�";
					break;
				case 1: // ����� û�ҳ��� ���
					returnPricearr[tryCount] = 24000;
					typeN[tryCount] = "����� û�ҳ�";
					break;
				case 2: // ������ û�ҳ��� ���
					returnPricearr[tryCount] = 19500;
					typeN[tryCount] = "������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPricearr[tryCount] = 31000;
					typeN[tryCount] = "���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr[tryCount] = 45000;
					typeN[tryCount] = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr[tryCount] = 27000;
					typeN[tryCount] = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr[tryCount] = 22500;
					typeN[tryCount] = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
			}

		}
	}
}
