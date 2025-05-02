package week7;

public class CarEx2 {
	public static void main(String[] args) {
		//다양한 생성자를 이용하여 객체 생성
		Car c1 = new Car();
		System.out.printf("c1 : %s %s %d \n", c1.model, c1.color, c1.maxSpeed);
		
		Car c2 = new Car("그랜저");
		System.out.printf("c2 : %s %s %d \n", c2.model, c2.color, c2.maxSpeed);
		
		Car c3 = new Car("소나타", "white");
		System.out.printf("c3 : %s %s %d \n", c3.model, c3.color, c3.maxSpeed);
		
		Car c4 = new Car("아반떼", "navy", 250);
		System.out.printf("c34 : %s %s %d \n", c4.model, c4.color, c4.maxSpeed);
	}
}
