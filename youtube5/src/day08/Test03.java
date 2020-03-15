package day08;

public class Test03 {

	public static void main(String[] args) {

		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) { // 1~5 까지 5번 반복
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			int a = 4;
			for(int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				if(k==0) {
					System.out.print("*");
				}else {
					System.out.print("**");
				}
			}
			System.out.println();
		}
		
		System.out.printf("%d * %d = %d", 1, 2, 1*2);
	}

}
