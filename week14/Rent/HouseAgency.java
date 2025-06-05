package week14;

public class HouseAgency implements Rentable<House> {
	@Override
	public House rent() {
		return new House();
	}
}
