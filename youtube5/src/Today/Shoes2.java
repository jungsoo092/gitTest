package Today;
//���� : ���θ� ���弼��
//1. ���δ� �Ź��̴� <���>
//2. �Ź��� ������ ������ �ִ� (������ leather)
//3. ���δ� ����, ����� ������ �ִ� <����> (����)
//4. ���δ� ���� ������ �ִ� (Ư����) heel
//���� default ������ 4�� ������
//����, �������� default�� ���� white, 230 ������ �ִ�..
//�⺻���� �������� ������ ���� ����, �������� ���� �Է¹��� �� �ִ�

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
		System.out.printf("����[%s], ����[%s], ������[%d], ��[%d]\n", texture, common.color, common.size, heel);
	}
}


public class Shoes2 {

	public static void main(String[] args) {
		

	}

}
