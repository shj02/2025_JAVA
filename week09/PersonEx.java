package week8;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동", 6.1);
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(p1.height*Person.FEET_CONSTANT + "cm");
		
		//final로 정의된 필드는 한 번 초기화된 후에는 값을 변경할 수 없다.
		//p1.nation = "USA";
		//p1.ssn = "456789-2221111";
		p1.name = "진달래";
	}
}
