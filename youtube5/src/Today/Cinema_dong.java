package Today;
import java.util.Scanner;
public class Cinema_dong {
	String[][] seat;
	Scanner sc = new Scanner(System.in); //�޴� ���� 
	//Scanner sc; sc ������ �ƹ��͵� �����ϰ������ʴ�  null ���� default ������ ��������� �ʱ�ȭ�ʿ� 
	//NullPointerException �߻����� : �޸� �Ҵ��� ���� ���� ���¿��� �ʵ� �Ǵ� �޼ҵ带 �������� �� �߻��ϴ� ����
	Cinema_dong(){  //default �� 
		
	}
	Cinema_dong(int num1,int num2){ //�ó׸��� ������ ���Ƿ� ����������� 
		seat = new String[num1][num2];
		for (int i = 0; i < seat.length; i++) {
			   for (int j = 0; j < seat[i].length; j++) {
			    seat[i][j] = "___";
			 }
		}
	}
	// ��ȭ�� �ڸ� ��� (���ڸ��� ����� �˼��ְ�) 
	private void seatPrint() {
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//��ȭ �����ϴ� �Լ� 
	public void reserveSeat() {
	String name;
	int col,row;
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						System.out.printf("[%s]", seat[i][j].equals("___") ? "�ڸ�" : "����");
					}
					System.out.println();
				}
				do{		
						System.out.print("���ϴ� ���� �����ϼ���: ");
						col = sc.nextInt();
						System.out.print("���ϴ� ���� �����ϼ���: ");	
						row = sc.nextInt();
						System.out.print("�����ڸ�: ");
						name = sc.next();
						//nextLine??? nextInt() �޼ҵ� ������ nextLine() �޼ҵ带 �����Ϸ��� �Ҷ�
						//nextLine()�޼ҵ尡 �׳� �Ѿ������ ������ ���ܳ���(������???)
					try {
						if (seat[col-1][row-1].equals("___")){ //�ڸ��� ��������� �������� 
							seat[col-1][row-1] = name;
							System.out.println(col+"��"+row+"�� �¼��� ����Ǿ����ϴ�");	
							break; //����� �ݺ����� �������� �� .. while���� �������� 
						} else {
							System.out.println("�̹� ����� �¼��Դϴ�.");
						}
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("�ش� ��� ���� ��ȭ�� �¼��� �����ϴ�...�ٽ��Է��ϼ���");
					}catch(Exception e) { //try �������� �߻��ϴ� ���ܸ� ó���� 
						System.out.println("�߸��� ���� �ԷµǾ����ϴ�.... �ٽ� �Է��ϼ���");
					}	
				}while(true);
	}
	
	 int division_name(String name) { // �������� ���� �޼ҵ�
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
	
	void cancelSeat() { // �ڸ� ��� �Լ� 
		int col,row;
		int name_count; //���� �̸��� ������Դ��� Ȯ���ϴ� ������ 
		String name = ""; // ������ �̸� 
			System.out.println("������ �̸��� �Է��� �ּ���");
			name = sc.next();
			name_count = division_name(name);
			if(name_count > 1) { //���������� �ִٸ� 
				System.out.println("���������� �ֽ��ϴ�....");
				System.out.println("�¼� ��ġ���� �����ݴϴ� ... ����� �¼��� �Է��ϼ��� >> ");
				seatPrint();
				System.out.print("���� �����ϼ���:");
				col = sc.nextInt();
				System.out.print("���� �����ϼ���:");
				row = sc.nextInt();
				seat[col-1][row-1] = col+"-"+row;
				System.out.println("�¼� ������ ��ҵǾ����ϴ�");
			}else if(name_count == 1){
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						if(seat[i][j].equals(name)) {
							seat[i][j] = (i+1)+"-"+(j+1);
							System.out.println((i+1)+"��"+(j+1)+"��"+"�¼� ������ ��ҵǾ����ϴ�");
						}
					}
				}
			}else {
				System.out.println("����� �̸��� �����ϴ�...");
			}

		}
	void showSeat() { // ���ų����� ��ȸ�ϴ� �Լ� 
		for (int i = 0; i < this.seat.length; i++) {
			for (int j = 0; j < this.seat[i].length; j++) {
				System.out.printf("[%s]", this.seat[i][j].equals("___") ? "�ڸ�" : "����");
			}
			System.out.println();
		}
	}
	//�ó׸��� �޴��� ������ 
	public void showMenu() {
	 while(true) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("===��ȭ ���� ���α׷�===");
		System.out.println("1.����");
		System.out.println("2.���� ���� ��ȸ");
		System.out.println("3.���� ���� ���");
		System.out.println("4.��ȭ�� �ڸ� ���");
		System.out.println("5.���α׷� ����");
		System.out.println("===================");
		System.out.print("1~5�� �ϳ��� �Է��ϼ���:");
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
				System.out.println("�̿����ּż� �����մϴ�. <���α׷� ����>");
				return;
			default:
				System.out.println("1~4 �� �ϳ��� �Է��ϼ���");
				break loop;
			}
		}
	 	}
	}
}