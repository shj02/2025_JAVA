package week6;

public class ArrayEx1 {
	public static void main(String[] args) {
		//값 목록으로 배열 생성하기
		int[] score = {70, 80, 90, 75, 95};
		String[] pNames = {"java", "c", "python", "c#"};
		double[] dArray1;
		dArray1 = new double[] {0.1, 0.2, 0.3, 0.4};
		
		//new 연산자로 배열 생성
		//배열의 크기가 반드시 필요
		//new 연산자로 생성된 배열에는 기본값으로 초기화됨
		int[] intArray = new int[5];
		System.out.println("intArray[0] = " + intArray[0]); //0
		
		double[] dArray2 = new double[5];
		System.out.println("dArray2[0] = " + dArray2[0]); //0.0
		
		String[] sArray = new String[4];
		System.out.println("sArray[0] = " + sArray[0]); //null
		
		System.out.println("");
		
		//sArray 배열에 pNames 배열 값을 저장
		//sArray = pNames;
		for (int i=0; i<pNames.length; i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s\n", i, sArray[i]);
		}
	}
}
