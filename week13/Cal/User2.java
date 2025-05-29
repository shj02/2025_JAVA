package week13;

public class User2 extends Thread {
	Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
		setName("User2");
	}
	
	@Override
	public void run() {
		try {
			calc.setMemory(50);
		} catch (InterruptedException e) {}
	}
}
