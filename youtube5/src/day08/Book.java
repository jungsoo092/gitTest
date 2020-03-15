package day08;

public class Book {


private String bookname;

    private int bookprice;

//    public Book(String name, int price) { //중간자
//        bookname = name;
//        bookprice = price;
//    }

    public void bookInfo() {
        System.out.println("책이름 : " + bookname + " / " + "가격: " + bookprice);
    }

    
    
    public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookname() {
        return bookname;
    }

    public int getBookprice() {
        return bookprice;
    }

}
