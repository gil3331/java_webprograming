package ������Ʈ1;

public class �⺻2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //���� ������ �̸� ���� ���� �λ縻 �ۼ��� �Դϴ�.
        System.out.println("�̸� : �̱���\n" + 
      		  			 "���� : 29\n"+
      		  			 "���� : 9��2��\n"+
      		  			 "�λ縻 : �ȳ��ϼ��� ������ ���� ������ �̱����Դϴ�.");
      	System.out.println("---------------------------------------------");
        //����ī�� ǥ����
        //���絷=int�� ǥ��   �Ÿ�=m���� shortǥ��    ��ġ=double�� ǥ��   ����=byte 
        //int current balance=30000(���� �ܾ�ǥ��)
        
      	//�ð��� �Ÿ� ǥ����
        //step1 int�� ������ ����
        //step2 println �� printf�� ���
        int mach;
        //mach=����
        int distance;
        //distance=�Ÿ�
        mach=340;
        distance=mach*60*60;
        System.out.println("1�ð� ���� ���� �Ÿ� : "+distance + "m");
        System.out.printf("1�ð� ���� ���� �Ÿ� : %d"+ "m\n",distance);
        System.out.println("---------------------------------------------");
        
        //�����ܾ� ǥ����
        int currentBalance;
        currentBalance=15000;
        final int CURRENT_BUS_PRICE=1250;
        int chargemoney=5000;
        System.out.println("���� �ܾ��� : "+currentBalance +"��");
         //ī�� ����currentBalance=currentBalance - CURRENT_BUS_PRICE
        currentBalance=currentBalance - CURRENT_BUS_PRICE;
        		System.out.println("���� �ܾ��� : "+currentBalance +"��");
        //����
        currentBalance=currentBalance + chargemoney;
        System.out.println("���� �ܾ��� : "+currentBalance +"��");
        System.out.println("---------------------------------------------");
        char ga1 ='��';
        char ga2 ='\uac00';
        char ga3 ='��';
        boolean a = true;
        boolean b = false;
        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(ga3);
        System.out.println(a + "�� �ƴϸ�" + b + "�̴�.");
        System.out.println("---------------------------------------------");
        
        //���� ���� ��ȯ ��� = ����orȰ�ڿ� ���ϴ� ���¸� (����)�� ǥ��
        int data;
        float floatData;
        floatData=(float)122.5;
        data=(int)floatData;
        System.out.println(data);
        int i;
        double d;
        i=(int)(7/(double)4.2);
        System.out.println(i);
        d=7/4;
        System.out.println(d);
        //d�� double�� ǥ�����־� �Ҽ��� ǥ������
        d=7/(double)4;
        System.out.println(d);
        
	}

}
