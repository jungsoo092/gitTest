package day08;

public class Test {

	public static void main(String[] args) {
		int number = ((int)(Math.random()*10)+1)*100;
		String msg ="";
		System.out.println("��÷��ȣ: " + number );
		
		switch(number) {
		case 1000:
		case 900:
		case 800:
		case 700:
		case 600:msg+="Cup";
			break;
		default : msg+="milk";	
		}
		System.out.println("��ǰ: " + msg);
	}

}
