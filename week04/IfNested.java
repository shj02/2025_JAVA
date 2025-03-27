package week4;

public class IfNested {

	public static void main(String[] args) {
		//중첩 if문
		//점수 : 0 ~ 99
		int score = (int)(Math.random() * 100);
		
		String grade;
		
		if (score >= 90) {
			if (score > 95)
				grade = "A+";
			else if (score > 93)
				// 93 < score <= 95
				grade = "A0";
			else
				grade = "A-";
		} else if (score >= 80) {
			if (score > 85)
				grade = "B+";
			else if (score > 83)
				grade = "B0";
			else
				grade = "B-";
		} else
			grade = "C";
		
		System.out.println(grade);
	}

}
