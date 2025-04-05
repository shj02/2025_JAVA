package week5;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int RandNum = (int)(Math.random() * 100 + 1);
		
		while(true) {
			System.out.print("숫자를 맞춰 보세요(1~100) >> ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num > 100 || num < 0) {
				System.out.println("1~100 사이의 값을 입력하세요.");
			} else if(num < RandNum) {
				System.out.println("숫자가 너무 작습니다.");
			} else if(num > RandNum) {
				System.out.println("숫자가 너무 큽니다.");
			} else {
				break;
			}
			
			//sc.close();
		}
		System.out.printf("정답입니다. 랜덤 숫자는 %d입니다.", RandNum);
	}
}
