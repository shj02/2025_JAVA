package week14;

public class Box2Ex {
	public static void main(String[] args) {
		//원하는 타입의 클래스 형식을 지정해서 객체 생성
		Box2<String> box1 = new Box2<String>();
		box1.setT("홍길동");
		String sVal = box1.getT();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.setT(100);
		int iVal = box2.getT();
	}
}
