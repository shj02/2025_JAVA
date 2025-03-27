package week4;

public class RandomDice {
	public static void main(String[] args) {
		//랜덤 함수 사용 : Math.random() => 0.0 ~ 0.9999 사이의 실수값 반환
		double num = Math.random();
		System.out.println("랜덤 숫자 : " + num);
		
		//주사위 : 1 ~ 6 사이의 값
		int number = (int)(num * 6 + 1);
		System.out.println("주사위 숫자 : " + number);
	}
}
