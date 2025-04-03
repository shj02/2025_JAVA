package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inStr;
		
		do {
			System.out.print(">> ");
			inStr = sc.nextLine();
			System.out.println(inStr);
		} while(!inStr.equals("q")); //조건식은 반복이 가능한 true 조건을 지정
		
		System.out.println("\n프로그램 종료");
		
		sc.close();
	}
}
