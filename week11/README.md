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

```
B b = new B();
C c = new C();
D d = new D();
E e = new E();
```
```
A a1
