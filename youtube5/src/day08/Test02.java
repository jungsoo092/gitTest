package day08;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		int num1, num2, result;
		String giho = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("��ȣ�� �Է��ϼ��� : +, -, *, /");
		giho = sc.nextLine();
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		num2 = Integer.parseInt(sc.nextLine());	
				
		if(giho.equals("+")) {
			result = num1 + num2;
		}else if(giho.equals("-")) {
			result = num1 - num2;
		}else if(giho.equals("*")) {
			result = num1 - num2;
		}else if(giho.equals("/")) {
			result = num1 - num2;
		}else {
			System.out.println("�ٽ� �Է��ϼ���: ");
			return;
		}
		System.out.println(num1 + "+" + num2 + "=" + result);
				
				
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("��ȣ�� �Է��ϼ���");
		giho = sc.nextLine();
		
		System.out.println("���ڸ� �Է��ϼ���");
		number2 = Integer.parseInt(sc.nextLine());
		
		if(giho.equals("+")) {
			result = number1 + number2;
		}else if(giho.equals("-")) {
			result = number1 - number2;
		}else if(giho.equals("*")) {
			result = number1 * number2;
		}else if(giho.equals("/")) {
			result = number1 / number2;
		}else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�");
			return;
		}
		System.out.printf("�����: %d %s %d = %d", number1, giho, number2, result);
		*/
	}

}
