package JavaHomeWork;

//Ex7_1
//class Tv{
//boolean power;
//int channel;
//
//void power() {power = !power;}
//void channelUp() {++channel;}
//void channelDown() {--channel;}
//}
//
//class CaptionTv extends Tv{
//	boolean caption;
//	void displayCaption(String text) {
//		if(caption) {
//			System.out.println(text);
//		}
//	}
//}
//
//Ex7_2
//class Parent{int x = 10;}
//class Child extends Parent{
//	int x = 20; //this.x
//	
//	void method() {
//		System.out.println("x=" + x);
//		System.out.println("this.x=" + this.x);
//		System.out.println("uper.x=" + super.x);
//	}
//}
//
//Ex7_3
//class Parent2{int x = 10;}
//
//class Child2 extends Parent2{
//	int x = 10; //super.x와 this.x 둘 다 가능
//	void method() {
//		System.out.println("x=" + x);
//		System.out.println("this.x=" + this.x);
//		System.out.println("uper.x=" + super.x);
//	}
//}
//
//Ex7_4
//class Point{
//	int x, y;
//	
//	Point(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//}
//
//class Point3D extends Point{
//	int z;
//	
//	Point3D(int x, int y, int z){
//		super(x, y);
//		this.z = z;
//	}
//}
//
//Ex7_5
//package com.codechobo.book;
//
//Ex7_6
//import static java.lang.Math.*;
//import static java.lang.System.out;
//
//Ex7_7
class Car{
	String color;
	int door;
	
	void drive(){  //운전하는 기능
		System.out.println("drive, Brrr~");
	}
	void stop() { //멈추는 기능
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}

public class Chapter7 {
	public static void main(String[] args) {
//		Ex7_1
//		CaptionTv ctv = new CaptionTv();
//		ctv.channel = 10;
//		ctv.channelUp();
//		System.out.println(ctv.channel);
//		ctv.displayCaption("Hello, World");
//		ctv.caption = true;
//		ctv.displayCaption("Hello, World");
//
//		Ex7_2
//		Child c = new Child();
//		c.method();
//
//		Ex7_3
//		Child2 c = new Child2();
//		c.method();
//		
//		Ex7_4
//		Point3D p = new Point3D(1, 2, 3);
//		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
//		
//		Ex7_5
//		System.out.println("Hello World!");
//		
//		Ex7_6
//		out.println(random());
//		out.println("Math.PI:" + PI);
//		
//		Ex7_7
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
	}

}
