package week7;

public class Pet {
	//객체를 만들기 위한 클래스
	//속성
	String name;
	String type;
	int age;
	String color;
	
	//생성자 오버로딩
	Pet(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}
	
	Pet(String name, String type, int age, String color) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
	
	//생성자(객체 생성 시 초기화를 담당)
	Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
}
