package week3;

public class TwoOperand4 {

	public static void main(String[] args) {
		//비트 이동 연산자 : <<, >>
		System.out.println("1 << 3 = " + (1 << 3)); //8
		System.out.printf("1       = %8s\n", Integer.toBinaryString(1));
		System.out.printf("(1<<3)  = %8s\n", Integer.toBinaryString(1<<3));
		//빈자리는 0으로 채워짐
		
		System.out.println("-8 >> 3 = " + (-8 >> 3)); //-1
		System.out.printf("-8       = %8s\n", Integer.toBinaryString(-8));
		System.out.printf("(-8>>3)  = %8s\n", Integer.toBinaryString(-8>>3));
		//빈자리는 부호비트와 동일한 값으로 채워짐(음수면 1, 양수면 0)
	}

}
