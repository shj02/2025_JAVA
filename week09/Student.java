package week8;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		int sum = 0;
		sum = kor + eng + math;
		return sum;
	}
	
	double getAvg() {
		return (double)(kor + eng + math)/3;
	}
}

//StudentEx.java
package week8;

public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 90, 85, 100);
		
		System.out.print(s1.name + " : ");
		System.out.printf("총점 %d점, ", s1.getTotal());
		System.out.printf("평균 %.1f점", s1.getAvg());
	}
}
