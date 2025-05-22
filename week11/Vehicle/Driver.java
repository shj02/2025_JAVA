package week11;

public class Driver {
	//차량을 매개변수로 받음
	//매개변수가 클래스 타입 변수
	//->매개변수의 다형성 구현
	public void drive(Vehicle v) {
		v.run();
	}
}
