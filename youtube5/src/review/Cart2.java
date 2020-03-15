package review;
class Product2{
	int price;
	int point;
	Product2(int price){
		this.price = price;
		point = (int)(this.price / 10.0);
	}
}
class Tv2 extends Product2{
	Tv2(){
		super(300);
	}
	@Override
	public String toString() {
		return "Tv2";
	}
}
class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}
class Computer2 extends Product2{
	Computer2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Computer2";
	}
}
class Buyer2{
	int money;
	int point;
	
	Product2[] Cart;
	int index = 0;
	
	Buyer2(){
		this(1000,0);
	}
	Buyer2(int money, int point){
		Cart = new Product2[10];
		this.money = money;
		this.point = point;
	}
	
	void buy(Product2 p) {
		if(this.money < p.price) {
			System.out.println("µ∑ æ¯¥Ÿ");
			return;
		}
		if(index >= 10) {
			System.out.println("¿€¿€ ªÁ");
			return;
		}
		
		Cart[index++] = p;
		
		this.money -= p.price;
		this.point += p.point;
		
		System.out.println("¿‹æ◊: " + this.money);
		System.out.println("∆˜¿Œ∆Æ: " + this.point);
		System.out.println("π∞«∞: " + p.toString());
	}
	
	void summary() {
		int totalprice = 0;
		int totalpoint = 0;
		String totallist = "";
		
		for(int i = 0; i < index; i++) {
			totalprice = Cart[i].price;
			totalpoint = Cart[i].point;
			totallist = Cart[i].toString() + " ";
		}
		System.out.println("√— ±›æ◊: " + totalprice);
		System.out.println("√— ∆˜¿Œ∆Æ: " + totalpoint);
		System.out.println("√— π∞«∞ ∏Ò∑œ: " + totallist);
	}
}
public class Cart2 {
	public static void main(String[] args) {
		Tv2 tv2 = new Tv2();
		Audio2 audio2 = new Audio2();
		Computer2 computer2 = new Computer2();
		Buyer2 buyer2 = new Buyer2();
		
		buyer2.buy(audio2);
		
	}
}
