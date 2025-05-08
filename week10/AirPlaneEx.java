package week10;

public class AirPlaneEx {
	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		sPlane.takeOff();
		sPlane.fly();
		sPlane.land();
		
		System.out.println();
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
	}
}
