package week12;

public interface RemoteControl {
	//인터페이스 선언
	//필드 선언 => 기본적으로 상수 필드 => 반드시 초기화 필요
	//선언된 필드 => 상수(public static final) => 반드시 초기화 필요
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	//모든 자식 객체에서 사용하는 기능을 모아 놓은 것
	//선언된 메소드 => 추상 메소드 : 실행문이 없는 메소드
	//컴파일 과정에서 자동으로 abstract 가 붙음
	
	public void turnOn();
	
	//기능 추가
	public void turnOff();
	void setVolume(int volume);
	
	//새로운 기능이 추가됨
	//디폴트 메소드로 선언 => 기존 구현 클래스에는 영향을 주지 않음
	//디폴트 메소드는 실행문이 선언되어야 함
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VALUE);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 선언 => 인터페이스 이름으로 호출이 가능
	//구현 객체가 없어도 실행 가능 => 실행문이 포함되어야 함
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다.");
	}
}
