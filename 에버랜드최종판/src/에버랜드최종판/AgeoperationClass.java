package ��������������;

public class AgeoperationClass {

	int memberAge;
	int returnAgeType;
	String ageTypeName;

	public AgeoperationClass() {
		ageTypeName = " ";

	}

	public int calcAge(int memberAge) {

		memberAge = memberAge / 10000;// �ֹι�ȣ�� ���ؼ� ���̸� ���ϱ� ���� �켱 �ֹι�ȣ�� 10000���� ���� ������ ��.
		if (memberAge <= 19) {
			memberAge = 2019 - (memberAge + 2000) + 1;// 2000����� ���� ���ڸ��� 00���� �����ϱ� ������ ���̿� 2000�� ���ϰ�, 2019�� ���� ���̰� ����
		} else {
			memberAge = 2019 - (memberAge + 1900) + 1;// 1900����� ���� ���� ������� 1900�� ���� ��, 2019�� ���ָ� ���̰� ����.
		}

		return memberAge;// ���� ��� ���� ����������� ����.
	}

	public int getAgeType(int age) {// ������ memberage��� ��� ���� age�� �ް�, ������ ������ ���̺��� �з��ϰ� ��.

		returnAgeType = 0;
		if (age < 3) {// ���������� ������ ���̰� 3�� �̸��� ���� ���̷� �з��Ͽ�, ǥ���� ���� �ƴ���.
			returnAgeType = 0;// ���̰� ���ǿ� �ش��ϴ� ��츦 0���� ����
			ageTypeName = "����";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 ���̷� ����
		}
		if (age >= 3 && age < 13 || age > 65) {// �������� �������� ���̰� 3�� �̻��̸鼭 ���̰� 13�� �̸��̰ų�, 65���� �Ѵ� ��� ���� Ȥ�� �������� �з��ϰ�
												// �Ǿ�����.
			returnAgeType = 1;// ���̰� ���ǿ� �ش��ϴ� ��츦 1�� ����
			ageTypeName = "����/���";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 �������� ����
		}
		if (age >= 13 && age < 19) {// �������� ������ ���̰� 13�� �̻��̸鼭, 19�� �̸��̸�, û�ҳ��� ������.
			returnAgeType = 2;// ���̰� ���ǿ� �ش��ϴ� ��츦 2�� ����
			ageTypeName = "û�ҳ�";
			// ���̰� ���ǿ� �ش��ϴ� ��츦 û�ҳ����� ����
		}
		if (age >= 19 && age <= 65) {// �������� ������ 19�� �̻��̸鼭 65�� ���Ϸδ� �������� ������.
			returnAgeType = 3;// ���̰� ���ǿ� �ش��ϴ� ��츦 3���� ����
			ageTypeName = "����";
		}
		return returnAgeType;// age�� ���� �з��� ���ǵ��� returnagetype�� ��������� ����.
	}

}
