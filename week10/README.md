[A. 패키지](#a-패키지)  
[B. 상속](#b-상속)  
[C. 메소드 재정의(Override)](#c-메소드-재정의(override))  
[D. protected 접근 제한자](#d-protected-접근-제한자)


# A. 패키지
## 패키지
### 패키지
> 클래스를 기능별로 묶어서 그룹 이름을 붙여 놓은 것
- 파일들을 관리하기 위해 사용하는 폴더(디렉터리)와 비슷한 개념
- 패키지의 물리적인 형태는 파일 시스템의 폴더와 유사

> 클래스 이름의 일부
- 클래스를 유일하게 만들어주는 식별자  
- 전체 클래스 이름 = 상위패키지.하위패키지.클래스명  
- 클래스명이 같아도 패키지명이 다르면 다른 클래스로 취급

> 클래스를 선언할 때 패키지 결정
- 클래스 선언 시 포함될 패키지 선언  
- 클래스 파일(.class)은 선언된 패키지와 동일한 폴더 안에서만 동작  
- 클래스 파일은 다른 폴더 안에 넣으면 동작하지 않음  

### import 문
> 다른 패키지에 있는 클래스를 사용해야 하는 경우 :
> 패키지 명이 포함된 전체 클래스 이름으로 사용  

> 주의 사항
- import문이 작성되는 위치는 **패키지 선언과 클래스 선언 사이**
- 패키지에 포함된 다수의 클래스를 사용해야 하는 경우 : * 사용
- import 문으로 지정된 패키지의 하위 패키지는 import 대상이 아님
아래 두 importy 문은 서로 다름(project는 하위 패키지임)
```
import com.mycompany.*;
import com.mycompany.project.*;
```
- 서로 다른 패키지에 동일한 이름의 클래스가 있는 경우 : 패키지 이름 전체 기술

## 접근 제한자
### 접근 제한자
> 클래스 및 클래스의 구성 멤버에 대한 접근을 제한하는 역할
- 클래스 제한 : 다른 패키지에서 클래스를 사용하지 못하도록 함
- 생성자 제한 : 클래스로부터 객체를 생성하지 못하도록 함
- 필드와 메소드 제한 : 특정 필드와 메소드를 숨김 처리함

> 접근 제한자 종류

| 접근 제한 | 적용 대상 | 접근할 수 없는 클래스 |  
| --- | --- | --- |
| public | 클래스, 필드, 생성자, 메소드 | 없음 |  
| protected | 필드, 생성자, 메소드 | 자식 클래스가 아닌 다른 패키지에 소속된 클래스 |  
| default | 클래스, 필드, 생성자, 메소드 | 다른 패키지에 소속된 클래스 |  
| private | 필드, 생성자, 메소드 | 모든 외부 클래스 |  

### 클래스의 접근 제한
> public : 다른 개발자가 사용할 수 있도록 라이브러리 클래스로 만들 때 유용  
> default : 클래스를 선언할 때 public을 생략한 경우, **다른 패키지에서는 사용 불가**

### 생성자의 접근 제한
> 생성자가 가지는 접근 제한에 따라 호출 여부가 결정됨  
- public : **모든 패키지**에서 생성자 호출 가능  
- default : **같은 패키지**에서만 생성자 호출 가능  
- private : **클래스 내부에서만**에서만 생성자 호출 가능

### 필드와 메소드의 접근 제한
> 클래스 내부, 패키지 내, 패키지 상호 간에 사용할 지 고려해서 선언
- public : **모든 패키지**에서 필드 접근과 메소드 호출 가능  
- default : **같은 패키지**에서만 필드 접근과 메소드 호출 가능  
- private : **클래스 내부에서만**에서만 필드 접근과 메소드 호출 가능

## Getter와 Setter
> 객체지향 프로그래밍에서는 외부에서 직접적인 필드 접근을 막고 대신 **메소드**를 통해 접근함  
> 클래스 선언 시 **필드**는 일반적으로 **private 접근 제한**
- Getter의 필요성 : 읽기 전용 필드가 있을 수 있음  
- Setter의 필요성 : 외부에서 엉뚱한 값으로 변경할 수 없도록 함  
> Getter : private 필드의 값을 **리턴**하는 역할  
> Setter : 외부에서 주어진 값을 **필드 값으로 수정**(필요할 경우 유효성 검사)
```
public class CarBasic {
  private String company;
  private String model;
  private String color;
  pricate int maxSpeed;

  public String getCompany {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
```

---

# B. 상속
## 상속
### 상속
> 자식(하위, 파생) 클래스가 부모(상위) 클래스의 멤버(필드, 메서드, 생성자, 중첩 클래스)를 물려받는 것  
> 자식이 부모를 선택해서 물려받음  
> 상속 대상 : 부모의 필드와 메소드

### 상속의 활용
> 상속의 효과
- 부모 클래스를 재사용해서 자식 클래스를 빨리 개발 가능  
- 반복된 코드 중복을 줄임  
- 유지 보수 편리성 제공  
- 객체 다형성 구현이 가능

> 상속 대상 제한
- 부모 클래스의 private 접근을 갖는 필드와 메소드는 제외
- 부모 클래스가 다른 패키지에 있을 경우(default 접근을 갖는 필드와 메소드도 제외)

### extends 키워드
> 자식 클래스가 상속할 부모 클래스를 지정하는 키워드
> 자바는 **단일 상속**으로, 부모 클래스 나열 불가
```
public class A { ... }
```
```
public class B extends A { ... }
```

## 부모 생성자 호출
### 자식 객체와 부모 객체
> 자식 객체를 생성할 때는 **부모 객체부터 생성**하고 자식 객체를 생성  
> 부모 생성자 호출 완료 후 자식 생성자 호출 완료

### 명시적인 부모 생성자 호출(super)
> 부모 객체 생성할 때, 부모 생성자를 선택해서 호출
```
자식클래스(매개변수 선언, ...) {
  super(매개값); //부모의 기본 생성자를 호출
  ...
}
```
> super(매개값, ...) : 매개값과 동일한 타입, 개수, 순서에 맞는 부모 생성자를 호출  
> 부모 생성자가 없다면 컴파일 오류 발생  
> 반드시 자식 생성자의 첫 줄에 기술  
> 부모 클래스에 기본 생성자가 없다면 반드시 작성
```
public SmartPhone(String model, String color) {
  super(model, color);
}
```

---

# C. 메소드 재정의(Override)
## 메소드 재정의(@Override)
### 부모 클래스의 메소드를 자식 클래스에서 상속하여 재정의하는 것

### 메소드 재정의 조건
> 부모 클래스의 메소드와 동일한 모양을 가져야 함 : 리턴 타입, 메소드 이름, 매개변수 리스트  
> 접근 제한을 더 강하게 오버라이딩 불가 : public -> default, private (x), 반대로 default -> public은 가능

### @Override 어노테이션
> 컴파일러에게 부모 클래스의 메소드 선언부와 동일한지 검사 지시
> 정확한 메소드 재정의를 위해 붙여줌

### 메소드 재정의 효과
> 부모 메소드는 숨겨지는 효과
> 재정의된 자식 클래스의 메소드가 실행됨

### 부모 메소드 호출(super 이용)
> 메소드 재정의는 부모 메소드를 숨기는 효과  
> 자식 클래스에서는 재정의된 메소드만 호출됨  
> 자식 클래스에서 부모 메소드를 호출하려면 super를 이용(super는 부모 객체를 참조(this는 자식 객체 참조))
```
class Parent {
  void method1() {...}
  void method2() {...}
}
```
```
class Child extends Parent {
  void method2() {...} //Overriding
  void method3() {
    method2(); //재정의된 메소드 호출
    super.method2(); //부모 메소드 호출
}
```

---

# D. protected 접근 제한자
## protected 접근 제한자
### 상속과 관련된 접근 제한자
> 같은 패키지 : default와 동일(같은 패키지만 가능)  
> 다른 패키지 : **자식 클래스**만 접근 허용
