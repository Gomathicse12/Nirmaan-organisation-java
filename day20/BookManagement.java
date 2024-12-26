package day20;


import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
public static void main(String[] args) {
	Book b1=new Book();
	ArrayList<Book> al=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	boolean isthere=true;
	while(isthere) {
		
				System.out.println("Enter your choice");
				System.out.println("Enter 1 for add");
				System.out.println("Enter 2 for update");
				System.out.println("Enter 3 for show");
				System.out.println("Enter 4 for remove");
				System.out.println("Enter 0 for exit");
				int key=sc.nextInt();
			    sc.nextLine();
			    
				if(key==1) {
					System.out.println("Enter bookname");
					String bookname=sc.nextLine();
					System.out.println("Enter bookprice");
					double bookprice=sc.nextDouble();
					al.add(b1= new Book(bookname,bookprice));
				}
				else if(key==2){
					System.out.println("bookname");
					String select=sc.nextLine();
			    for(Book book1:al) {
				if (select.equalsIgnoreCase(book1.getBookname()))
				{ 
			    System.out.println("enter bookname");
			     String bookname=sc.next();
			     book1.setBookname(bookname);
			     System.out.println("Bookprice");
			     double bookprice=sc.nextDouble();
			     book1.setBookname(bookname);
			     
				}}
				}
				if(!isthere) {
					System.out.println("not there");
				}
				
				else if (key==3) {
					System.out.println(al);
				}
				else if (key==4) {
					System.out.println("bookname");
					String bookname=sc.nextLine();
					String select1=sc.nextLine();
					 for(Book book2:al) {
						 if (select1.equalsIgnoreCase(book2.getBookname()))
						 {
							 al.remove(book2);
						 }
					 }
				}
					 else {
						 System.out.println("THANK YOU");
						 isthere=false;
					 }
			}
	
}
	}



	





