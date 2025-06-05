package week14;

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("hello");
		//캐스팅
		String sVal = (String)box.getObj();
		
		box.setObj(100);
//		int iVal = box.getObj();
		int iVal = (int)box.getObj();
	}
}
