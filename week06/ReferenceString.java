package week6;

public class ReferenceString {
	public static void main(String[] args) {
		//문자열은 0번부터 인덱스 부여
		String ssn = "0502194000000";
		
		//문자 추출
		char gender = ssn.charAt(6);
		switch(gender) {
		case '1', '3' -> System.out.println("남자");
		case '2', '4' -> System.out.println("여자");
		}
		
		//문자열의 길이
		int length = ssn.length();
		if (length == 13) {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
		//문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 추출하기(잘라내기)
		//0번 인덱스부터 6번 앞 인덱스까지 가져오기
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		//0번부터 끝까지
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);
		
		//문자열 찾기
		//String oldStr = "자바 프로그래밍";
		//indexOf : 문자열이 시작하는 인덱스 반환
		int index = oldStr.indexOf("프로그래밍");
		if (index == -1) {
			System.out.println("프로그래밍 단어가 포함되어 있지 않음");
		} else {
			System.out.println(index + "번 인덱스에 프로그래밍 단어가 있음");
		}
		
		//문자열이 포함되어 있는지 없는지 여부 확인 => contains()
		boolean result = oldStr.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 문자열");
		} else {
			System.out.println("자바와 관련없는 문자열");
		}
		
		//문자열 분리하기
		String board = "1,자바학습,참조타입 String 클래스,홍길동";
		String[] tokens = board.split(",");
		for (int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		//향상된 for문 사용 => 인덱스를 사용하지 않음
		for (String str : tokens) {
			System.out.println(str);
		}
	}
}
