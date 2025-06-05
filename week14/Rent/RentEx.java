package week14;

public class RentEx {

	public static void main(String[] args) {
		HouseAgency houseA = new HouseAgency();
		House myHome = houseA.rent();
		myHome.turnOnLight();
				
		CarAgency carA = new CarAgency();
		Car myCar = carA.rent();
		myCar.run();
		
		ToyAgency toyA = new ToyAgency();
		Toy myToy = toyA.rent();
		myToy.play();
	}

}
