package week11;

public class GameEx {
	public static void main(String[] args) {
		//다형성 구현
		//1.상속 2.메소드 재정의 3.클래스의 자동타입변환
		
		//클래스 변수 : String[] names = new String[3];
		Game[] games = new Game[3];
		games[0] = new LOL("롤", "13.0"); //자동타입 변환
		games[1] = new Tetris("테트리스", "12.5");
		games[2] = new SuperMario("슈퍼마리오", "15.1");
		
		for(int i=0; i<games.length; i++) {
			games[i].start();
			games[i].gameDesc();
			System.out.println("-----");
		}
		
		System.out.println("향상된 for문\n");
		
		//향상된 for 문 이용
		for(Game g : games) {
			g.start();
			g.gameDesc();
			System.out.println("-----");
		}
	}
}
