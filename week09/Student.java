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
