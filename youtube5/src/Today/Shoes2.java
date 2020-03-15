package Today;
//문제 : 구두를 만드세요
//1. 구두는 신발이다 <상속>
//2. 신발은 재질을 가지고 있다 (재질은 leather)
//3. 구두는 색상, 사이즈를 가지고 있다 <포함> (공통)
//4. 구두는 굽을 가지고 있다 (특수성) heel
//굽의 default 값으로 4를 가진다
//색상, 사이즈은 default로 각각 white, 230 가지고 있다..
//기본값을 설정하지 않으면 굽과 색상, 사이즈의 값을 입력받을 수 있다

class Shoes{
	String texture;
	Shoes(){
		texture = "leather";
	}
}

class Common{
	String color;
	int size;
	
	Common(){
		this("white", 230);
	}
	
	Common(String color, int size){
		this.color = color;
		this.size = size;
	}
}

class DressShoes extends Shoes{
	Common common;
	int heel;
	
	DressShoes(){
		this(4, new Common("white", 230));
	}
	
	DressShoes(int heel, Common common){
		this.heel = heel;
		this.common = common;
	}
	public void print() {
		System.out.printf("재질[%s], 색상[%s], 사이즈[%d], 굽[%d]\n", texture, common.color, common.size, heel);
	}
}


public class Shoes2 {

	public static void main(String[] args) {
		

	}

}
