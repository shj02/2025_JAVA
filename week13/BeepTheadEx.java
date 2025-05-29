package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException {
		//main 스레드
		
		//작업 스레드 객체 생성 및 실행
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
