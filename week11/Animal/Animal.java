package week11;

public abstract class Animal {
	//추상 클래스는 객체 생성 불가
	//상속은 가능
	
	public String kind;
	
	//모든 동물에 공통적으로 적용
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//모든 동물은 소리를 낸다.
	//모든 동물의 소리는 다르다.
	//자식 클래스에서 반드시 재정의해야 함
	//추상메소드 형식으로 메소드 선언만 해줌
	//추상 메소드 => 실행문 없음 => 객체 생성 못함
	public abstract void sound();
}
