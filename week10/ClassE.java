package week10;

public class ClassE {
	public ClassE() {
		ClassD aa = new ClassD();
		aa.field1 = 20;
		aa.field2 = 20;
		//private은 접근 불가
		//aa.field3 = 20;
		
		aa.method1();
		aa.method2();
		
		//private은 접근 불가
		//aa.method3();
	}
}
