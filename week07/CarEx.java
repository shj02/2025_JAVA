package week7;

public class CarEx {
	public static void main(String[] args) {
		//실행 클래스
		//객체 생성
		Car mycar = new Car();
		
		//필드값 출력
		//객체의 필드값은 반드시 객체 이름으로 접근해야 함
		System.out.println("제작회사 : " + mycar.company);
		System.out.println("모 델 : " + mycar.model);
		System.out.println("색 상 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxSpeed);
		System.out.println("현재속도 : " + mycar.speed);
		
		//필드값 변경
		mycar.speed = 100;
		System.out.println("현재속도 : " + mycar.speed);
		
		Car yourcar = new Car();
		System.out.println("-- your car ---");
		System.out.println("제작회사 : " + yourcar.company);
		System.out.println("모 델 : " + yourcar.model);
		System.out.println("색 상 : " + yourcar.color);
		System.out.println("최고속도 : " + yourcar.maxSpeed);
		System.out.println("현재속도 : " + yourcar.speed);
		
		//매개변수로 초기화하는 생성자로 객체 생성
		Car mycar2 = new Car("제네시스", "white", 350);
		System.out.println("-- mycar2 --");
		System.out.println("제작회사 : " + mycar2.company);
		System.out.println("모 델 : " + mycar2.model);
		System.out.println("색 상 : " + mycar2.color);
		System.out.println("최고속도 : " + mycar2.maxSpeed);
		System.out.println("현재속도 : " + mycar2.speed);
		
	}	
}
