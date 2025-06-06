# 제네릭과 컬렉션 프레임워크
## 제네릭
### 제네릭이란?
> 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때 파라미터를 구체적인 타입으로 **대체**시키는 기능  
> 컬렉션, 람다식, 스트림 등에서 널리 사용

### 제네릭 타입
> 타입을 파라미터로 가지는 클래스와 인터페이스  
> 선언 시 클래스 또는 인터페이스 이름 위에 <> 부호를 붙임  
> <> 사이에는 타입 파라미터가 위치  

> 타입 파라미터  
> : 일반적으로 대문자 알파벳 한 문자로 표현  
> 개발 코드에서는 타입 파라미터 자리에 구체적인 타입을 지정해야 함  
```java
public class Box<T> {
  private T t;
  public T get() { return t; }
  public void set(T t) { this.t = t; }
}
```

### 제네릭 타입 사용 여부에 따른 비교
> 데이터를 입력 받아 출력하는 메소드  
> 데이터 타입이 다르면 => 메소드 오버로딩

제네릭 타입 사용
```java
public class PrintClass2<T> {
	//처리 내용은 동일하고, 데이터 타입만 다른 경우
	//제네릭 타입을 사용
	public void printVal(T value) {
		System.out.println("value = " + value);
	}
}
```
```java
public class PrintClass2Ex {
	public static void main(String[] args) {
		//제네릭 타입을 포함한 객체 생성
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printVal(100);
//		pc2.printVal("홍길동");
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printVal("홍길동");
		
		PrintClass2<Boolean> pc4 = new PrintClass2<Boolean>();
		pc4.printVal(true);
	}
}
```

> 제네릭 타입을 사용하지 않은 경우  
> Object 타입 사용 => 빈번한 타입 변환 발생 => 프로그램 성능 저하  
```java
public class Box {
  private Object object;
  public Object get() { return object; }
  public void set(Object object) { this.object = object; }
}
```
```java
Box box = new Box();
box.set("hello");
String str = (String)box.get();
```

> 제네릭 타입을 사용한 경우  
> 클래스 선언할 때 타입 파라미터(클래스, 인터페이스)(Byte, Integer, Character, Float, Double, Boolean) 사용  
> 컴파일 시 타입 파라미터가 구체적인 클래스로 변경  
> 실행문에서 객체 생성(컴파일 시 자동으로 변경)  

## 컬렉션 프레임워크
### 컬렉션 프레임워크란?  
> 컬렉션 : 사전적 의미로 요소(객체)를 수집해 저장하는 것  
> 배열의 경우 : 저장할 수 있는 객체 수가 배열을 생성할 때 결정(불특정 다수의 객체를 저장하기엔 부적합)  
> 객체를 삭제한 경우 해당 인덱스가 비게 됨  

> 컬렉션 프레임워크  
> : 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리  
> java.util 패키지에 포함  
> 인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스 이용이 가능

### 컬렉션 프레임워크의 주요 인터페이스
<img src="https://github.com/user-attachments/assets/06a0b10e-bd7f-43e3-beaf-8fc5dc48853b">

---

## List 컬렉션
### 특징
> 인덱스로 관리  
> 중복해서 객체 저장 가능  

### 구현 클래스
> ArrayList, Vector, LinkedList  

> 주요 메소드
<img src="https://github.com/user-attachments/assets/d3814557-7633-450e-97c7-fb9ee269b484">

## ArrayList
### 저장용량
> 저장 용량을 초과한 객체들이 들어오면 자동적으로 늘어남   
> 고정도 가능  
> 객체 제거: 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐  

## Vector
### ArrayList와 동일한 내부 구조를 가짐
### 동기화(Synchronization)된 메소드로 구성
> 복수의 스레드가 동시에 Vector에 접근할 수 없음  
> 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 가능  

## LinkedList
### 인접 참조를 링크해서 체인처럼 관리
> 특정 인덱스에서 객체를 추가하거나 제거하면 바로 앞뒤 링크만 변경    
> 빈번한 객체 삽입과 삭제가 일어나는 곳에서는 ArrayList보다 좋은 성능을 나타냄

---

## Set 컬렉션
### 특징
> 수학의 집합에 비유  
> 저장 순서가 유지되지 않음  
> 객체를 중복 저장 불가  
> 하나의 null만 저장 가능  

### 구현 클래스
> HashSet, LinkedHashSet, TreeSet

### 주요 메소드
<img src="https://github.com/user-attachments/assets/4a7f2abb-cb31-4ec4-836e-52decac2b9c3">  

> 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator) 제공  
> 인덱스로 객체를 검색해서 가져오는 메소드 없음
```java
Iterator<String> iter = set.iterator();
while(iter.hasNext()) {
  System.out.println(iter.next());
}
```

---

## Map 컬렉션
### 특징
> 키(key)와 값(value)으로 구성된 Map.Entry 객체를 저장하는 구조    
> 키와 값은 모두 객체(클래스타입)  
> 키는 중복될 수 없지만, 값은 중복 저장 가능  

### 구현 클래스
> HashMap, Hashtable, TreeMap, Properties, LinkedHashMap

### 주요 메서드
![image](https://github.com/user-attachments/assets/24ffd0e7-b3bf-4c3a-aeba-085741768cd5)
