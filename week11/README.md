# 타입변환과 다형성(Polymorphism)
### 다형성
> 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
> 효과 : 객체 부품화 가능

### 다형성의 조건 
> 상속
> 메서드 정의
> 자동 타입 변환

### 자동 타입 변환(Promotion)
> 프로그램 실행 도중에 자동으로 타입 변환이 일어나는 것
> 상속에 의한 자동 타입 변환
> 부모 클래스 변수 = 자식 클래스 타입;
```
// Animal : 부모 클래스
// Cat : 자식 클래스
Cat cat = new Cat();
Animal animal = cat;
// Animal animal = new Cat(); 도 가능

cat == animal // true
```
> 바로 위의 부모가 아니더라도 **상속 계층의 상위**이면 자동 타입 변환이 가능
> 변환 후에는 부모 클래스 멤버만 접근 가능
<p align="center"><img src="https://github.com/user-attachments/assets/d57306ab-e04f-47d4-af94-26b6b34207d1"></p>  

```
B b = new B();
C c = new C();
D d = new D();
E e = new E();
```
```
A a1 = b;
A a2 = c;
A a3 = d;
A a4 = e;

B b1 = d;
C c1 = e;

B b2 = e; //불가능
C c2 = d; //불가능
```
예제
```
//Parent 클래스
public class Parent {
    public void method1() {
        System.out.println("Parent-method1");
    }
    
    public void method2() {
        System.out.println("Parent-method2");
    }
}
```
```
//Child 클래스
public class Child extends Parent {
    @Override
    public void method2() {
        System.out.println("Child-method1");
    }
    
    public void method3() {
        System.out.println("Child-method3");
    }
}
```
```
//ChildEx (실행) 클래스
public class ChildEx {
    Child child = new Child();
    
    Parent parent = new Parent();
    
    parent.method1(); //Parent-method1
    parent.method2(); //Child-method2
    //parent.method3(); 실행 안됨 : 자식 객체가 부모 객체로 자동 타입 변환되면 자식 객체에만 정의된 메소드는 호출할 수 없음!!
}
```

### 강제 타입 변환(Casting)
> 부모 타입을 자식 타입으로 변환하는 것  
> 조건 : **자식 타입을 부모 타입으로 자동 변환 후**, 다시 자식 타입으로 변환할 때  
> 자식 클래스 변수 = (자식 클래스) 부모 클래스 타입;

### 강제 타입 변환이 필요한 경우
> 자식 타입이 부모 타입으로 자동 변환되면, 부모 타입에 선언된 필드와 메소드만 사용 가능 : 위 예제의 method3를 호출할 수 없는 경우  
> 자식 타입에 추가로 선언된 필드와 메소드를 다시 사용해야 할 경우

### 객체 타입 확인(instanceof)
> 부모 타입이 모두 자식 타입으로 강제 타입 변환할 수 있는 것이 아님
> ClassCastException 예외 발생 가능
```
Parent parent = new Parent();
Child child = (Child)parent; // 강제 타입 변환 불가능
```
> 먼저 자식 타입인지 확인 후 강제 타입 변환을 실행해야 함
> boolean result = 좌항(객체) instanceof 우항(타입)
```
public void method(Parent parent) { //매개변수로 Parent 객체가 들어옴
  if(parent instanceof Child) {
    Child child = (Child)parent;
  }
}
```
