package week7;

public class Korean {
	//객체를 만들기 위한 클래스(설계도)
	//객체의 속성(필드, field)
	String nation = "대한민국";
	String name;
	String ssn;
	String phone;
	
	//매개변수가 있는 생성자(클래스 이름과 동일하고 함수 모양처럼 생겼지만 return 값 없음)
	Korean(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
}
