package week10;

public class Phone {
	//자식 개체의 공통된 속성과 기능을 모아놓은 클래스 => 부모 클래스
	
	//private인 경우에는 상속 불가
	private String model;
	private String color;
	
	public Phone(String model, String color) {
		//기본 생성자
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 호출");
	}
	
	
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String msg) {
		System.out.println("나: " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("너: " + msg);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
