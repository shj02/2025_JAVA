package week12;

public class AirPods implements EarPhone {
	public AirPods() {
		System.out.println("\n새로 구입한 Apple Airpods 연결");
	}
	
	@Override
	public void play() {
		System.out.println("Apple AirPods 음악 재생 중~");
	}

	@Override
	public void stop() {
		System.out.println("Apple AirPods 음악을 중지합니다.");
	}
	
}
