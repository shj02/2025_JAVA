package package1;

import week10.ClassA;

public class ClassC {
	//패키지가 다른 경우 import
	ClassA c1 = new ClassA(true);
	
	//default : 같은 패키지 안에서만 사용 가능
	//ClassA c2 = new ClassA(10);
	
	//private
	//ClassA c3 = new ClassA("홍길동");
}
