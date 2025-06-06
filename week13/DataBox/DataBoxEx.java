package week13;

public class DataBoxEx {
	public static void main(String[] args) {
		//공유 객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread prod = new ProducerThread(dataBox);
		ConsumerThread cons = new ConsumerThread(dataBox); //공유객체가 됨
		
		prod.start();
		cons.start();
	}
}
