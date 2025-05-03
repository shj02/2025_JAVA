package week8;

import java.util.Scanner;

public class CarEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gasVal;
		
		Car mycar = new Car();
		mycar.setGas(5);
		
//		if(mycar.isLeftGas())
//			System.out.println("출발합니다.");
//		
//		mycar.run();
		
		while(mycar.isLeftGas()) {
			System.out.println("출발합니다.");
			mycar.run();
			
			//연료가 없을 때
			System.out.println("gas를 주입하세요 >> ");
			gasVal = sc.nextInt();
			
			if (gasVal == 0)
				break;
			
			mycar.setGas(gasVal);
		}
		
		System.out.println("프로그램 종료");
	}
}
