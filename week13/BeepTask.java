package week13;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}

}
