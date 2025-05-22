package week11;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
	
	public void dogLife() {
		System.out.println("Dog 평균 수명은 약 15~20년입니다.");
	}
	
}
