package week8;

public class CalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small"); //객체생성
		System.out.println(c1.color + ", " + c1.size);
		
		int result1 = c1.plus(10, 20);
		System.out.println("plus(10, 20) = " + result1);
		
		double result2 = c1.divide(10, 20);
		System.out.println("divide(10, 20) = " + result2);
		
		byte b1 = 10;
		byte b2 = 20;
		result2 = c1.divide(b1, b2);
		System.out.println("divide(10, 20) = " + result2);
		
		double result3 = c1.avg(10, 7);
		System.out.println("avg(10, 7) = " + result3);
	}
}
