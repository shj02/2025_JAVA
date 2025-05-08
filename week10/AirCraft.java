package week10;

//하나의 파일 안에 클래스가 여러 개 선언되는 경우

class AirLine {
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}

public class AirCraft extends AirLine {
	@Override
	public void fly() {
		System.out.println("여객기 비행입니다.");
	}
	
	public static void main(String[] args) {
		AirCraft air = new AirCraft();
		air.takeOff();
		air.fly();
		air.land();
	}
}
