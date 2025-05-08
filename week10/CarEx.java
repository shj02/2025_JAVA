package week10;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		//mycar.company = "현대자동차";
		mycar.setCompany("현대자동차");
		mycar.setModel("그랜저");
		mycar.setColor("white");
		mycar.setMaxSpeed(500);
		
		System.out.println(mycar.getCompany());
		System.out.println(mycar.getModel());
		System.out.println(mycar.getColor());
		System.out.println(mycar.getMaxSpeed()); //350
	}
}
