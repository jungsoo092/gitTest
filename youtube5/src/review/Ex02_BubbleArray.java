package review;

public class Ex02_BubbleArray {

	public static void main(String[] args) {

		int[] a = { 20, 2, 5, 45, 1, 25 };
		int b;

		for (int i = 0; i < a.length; i++) { // 0~5����
			for (int j = 0; j < a.length - i - 1; j++) { // ù���� �˻翡�� ���� ū���� �ǵڷ� ����
				if (a[j] > a[j + 1]) {
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
