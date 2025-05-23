package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("---");
		tv.turnOn();
		tv.setVolume(3);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		
		System.out.println("---");
		SmartTV smart = new SmartTV();
		smart.turnOn();
		smart.setVolume(3);
		smart.search("네이버");
		smart.setMute(true);
		smart.setMute(false);
		smart.turnOff();
		
		System.out.println("---");
		System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VALUE);
		System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VALUE);
		
		System.out.println("---");
		RemoteControl.changeBattery();
		System.out.println("---");

		System.out.println("\n--- 인터페이스의 다형성---\n");
		
		//인터페이스 변수 <= 구현 객체를 대입
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = smart;
		
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(5);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---\n");
		}
	}
}
