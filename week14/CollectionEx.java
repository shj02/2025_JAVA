package week14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

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
		
		List<String> vector = new Vector<String>();
		vector.add("홍길동");
		vector.add("이순신");
		vector.add("강감찬");
		
		System.out.println();
		for(String s : vector) {
			System.out.println(s);
		}
		
		System.out.println();
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("apple");
		linkedList.add("melon");
		linkedList.add("banana");
		linkedList.add("apple");
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		System.out.println();
		linkedList.remove("apple");
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		//Set : 인덱스 없음
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("kiwi");
		set.add("tomato");
		set.add("apple");
		set.add("melon");
		
		System.out.println();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		//Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("name" , "홍길동");
		map.put("nickname", "홍길동");
		map.put("name", "이순신"); //key가 같음 -> 이거로 나옴
		map.put("gender", "남자");
		map.put("id", "admin");
		//map.put("age", 25);
		map.put("age", "25");
		map.put("password", "1234");
		
		System.out.println();
		
		//map에 저장된 키만 가져오기 : keySet()
		Set<String> key = map.keySet();
		for(String s : key) {
			System.out.println(s + " = " + map.get(s));
		}
	}
}
