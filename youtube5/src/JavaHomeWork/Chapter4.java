//package JavaHomeWork;
//
//import java.util.Scanner;
//
//public class Chapter4 {
//
//	public static void main(String[] args) {
//		Ex4_1
//		int score = 80;
//		
//		if(score > 60) {
//			System.out.println("합격입니다.");
//		}
//		
//		Ex4_2
//		int x = 0;
//		System.out.printf("x=%d 일 때, 참인 것은%n", x);
//		
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("!x==0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		
//		x = 1;
//		System.out.printf("x=%d 일 때, 참인 것은%n", x);
//		
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("!x==0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//		
//		Ex4_3
//		System.out.print("숫자를 하나 입력하세요>");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		
//		if(input ==0) {
//			System.out.println("입력하신 숫자는 0 입니다");
//		}else {
//			System.out.println("입력하신 숫자는 0이 아닙니다");
//		}
//		
//		Ex4_4
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("점수를 입력하세요>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if(score >= 90) {
//			grade = 'A';
//		}else if(score >= 80) {
//			grade = 'B';
//		}else if(score >= 80) {
//			grade = 'C';
//		}else {
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다");
//		
//		Ex4_5
//		int score = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력하세요>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는 %d 입니다", score);
//		
//		if(score >= 90) {
//			grade = 'A';
//			if(score >= 98) {
//				opt ='+';
//			}else if(score < 94) {
//				opt = '-';
//			}
//		}else if(score >= 90) {
//			grade = 'B';
//			if(score >= 88) {
//				opt ='+';
//			}else if(score < 84) {
//				opt = '-';
//			}
//		}else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다%n", grade,opt);
//		
//		System.out.print("현재 월을 입력하세요>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		
//		switch(month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("현재 계절은 봄입니다");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재 계절은 여름입니다");
//		case 9: case 10: case 11:
//			System.out.println("현재 계절은 가을입니다");
//			break;
//			default:
//				System.out.println("현재 계절은 겨울입니다");
//		}
//		
//		Ex4_7
//		int num = 0;
//		
//		for(int i = 1; i <= 5; i++) {
//			num = (int)(Math.random()*6)+1;
//			System.out.println(num);
//		}
//		
//		Ex4_8
//		for(int i =1; i <= 3; i++) {
//			System.out.println("Hello");
//		}
//		
//		Ex4_9
//		for(int i = 1; i <= 5; i++) 
//			System.out.println(i);
//			
//			for(int i = 1; i <= 5; i++) 
//				System.out.print(i);
//			
//		Ex4_10
//		int sum = 0;
//		
//		for(int i = 1; i <= 5; i++) {
//			sum += i;
//			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
//		}
//		
//		Ex4_11
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		Ex4_12
//		int i = 5;
//		
//		while(i--!=0) {
//			System.out.println(i + " - I can do it");
//		}
//		
//		Ex4_13
//		int sum =0;
//		int i = 0;
//		
//		while(sum <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
//		
//		Ex4_14
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요(예:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /= 10;
//		}
//		System.out.println("각 자리수의 합" + sum);
//		
//		Ex4_15
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random() *100) + 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("1과 100사이의 정수를 입력하세요>");
//			input = scanner.nextInt();
//			
//			if(input > answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요");
//			}else if(input < answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요");
//			}
//		}while(input!=answer);
//		
//		System.out.println("정답입니다");
//		
//		Ex4_16
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			if(sum > 100)
//				break;
//			++i;
//			sum += i;
//		}
//		
//		System.out.println("i= " + i);
//		System.out.println("sum= " + sum);
//		
//		Ex4_17
//		for(int i = 0; i <= 10; i++) {
//			if(i%3 == 0) 
//				continue;
//				System.out.println(i);
//		}
//		
//		Ex4_18
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(3) log");
//			System.out.println("원하는 메뉴(1~3)를 선택하세요(종료:0)");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if(menu==0) {
//				System.out.println("프로그램을 종료하세요");
//				break;
//			}else if(!(1 <= menu && menu <= 3)) { // 1 <= menue <= 3  -> 1~3 아니면 
//				System.out.println("메뉴를 잘못 선택하셨습니다(종료는:0");
//				continue;
//			}
//			System.out.println("선택하신 메뉴는 " + menu + "번입니다");
//		}
//		
//		Ex4_19
//		Loop1 : for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				if(j == 5) 
//					break Loop1;
////					break;
////					continue Loop1;
////					continue;
//					System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println();
//		}
//		
//		Ex4_20
//		int menu = 0, num = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		outer:
//		while(true) {
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(3) log");
//			System.out.print("원하는 메뉴를(1~3)를 선택하세요(종료0)>");
//			
//			String tmp = scanner.nextLine();
//			menu = Integer.parseInt(tmp);
//			
//			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else if(!(1 <= menu && menu <= 3)) { // 1 <= menue <= 3  -> 1~3 아니면 
//				System.out.println("메뉴를 잘못 선택하셨습니다(종료는:0");
//				continue;
//			}
//			
//			for(;;) {
//				System.out.print("계산할 값을 입력하세요(계산 종료:0, 전체 종료:99)>");
//				tmp = scanner.nextLine();
//				num = Integer.parseInt(tmp);
//				
//				if(num==0)
//					break;
//				
//				if(num==99)
//					break outer;
//				
//				switch(menu) {
//				case 1:
//					System.out.println("result= " + num*num);
//					break;
//				case 2:
//					System.out.println("result= " + Math.sqrt(num));
//					break;
//				case 3:
//					System.out.println("result= " + Math.log(num));
//					break;
//				}
//			}
//			
//		}
//		
//		
//		
//	}
//}