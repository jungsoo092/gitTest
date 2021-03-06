package Today;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Cinema2 {
	private String[][] seat;
	private Scanner sc;
	String name;
	int col, row;
	
	
	public Cinema2() {
		seat = new String[3][5];
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}
		sc = new Scanner(System.in);
	}
	
	private String showMenu(Scanner sc) {  // 기본 메뉴 함수
		System.out.println("===영화 예매 프로그램===");
		System.out.println("1.예매");
		System.out.println("2.예매 내역 조회");
		System.out.println("3.예매 내역 취소");
		System.out.println("4.자리 조회");
		System.out.println("5.프로그램 종료");
		System.out.println("===================");
		String selectnum = sc.nextLine();
		return selectnum;
	}
	
	public void cinemaReserve() {  // 실행 함수
		loop: while (true) {
			String selectnum = showMenu(sc);
		 switch (selectnum) {
			case "1":
				showSeat(); // 1번 예매하면 자리현황을 보여주고 고르게 하자.
				reserveSeat(); // 자리랑 이름을 입력하고 예약하자.
				break ;
			case "2":
				showSeat(); // 현재 예매내역을 조회. -> case1 - showSeat()과  똑같은 함수.
				break ;
			case "3":
				cancelSeat(); // 취소 함수
				break ;
			case "4": 
				seatPrint(); // 예약현황
				break;
			case "5":  // 종료
				System.out.println("이용해주셔서 감사합니다. <프로그램 종료>");
				break loop;
			default:
				System.out.println("1~5 중 하나를 입력하세요");
				break;
			}
		}
	}


	public void reserveSeat() { // 예매하는 함수
		Pattern eng = Pattern.compile("^[a-zA-Z]*$"); // 영어만쓰는
		Pattern kor = Pattern.compile("^[가-힣]*$"); // 한글만 쓰는

		loop: do { // 행, 열, 이름을 무조건 입력 받아라
			try {
				System.out.println("1~3 중 원하는 행: "); // 행 입력
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.println("1~5 중 원하는 열: ");
				row = Integer.parseInt(sc.nextLine()) - 1; // 열입력
				
				System.out.println("예약자명: ");
				while(sc.hasNextInt()) { //문자 값이면 (true)면 아래를 실행하고 while을 벗어나라. 거짓이면(숫자면) 계속 돌아라.
					sc.next(); //숫자가 오면 담고 버린다.
					System.out.println("이름을 입력해주세요.");
				}
				name = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println("잘 못된 입력입니다. 다시 입력하세요");
				return;
			}

			
			try {
				if (this.seat[col][row].equals("___")) {
					this.seat[col][row] = name;
					System.out.printf("[%s]님 [%d]행 [%d]열 예약에 성공하셨습니다\n", name, col + 1, row + 1);
					break loop; // do 탈출
				} else {
					System.out.println("이미 예약 되었습니다. 다시 선택해 주세요");
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
			}
			
		} while (true);
	}

	private void showSeat() { // 예매내역을 표처럼 보여주는 함수   case2
		for (int i = 0; i < this.seat.length; i++) {
			for (int j = 0; j < this.seat[i].length; j++) {
				System.out.printf("[%s]", this.seat[i][j].equals("___") ? "자리" : "예매");
			}
			System.out.println();
		}
	}

	int division_name(String name) { // 동명이인 구별 함수
        int count = 0;
        for (int i = 0; i <seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (this.seat[i][j].equals(name)) {
                    count++;
                }
            }
        }
        return count;
    }
	
	private void cancelSeat() { // 자리 취소 함수    case3
		
		//int col, row;
		int name_count; //같은 이름이 몇번나왔는지 확인하는 변수명 
		String name = ""; // 예약자 이름 
			System.out.println("예약자 이름을 입력해 주세요");
			name = sc.nextLine();
			name_count = division_name(name);
			if(name_count > 1) { //동명이인이 있다면 
				System.out.println("동명이인이 있습니다. 취소할 행과 열을 입력해주세요");
				System.out.print("행을 선택하세요:");
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.print("열을 선택하세요:");
				row = Integer.parseInt(sc.nextLine()) - 1;
				seat[col][row] = "___";
				System.out.println("좌석 예약이 취소되었습니다");
			}else if(name_count == 1){ // 예약자가 있으면
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						if(seat[i][j].equals(name)) {
							seat[i][j] = "___";
							System.out.println((i+1)+"행"+(j+1)+"열"+"좌석 예약이 취소되었습니다");
						}
					}
				}
			}else {
				System.out.println("예약된 이름이 없습니다...");
			}

		}
	
	private void seatPrint() { // 자리 조회 함수
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
