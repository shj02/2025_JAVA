package week5;

public class Break {
	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random() * 10);
			System.out.println("랜덤 숫자 : " + num);
			
			if(num == 7) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
