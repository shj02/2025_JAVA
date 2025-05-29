package week13;

public class User1 extends Thread {
	Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
		//스레드 이름 변경
		setName("User1");
	}
	
	//작업 스레드 내용 기술 => run() 재정의
	@Override
	public void run() {
		try {
			calc.setMemory(100);
		} catch (InterruptedException e) {}
	}
}
