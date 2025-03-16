package week2;

public class DataType3 {
	public static void main(String[] args) {
		//char 데이터 타입
		//char : 음수가 없다!
		char cData1 = 'A';	//char 문자를 직접 입력
		char cData2 = 65;	//10진수로 저장
		char cData3 = '\u0041';	//16진수로 저장
		System.out.println("cData1 = " + cData1); //A
		System.out.println("cData2 = " + cData2); //A
		System.out.println("cData3 = " + cData3); //A
		
		//한글 입력
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		System.out.println("cData4 = " + cData4); //가
		System.out.println("cData5 = " + cData5); //가
		System.out.println("cData6 = " + cData6); //가
		
		//char 타입의 변수의 유니코드 값을 알고 싶으면 int 타입 변수에 저장메모
		int cData7 = 'B';
		int cData8 = '하';
		int cData9 = '&';
		System.out.println("cData7 = " + cData7); //66
		System.out.println("cData8 = " + cData8); //54616	
		System.out.println("cData9 = " + cData9); //38
	}
}
