package review;

import java.util.Random;
import java.util.Scanner;

//Ÿ��: �⺻Ÿ�� 8���� + String + class + �迭(Array)
//�ʱ�ȭ�� ���� �����ڿ���... �ʿ��ϴٸ�.... �����ε�

//���赵
public class Lotto {
	// public int[] numbers = new int[6]; Ʋ�� �ڵ� �ƴϴ�
//    private int numbers;
//    public Lotto() { //����: �ʱ�ȭ(����ʵ�)
//        this(10); //����ʵ尡 1�� ¥���� ã�Ƽ� Ÿ�� ����. ������
//    }
//    public Lotto(int numbers) {
//        this.numbers = numbers;
//    }
	// public int[] numbers = new int[6]; Ʋ�� �ڵ� �ƴϴ�

	private int[] numbers; // �迭 ����
	private Scanner scanner;
	private Random r; // = new Random();
	
	public Lotto() {
		// �ʱ�ȭ (��� �ʵ�)
		numbers = new int[6]; // �ʱ�ȭ
		scanner = new Scanner(System.in);
		r = new Random();
	}
	// ���... (method) �ȿ��� >> �Լ� �ϳ��� ��� 1����
	// ��ȣ ������ �ּ���
	// �ߺ��� X
	// ���� ������ ����
	// ����ϼ��� (ȭ�� ���)
	// �޴� ���.... ����.....
	// 1 >> �ζ� ����
	// 2 >> ���α׷� ����
	
	public void selectLottoNumber() {
		loop_1: while (true) {
			String selectionnum = showMenu(scanner);
			switch (selectionnum) {
			case "1":
				// makeLottoNumber(r, numbers); //��ȣ ����
				// showLottoNumbers(); //�����ϰ� ����ϱ�
				do {
					makeLottoNumber(r, numbers); // ��ȣ ���� -> ����, �ߺ�����
				} while (!checkAverage()); // ******************@(#*@(#*(@*#(
				showLottoNumbers(); // ���� �� ����ϱ�
				numberdivide();
				break; // �����϶� break�� ������ �ٽ� ���� switch������ ����....
			case "2": // ���α׷� ����: return (�Լ� Ż��), System.exit(0), �󺧰�
				System.out.println("Good Luck!");
				break loop_1;
			default:
				System.out.println("Not in Operation~~");
				break;
			}
		}
	}
	// private ... ���ο����� ���

	private String showMenu(Scanner sc) { // �����̴ϱ� (parameter)
		System.out.println("*****************");
		System.out.println("*1. ��÷ ���� ��ȣ ����*");
		System.out.println("*2. ���α׷� ����^^!*");
		System.out.println("*****************");
		System.out.print("���ϴ� �۾� ��ȣ�� �Է��ϼ���:");
		String selectionnum = sc.nextLine();
		return selectionnum;
	}

	// ��ȣ ����, �ߺ��� ����
	private void makeLottoNumber(Random r, int[] numbers) { // parameter ����
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1; // ������ 6�� �̾ƶ�
			for (int j = 0; j < i; j++) { // 1���� ���� �ְڴ�
				if (numbers[i] == numbers[j]) { // 1�ε��� 0�ε����� ���ϰ� ���� ������ i�� 0���� ������ �ٽ�
					i--;
					break;
				}
			}
		}
	}

	// ȭ�� ��±��
	private void showLottoNumbers() {
		System.out.println("[������ Lotto ��ȣ]");
		for (int i = 0; i < numbers.length; i++) { // 0~5���� 6�� �ݺ�
			for (int j = i + 1; j < numbers.length; j++) { // 1~5���� �ݺ�
				if (numbers[i] > numbers[j]) { // i�� > 1~5���� ��
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		// ����ϱ�
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%2d]", numbers[i]);
		}
		System.out.println();
	}

	// ��Ģ (�迭�� ���� ����� Ư�� ������ ����� ������)
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for (int num : numbers) {
			sum += num;
		}
		average = sum / numbers.length;
		System.out.println("���: " + average);
		return (average >= 15 && average <= 35); // true, false
	}

	// Ȧ�� ¦�� ������
	private void numberdivide() {
		System.out.print("¦�� : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.printf("[%2d]", numbers[i]);
			}
		}
		System.out.println();

		System.out.print("Ȧ�� : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.printf("[%2d]", numbers[i]);
			}
		}
		System.out.println();
	}
}
