package week4;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 구매 가격 입력 >> ");
		int price = sc.nextInt();
		
		int rate; //int rate = 0; 초기값 설정
		if (price >= 100000) {
			rate = 10;
		} else if (price >= 50000) {
			rate = 5;
		} else { //없어도 됨
			rate = 0;
		}
		
		double total = price - (price*rate*0.01);
		
		System.out.println("원래 가격: " + price + "원");
		System.out.println("할인율: " + rate + "%");
		System.out.printf("최종 가격: %.0f원", total);
		
		sc.close();
	}

}
