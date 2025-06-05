# 인터페이스
## 인터페이스의 역할
### 인터페이스
> 객체의 사용 방법(기능-메소드)을 정의한 타입(객체 사용설명서)  
> 객체의 교환성을 높여주기 위해 **다형성을 구현**하는 매우 중요한 역할을 담당  
> 개발 코드와 객체가 서로 연결되는 접점 : 개발 코드는 인터페이스의 메소드만 알고 있으면 OK

## 인터페이스 선언
### 인터페이스 선언
> 인터페이스 선언 : File > New > Interface  
> 인터페이스 구성 멤버 : 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드  
> 인터페이스는 객체 사용 설명서이므로 런타임 시 데이터를 저장할 수 있는 필드를 생성할 수 없음!  

### 인터페이스 구성 멤버 - 상수 필드
> 인터페이스는 상수 필드만 선언 가능 : 데이터를 저장하지 않음  
> 선언된 필드는 모두 public static final : 컴파일 과정에서 자동으로 붙음  
> 상수명은 대문자로 작성 : 서로 다른 단어로 구성된 경우에는 _로 연결  
> 선언과 동시에 초기값을 지정  
> 실행 도중 데이터 저장 불가능

### 인터페이스 구성 멤버 - 추상 메소드
> 인터페이스의 메소드는 기본적으로 추상 메소드  
- 실행 블록이 없는 메소드  
- public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙음  
- 인터페이스를 구현한 객체에서 **반드시 재정의**해서 실행

### 인터페이스 구성 멤버 - 정적 메소드
> 객체가 없어도 인터페이스 이름으로 호출이 가능한 메소드
```
public interface RemoteControl {
    static void changeBattery() {
        System.out.println("건전지를 교환합니다");
    }
}
```
실행 클래스
```
RemoteControl.changeBattery();
```

### 인터페이스 선언 예시
```
public interface RemoteControl { //public abstract 자동 생성
  int MAX_VOLUME = 10; //상수 필드
  int MIN_VOLUME = 0;
  public void turnOn();
}
```

## 인터페이스 구현
### 구현 클래스와 구현 객체
> 구현 클래스 : 인터페이스의 추상 메소드를 실체 메소드로 구현하는 클래스  
> 구현 객체 : 인터페이스를 구현한 클래스로 생성한 객체

### 인터페이스 구현 예시
```
public class TV implements RemoteControl { //TV : RemoteControl 인터페이스를 구현하는 구현 클래
  @Override
  public void turnOn() {
    System.out.println("TV를 켭니다");
  }
}
```
```
public class Audio implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다");
  }
}
```
실행 클래스
```
public class RemoteControlEx {
  public static void main(String[] args) {
    Audio audio = new Audio();
    TV tv = new TV();

    audio.turnoOn();
    tv.turnOn();

    System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
    System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
  }
}
```

## 디폴트 메소드
### 디폴트 메소드 사용
> [public] default 리턴타입 메소드명 (매개변수, ...) {...}  
> **실행 블록**을 가지고 있는 메소드  
> 반드시 default 키워드를 붙여야함  
> 기본적으로 public 접근 제한의 특성을 가짐  
> 모든 구현 객체가 가지고 있는 기본 메소드로 사용 가능  
> 필요에 따라 구현 클래스가 디폴트 메소드를 재정의해서 사용  
> 기존 구현 클래스에는 영향을 주지 않음
```
public interface RemoteControl { //public abstract 자동 생성
  int MAX_VOLUME = 10; //상수 필드
  int MIN_VOLUME = 0;
  public void turnOn();
  public void turnOff();
  public void setVolume(int volume);

  default void setMute(boolean mute) {
    if(mute) {
      System.out.println("무음 처리합니다");
      setVolume(MIN_VOLUME);
    } else {
        System.out.println("무음 해제합니다");
    }
  }
}
```
디폴트 메소드 재정의
```
public class Audio implements RemoteControl {
    private int memoryVol;
    
    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVol = this.volume;
            System.out.println("무음 처리");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(memoryVol);
        }
    }
}
```

## 인터페이스를 구현하려면 항상 클래스 선언?
### 익명 구현 객체 이용
> 명시적인 구현 클래스 작성은 생략하고 구현 객체를 바로 생성  
> 이름 없는 구현 클래스 선언과 동시에 객체 생성  
> 인터페이스의 추상 메소드들을 모두 재정의  
> 추가적으로 필드와 메소드 선언도 가능(익명 객체 안에서만 사용)  
> 인터페이스 변수로 **접근 불가능**  
> 활용 : UI 프로그래밍에서 이벤트 처리 시, 임시 작업 스레드를 만들기 위해 사용
```
public interface Volume {
    void volume(int level);
    void volume(int level);
}
```
```
public class VolumeControlEx { //실행 클래스
    public static void main(String[] args) {
        Volume vol = new Volume() { //!!!!!!!!!!
            @Override
            public void volumeUp(int level) {
                System.out.println("익명 객체 볼륨을 올립니다 : " + level);
            }
            
            @Override
            public void volumeDown(int level) {
                System.out.println("익명 객체 볼륨을 내립니다 : " + level);
            }
        }; //!!!!!!!!!
    }
}
```

## 다중 인터페이스
### 다중 인터페이스 구현 클래스
```
public class 구현클래스명 implements 인터페이스A, 인터페이스B {
    //인터페이스A에 선언된 추상 메소드의 실체 메소드 선언
    //인터페이스B에 선언된 추상 메소드의 실체 메소드 선언
}
```

## 인터페이스의 다형성
### 다형성
> 하나의 타입에 여러 가지 객체를 대입해서 다양한 결과를 얻는 것  
> 구현 조건  
- 인터페이스 구현  
- 메소드 재정의  
- 자동 타입 변환  

> 다형성의 효과  
- 다양한 실행 결과를 얻을 수 있음  
- 객체를 부품화해서 유지보수가 용이  
