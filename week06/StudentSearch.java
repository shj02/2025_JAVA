package week6;

import java.util.Scanner;

public class StudentSearch {
	public static void main(String[] args) {
		//학생 이름 배열 선언
		String[] st = {"홍길동", "이순신", "강감찬", "김철수", "고길동"};
		
		//이름 입력 받기
		System.out.print("찾고 싶은 학생 이름 >> ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		//학생 존재 여부 저장하는 변수선언
		boolean found = false;
		
		//배열에서 같은 이름 찾기
		for(int i=0; i<st.length; i++) {
			if(st[i].equals(name)) {
				found = true;
			}
		}
		
		//결과 출력
		if(found) {
			System.out.println(name + " 학생이 명단에 있음");
		} else {
			System.out.println("해당 학생이 명단에 없음");
		}
	}
}
