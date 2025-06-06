package week13;

public class DataBox {
	//공유 객체 클래스
	private String data;

	public synchronized String getData() throws InterruptedException {
		//소비자가 data를 읽는 메소드
		//읽을 data가 있는 경우에만 읽어야 함
		//data가 있는지 없는지 확인
		if(this.data == null) {
			//DataBox에 data가 없는 경우 => 읽으면 안됨 => 기다려야 함
			wait();
		}
		
		//data가 있는 경우 => 읽으면 됨
		String returnValue = data;
		System.out.println("Consumer Thread가 읽은 데이터 : " + returnValue);
		
		//data를 읽은 뒤에는 data 공간 비우기
		data = null;
		
		//소비자가 data를 읽는 동안, 생산자는 wait()
		//생산자가 data를 쓸 수 있도록 깨우기 => notify()
		notify();
		
		return returnValue;
	}

	public synchronized void setData(String data) throws InterruptedException {
		//생산자가 data를 쓰는 메소드
		//DataBox에 data가 없는 경우에만 데이터 쓰기 가능
		//data가 있는지 없는지 확인
		if(this.data != null) {
			//데이터가 있는 경우
			wait();
		}
		
		//DataBox에 data가 없는 경우 => data 쓰기 가능
		this.data = data;
		System.out.println("Producer Thread가 생성한 데이터 : " + data);
		
		//생산자가 데이터를 쓰는 동안, 소비자는 wait()
		//소비자가 데이터를 읽을 수 있도록 깨우기 => notify()
		notify();
	}
	
	
}
