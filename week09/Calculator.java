package week8;

public class Calculator {
	String color;
	String size;
		
	public Calculator(String color, String size) {
		this.color;
		this.size;
	}
	//전원 켜기
	//리턴값이 없는 경우
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	//전원 끄기
	//리턴값이 없는 경우
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double divide(int x, int y) {
		return (double)x/y;
	}

	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
}
