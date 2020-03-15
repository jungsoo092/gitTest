package Today;
import java.util.Scanner;
public class Cinema_dong {
	String[][] seat;
	Scanner sc = new Scanner(System.in); //메뉴 선택 
	//Scanner sc; sc 변수는 아무것도 참조하고있지않는  null 값이 default 값으로 저장되있음 초기화필요 
	//NullPointerException 발생원인 : 메모리 할당을 하지 않은 상태에서 필드 또는 메소드를 참조했을 때 발생하는 에러
	Cinema_dong(){  //default 값 
		
	}
	Cinema_dong(int num1,int num2){ //시네마의 공간을 임의로 만들수도있음 
		seat = new String[num1][num2];
		for (int i = 0; i < seat.length; i++) {
			   for (int j = 0; j < seat[i].length; j++) {
			    seat[i][j] = "___";
			 }
		}
	}
	// 영화관 자리 출력 (내자리가 어딘지 알수있게) 
	private void seatPrint() {
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//영화 예매하는 함수 
	public void reserveSeat() {
	String name;
	int col,row;
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매");
					}
					System.out.println();
				}
				do{		
						System.out.print("원하는 행을 선택하세요: ");
						col = sc.nextInt();
						System.out.print("원하는 열을 선택하세요: ");	
						row = sc.nextInt();
						System.out.print("예약자명: ");
						name = sc.next();
						//nextLine??? nextInt() 메소드 다음에 nextLine() 메소드를 실행하려고 할때
						//nextLine()메소드가 그냥 넘어가버리는 오류가 생겨난다(이유는???)
					try {
						if (seat[col-1][row-1].equals("___")){ //자리가 비어있으면 예약을함 
							seat[col-1][row-1] = name;
							System.out.println(col+"행"+row+"열 좌석에 예약되었습니다");	
							break; //가까운 반복문을 빠져나감 즉 .. while문을 빠져나감 
						} else {
							System.out.println("이미 예약된 좌석입니다.");
						}
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("해당 행과 열은 영화관 좌석에 없습니다...다시입력하세요");
					}catch(Exception e) { //try 구문에서 발생하는 예외를 처리함 
						System.out.println("잘못된 값이 입력되었습니다.... 다시 입력하세요");
					}	
				}while(true);
	}
	
	 int division_name(String name) { // 동명이인 구별 메소드
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
	
	void cancelSeat() { // 자리 취소 함수 
		int col,row;
		int name_count; //같은 이름이 몇번나왔는지 확인하는 변수명 
		String name = ""; // 예약자 이름 
			System.out.println("예약자 이름을 입력해 주세요");
			name = sc.next();
			name_count = division_name(name);
			if(name_count > 1) { //동명이인이 있다면 
				System.out.println("동명이인이 있습니다....");
				System.out.println("좌석 배치도를 보여줍니다 ... 취소할 좌석을 입력하세요 >> ");
				seatPrint();
				System.out.print("행을 선택하세요:");
				col = sc.nextInt();
				System.out.print("열을 선택하세요:");
				row = sc.nextInt();
				seat[col-1][row-1] = col+"-"+row;
				System.out.println("좌석 예약이 취소되었습니다");
			}else if(name_count == 1){
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						if(seat[i][j].equals(name)) {
							seat[i][j] = (i+1)+"-"+(j+1);
							System.out.println((i+1)+"행"+(j+1)+"열"+"좌석 예약이 취소되었습니다");
						}
					}
				}
			}else {
				System.out.println("예약된 이름이 없습니다...");
			}

		}
	void showSeat() { // 예매내역을 조회하는 함수 
		for (int i = 0; i < this.seat.length; i++) {
			for (int j = 0; j < this.seat[i].length; j++) {
				System.out.printf("[%s]", this.seat[i][j].equals("___") ? "자리" : "예매");
			}
			System.out.println();
		}
	}
	//시네마의 메뉴를 보여줌 
	public void showMenu() {
	 while(true) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("===영화 예매 프로그램===");
		System.out.println("1.예매");
		System.out.println("2.예매 내역 조회");
		System.out.println("3.예매 내역 취소");
		System.out.println("4.영화관 자리 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("===================");
		System.out.print("1~5중 하나를 입력하세요:");
		String selectnum = sc.nextLine();
		loop : while(true) {
			switch(selectnum) {
			case "1": 
				reserveSeat();
				break loop;
			case "2":
				showSeat();
				break loop;	
			case "3":
				cancelSeat();
				break loop;
			case "4":
				seatPrint();
				break loop;
			case "5":
				System.out.println("이용해주셔서 감사합니다. <프로그램 종료>");
				return;
			default:
				System.out.println("1~4 중 하나를 입력하세요");
				break loop;
			}
		}
	 	}
	}
}