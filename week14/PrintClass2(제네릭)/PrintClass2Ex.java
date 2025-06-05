package week14;

public class PrintClass2Ex {
	public static void main(String[] args) {
		//제네릭 타입을 포함한 객체 생성
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printVal(100);
//		pc2.printVal("홍길동");
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printVal("홍길동");
		
		PrintClass2<Boolean> pc4 = new PrintClass2<Boolean>();
		pc4.printVal(true);
	}
}
