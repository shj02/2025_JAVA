package week7;

public class PetEx {
	public static void main(String[] args) {
		//객체 생성
		Pet myPet = new Pet("바둑이", "강아지", 3);
		
		//필드값 출력
		System.out.println("<애완동물 정보>");
		System.out.println("이름 : "+myPet.name);
		System.out.println("종류 : "+myPet.type);
		System.out.println("나이 : "+myPet.age+ "살");
		
		//생성자 오버로딩을 이용해서 객체 초기화
		Pet pet1 = new Pet("초코", "고양이");
		Pet pet2 = new Pet("구름이", "강아지", 2, "흰색");
		
		System.out.println("<애완동물 정보>");
		System.out.println("이름 : "+pet1.name);
		System.out.println("종류 : "+pet1.type);
		System.out.println("나이 : "+pet1.age+ "살");
		System.out.println("색 : " +pet1.color);
		
	}
}
