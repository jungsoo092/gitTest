package day08;

public class Test05 {

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			int a = 4;
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (k == 0) {
					System.out.print("*");
				} else {
					System.out.print("**");
				}
			}
			System.out.println();

		}
	}

}
