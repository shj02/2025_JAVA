package week12;

public class TonFree implements EarPhone {
	public TonFree() {
		System.out.println("\nLG 블루투스 이어폰 TonFree 연결");
	}
	
	@Override
	public void play() {
		System.out.println("LG 톤프리 음악 재생 중~~");
	}

	@Override
	public void stop() {
		System.out.println("LG 톤프리 음악을 중지합니다.");
	}

}
