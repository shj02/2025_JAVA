package week13;

public class BeepTaskEx {
	public static void main(String[] args) throws InterruptedException {
		//Runnable 인터페이스를 구현하는 구현 객체 생성
		BeepTask beepTask = new BeepTask();
		
		//Thread 객체를 직접 생성
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
