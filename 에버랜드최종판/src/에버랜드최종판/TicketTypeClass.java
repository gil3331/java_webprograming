package ��������������;

public class TicketTypeClass {

	String ticketN;
	String typeN;
	int returnPricearr;

	TicketTypeClass() {
		ticketN = " ";
		typeN = " ";
		returnPricearr = 0;

	}

	public void getTicketPrice(int ticket, int returnAgeType, int inputAdvantage, String ticketName,
			String typeName) {
		// �� Ŭ������ ������ ���� �ܺ��� �������� �䱸������, Ŭ�������� �ܺ��� ����, �������� ���� �� �ְ� �������� �ο��Ѵ�.
		if (ticket == 1) {
			ticketN = "���ϱ�";// ticket�� 1�� ��츦 "���ϱ�"�̶�� ������ �ο�
			switch (returnAgeType) {// switch�� ���̿� �ش��ϴ� Ÿ���� �ְ�,
			case 0:// ���� Ÿ���� 0�϶�, �� ������ ���
				returnPricearr = 0;// ǥ���� ������.
				typeN = "����";
				break;

			case 1: // 1�϶�, ������ ���
				switch (inputAdvantage) {// ���� Ÿ���� 1�� ���(������ ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� ������ ���
					returnPricearr = 43000;
					typeN = "�Ϲ� ����";
					break;
				case 1: // �������� ����� ������ ���
					returnPricearr = 26000;
					typeN = "����� ����";
					break;
				case 2: // �������� ������ ������ ���
					returnPricearr = 21500;
					typeN = "������ ����";
					break;
				case 3: // �������� ���ڳ� ������ ���
					returnPricearr = 34000;
					typeN = "���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // ���� Ÿ���� 2�϶�, û�ҳ��� ���
				switch (inputAdvantage) {// ���� Ÿ���� 2�� ���(û�ҳ��� ���) �ٽ� �ű⿡ switch�� �������� �з�
				case 0:// �������� �Ϲ� û�ҳ��� ���
					returnPricearr = 46000;
					typeN = "�Ϲ� û�ҳ�";
					break;
				case 1: // �������� ����� û�ҳ��� ���
					returnPricearr = 28000;
					typeN = "����� û�ҳ�";
					break;
				case 2: // �������� ������ û�ҳ��� ���
					returnPricearr = 23000;
					typeN = "������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPricearr = 36000;
					typeN = "���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr = 54000;
					typeN = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr = 33000;
					typeN = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr = 27000;
					typeN = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr = 43000;
					typeN = "���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPricearr = 45000;
					typeN = "�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketN = "���ı�";// ticket�� 2�� ��츦 "���ı�"�� ������ �ο���.
			switch (returnAgeType) {
			case 0: // ������ ���
				returnPricearr = 0;
				typeN = "����";
				break;

			case 1: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr = 36000;
					typeN = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr = 23000;
					typeN = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr = 18000;
					typeN = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr = 28000;
					typeN = "���ڳ� ����";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 2: // û�ҳ��� ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� û�ҳ��� ���
					returnPricearr = 39000;
					typeN = "�Ϲ� û�ҳ�";
					break;
				case 1: // ����� û�ҳ��� ���
					returnPricearr = 24000;
					typeN = "����� û�ҳ�";
					break;
				case 2: // ������ û�ҳ��� ���
					returnPricearr = 19500;
					typeN = "������ û�ҳ�";
					break;
				case 3: // ���ڳ� û�ҳ��� ���
					returnPricearr = 31000;
					typeN = "���ڳ� û�ҳ�";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
				break;
			case 3: // ������ ���
				switch (inputAdvantage) {
				case 0:// �Ϲ� ������ ���
					returnPricearr = 45000;
					typeN = "�Ϲ� ����";
					break;
				case 1: // ����� ������ ���
					returnPricearr = 27000;
					typeN = "����� ����";
					break;
				case 2: // ������ ������ ���
					returnPricearr = 22500;
					typeN = "������ ����";
					break;
				case 3: // ���ڳ� ������ ���
					returnPricearr = 36000;
					typeN = "���ڳ� ����";
					break;
				case 4: // �ӻ�� ������ ���
					returnPricearr = 36000;
					typeN = "�ӻ��";
					break;
				default:
					System.out.println("�ùٸ� ������ �ƴ�");
					break;
				}
			}

		}
	}
}
