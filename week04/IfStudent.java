package week4;

import java.util.Scanner;

public class IfStudent {

	public static void main(String[] args) {
		//외부로부터 데이터 입력 => Scanner 클래스 이용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도 입력 >> ");
		int year = sc.nextInt(); //정수 값 입력 받을 수 있음
		
		//나이 계산
		int age = 2025 - year;
		
		//조건문을 이용해서 학생의 종류 출력
		//20 <= age <= 26 식으로 쓰면 안됨
		String stu;
		if (age >= 20 && age <= 26) {
			stu = "대학생";
		} else if (age >= 17 && age < 20) {
			stu = "고등학생";
		} else if (age >= 14 && age < 17) {
			stu = "중학생";
		} else if (age >= 8 && age < 14) {
			stu = "초등학생";
		} else {
			//age < 8 || age >= 27
			stu = "학생이 아닙니다";
		}
		
		System.out.println(stu);
		
		sc.close();
	}

}
