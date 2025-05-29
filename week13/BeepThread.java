package week13;

public class BeepThread extends Thread {
	//작업 스레드를 정의하는 메소드 run()을 재정의
	
	@Override
	public void run() {
		// 작업 스레드에서 실행할 명령문 기술
		for(int i=0; i<5; i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
