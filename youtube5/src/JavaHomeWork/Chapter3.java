//package JavaHomeWork;
//
//public class Chapter3 {
//
//	public static void main(String[] args) {
//
//		Ex3_1
//		int x,y;
//		
//		x = y = 3;
//		System.out.println("x= " + x);
//		System.out.println("y= " + y);
//		
//		Ex3_2
//		int i = 5, j = 0;
//		
//		j = i++;
//		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
//		
//		i = 5;
//		j = 0;
//		
//		j = ++i;
//		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
//		
//		Ex3_3
//		int i = 5, j = 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println("i =  " + i + ", j = " + j);
//		
//		Ex3_4
//		int i = -10;
//		i = +i;
//		System.out.println(i);
//		
//		i = -10;
//		i = -i;
//		System.out.println(i);
//		
//		Ex3_5
//		double d = 85.4;
//		int score = (int) d;
//		System.out.println("score = " + score);
//		System.out.println("d=" + d);
//		
//		Ex3_6
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d%n", a,b, a+b);
//		System.out.printf("%d - %d = %d%n", a,b, a-b);
//		System.out.printf("%d * %d = %d%n", a,b, a*b);
//		System.out.printf("%d / %d = %d%n", a,b, a/b);
//		System.out.printf("%d / %f = %f%n", a,(float)b, a/(float)b);
//		
//		Ex3_7
//		System.out.println(5/2);
//		System.out.println(5/(float)2);
//
//		Ex3_8
//		byte a = 10;
//		byte b = 30;
//		byte c = (byte)(a * b);
//		System.out.println(c);
//		
//		Ex3_9
//		int a = 1_000_000;
//		int b = 2_000_000;
//		
//		long c = a * b;
//		
//		System.out.println(c);
//
//		Ex3_10
//		long a = 1_000_000 * 1_000_000;
//		long b = 1_000_000 * 1_000_000l;
//		
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		
//		Ex3_11
//		double pi = 3.141592;
//		double shortPi = Math.random(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
//		
//		Ex3_12
//		int x = 10; 
//		int y = 8;
//		
//		System.out.printf("%d을 %d로 나누면 , %n", x, y);
//		System.out.printf("몫은 %d이고, 나머지는 %d입니다 %n", x / y, x% y);
//		
//		Ex3_13
//		System.out.println(-10%8);
//		System.out.println(10%-8);
//		System.out.println(-10%-8);
//		
//		Ex3_14
//		String str1 = "abc";
//		String str2 = new String("abc");
//		
//		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
//		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
//		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
//		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
//		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("abc"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
//		
//		Ex3_15
//		Scanner scanner = new Scanner(System.in);
//		char ch =' ';
//		
//		System.out.println("문자를 하나 입력하세요>");
//		
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		
//		if('0' <= ch && ch <= '9') {
//			System.out.printf("입력하신 문자는 숫자입니다%n");
//		}
//		
//		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
//			System.out.printf("입력하신 문자는 영문자입니다%n");
//		}
//		
//		Ex3_16
//		boolean b = true;
//		char ch = 'C';
//		
//		System.out.printf("b=%b%n", b);
//		System.out.printf("!b=%b%n", !b);
//		System.out.printf("!!b=%b%n", !!b);
//		System.out.printf("!!!b=%b%n", !!!b);
//		System.out.println();
//		
//		System.out.printf("ch=%c%n", ch);
//		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
//		System.out.printf("!(ch => 'a' && ch <= 'z') = %b%n", !(ch >= 'a' && ch <= 'z'));
//		System.out.printf(" (ch => 'a' && ch <= 'z') = %b%n", ch >= 'a' && ch <= 'z');
//		
//		Ex3_17
//		int x, y, z;
//		int absX, absY = 0, absZ = 0;
//		char signX, signY, signZ;
//		
//		x = 10;
//		y = -5;
//		z = 0;
//		
//		absX = x >= 0 ? x : -x;
//		absX = y >= 0 ? y : -y;
//		absX = y >= 0 ? z : -z;
//		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
//		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
//		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
//		
//		System.out.printf("x=%c%d%n", signX, absX);
//		System.out.printf("x=%c%d%n", signY, absY);
//		System.out.printf("x=%c%d%n", signZ, absZ);
//	}
//
//}