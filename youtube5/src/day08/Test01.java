
package day08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		/*
		 * 
		 * <1>���﷣�嵿������������ϴ�. �����������5���̸�������, 5 -11������2500��12
		 * 
		 * ���ʹ�5000���Դϴ�.ȭ�鿡�����̸��Է¹޾ƿ��������Ͽ�����ϴ� ���α׷����ۼ��Ͻÿ���¿���> ���̸��Է��ϼ���: 3 �����¹����Դϴ�.
		 * 
		 * ���̸��Է��ϼ���: 7 ������2500���Դϴ�. ���̸��Է��ϼ���: 22 ������5000���Դϴ�
		 * 
		 */

		/*
		 * 
		 * int age; Scanner sc = new Scanner (System.in);
		 * 
		 * System.out.println("���̸� �Է��ϼ���: ");
		 * 
		 * age = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * if(age < 5 && age >= 1) { System.out.println("�����Դϴ�"); }else if(age >= 5 &&
		 * age <= 11) {
		 * 
		 * System.out.println("2500�� �Դϴ�"); }else if(age >= 12) {
		 * 
		 * System.out.println("5000�� �Դϴ�"); }else { System.out.println("�ٽ� �Է��ϼ���"); }
		 * 
		 */

		/*
		 * <2> ȭ�鿡�����ǰ����Է¹޾����εȱݾ�������Ͽ�����ϴ����α׷����ۼ��Ͻÿ���� ����>���ǰ����Է��ϼ���(����): 10
		 * ���εȱݾ���97000���Դϴ�. ���ǰ����Է��ϼ���(����): 20 ���εȱݾ���190000�Դϴ�
		 */

		
//		  int price; 
//		  double result = 0; 
//		  double point = 0;
//		  double sum = 0;
		
//		  2-1
//		  Scanner sc = new Scanner (System.in);
//		  System.out.println("���ǰ��� �Է��ϼ���(���� ����)"); 
//		  price = (Integer.parseInt(sc.nextLine())*10000);
//		  
//		  if(price <= 100000 && price >= 0) { 
//			  result = price - (price * 0.03);
//		  }else if(price > 100000 && price <= 300000){ 
//			  result = price - (price * 0.05); 
//		  }else if(price > 300000 && price <= 1000000){ 
//			  result = price - (price * 0.08); 
//		  }else if(price > 100000) { 
//			  result = price - (price * 0.1); 
//		  }else{
//			  System.out.println("�߸� �Է��� ���Դϴ�. �ٽ� �Է��ϼ���>");
//			  return;
//		  }
//		  
//		  System.out.println("���ε� �ݾ���: " + (int)result + "�Դϴ�");
//		  
//		  int price;  // �ݾ�
//		  double point = 0; // ����Ʈ
//		  double sum = 0; //����Ʈ ���� 
//		
//		  Scanner sc = new Scanner (System.in);
//		  
//		  2-2
//		  while(true) {
//			  System.out.println("���ǰ��� �Է��ϼ���(���� ����) - ����: 0"); 
//			  
//			  price = (Integer.parseInt(sc.nextLine())*10000);
//			  
//			  if(price == 0) {
//				  System.out.println("���α׷��� �����մϴ�");
//				  break;
//			  }else if((price < 100000 && price >= 0)) { 
//				  point = price * 0.01;
//			  }else if((price >= 100000 && price < 300000)){ 
//				  point = price * 0.02;
//			  }else if((price >= 300000 && price < 500000)){ 
//				  point = price * 0.05;
//			  }else if((price >= 500000)) { 
//				  point = price * 0.08;
//			  }else {
//				  System.out.println("�߸� �Է��� ���Դϴ�. �ٽ� �Է��ϼ���>");
//				  continue;
//			  }
//			  sum += point; // ����Ʈ�� sum�� ����
//			  if(sum % 50000 == 0 || sum >= 50000) { 
//				  price -= 50000;
//				  System.out.println("����Ʈ ���� 50,000��");
//			  }
//			  System.out.println("���� �ݾ���: " + price + " ��");
//			  System.out.println("������ ����Ʈ��: " + (int)sum);
//		  }
//			  
//		  
		// <3>

		// ȭ�鿡��3���Ǽ��ڸ��Է¹޾��ִ밪���ּҰ������ϴ����α׷����ۼ��Ͻÿ�.��¿���>
		// ù��°���ڸ��Է��ϼ���: 7
		// �ι�°���ڸ��Է��ϼ���: 3
		// ����°���ڸ��Է��ϼ���: 10
		// �ִ밪: 10, �ּҰ�: 3

		
		
