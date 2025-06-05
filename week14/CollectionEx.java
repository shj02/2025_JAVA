package week14;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
	public static void main(String[] args) {
		//ArrayList, Vector, LinkedList
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("OOP");
		list.add("객체 지향 프로그래밍");
		
		System.out.println("리스트의 총 개수 = " + list.size());
		
		String item = list.get(2);
		System.out.println("리스트 2번 인덱스 값 = " + item);
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " " + list.get(i));
		}
		
		System.out.println();
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " " + list.get(i));
		}
	}
}
