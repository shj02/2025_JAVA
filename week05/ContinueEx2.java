package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("sum2 = " + sum2);
		
		System.out.println("sum + sum2 = " + (sum + sum2));
	}
}
