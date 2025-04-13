[Switch]
switch(grade) {
		case 'A': case 'a':
			System.out.println("A 등급");
			break;
   ...
}

switch(grade) {
case 'A', 'a' -> {
			System.out.println("A등급");
			System.out.println("우수 회원");
		}
  ...
}

switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원");
		case 'B', 'b' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}

switch(grade) {
		case "A":
			score1 = 100;
			break;
   ...
}

int score2 = switch(grade) {
			case "A" -> 100;
   ...
}

[Scanner]
- Scanner + ctrl spacebar -> import 생성 -> Scanner sc = new Scanner(System.in);
- sc.nextInt(), sc.next(), ...

[random]
- Math.random() : 0~0.9까지 랜덤 수 생성 
