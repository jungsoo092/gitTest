
package day08;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		/*
		 * 
		 * <1>서울랜드동물원에놀러갔습니다. 동물원요금이5세미만은무료, 5 -11세까지2500원12
		 * 
		 * 부터는5000원입니다.화면에서나이를입력받아요금을계산하여출력하는 프로그램을작성하시오출력예시> 나이를입력하세요: 3 입장료는무료입니다.
		 * 
		 * 나이를입력하세요: 7 입장료는2500원입니다. 나이를입력하세요: 22 입장료는5000원입니다
		 * 
		 */

		/*
		 * 
		 * int age; Scanner sc = new Scanner (System.in);
		 * 
		 * System.out.println("나이를 입력하세요: ");
		 * 
		 * age = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * if(age < 5 && age >= 1) { System.out.println("무료입니다"); }else if(age >= 5 &&
		 * age <= 11) {
		 * 
		 * System.out.println("2500원 입니다"); }else if(age >= 12) {
		 * 
		 * System.out.println("5000원 입니다"); }else { System.out.println("다시 입력하세요"); }
		 * 
		 */

		/*
		 * <2> 화면에서물건값을입력받아할인된금액을계산하여출력하는프로그램을작성하시오출력 예시>물건값을입력하세요(만원): 10
		 * 할인된금액은97000원입니다. 물건값을입력하세요(만원): 20 할인된금액은190000입니다
		 */

		
//		  int price; 
//		  double result = 0; 
//		  double point = 0;
//		  double sum = 0;
		
//		  2-1
//		  Scanner sc = new Scanner (System.in);
//		  System.out.println("물건값을 입력하세요(만원 단위)"); 
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
//			  System.out.println("잘못 입력한 값입니다. 다시 입력하세요>");
//			  return;
//		  }
//		  
//		  System.out.println("할인된 금액은: " + (int)result + "입니다");
//		  
//		  int price;  // 금액
//		  double point = 0; // 포인트
//		  double sum = 0; //포인트 누적 
//		
//		  Scanner sc = new Scanner (System.in);
//		  
//		  2-2
//		  while(true) {
//			  System.out.println("물건값을 입력하세요(만원 단위) - 종료: 0"); 
//			  
//			  price = (Integer.parseInt(sc.nextLine())*10000);
//			  
//			  if(price == 0) {
//				  System.out.println("프로그램을 종료합니다");
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
//				  System.out.println("잘못 입력한 값입니다. 다시 입력하세요>");
//				  continue;
//			  }
//			  sum += point; // 포인트를 sum에 누적
//			  if(sum % 50000 == 0 || sum >= 50000) { 
//				  price -= 50000;
//				  System.out.println("포인트 할인 50,000원");
//			  }
//			  System.out.println("물건 금액은: " + price + " 원");
//			  System.out.println("누적된 포인트는: " + (int)sum);
//		  }
//			  
//		  
		// <3>

		// 화면에서3개의숫자를입력받아최대값과최소값을구하는프로그램을작성하시오.출력예시>
		// 첫번째숫자를입력하세요: 7
		// 두번째숫자를입력하세요: 3
		// 세번째숫자를입력하세요: 10
		// 최대값: 10, 최소값: 3

		
		
