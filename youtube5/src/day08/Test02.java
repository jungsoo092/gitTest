package day08;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		int num1, num2, result;
		String giho = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("기호를 입력하세요 : +, -, *, /");
		giho = sc.nextLine();
		
		System.out.println("숫자를 입력하세요: ");
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
			System.out.println("다시 입력하세요: ");
			return;
		}
		System.out.println(num1 + "+" + num2 + "=" + result);
				
				
		/*Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("기호를 입력하세요");
		giho = sc.nextLine();
		
		System.out.println("숫자를 입력하세요");
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
			System.out.println("잘 못 입력하셨습니다");
			return;
		}
		System.out.printf("결과는: %d %s %d = %d", number1, giho, number2, result);
		*/
	}

}
