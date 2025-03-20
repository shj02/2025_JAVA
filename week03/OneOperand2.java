package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		//단항 연산자 중 증감 연산자 : ++, --
		int x = 10;
		int y = 20;
		int z;
		
		//++연산자 : 피연산자의 기존 값에 1을 더해줌
		//++ 기호가 왼쪽(앞)에 있는 경우 : 먼저 1을 더해주고 명령문을 실행
		System.out.println("++x = " + (++x)); //11
		
		//++기호가 오른쪽(뒤)에 있는 경우 : 명령문을 먼저 실행하고 다음으로 넘어갈 때 증가함
		System.out.println("x++ = " + (x++)); //11(위에서 11이 됐음)
		System.out.println("x = " + x);//12
		
		//--연산자 : 피연산자의 기존 값에 1을 빼줌
		
		z= x++;
		System.out.println("z = " + z);//12
		System.out.println("x = " + x);//13
		
		z = ++x + y--;
		System.out.println("z = " + z);//14 + 20 = 34
		System.out.println("x = " + x);//14
		System.out.println("y = " + y);//19
	}

}
