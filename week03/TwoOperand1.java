package week3;

public class TwoOperand1 {

	public static void main(String[] args) {
		//이항 연산자 : 문자열에 적용되는 + 연산자 => 문자열의 연결
		String str1 = "JDK" + 6.0; //JDK6.0
		String str2 = str1 + " 특징"; //JDK6.0 특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		System.out.println(str3); //JDK33.0
		
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str4); //6.0JDK
	}

}
