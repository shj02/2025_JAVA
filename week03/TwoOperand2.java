package week3;

public class TwoOperand2 {

	public static void main(String[] args) {
		//이항연산자 : 비교연산자(>, >=, <, <=, ==(같다), !=(다르다)
		//논리연산자 : &&(and, &), ||(or, |)
		int charCode1 = 'A';
		if(charCode1 >= 65 && charCode1 <= 90) {
			//65 <= charCode <= 90
			System.out.println((char)charCode1 + "는 알파벳 대문자이다.");
		}
		
		int charCode2 = 'b';
		if(charCode2 >= 97 && charCode2 <= 122) {
			//true && true => 양쪽 모두 true인 경우에만 true 결과
			//97 <= charCode2 <= 122
			System.out.println((char)charCode2 + "는 알파벳 소문자이다.");
		}
		
		int charCode3 = '9';
		if(!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println(charCode3 + "는 0 ~ 9 사이의 숫자이다.");
		}
		
		int iValue = 4;
		if((iValue%2 == 0) || (iValue%3 == 0)) {
			//2의 배수이거나(or) 3의 배수인 경우
			//둘 중에 하나만 true여도 결과는 true
			System.out.println(iValue + "는 2 또는 3의 배수이다.");
		}
	}

}
