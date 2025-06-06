## 프로세스와 스레드
### 프로세스(process)
> 실행 중인 하나의 프로그램(애플리케이션)  
> 사용자가 애플리케이션을 실행하면 운영체제로부터 실행에 필요한 메모리를 할당 받아 애플리케이션의 코드를 실행하는 것  
> 하나의 프로그램이 다중 프로세스를 만들기도 함

### 멀티 태스킹(multi tasking)
> 두 가지 이상의 작업을 동시에 처리하는 것  
> 멀티 프로세스 : 독립적으로 프로그램들을 실행하고 여러 가지 작업 처리  
> 멀티 스레드 : 한 개의 프로그램을 실행하고 내부적으로 여러 가지 작업 처리  
> 스레드 : 한 가지 작업을 실행하기 위해 순차적으로 실행할 코드  
<img src="https://github.com/user-attachments/assets/4833e58a-e589-4fc1-8cb9-855c39f76ad9">

### 멀티 프로세스 : 애플리케이션 단위의 멀티 태스킹
> 운영체제에서 할당받은 자신의 메모리를 가지고 실행하기 때문에 **서로 독립적**  
> 하나의 프로세스에서 오류가 발생해도 다른 프로세스에게 영향을 미치지 않음  
> -> 워드와 엑셀을 동시에 사용하던 도중, 워드에 오류가 발생하더라도 엑셀은 여전히 사용 가능

### 멀티 스레드 : 한 개의 애플리케이션 내부에서의 멀티 태스킹
> 하나의 프로세스 내에서 여러가지 작업을 처리  
> 메신저의 경우 파일을 전송하는 스레드에서 예외가 발생되면 메신저 프로세스 자체가 종료되기 때문에 채팅 스레드도 같이 종료됨  
> 멀티 스레드에서는 예외 처리에 만전을 기해야 함

> 활용  
- 대용량 데이터의 처리 시간을 줄이기 위해 데이터를 분할해서 병렬처리할 때  
- UI를 가지고 있는 애플리케이션에서 네트워크 통신을 할 때  
- 다수 클라이언트의 요청을 처리하는 서버를 개발할 때

### 메인 스레드
> 모든 자바 프로그램은 메인 스레드가 main() 메소드를 실행하며 시작  
> main() 메소드의 첫 코드부터 아래로 순차적으로 실행  
> 실행 종료 조건: 마지막 코드 실행,  return문을 만남
  
> main 스레드는 작업 스레드들을 만들어 병렬로 코드들 실행  
> : 멀티 스레드를 생성해 멀티 태스킹 수행

> 프로세스의 종료   
- 싱글 스레드: 메인 스레드가 종료하면 프로세스도 종료  
- 멀티 스레드: 실행 중인 스레드가 하나라도 있다면 프로세스 미종료  

### 멀티 스레드로 실행하는 어플리케이션 개발
> 몇 개의 작업을 병렬로 실행할 지 결정하는 것이 선행되어야 함
```java
package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		//'삐~' 소리를 내는 작업
		for(int i=0; i<5; i++) {
			System.out.println("삐~");
			Thread.sleep(1000); //1000밀리세컨=1초동안 잠깐 멈춤
		}
		
		//'***'을 출력하는 작업
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
```

### 작업 스레드 생성 방법
> Thread 하위 클래스로부터 생성 : Thread 클래스 상속 후 run 메소드를 재정의해 스레드가 실행할 코드 작성
```java
package week13;

public class BeepThread extends Thread {
	//작업 스레드를 정의하는 메소드 run()을 재정의
	@Override
	public void run() {
		// 작업 스레드에서 실행할 명령문 기술
		for(int i=0; i<5; i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
```
```java
package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException {
		//main 스레드
		
		//작업 스레드 객체 생성 및 실행
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
```
> Runnable 인터페이스를 매개값으로 갖는 Thread 생성자 호출
```java
package week13;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("삐~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}

}
```
```java
package week13;

public class BeepTaskEx {
	public static void main(String[] args) throws InterruptedException {
		//Runnable 인터페이스를 구현하는 구현 객체 생성
		BeepTask beepTask = new BeepTask();
		
		//Thread 객체를 직접 생성
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
```

# 스레드 우선 순위
## 동시성과 병렬성
### 동시성(Concurrency)
> 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아 가며 실행하는 성질
### 병렬성(Parallelism)
> 멀티 작업을 위해 멀티 코어에서 개별 스레드를 동시에 실행하는 성질
<img src="https://github.com/user-attachments/assets/f1fbf660-b874-406c-bb6b-866b8ff4f7f6">

## 스레드 스케줄링
### 스레드의 개수가 코어의 수보다 많을 경우
> 스레드를 어떤 순서로 동시성으로 실행할 것인가 결정 -> 스레드 스케줄링  
> 스케줄링에 의해 스레드들은 번갈아 가며 run() 메소드를 조금씩 실행
<img src="https://github.com/user-attachments/assets/7560a8e1-2b63-47dd-9fed-4fa2f89aa672">

## 자바의 스레드 스케줄링
### 우선 순위 방식(Priority)과 순환 할당 방식(Round-Robin) 사용
### 우선 순위 방식(코드로 제어 가능)
> 우선 순위가 높은 스레드가 실행 상태를 더 많이 가지도로 스케줄링  
> 1~10까지 값을 가질 수 있으며 기본은 5

### 순환 할당 방식(코드로 제어 불가능)
> 시간 할당량(Time Slice)을 정해서 하나의 스레드를 정해진 시간만큼 실행

## 공유 객체를 사용할 때의 주의할 점
### 멀티 스레드가 하나의 객체를 공유해서 생기는 오류
<img src="https://github.com/user-attachments/assets/1f315941-b4cd-4ad0-8b37-ffaffe5519f4">

## 동기화 메소드 및 동기화 블록 - synchronized
### 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하기 위해 스레드 작업이 끝날 때까지 객체에 잠금 장치 적용
### 단 하나의 스레드만 실행할 수 있는 메소드 또는 블록
### 다른 스레드는 메소드나 블록 실행이 끝날 때까지 대기해야 함
