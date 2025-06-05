package week14;

public class PrintClass1 {
	//데이터를 입력받아 출력하는 메소드 정의
	//데이터 타입이 다르면 => 메소드 오버로딩
	public void printVal(int value) {
		System.out.println("value = " + value);
	}
	
	public void printVal(String value) {
		System.out.println("value = " + value);
	}
	
	public void printVal(boolean value) {
		System.out.println("value = " + value);
	}
}
