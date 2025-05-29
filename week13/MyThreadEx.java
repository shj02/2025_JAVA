package week13;

public class MyThreadEx {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<100; i++) {
			MyThread thread = new MyThread(i);
			thread.start();
			thread.join();
		}
	}
}
