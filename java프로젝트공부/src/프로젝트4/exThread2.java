package 프로젝트4;

public class exThread2 extends Thread {
	Thread t;
	exThread2(){//exThread2를 생성자로 만들고,
		t=new Thread(this);//t를 초기화 해준뒤
		t.start();//t를 실행하게 한다.
		} 
	public void run() {//메서드 run은
		try {
			for (int i = 300; i < 500; i++) {//for문 구조로 i를 300~499까지 1씩 증가하게 
				System.out.println("Two : " + i);//출력하고,
				Thread.sleep(200);//계산 텀을 200으로 둔다.(육안으로 구분되게 하고자 함.-이렇게 텀을 두기위해선 꼭 try~catch문을 사용해야함.)
			}
		} catch (Exception e) {

		}

	}

}