package week3;

public class TwoOperand3 {

	public static void main(String[] args) {
		//이항 연산자 : 비트 연산지 (&, |, ^)
		//2진수로 연산
		byte num1 = 45;
		byte num2 = 25;
		int  result = num1 & num2;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("result = " + result);
		
		//& (AND)
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(&) = %6s\n", Integer.toBinaryString(result));
		
		System.out.println();
		
		//| (OR)
		result = num1 | num2;
		System.out.println("result = " + result);
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(|) = %6s\n", Integer.toBinaryString(result));
		
		System.out.println();
		
		//^ (XOR)
		result = num1 ^ num2;
		System.out.println("result = " + result);
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(^) = %6s\n", Integer.toBinaryString(result));
	}

}