//		  int num1, num2, num3; // 숫자 3개를 입력 받기 위한 변수
//		  int max, min; // 최대값, 최소값
//
//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("첫번째숫자를 입력하세요: ");
//		  num1 = Integer.parseInt(sc.nextLine());
//		  
//		  System.out.println("두번쨰숫자를 입력하세요: ");
//		  num2 = Integer.parseInt(sc.nextLine());
//		  
//		  System.out.println("세번째숫자를 입력하세요: ");
//		  num3 = Integer.parseInt(sc.nextLine());
//		  
//		  max = ((num1 > num2)&&(num1 > num3))? num1 : ((num3 > num2)? num3 : num2);
//		  //num1이 num2보다 큰지 비교,num1이 num3보다 큰지 비교 둘 다 참이면 num1이 가장크다.
//		  
//		  min = (num1 < num2)&&(num1 < num3)? num1 : ((num2 < num3)? num2 : num3);
//		  //num1이 num2보다 작은지 비교,num1이 num3 보다 작은지 비교해서 num1이 제일 작으면 num1 출력 아니면 뒤의 수식 수행
//		  
//		  System.out.println("최대값: " + max + " , 최소값: " + min);
		

		/*
		 * 
		 * <4>상품의수량과단가를입력받고, 수량이10개미만이면할인을적용하지않고,
		 * 10개이상이면서금액이50000원이상이면10%의할인을적용하여총금액을구하는프로그램을작성하시오.
		 * 
		 * 출력예시>상품수량을입력하시오: 10
		 * 
		 * 상품가격을입력하시오: 10000
		 * 
		 * 상품총가격은100000 원입니다.
		 * 
		 * 
		 * 
		 * 상품수량을입력하시오: 20
		 * 
		 * 상품가격을입력하시오: 50000
		 * 
		 * 상품총가격은900000 원입니다
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
		 * System.out.println("수량을 입력하시오: ");
		 * 
		 * num = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * System.out.println("가격을 입력하시오: ");
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
		 * System.out.println("상품 총 가격: " + (int)result);
		 * 
		 */

		/*
		 * 
		 * <5>하나의숫자를입력받아입력받은수의절대값을구하는프로그램을작성하시오
		 * 
		 * 출력예시>
		 * 
		 * 숫자를입력하세요: -3
		 * 
		 * -3의절대값: 3
		 * 
		 * 숫자를입력하세요: 3
		 * 
		 * 3의절대값: 3
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
		 * System.out.println("숫자를 입력하세요: ");
		 * 
		 * num = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * //Math.abs(num2);
		 * 
		 * 
		 * 
		 * System.out.println(num + "의 절대값: " + Math.abs(num));
		 * 
		 */

		/*
		 * 
		 * 6.문자를하나받아서입력받은문자가숫자인지영문자인지판단하는프로그램을작성하시오
		 * 
		 * 출력예시>
		 * 
		 * 구분할문자를입력하세요: a if(opr == String){
		 * 
		 * a는영문자입니다.
		 * 
		 * 구분할문자를입력하세요: 1
		 * 
		 * 1은숫자입니다
		 * 
		 * => if(opr == String){
		 * 
		 * syso(opr + "은 영문자입니다"
		 * 
		 * }else if(opr == int){
		 * 
		 * syso(opr + "은 숫자입니다")
		 * 
		 * }
		 * 
		 */

//		String str = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구분할 문자를 입력하세요: ");
//		str = sc.nextLine();

//        if(str == String) {
//            
//        }
		
//		7.보통시험에는과락이있습니다.   만약, 과락의기준이되는점수가60점이라면
//		1 -100사이의랜덤숫자를생성하여생성된점수가합격인지불합격인지판단하는프로
//		그램을작성하시오
//		출력예시>
//		96 점은합격입니다.
//		8점은불합격입니다
		
//		int random;
//		random = (int)(Math.random()*100)+1;
//		
//		if(random % 2 == 0) {
//			System.out.println(random + "은 짝수입니다");
//		}else {
//			System.out.println(random + "은 홀수입니다");
//		}
		
		
//		1.1부터100까지의홀수합계, 짝수합계, 전체합계를구하시오
//		홀수합계: ?
//		짝수합계: ?
//		전체합계: ?
		
//		int number1 = 0; // 홀수 합계
//		int number2 = 0; // 짝수 합계
//		int number3 = 0; // 전체 합계
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				number1 += i;
//			}else {
//				number2 += i;
//			}
//			number3 += i;
//		}
//		System.out.println("홀수합계" + number1);
//		System.out.println("짝수합계 " + number2);
//		System.out.println("전체합계" + number3);
		
//		2.1-100사이의랜덤숫자5개를생성하여생성된숫자의합계와평균을구하시오단,
//		평균은소수점아래2자리만출력
//		생성된수: 312 55 9 90
//		합계: ?
//		평균: ?
		
		float sum = 0;
		float avg = 0;
		
		System.out.print("생성된 수 : ");
		
		for(int i = 1; i <= 5; i++) {
			int random = (int)(Math.random()*100)+1;
			System.out.print(random + " ");
			sum += random;
			avg = sum / 5;
		}
		System.out.println();
		System.out.printf("합계 : %5.2f\n" , sum);
		System.out.printf("평균 : %5.2f\n" , avg);
	}
}
