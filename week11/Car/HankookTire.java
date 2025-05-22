package week11;

public class HankookTire extends Tire {
	//다형성의 조건
	//1. 상속
	//2. 재정의(override)
	@Override
	public void roll() {
		System.out.println("한국타이어 회전");
	}
}
