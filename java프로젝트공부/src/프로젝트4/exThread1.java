package ������Ʈ4;

public class exThread1 extends Thread {
	Thread t;

	exThread1() {//exThread1�� �����ڷ� �����,
		t = new Thread(this);//t�� �ʱ�ȭ ���� ��
		t.start();//t�� �����ϰ� �Ѵ�.
	}

	public void run() {//�޼���run�� 
		try {
			for (int i = 1; i < 100; i++) {//for�� ������ i�� 1~99���� 1�� �����ϰ�
				System.out.println("One : " + i);//����ϰ�,
				Thread.sleep(200);//��� ���� 200���� �д�.(�������� ���еǰ� �ϰ��� ��.-�̷��� ���� �α����ؼ� �� try~catch���� ����ؾ���.)
			}
		} catch (Exception e) {

		}

	}

}
