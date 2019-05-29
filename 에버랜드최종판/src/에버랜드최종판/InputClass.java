package ��������������;

import java.util.Scanner;

public class InputClass {

	public static Scanner in = null;
	int inputType;//
	int inputID;
	int inputCount;
	int inputAdvantage;
	String inputID_str;

	InputClass() {// �ش� Ŭ������ �ʿ��� ���� �� �迭�� �ʱ�ȭ ��Ű��, �迭 ���� ������ ��.
		in = new Scanner(System.in);
		inputType = 0;
		inputCount =0;
		inputID_str = " ";
		inputAdvantage = 0;
	}

	public void inputTypeCommand() {
		do {
			try {
				System.out.print("������ ���Ͻÿ� :\n 1.�ְ���\n 2.���ı�\n 99.����\n");// ticket�� ������ �����ϱ� ���� �ְ��� ���ı����� ����԰� ���ÿ�, 99��
																			// ���Ḧ �Ҽ� �ְ� �����.
				inputType = in.nextInt();// Ƽ�� ���� ����
				if (inputType != 1 && inputType != 2 && inputType != 99) {// ������ inputdata�� 1�̳�, 2�̳�, 99�� �ƴ϶��,
					System.out.println("�ùٸ� ������ �ƴմϴ�.");// �ùٸ� ������ �ƴ϶�� ����ϰ� ��.
				}
			} catch (Exception e) {// ���ڷ� ���ԵǴ°� �ƴ�, Ư������, ������ ��츦 �Է��Ҷ�,
				System.out.println("�߸��� �����Դϴ�.");// �߸��� �����̶� ����Ͽ�, ����ְ� ��.

			}
			in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);// 1,2,99�� �Է��� �ƴҽÿ��� do~while���� ���� �ʱ� ����Ʈ ������ ���ư�.

	}

	public int inputIDCommand() {

		boolean isDigit = true;
		do {
			do {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ��� : \n");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6);// 6�ڸ��� �ƴҽ� ������ ��� ���Ͽ�, �ֹι�ȣ�� ���ڿ��� �ް� ��.
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);// �ٽ� �ش� ���ڿ��� �ֹι�ȣ�� ���ڷ� ��ȯ��.
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false);
		return inputID;
	}

	public void inputCountCommand() {

		do {
			try {
				System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? : ");
				inputCount = in.nextInt();// ������ �������� ����
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount <= 0 || inputCount >= 10);// Ƽ�� ���� 1~9�� ������ ���ϰ�, �� �̻��� �ֹ����� ���ϰ� ��.

	}

	public void inputAdvantageCommand() {

		do {
			try {

				System.out.print("�������� �Է��ϼ��� : \n0(�Ϲ�)\n1(�����)\n2(������)\n3(���ڳ�)\n4(�ӻ��)\n");// �������� �����ϴ� ��¹�����, ����
																							// �������� �ִ�����
																							// ���
				inputAdvantage = in.nextInt();// ������ ����
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage != 1 && inputAdvantage != 2 && inputAdvantage != 3 && inputAdvantage != 4
				&& inputAdvantage != 0);// do~while�� ���� ������ ������ 1,2,3,4�� �ƴҽ� do�� ���ư�.

	}

	protected void fianlize() throws Throwable {
		in.close();
	}

}