package week4;

public class IfElseErr {
	public static void main(String[] args) {
		int score = 85;
		char grade;
		
		if (score >= 90) {
			System.out.println("90 이상");
			grade = 'A';
		} else if (score >= 80) {
			System.out.println("80 이상");
			grade = 'B';
		} else if (score >= 70) {
			System.out.println("70 이상");
			grade = 'C';
		} else if (score >= 60) {
			System.out.println("60 이상");
			grade = 'D';
		} else {
			System.out.println("60 미만");
			grade = 'F';
		}
		System.out.println(grade);
	}
}
