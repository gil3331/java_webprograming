package ��ü���⿡������������Ʈ;

public class PrintClass {

	int[] count;
	int[] returnPrice;

	PrintClass() {
		count = new int[20];
		returnPrice = new int[20];

	}

	public void PrintTicket(int[] returnPrice, int[] count, String[] TicketN, String[] AgeTN, String[] TypeN,int tryCount) {
	//�ܺο��� ������ ������ �޾ƿ��� ���ؼ� printticket�޼��忡 ���� �������� �����Ͽ� ������ �ް�,
			System.out.printf("=================��������====================\n");
		for (int i = 0; i <= tryCount; i++) {//i���� �迭�� �޾� ������ �޼��忡�� ���� ������ �Ʒ��� ��°����� �����.
			System.out.printf("����:%s %s %d�� �Ѿ� : %d�� %s ����Դϴ�.\n", TicketN[i], AgeTN[i], count[i], returnPrice[i],TypeN[i]);
			System.out.printf("===========================================\n");
		}

	}

}
