package day08;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		int user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 가위, 2.바위, 3.보");
		user = Integer.parseInt(sc.nextLine());
		
		com = (int)(Math.random()*3)+1;
		
		if(user == com) {
			System.out.println("비겼습니다");
		}else if(user == 1 && com == 2|| user==2 && com==3 || user==3 && com==1){
			System.out.println("컴퓨터 승리");
		}else if(user == 1 && com == 3|| user==2 && com==1 || user==3 && com==2) {
			System.out.println("인간 승리");
		}else {
			System.out.println("잘 못 입력함");
			return;
		}
		System.out.println("컴퓨터: " + com);
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("1. 가위, 2.바위, 3.보");
		user = Integer.parseInt(sc.nextLine());
		
		com = (int)(Math.random()*3)+1;
		System.out.println(com);
		
		if(user == com) {
			System.out.println("비겼습니다");
		}else if(user==1 && com==2 || user==2 && com==3 || user==3 && com==1) {
			System.out.println("컴퓨터 승리");
		}else if(user==1 && com==3 || user==2 && com==1 || user==3 && com==2) {
			System.out.println("사용자 승리");
		}else {
			System.out.println("잘 못 입력하였습니다");
			return;
		}
		System.out.println("컴퓨터 : " + com);
		*/
	}

}
