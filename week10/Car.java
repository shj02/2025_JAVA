package week10;

public class Car {
	//클래스의 각 필드를 private으로 선언
	//외부에서 접근이 제한됨
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//외부에서 값이 필요한 경우
	//필드값을 제공하기 위한 getter() 메소드
	//getter()는 반드시 public
	public String getCompany() {
		return company;
	}
	
	//외부로부터 주어진 값을 필드값으로 적용하기 위해 setter() 메소드
	//필요한 경우 유효성 검사도 가능
	public void setCompany(String company) {
		this.company = company;
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

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		//유효성 검사
		if (maxSpeed > 350) {
			this.maxSpeed = 350;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
}
