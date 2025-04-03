package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		//while(true) : 무한 루프 이용
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		while(true) {
			//무한 반복 부분
			System.out.print("첫 번째 숫자 >> ");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 >> ");
			num2 = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		}
		
		//sc.close();
	}
}
