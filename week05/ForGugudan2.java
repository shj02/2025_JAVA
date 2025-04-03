package week5;

public class ForGugudan2 {

	public static void main(String[] args) {
		//2~9단까지 구구단 출력
		//바깥 for문 : 단의 출력
		for(int i=2; i<=9; i++) {
			System.out.println("==========");
			System.out.println("구구단 " +i+"단");
			System.out.println("==========");
			
			//안쪽 for문 : 1~9까지 반복
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}

}
