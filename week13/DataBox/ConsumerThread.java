package week13;

public class ConsumerThread extends Thread {
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;	
	}
	
	//소비자 작업 스레드 내용 기술
			@Override
			public void run() {
				//소비자는 데이터를 읽기만 함 => getData()만!
				for(int i=1; i<=3; i++) {
					try {
						String data = dataBox.getData();
					} catch (InterruptedException e) {}
				}
			}
}
