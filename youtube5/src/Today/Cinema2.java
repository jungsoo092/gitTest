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
	
	private String showMenu(Scanner sc) {  // �⺻ �޴� �Լ�
		System.out.println("===��ȭ ���� ���α׷�===");
		System.out.println("1.����");
		System.out.println("2.���� ���� ��ȸ");
		System.out.println("3.���� ���� ���");
		System.out.println("4.�ڸ� ��ȸ");
		System.out.println("5.���α׷� ����");
		System.out.println("===================");
		String selectnum = sc.nextLine();
		return selectnum;
	}
	
	public void cinemaReserve() {  // ���� �Լ�
		loop: while (true) {
			String selectnum = showMenu(sc);
		 switch (selectnum) {
			case "1":
				showSeat(); // 1�� �����ϸ� �ڸ���Ȳ�� �����ְ� ���� ����.
				reserveSeat(); // �ڸ��� �̸��� �Է��ϰ� ��������.
				break ;
			case "2":
				showSeat(); // ���� ���ų����� ��ȸ. -> case1 - showSeat()��  �Ȱ��� �Լ�.
				break ;
			case "3":
				cancelSeat(); // ��� �Լ�
				break ;
			case "4": 
				seatPrint(); // ������Ȳ
				break;
			case "5":  // ����
				System.out.println("�̿����ּż� �����մϴ�. <���α׷� ����>");
				break loop;
			default:
				System.out.println("1~5 �� �ϳ��� �Է��ϼ���");
				break;
			}
		}
	}


	public void reserveSeat() { // �����ϴ� �Լ�
		Pattern eng = Pattern.compile("^[a-zA-Z]*$"); // �������
		Pattern kor = Pattern.compile("^[��-�R]*$"); // �ѱ۸� ����

		loop: do { // ��, ��, �̸��� ������ �Է� �޾ƶ�
			try {
				System.out.println("1~3 �� ���ϴ� ��: "); // �� �Է�
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.println("1~5 �� ���ϴ� ��: ");
				row = Integer.parseInt(sc.nextLine()) - 1; // ���Է�
				
				System.out.println("�����ڸ�: ");
				while(sc.hasNextInt()) { //���� ���̸� (true)�� �Ʒ��� �����ϰ� while�� �����. �����̸�(���ڸ�) ��� ���ƶ�.
					sc.next(); //���ڰ� ���� ��� ������.
					System.out.println("�̸��� �Է����ּ���.");
				}
				name = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println("�� ���� �Է��Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}

			
			try {
				if (this.seat[col][row].equals("___")) {
					this.seat[col][row] = name;
					System.out.printf("[%s]�� [%d]�� [%d]�� ���࿡ �����ϼ̽��ϴ�\n", name, col + 1, row + 1);
					break loop; // do Ż��
				} else {
					System.out.println("�̹� ���� �Ǿ����ϴ�. �ٽ� ������ �ּ���");
				}
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		} while (true);
	}

	private void showSeat() { // ���ų����� ǥó�� �����ִ� �Լ�   case2
		for (int i = 0; i < this.seat.length; i++) {
			for (int j = 0; j < this.seat[i].length; j++) {
				System.out.printf("[%s]", this.seat[i][j].equals("___") ? "�ڸ�" : "����");
			}
			System.out.println();
		}
	}

	int division_name(String name) { // �������� ���� �Լ�
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
	
	private void cancelSeat() { // �ڸ� ��� �Լ�    case3
		
		//int col, row;
		int name_count; //���� �̸��� ������Դ��� Ȯ���ϴ� ������ 
		String name = ""; // ������ �̸� 
			System.out.println("������ �̸��� �Է��� �ּ���");
			name = sc.nextLine();
			name_count = division_name(name);
			if(name_count > 1) { //���������� �ִٸ� 
				System.out.println("���������� �ֽ��ϴ�. ����� ��� ���� �Է����ּ���");
				System.out.print("���� �����ϼ���:");
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.print("���� �����ϼ���:");
				row = Integer.parseInt(sc.nextLine()) - 1;
				seat[col][row] = "___";
				System.out.println("�¼� ������ ��ҵǾ����ϴ�");
			}else if(name_count == 1){ // �����ڰ� ������
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						if(seat[i][j].equals(name)) {
							seat[i][j] = "___";
							System.out.println((i+1)+"��"+(j+1)+"��"+"�¼� ������ ��ҵǾ����ϴ�");
						}
					}
				}
			}else {
				System.out.println("����� �̸��� �����ϴ�...");
			}

		}
	
	private void seatPrint() { // �ڸ� ��ȸ �Լ�
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
