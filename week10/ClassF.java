package package1;

import week10.ClassD;

public class ClassF {
	public ClassF() {
		ClassD dd = new ClassD();
		dd.field1 = 20;
		
		//default, private는 안됨
//		dd.field2 = 20;
//		dd.field3 = 20;
		
		dd.method1();
		
		//default, private는 안됨
//		dd.method2();
//		dd.method3();
	}
}
