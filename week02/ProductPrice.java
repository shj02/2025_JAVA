package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int cnt = 7;
		int tPrice = 5700;
		
		//상품 단가 구하기 = 총 금액 / 개수
		// int/int => int
		double aPrice = (double)tPrice / cnt;
		
		System.out.printf("구매 수량 : %d개\n", cnt);
		System.out.printf("총 구매 금액 : %d원\n", tPrice);
		System.out.printf("상품 단가 : %.1f원", aPrice);
	}
}
