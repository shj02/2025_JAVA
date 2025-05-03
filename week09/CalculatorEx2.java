package week8;

public class CalculatorEx2 {
	public static void main(String[] args) {
		//정적(static) 필드는 객체를 생성하지 않아도 접근이 가능함
		int radius = 8;
		double circleArea = Calculator2.pi * radius * radius;
		System.out.printf("반지름이 %d인 원의 면적 = %.2f\n", radius, circleArea);
		
		int x = 8;
		int y = 7;
		System.out.printf("(%d, %d)의 합 = %d\n", x, y, Calculator2.plus(x, y));
		System.out.printf("(%d, %d)의 차 = %d\n", x, y, Calculator2.minus(x, y));
	}
}
