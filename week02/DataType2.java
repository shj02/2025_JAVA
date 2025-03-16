package week2;

public class DataType2 {
	public static void main(String[] args) {
		//실수 데이터 타입
		float	fValue = 3.14f;
		double	dValue = 3.14;
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		//실수의 정밀도 테스트
		fValue = 0.1234567890123456789f;
		dValue = 0.1234567890123456789;
		System.out.println("fValue = " + fValue); //0.12345679
		System.out.println("dValue = " + dValue); //0.1234567890123456789
		
		// e 기호 사용하기 : 10의 제곱승
		int	iData = 4500000;
		float	fData = 3e7f; //e7 => 10의 7승
		double	dData1 = 3e7;
		double	dData2 = 3e-7;

		//println: 데이터를 기본값 형태로 출력 -> 가독성 높은 방식으로 출력함
		System.out.println("iData = " + iData); //4500000
		System.out.println("fData = " + fData); //3.0E7
		System.out.println("dData1 = " + dData1); //3.0E7
		System.out.println("dData2 = " + dData2); //3.0E-7
		
		System.out.println();

		//printf: 형식 지정자 사용, 소수점 이하 6자리
		System.out.printf("iData = %d\n", iData); //4500000
		System.out.printf("fData = %f\n", fData); //30000000.000000
		System.out.printf("dData1 = %f\n", dData1); //30000000.000000
		System.out.printf("dData2 = %f\n", dData2); //0.000000

		System.out.println();
		System.out.printf("fData = %.4f\n", fData); //소수 넷째자리까지
		System.out.printf("dData1 = %.2f\n", dData1); //소수 둘째자리까지
		System.out.printf("dData2 = %10.8f\n", dData2); //총 10자리인데, 소수 8자리까지
	}
}
