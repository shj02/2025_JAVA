package week12;

public class TV implements RemoteControl {
	private int volume;
	
	//인터페이스를 구현하는 클래스
	//인터페이스에 있는 추상 메소드를 실제로 구현
	//추상메소드를 반드시 재정의
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//유효성 검사
		if(volume > MAX_VALUE)
			volume = MAX_VALUE;
		else if(volume < MIN_VALUE)
			volume = MIN_VALUE;

		this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
}
