package week8;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
//			System.out.println("gas가 없습니다.");
			return false;
		}
		
//		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (gas > 0) {
			System.out.println("달립니다. (gas잔량 : "+gas+")");
			gas -= 1;
		}
		
		System.out.println("멈춥니다. (gas잔량 : "
				+gas+")");
	}
}
