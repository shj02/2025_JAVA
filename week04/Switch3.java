package week4;

public class Switch3 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100 - 20;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 = " + score1);
		
		//표현식을 이용한 변수값 설정
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				//연산 처리
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2 = " + score2);
	}
}
