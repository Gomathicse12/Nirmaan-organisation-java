package day20;

public class Book {
	
		private String bookname ;
		private double bookprice ;
		
		
		public Book() {
			super();
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public double getBookprice() {
			return bookprice;
		}
		public void setBookprice(double bookprice) {
			this.bookprice = bookprice;
		}
		public Book(String bookname, double bookprice) {
			
			this.bookname = bookname;
			this.bookprice = bookprice;
		}
		@Override
		public String toString() {
			return "Book [bookname=" + bookname + ", bookprice=" + bookprice + "]";
		}
		
	}


