package week10;

public class ClassB {
	//패키지가 같은 경우
	
	//public : 어디서든 호출 가능
	ClassA c1 = new ClassA(true);
	
	//default : 같은 패키지에서 호출 가능
	ClassA c2 = new ClassA(10);
	
	//private : 클래스 안에서만 호출 가능
	//외부에서는 아무도 사용 못함
	//ClassA c3 = new ClassA("홍길동");
}
