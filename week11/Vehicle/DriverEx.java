package week11;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		driver.drive(v);
		
		//다형성 구현
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
