//package JavaHomeWork;
//
//public class Chapter6 {
//	Ex6_14
//	static {
//		System.out.println("static { }");
//	}
//	
//	{
//		System.out.println("{ }");
//	}
//	
//	public Chapter6() {
//		System.out.println("생성자");
//	}
//	
//	Ex6_15
//	static int[] arr = new int[10];
//	
//	static {
//		for(int i=0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10) + 1;
//		}
//	}
//
//	public static void main(String[] args) {
//		Ex6_1
//		Tv t;
//		t = new Tv();
//		t.channel = 7;
//		t.channelDown();
//		System.out.println("현재 채널은 " + t.channel + "입니다");
//		System.out.println(t.power);
//		
//		Ex6_2
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
//		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
//		
//		t1.channel =7;
//		System.out.println("t1의 채널값을 7로 변경하였습니다");
//		
//		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
//		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
//		
//		Ex6_3
//		System.out.println("Card.width = " + Card.width);
//		System.out.println("Card.height = " + Card.height);
//		
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 4;
//		
//		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
//		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
//		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
//		c1.width = 50;
//		c1.height =  80;
//		
//		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
//		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
//	
//		Ex6_4
//		MyMath mm = new MyMath();
//		long result1 = mm.add(5l, 3l);
//		long result2 = mm.subtract(5l, 3l);
//		long result3 = mm.multiply(5l, 3l);
//		double result4 = mm.divide(5l, 3l);
//				
//		System.out.println("add(5L, 3L) = " + result1);
//		System.out.println("subtract(5L, 3L) = " + result2);
//		System.out.println("multiply(5L, 3L) = " + result3);
//		System.out.println("divide(5L, 3L) = " + result4);
//		
//		Ex6_5
//		System.out.println("Hello");
//		
//		Ex6_6
//		Data d= new Data();
//		d.x = 10;
//		System.out.println("main() : x = " + d.x);
//		
//		change(d.x);
//		System.out.println("After change(d.x)");
//		System.out.println("main() : x = " + d.x);
//	}
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : x = " + x);
//	}
//		
//		Ex6_7
//		Data d2= new Data();
//		d2.x = 10;
//		System.out.println("main() : x = " + d2.x);
//		
//		change(d2);
//		System.out.println("After change(d2)");
//		System.out.println("main() : x = " + d2.x);
//		
//	}
//	static void change(Data d2) {
//		d2.x = 1000;
//		System.out.println("change() : x = " + d2.x);
//	}
//	
//		Ex6_8
//		Data3 d= new Data3();
//		d.x = 10;
//		
//		Data3 d2 = copy(d);
//		System.out.println("d.x =" + d.x);
//		System.out.println("d2.x =" + d2.x);
//		
//		
//	}
//		static Data3 copy(Data3 d) {
//			Data3 tmp = new Data3();
//			tmp.x = d.x;
//			return tmp;
//		}
//
//		Ex6_9
//		System.out.println(MyMath2.add(200l, 100l));
//		System.out.println(MyMath2.subtract(200l, 100l));
//		System.out.println(MyMath2.multiply(200l, 100l));
//		System.out.println(MyMath2.divide(200.0, 100.0));
//		
//		MyMath2 mm = new MyMath2();
//		mm.a = 200L;
//		mm.b = 100L;
//		System.out.println(mm.add());
//		System.out.println(mm.subtract());
//		System.out.println(mm.multiply());
//		System.out.println(mm.divide());
//		
//		Ex6_10
//		MyMath3 mm = new MyMath3();
//		System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3));
//		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
//		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
//		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L, 3L));
//		
//		int[] a = {100, 200, 300};
//		System.out.println("mm.add(a) 결과: " + mm.add(a));
//		
//		Ex6_11
//		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2();
//		
//		Ex6_12
//		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		
//		Car c2 = new Car("white", "auto", 4);
//		
//		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
//		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
//		
//		Ex6_13
//		Car2 c1 = new Car2();
//		Car2 c2 = new Car2("blue");
//		
//		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
//		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
//	
//		Ex6_14
//		System.out.println("Chapter6 bt = new Chapter6(); ");
//		Chapter6 bt = new Chapter6();
//		
//		System.out.println("Chapter6 bt2 = new Chapter6(); ");
//		Chapter6 bt2 = new Chapter6();
//		
//		Ex6_15
//		for(int i = 0; i < arr.length; i++)
//			System.out.println("arr[" + i + "] :" + arr[i]);
//		
//	}
//}
//Ex6_1, 2
//class Tv{
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {power = !power;}
//	void channelUp() {++channel;}
//	void channelDown(){--channel;}
//}
//
//Ex6_3
//class Card{
//	String kind;
//	int number;
//	static int width;
//	static int height;
//}
//
//Ex6_4
//class MyMath{
//	long add(long a, long b) {
//		long result = a + b;
//		return result;
//	}
//	long subtract(long a, long b) {return a - b;}
//	long multiply(long a, long b) {return a * b;}
//	double divide(double a, double b) {return a / b;}
//}
//
//Ex6_6, 7, 8
//class Data3{int x;}
//
//Ex6_9
//class MyMath2{
//	long a, b;
//	
//	long add() {return a + b;}
//	long subtract() {return a - b;}
//	long multiply() {return a * b;}
//	double divide() {return a / b;}
//	
//	static long add(long a, long b) {return a + b;}
//	static long subtract(long a, long b) {return a - b;}
//	static long multiply(long a, long b) {return a * b;}
//	static double divide(double a, double b) {return a / b;}
//}
//
//Ex6_10
//class MyMath3{
//	int add(int a, int b) {
//		System.out.print("int add(int a, int b) -");
//		return a+b;
//	}
//	
//	long add(int a, long b) {
//		System.out.print("int add(int a, long b) -");
//		return a+b;
//	}
//	
//	long add(long a, int b) {
//		System.out.print("int add(long a, int b) -");
//		return a+b;
//	}
//	
//	long add(long a, long b) {
//		System.out.print("int add(long a, long b) -");
//		return a+b;
//	}
//	
//	int add(int[] a) {
//		System.out.print("int add(int[] a) - ");
//		int result = 0;
//		for(int i=0; i < a.length; i ++)
//			result += a[i];
//		return result;
//	}
//}
//
//Ex6_11
//class Data_1{
//	int value;
//}
//class Data_2{
//	int value;
//	
//	Data_2(int x){
//		value = x;
//	}
//}
//Ex6_12
//class Car{
//	String color;
//	String gearType;
//	int door;
//	
//	Car(){}
//	
//	Car(String c, String g, int d){
//		color = c;
//		gearType = g;
//		door = d;
//	}
//}
//
//Ex6_13
//class Car2{
//	String color;
//	String gearType;
//	int door;
//	
//	Car2(){
//		this("white", "auto", 4);
//	}
//	
//	Car2(String color){
//		this(color, "auto", 4);
//	}
//	
//	Car2(String c, String g, int d){
//		color = c;
//		gearType = g;
//		door = d;
//	}
//}