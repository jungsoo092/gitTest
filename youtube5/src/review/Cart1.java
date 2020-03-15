package review;

class Product{
	int price;
	int point;
	
	Product(int price){
		this.price = price;
		point = (int)(this.price / 10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(400);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class Audio extends Product{
	Audio(){
		super(200);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	
	int money;
	int point;
	
	Product[] Cart;
	int index = 0;
	
	Buyer(){
		this(1000,0);
	}
	Buyer(int money, int point){
		Cart = new Product[10];
		this.money = money;
		this.point = point;
	}
	void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("µ· ¾ø´Ù...");
			return;
		}
		if(index >= 10) {
			System.out.println("¿å½ÉÀ» ¹ö·Á...");
			return;
		}
		
		Cart[index++] = p;
		
		this.money -= p.price;
		this.point += p.point;
		
		System.out.println("ÀÜ¾×: " + this.money);
		System.out.println("Æ÷ÀÎÆ®: "+ this.point);
		System.out.println("¹°Ç°: " + p.toString());
	}
	
	void summary() {
		int totalprice = 0;
		int totalpoint = 0;
		String totallist = "";
		
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price;
			totalpoint += Cart[i].point;
			totallist += Cart[i].toString() + " ";
		}
		System.out.println("ÃÑ±Ý¾×: " + totalprice);
		System.out.println("ÃÑ Æ÷ÀÎÆ®: " + totalpoint);
		System.out.println("ÃÑ ¸ñ·Ï: " + totallist);
	}

}

public class Cart1 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		Computer computer = new Computer();
		Buyer buyer = new Buyer();
		
		buyer.buy(computer);
		buyer.buy(computer);
		buyer.summary();
	}

}