//		  int num1, num2, num3; // ���� 3���� �Է� �ޱ� ���� ����
//		  int max, min; // �ִ밪, �ּҰ�
//
//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("ù��°���ڸ� �Է��ϼ���: ");
//		  num1 = Integer.parseInt(sc.nextLine());
//		  
//		  System.out.println("�ι������ڸ� �Է��ϼ���: ");
//		  num2 = Integer.parseInt(sc.nextLine());
//		  
//		  System.out.println("����°���ڸ� �Է��ϼ���: ");
//		  num3 = Integer.parseInt(sc.nextLine());
//		  
//		  max = ((num1 > num2)&&(num1 > num3))? num1 : ((num3 > num2)? num3 : num2);
//		  //num1�� num2���� ū�� ��,num1�� num3���� ū�� �� �� �� ���̸� num1�� ����ũ��.
//		  
//		  min = (num1 < num2)&&(num1 < num3)? num1 : ((num2 < num3)? num2 : num3);
//		  //num1�� num2���� ������ ��,num1�� num3 ���� ������ ���ؼ� num1�� ���� ������ num1 ��� �ƴϸ� ���� ���� ����
//		  
//		  System.out.println("�ִ밪: " + max + " , �ּҰ�: " + min);
		

		/*
		 * 
		 * <4>��ǰ�Ǽ������ܰ����Է¹ް�, ������10���̸��̸����������������ʰ�,
		 * 10���̻��̸鼭�ݾ���50000���̻��̸�10%�������������Ͽ��ѱݾ������ϴ����α׷����ۼ��Ͻÿ�.
		 * 
		 * ��¿���>��ǰ�������Է��Ͻÿ�: 10
		 * 
		 * ��ǰ�������Է��Ͻÿ�: 10000
		 * 
		 * ��ǰ�Ѱ�����100000 ���Դϴ�.
		 * 
		 * 
		 * 
		 * ��ǰ�������Է��Ͻÿ�: 20
		 * 
		 * ��ǰ�������Է��Ͻÿ�: 50000
		 * 
		 * ��ǰ�Ѱ�����900000 ���Դϴ�
		 * 
		 */

		/*
		 * 
		 * int price, num;
		 * 
		 * double result =0;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("������ �Է��Ͻÿ�: ");
		 * 
		 * num = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * System.out.println("������ �Է��Ͻÿ�: ");
		 * 
		 * price = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * if(num < 10 && num > 0) {
		 * 
		 * result = price;
		 * 
		 * }else if(num >= 10){
		 * 
		 * result = price - (price * 0.1);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * System.out.println("��ǰ �� ����: " + (int)result);
		 * 
		 */

		/*
		 * 
		 * <5>�ϳ��Ǽ��ڸ��Է¹޾��Է¹����������밪�����ϴ����α׷����ۼ��Ͻÿ�
		 * 
		 * ��¿���>
		 * 
		 * ���ڸ��Է��ϼ���: -3
		 * 
		 * -3�����밪: 3
		 * 
		 * ���ڸ��Է��ϼ���: 3
		 * 
		 * 3�����밪: 3
		 * 
		 * 
		 * 
		 * Math.abs();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int num;
		 * 
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("���ڸ� �Է��ϼ���: ");
		 * 
		 * num = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * //Math.abs(num2);
		 * 
		 * 
		 * 
		 * System.out.println(num + "�� ���밪: " + Math.abs(num));
		 * 
		 */

		/*
		 * 
		 * 6.���ڸ��ϳ��޾Ƽ��Է¹������ڰ��������������������Ǵ��ϴ����α׷����ۼ��Ͻÿ�
		 * 
		 * ��¿���>
		 * 
		 * �����ҹ��ڸ��Է��ϼ���: a if(opr == String){
		 * 
		 * a�¿������Դϴ�.
		 * 
		 * �����ҹ��ڸ��Է��ϼ���: 1
		 * 
		 * 1�������Դϴ�
		 * 
		 * => if(opr == String){
		 * 
		 * syso(opr + "�� �������Դϴ�"
		 * 
		 * }else if(opr == int){
		 * 
		 * syso(opr + "�� �����Դϴ�")
		 * 
		 * }
		 * 
		 */

//		String str = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ ���ڸ� �Է��ϼ���: ");
//		str = sc.nextLine();

//        if(str == String) {
//            
//        }
		
//		7.������迡�°������ֽ��ϴ�.   ����, �����Ǳ����̵Ǵ�������60���̶��
//		1 -100�����Ƿ������ڸ������Ͽ��������������հ��������հ������Ǵ��ϴ�����
//		�׷����ۼ��Ͻÿ�
//		��¿���>
//		96 �����հ��Դϴ�.
//		8�������հ��Դϴ�
		
//		int random;
//		random = (int)(Math.random()*100)+1;
//		
//		if(random % 2 == 0) {
//			System.out.println(random + "�� ¦���Դϴ�");
//		}else {
//			System.out.println(random + "�� Ȧ���Դϴ�");
//		}
		
		
//		1.1����100������Ȧ���հ�, ¦���հ�, ��ü�հ踦���Ͻÿ�
//		Ȧ���հ�: ?
//		¦���հ�: ?
//		��ü�հ�: ?
		
//		int number1 = 0; // Ȧ�� �հ�
//		int number2 = 0; // ¦�� �հ�
//		int number3 = 0; // ��ü �հ�
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				number1 += i;
//			}else {
//				number2 += i;
//			}
//			number3 += i;
//		}
//		System.out.println("Ȧ���հ�" + number1);
//		System.out.println("¦���հ� " + number2);
//		System.out.println("��ü�հ�" + number3);
		
//		2.1-100�����Ƿ�������5���������Ͽ������ȼ������հ����������Ͻÿ���,
//		������Ҽ����Ʒ�2�ڸ������
//		�����ȼ�: 312 55 9 90
//		�հ�: ?
//		���: ?
		
		float sum = 0;
		float avg = 0;
		
		System.out.print("������ �� : ");
		
		for(int i = 1; i <= 5; i++) {
			int random = (int)(Math.random()*100)+1;
			System.out.print(random + " ");
			sum += random;
			avg = sum / 5;
		}
		System.out.println();
		System.out.printf("�հ� : %5.2f\n" , sum);
		System.out.printf("��� : %5.2f\n" , avg);
	}
}
