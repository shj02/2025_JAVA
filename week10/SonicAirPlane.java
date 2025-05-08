package week10;

public class SonicAirPlane extends AirPlane {
	//비행모드에 따라 비행 방법을 달리하는 경우
	public static final int NORMAL = 1;
	public static final int SUPERSONIC  = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int maxSpeed;
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	//부모 클래스의 fly() 메소드 재정의
	//재정의 된 메소드가 실행됨!!
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC)
			System.out.println("음속 비행합니다.");
		else
			super.fly();
	}
}
