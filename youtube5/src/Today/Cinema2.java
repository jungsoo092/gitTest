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
	
	private String showMenu(Scanner sc) {  // ±âº» ¸Ş´º ÇÔ¼ö
		System.out.println("===¿µÈ­ ¿¹¸Å ÇÁ·Î±×·¥===");
		System.out.println("1.¿¹¸Å");
		System.out.println("2.¿¹¸Å ³»¿ª Á¶È¸");
		System.out.println("3.¿¹¸Å ³»¿ª Ãë¼Ò");
		System.out.println("4.ÀÚ¸® Á¶È¸");
		System.out.println("5.ÇÁ·Î±×·¥ Á¾·á");
		System.out.println("===================");
		String selectnum = sc.nextLine();
		return selectnum;
	}
	
	public void cinemaReserve() {  // ½ÇÇà ÇÔ¼ö
		loop: while (true) {
			String selectnum = showMenu(sc);
		 switch (selectnum) {
			case "1":
				showSeat(); // 1¹ø ¿¹¸ÅÇÏ¸é ÀÚ¸®ÇöÈ²À» º¸¿©ÁÖ°í °í¸£°Ô ÇÏÀÚ.
				reserveSeat(); // ÀÚ¸®¶û ÀÌ¸§À» ÀÔ·ÂÇÏ°í ¿¹¾àÇÏÀÚ.
				break ;
			case "2":
				showSeat(); // ÇöÀç ¿¹¸Å³»¿ªÀ» Á¶È¸. -> case1 - showSeat()°ú  ¶È°°Àº ÇÔ¼ö.
				break ;
			case "3":
				cancelSeat(); // Ãë¼Ò ÇÔ¼ö
				break ;
			case "4": 
				seatPrint(); // ¿¹¾àÇöÈ²
				break;
			case "5":  // Á¾·á
				System.out.println("ÀÌ¿ëÇØÁÖ¼Å¼­ °¨»çÇÕ´Ï´Ù. <ÇÁ·Î±×·¥ Á¾·á>");
				break loop;
			default:
				System.out.println("1~5 Áß ÇÏ³ª¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
				break;
			}
		}
	}


	public void reserveSeat() { // ¿¹¸ÅÇÏ´Â ÇÔ¼ö
		Pattern eng = Pattern.compile("^[a-zA-Z]*$"); // ¿µ¾î¸¸¾²´Â
		Pattern kor = Pattern.compile("^[°¡-ÆR]*$"); // ÇÑ±Û¸¸ ¾²´Â

		loop: do { // Çà, ¿­, ÀÌ¸§À» ¹«Á¶°Ç ÀÔ·Â ¹Ş¾Æ¶ó
			try {
				System.out.println("1~3 Áß ¿øÇÏ´Â Çà: "); // Çà ÀÔ·Â
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.println("1~5 Áß ¿øÇÏ´Â ¿­: ");
				row = Integer.parseInt(sc.nextLine()) - 1; // ¿­ÀÔ·Â
				
				System.out.println("¿¹¾àÀÚ¸í: ");
				while(sc.hasNextInt()) { //¹®ÀÚ °ªÀÌ¸é (true)¸é ¾Æ·¡¸¦ ½ÇÇàÇÏ°í whileÀ» ¹ş¾î³ª¶ó. °ÅÁşÀÌ¸é(¼ıÀÚ¸é) °è¼Ó µ¹¾Æ¶ó.
					sc.next(); //¼ıÀÚ°¡ ¿À¸é ´ã°í ¹ö¸°´Ù.
					System.out.println("ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				}
				name = sc.nextLine();
				
			} catch (Exception e) {
				System.out.println("Àß ¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
				return;
			}

			
			try {
				if (this.seat[col][row].equals("___")) {
					this.seat[col][row] = name;
					System.out.printf("[%s]´Ô [%d]Çà [%d]¿­ ¿¹¾à¿¡ ¼º°øÇÏ¼Ì½À´Ï´Ù\n", name, col + 1, row + 1);
					break loop; // do Å»Ãâ
				} else {
					System.out.println("ÀÌ¹Ì ¿¹¾à µÇ¾ú½À´Ï´Ù. ´Ù½Ã ¼±ÅÃÇØ ÁÖ¼¼¿ä");
				}
			} catch (Exception e) {
				System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù.");
			}
			
		} while (true);
	}

	private void showSeat() { // ¿¹¸Å³»¿ªÀ» Ç¥Ã³·³ º¸¿©ÁÖ´Â ÇÔ¼ö   case2
		for (int i = 0; i < this.seat.length; i++) {
			for (int j = 0; j < this.seat[i].length; j++) {
				System.out.printf("[%s]", this.seat[i][j].equals("___") ? "ÀÚ¸®" : "¿¹¸Å");
			}
			System.out.println();
		}
	}

	int division_name(String name) { // µ¿¸íÀÌÀÎ ±¸º° ÇÔ¼ö
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
	
	private void cancelSeat() { // ÀÚ¸® Ãë¼Ò ÇÔ¼ö    case3
		
		//int col, row;
		int name_count; //°°Àº ÀÌ¸§ÀÌ ¸î¹ø³ª¿Ô´ÂÁö È®ÀÎÇÏ´Â º¯¼ö¸í 
		String name = ""; // ¿¹¾àÀÚ ÀÌ¸§ 
			System.out.println("¿¹¾àÀÚ ÀÌ¸§À» ÀÔ·ÂÇØ ÁÖ¼¼¿ä");
			name = sc.nextLine();
			name_count = division_name(name);
			if(name_count > 1) { //µ¿¸íÀÌÀÎÀÌ ÀÖ´Ù¸é 
				System.out.println("µ¿¸íÀÌÀÎÀÌ ÀÖ½À´Ï´Ù. Ãë¼ÒÇÒ Çà°ú ¿­À» ÀÔ·ÂÇØÁÖ¼¼¿ä");
				System.out.print("ÇàÀ» ¼±ÅÃÇÏ¼¼¿ä:");
				col = Integer.parseInt(sc.nextLine()) - 1;
				System.out.print("¿­À» ¼±ÅÃÇÏ¼¼¿ä:");
				row = Integer.parseInt(sc.nextLine()) - 1;
				seat[col][row] = "___";
				System.out.println("ÁÂ¼® ¿¹¾àÀÌ Ãë¼ÒµÇ¾ú½À´Ï´Ù");
			}else if(name_count == 1){ // ¿¹¾àÀÚ°¡ ÀÖÀ¸¸é
				for(int i=0; i<seat.length; i++) {
					for(int j=0; j<seat[i].length; j++) {
						if(seat[i][j].equals(name)) {
							seat[i][j] = "___";
							System.out.println((i+1)+"Çà"+(j+1)+"¿­"+"ÁÂ¼® ¿¹¾àÀÌ Ãë¼ÒµÇ¾ú½À´Ï´Ù");
						}
					}
				}
			}else {
				System.out.println("¿¹¾àµÈ ÀÌ¸§ÀÌ ¾ø½À´Ï´Ù...");
			}

		}
	
	private void seatPrint() { // ÀÚ¸® Á¶È¸ ÇÔ¼ö
		for(int i=0;i<seat.length;i++) {
			for(int j=0;j<seat[i].length;j++) {
				System.out.print(seat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
