package day08;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		int user;
		int com;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ����, 2.����, 3.��");
		user = Integer.parseInt(sc.nextLine());
		
		com = (int)(Math.random()*3)+1;
		
		if(user == com) {
			System.out.println("�����ϴ�");
		}else if(user == 1 && com == 2|| user==2 && com==3 || user==3 && com==1){
			System.out.println("��ǻ�� �¸�");
		}else if(user == 1 && com == 3|| user==2 && com==1 || user==3 && com==2) {
			System.out.println("�ΰ� �¸�");
		}else {
			System.out.println("�� �� �Է���");
			return;
		}
		System.out.println("��ǻ��: " + com);
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("1. ����, 2.����, 3.��");
		user = Integer.parseInt(sc.nextLine());
		
		com = (int)(Math.random()*3)+1;
		System.out.println(com);
		
		if(user == com) {
			System.out.println("�����ϴ�");
		}else if(user==1 && com==2 || user==2 && com==3 || user==3 && com==1) {
			System.out.println("��ǻ�� �¸�");
		}else if(user==1 && com==3 || user==2 && com==1 || user==3 && com==2) {
			System.out.println("����� �¸�");
		}else {
			System.out.println("�� �� �Է��Ͽ����ϴ�");
			return;
		}
		System.out.println("��ǻ�� : " + com);
		*/
	}

}
