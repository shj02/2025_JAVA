package week5;

public class ForStar {

	public static void main(String[] args) {
		//랜덤 함수 이용해서 1~10 사이의 값 생성
		int num = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤 숫자 : " + num);
		
		for(int i=1; i<=num; i++) {
			System.out.print("★");
		}
	}

}
