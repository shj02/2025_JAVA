package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.field1 = "aaa";
		child.field2 = "bbb";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		//클래스의 자동타입 변환
		//클래스 변수 <= 자식객체를 대입
		Parent parent = child;
		parent.method1();
		
		//자동타입 변환이 적용된 경우
		//부모 클래스 변수라고 자식 클래스의 재정의된 메소드 호출
		parent.method2(); //Child-method2()
		
		//자식 객체가 부모 객체로 자동타입 변환되면
		//자식 객체에만 정의된 메소드는 호출 불가
		//부모 클래스에 정의된 메소드만 부모 클래스 변수로 호출 가능
		//parent.method3();
		parent.field1 = "aaa";
		
		//부모 클래스 변수로는 자식 클래스에서만 정의된 필드나 메소드는 접근 불가
		//parent.field2 = "bbb";
		
		//강제 타입 변환(casting)
		Child child2 = (Child)parent;
		child2.field1 = "aaa";
		child2.field2 = "bbb";
		child2.method1();
		child2.method2();
		child2.method3();
		
		//순수 부모 객체를 이용하여 casting
		Parent parent2 = new Parent();
		child2 = (Child)parent2;
		//child2.method3();
	}
}
