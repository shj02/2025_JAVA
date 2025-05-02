package week7;

public class StudentEx {
	//실행용 클래스
	public static void main(String[] args) {
		//라이브러리용 클래스를 이용해서 객체 생성
		String name = new String("홍길동");
		Student st1 = new Student();
		System.out.println("st1 변수는 Student 객체를 참조한다.");
		
		//설계도에 해당하는 클래스는 인스턴스를 여러 개 생성할 수 있다.
		Student st2 = new Student();
		System.out.println("st2 변수는 또 다른 Student 객체를 참조한다.");
	}
}
