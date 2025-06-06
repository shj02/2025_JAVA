package week13;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	//생산자 작업 스레드 내용 기술
	@Override
	public void run() {
		//생산자 data를 생산만 함 => setData()만 호출
		for(int i=1; i<=3; i++) {
			String data = "Data - " + i;
			try {
				dataBox.setData(data);
			} catch (InterruptedException e) {}
		}
	}
}
