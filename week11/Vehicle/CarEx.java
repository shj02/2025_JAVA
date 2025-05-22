package week11;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire();
		car.run();
		
		//자동타입 변환
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
	}
}
