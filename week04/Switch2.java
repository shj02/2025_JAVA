package week4;

public class Switch2 {
	public static void main(String[] args) {
		//switch 표현식
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("A등급");
			System.out.println("우수 회원");
		}
		case 'B', 'b' -> {
			System.out.println("B등급");
			System.out.println("일반 회원");
		}
		default -> {
			System.out.println("손님");
		}
		}
		
		System.out.println();
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원");
		case 'B', 'b' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}
	}
}
