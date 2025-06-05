package week14;

public class PrintClass2<T> {
	//처리 내용은 동일하고, 데이터 타입만 다른 경우
	//제네릭 타입을 사용
	public void printVal(T value) {
		System.out.println("value = " + value);
	}
}
