package 프로젝트4;

public class exThread1 extends Thread {
	Thread t;

	exThread1() {//exThread1을 생성자로 만들고,
		t = new Thread(this);//t를 초기화 해준 뒤
		t.start();//t를 실행하게 한다.
	}

	public void run() {//메서드run은 
		try {
			for (int i = 1; i < 100; i++) {//for문 구조로 i를 1~99까지 1씩 증가하게
				System.out.println("One : " + i);//출력하고,
				Thread.sleep(200);//계산 텀을 200으로 둔다.(육안으로 구분되게 하고자 함.-이렇게 텀을 두기위해선 꼭 try~catch문을 사용해야함.)
			}
		} catch (Exception e) {

		}

	}

}
