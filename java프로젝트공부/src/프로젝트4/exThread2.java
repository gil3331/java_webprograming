package ������Ʈ4;

public class exThread2 extends Thread {
	Thread t;
	exThread2(){//exThread2�� �����ڷ� �����,
		t=new Thread(this);//t�� �ʱ�ȭ ���ص�
		t.start();//t�� �����ϰ� �Ѵ�.
		} 
	public void run() {//�޼��� run��
		try {
			for (int i = 300; i < 500; i++) {//for�� ������ i�� 300~499���� 1�� �����ϰ� 
				System.out.println("Two : " + i);//����ϰ�,
				Thread.sleep(200);//��� ���� 200���� �д�.(�������� ���еǰ� �ϰ��� ��.-�̷��� ���� �α����ؼ� �� try~catch���� ����ؾ���.)
			}
		} catch (Exception e) {

		}

	}

}