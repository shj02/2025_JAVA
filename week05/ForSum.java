package week5;

public class ForSum {
	public static void main(String[] args) {
		//1~100까지의 합 구하기
		//누적 값을 저장하기 위해서는 변수 초기화 필수
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			//조건식이 참일 때 반복
			//sum = sum + i;
			sum += i; //복합 연산자
		}
		System.out.println("1~100까지의 합 = " + sum);
	}
}
