package week5;

public class ForNested {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			//i=0, 1, 2일 때 -> 3번 반복
			for(int j=0; j<3; j++) {
				//j=0, 1, 2
				System.out.println("i="+i+", j="+j);
			}
		}
	}
}
