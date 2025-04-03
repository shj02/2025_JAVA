package week5;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = ' ';
		int score;
		
		while(true) {
			System.out.print("점수 입력 >> ");
			score = sc.nextInt();
			
			if(score<0) {
				break;
			}
			
			if(score>=90) {
				grade = 'A'; 
			} else if(score>=80) {
				grade = 'B';
			} else if(score>=70) {
				grade = 'C';
			} else if(score>=60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("SCORE\tGRADE");
			System.out.println("===============");
			System.out.printf("%d\t%c\n", score, grade);
			System.out.println("");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
