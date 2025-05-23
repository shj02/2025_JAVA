package week12;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVol;
	
	//인터페이스의 추상메소드를 구현하는 구현 클래스
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	//필요한 경우, 디폴트 메소드로 재정의 가능
	@Override
	public void setMute(boolean mute) {
		//일반적으로 무음처리할 때, 이전 볼륨 값 저장
		if(mute) {
			System.out.println("Audio 무음 처리...");
			this.memoryVol = this.volume;
			setVolume(MIN_VALUE);
		} else {
			System.out.println("Audio 무음 해제~");
			//이전 볼륨 값으로 복귀하도록
			setVolume(memoryVol);
		}
	}

}
