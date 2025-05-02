package week7;

public class KoreanEx {
	public static void main(String[] args) {
		//객체 생성
		Korean k1 = new Korean("홍길동", "0502191234567", "010-2023-0530");
		
		//객체 필드값(속성) 출력
		System.out.println("k1.nation = "+k1.nation);
		System.out.println("k1.name = "+k1.name);
		System.out.println("k1.ssn = "+k1.ssn);
		System.out.println("k1.phone = "+k1.phone);
	}
}
