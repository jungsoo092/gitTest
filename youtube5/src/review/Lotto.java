package review;

import java.util.Random;
import java.util.Scanner;

//타입: 기본타입 8가지 + String + class + 배열(Array)
//초기화는 보통 생성자에서... 필요하다면.... 오버로딩

//설계도
public class Lotto {
	// public int[] numbers = new int[6]; 틀린 코드 아니다
//    private int numbers;
//    public Lotto() { //목적: 초기화(멤버필드)
//        this(10); //멤버필드가 1개 짜리를 찾아서 타고 들어간다. ↓으로
//    }
//    public Lotto(int numbers) {
//        this.numbers = numbers;
//    }
	// public int[] numbers = new int[6]; 틀린 코드 아니다

	private int[] numbers; // 배열 선언
	private Scanner scanner;
	private Random r; // = new Random();
	
	public Lotto() {
		// 초기화 (멤버 필드)
		numbers = new int[6]; // 초기화
		scanner = new Scanner(System.in);
		r = new Random();
	}
	// 기능... (method) 안에서 >> 함수 하나당 기능 1개만
	// 번호 추출해 주세요
	// 중복값 X
	// 낮은 순으로 정렬
	// 출력하세요 (화면 출력)
	// 메뉴 기능.... 선택.....
	// 1 >> 로또 추출
	// 2 >> 프로그램 종료
	
	public void selectLottoNumber() {
		loop_1: while (true) {
			String selectionnum = showMenu(scanner);
			switch (selectionnum) {
			case "1":
				// makeLottoNumber(r, numbers); //번호 추출
				// showLottoNumbers(); //정렬하고 출력하기
				do {
					makeLottoNumber(r, numbers); // 번호 추출 -> 정렬, 중복제거
				} while (!checkAverage()); // ******************@(#*@(#*(@*#(
				showLottoNumbers(); // 랜덤 값 출력하기
				numberdivide();
				break; // 거짓일때 break로 빠져서 다시 위의 switch문으로 간다....
			case "2": // 프로그램 종료: return (함수 탈출), System.exit(0), 라벨값
				System.out.println("Good Luck!");
				break loop_1;
			default:
				System.out.println("Not in Operation~~");
				break;
			}
		}
	}
	// private ... 내부에서만 사용

	private String showMenu(Scanner sc) { // 연습이니까 (parameter)
		System.out.println("*****************");
		System.out.println("*1. 당첨 예상 번호 추출*");
		System.out.println("*2. 프로그램 종료^^!*");
		System.out.println("*****************");
		System.out.print("원하는 작업 번호를 입력하세요:");
		String selectionnum = sc.nextLine();
		return selectionnum;
	}

	// 번호 추출, 중복값 배제
	private void makeLottoNumber(Random r, int[] numbers) { // parameter 연습
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1; // 랜덤값 6번 뽑아라
			for (int j = 0; j < i; j++) { // 1개의 값은 넣겠다
				if (numbers[i] == numbers[j]) { // 1인덱스 0인덱스를 비교하고 값이 같으면 i를 0으로 보내서 다시
					i--;
					break;
				}
			}
		}
	}

	// 화면 출력기능
	private void showLottoNumbers() {
		System.out.println("[선택한 Lotto 번호]");
		for (int i = 0; i < numbers.length; i++) { // 0~5까지 6번 반복
			for (int j = i + 1; j < numbers.length; j++) { // 1~5까지 반복
				if (numbers[i] > numbers[j]) { // i를 > 1~5까지 비교
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		// 출력하기
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%2d]", numbers[i]);
		}
		System.out.println();
	}

	// 규칙 (배열의 합의 평균이 특정 법위에 벗어나면 재추출)
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for (int num : numbers) {
			sum += num;
		}
		average = sum / numbers.length;
		System.out.println("평균: " + average);
		return (average >= 15 && average <= 35); // true, false
	}

	// 홀수 짝수 나누기
	private void numberdivide() {
		System.out.print("짝수 : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.printf("[%2d]", numbers[i]);
			}
		}
		System.out.println();

		System.out.print("홀수 : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.printf("[%2d]", numbers[i]);
			}
		}
		System.out.println();
	}
}
