package week11;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("냥!");		
	}
	
	public void catLife() {
		System.out.println("Cat 평균 수명은 약 12~15년입니다.");
	}
}
