package review;
//���� : ���θ� ���弼��
//1. ���δ� �Ź��̴� <���>
//2. �Ź��� ������ ������ �ִ� (������ leather)
//3. ���δ� ����, ����� ������ �ִ� <����> (����)
//4. ���δ� ���� ������ �ִ� (Ư����) heel
//���� default ������ 4�� ������
//����, �������� default�� ���� white, 230 ������ �ִ�..
//�⺻���� �������� ������ ���� ����, �������� ���� �Է¹��� �� �ִ�

class Shoes2 {
	String texture = "leather";
}

class Common {
	String color;
	int size;

	Common() {
		this("white", 230);
	}

	Common(String color, int size) {
		this.color = color;
		this.size = size;
	}
}

class DressShoes extends Shoes2 {
	Common common; // common Ÿ���� common ����
	int heel;
	DressShoes() {
		this(4, new Common("white", 230));
	}

	DressShoes(int heel, Common common) {
		this.heel = heel;
		this.common = common;
	}

	public void print() {
		System.out.printf("����[%s], ����[%s], ������[%d], ��[%d]\n", texture, common.color, common.size, heel);
	}
}

public class Shoes {

	public static void main(String[] args) {

		DressShoes ds3 = new DressShoes();
		ds3.print();

		DressShoes ds4 = new DressShoes(10, new Common("red", 260));
		ds4.print();
	}
}
