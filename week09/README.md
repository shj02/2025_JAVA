## 메소드
> 객체의 동작(기능)  
> 필드를 읽고 수정하는 역할  
> 다른 객체를 생성해서 다양한 기능을 수행  
> 객체 간의 데이터 전달의 수단으로 사용  

### 메소드 이름
> 자바 식별자 규칙에 맞게 작성
- 숫자로 시작하면 안됨
- $와 _를 제외한 특수문자 사용 불가
- 관례적으로 메소드명은 소문자로 작성
- 서로 다른 언어가 혼합된 이름이라면 뒤에 오는 단어의 첫글자는 대문자

### 메소드 리턴 타입
> 메소드를 실행한 후 리턴하는 값의 데이터 타입  
> 메소드는 리턴값이 있을 수도, 없을 수도 있음
```
//메소드 선언
void powerOn() {...} //리턴값이 없음
double divide(int x, int y) {...} //리턴값 double
```
```
//호출
powerOn();
double result = divide(10,20);
```

### 메소드 매개변수
> 매개변수는 메소드를 실행할 때 필요한 데이터를 외부에서 받기 위해 사용  
> 메소드의 매개변수는 있을 수도, 없을 수도 있음
```
void powerOn() {...} //매개변수가 없음
double divide(int x, int y) {...} //매개변수 있음
```
```
//divide
byte b1 = 10;
byte b2 = 20;
double result = divide(b1, b2); // 자동타입 변환
```

### 리턴(return) 문
> 메소드 실행을 중지하고 리턴값을 지정하는 역할  
> 리턴값이 있다면 반드시 return문을 사용하여 리턴값을 지정해야 하며, return 문 뒤에는 실행문이 올 수 없음  
> 리턴값이 없다면 메소드 실행을 강제 종료시키는 역할

### 메소드 호출
> 메소드는 클래스 내부/외부에서 호출에 의해 실행  
> 내부 : 메소드 이름으로 호출  
> 외부 : **객체 생성 후**, **참조 변수**를 이용해서 호출
```
//내부
void run() {...} //메소드 선언
void stop() {...}

void 내부메소드() {
  run(); //호출
  stop();
}

//외부
void 외부메소드() {
  Car car = new Car();
  car.run();
  car.stop();
}
```

### 매개변수의 개수를 모르는 경우
```
int sum1(int[] values) {...}
int[] values = {1,2,3};
int result1 = sum1(values);

int sum2(int ... values) {...}
int result2 = sum2(1,2,3);
```

### 메소드 오버로딩
> 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것  
> 하나의 메소드 이름으로 다양한 매개값을 받기 위함  
> 조건 : 매개변수의 타입, 개수, 순서 중 하나라도 달라야 함
```
int plus(int a, int b) { returen a+b; }

double plus(double a, double b) { return a+b; }
```
```
//int a = 10;  
//double b = 20.3;  
//plus(a, b);

//1. double 타입으로 매개변수 받기 : int는 double로 자동 형변환함
double plus(double a, double b) { return a+b; }

//2. 메소드 오버로딩
double plus(int a, double b) { return a+b; }
double plus(double a, int b) { return a+b; }
```
> 리턴 타입 : 무관  
> 메소드 이름 : 동일  
> 타입 변수 : 매개변수의 타입, 개수, 순서 중 하나라도 달라야 함

---

## 인스턴스 멤버
> 객체(인스턴스)를 **생성한 후 사용**할 수 있는 필드와 메소드 : 인스턴스 필드, 인스턴스 메소드  
> 인스턴스 멤버는 객체에 소속된 멤버이므로 객체 없이 사용 불가
```
public class Car {
  int gas; //필드
}

//메소드
void setSpeed(int speed) { ... }
```
```
Car myCar = new Car();
myCar.gas = 10;
myCar.setSpeed(60);
```

### this
> 객체(인스턴스) 자신의 참조(번지)를 가지고 있는 키워드  
> 객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 사용  
> 매개변수와 필드명이 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용
```
Car(String model) {
  this.model = model;
}
```

## 정적 멤버
> 클래스에 고정된 필드와 메소드 : 정적 필드, 정적 메소드
> 정적 멤버는 클래스에 **소속**된 멤버
> 객체 내부에 존재하지 않고, 메소드 영역에 존재
> 정적 멤버는 객체를 **생성하지 않고 클래스로 바로 접근**해서 사용  
> 클래스 이름과 함께 도트(.) 연산자로 접근
```
public class Calculator {
  static double pi = 3.14;
  static int plus(int x, int y) { ... }
  static int minus(int x, int y) { ... }
```
```
double result1 = 10 * 10 * Calculator.pi;
int result2 = Calculator.plus(10, 5);
int result3 = Calculator.divide(20, 4);
```

## 멤버 선언 기준
### 필드
> 객체마다 가지고 있어야 하는 데이터 => 인스턴스 필드
> 공용으로 사용하는 데이터 => 정적 필드
### 메소드
> 인스턴스 필드로 작업해야 하는 메소드 => 인스턴스 메소드
> 인스턴스 필드로 작업하지 않는 메소드 => 정적 메소드

## final 필드와 상수(final static) 필드
### final 필드
> 객체마다 가지는 불변의 인스턴스 필드  
> 최종적인 값을 갖고 있는 필드 
> 실행 도중에 값을 변경할 수 없는 필드  
> 단 한 번의 초기값만 지정 가능 => 필드 선언 시 초기값 대입, 생성자에게 초기값 대입

## 상수(final static) 필드
> 객체마다 갖고 있지 않음  
> 메소드 영역에 클래스 별로 관리되는 불변의 정적 필드  
> 공용 데이터로 사용  
> 상수 이름은 전부 대문자로 작성
