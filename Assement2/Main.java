package day12;

import java.util.Scanner;

public class Main {
public static void main(String args []) {
	Book b= new Book();
	boolean istrue=true;
	while(istrue) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter choice");
	System.out.println("Enter 1 for add");
	System.out.println("Enter 2 for show");
	System.out.println("Enter 3 for exit");
	int key=sc.nextInt();
	sc.nextLine();
	
	switch (key){
	case 1:{
	System.out.println("enter book name");
	String bookname=sc.nextLine();
	b.setbookName(bookname);
	
	System.out.println("enter author name");
	String authorname=sc.nextLine();
	b.setauthorName(authorname);
	
	System.out.println("enter price");
	double price=sc.nextDouble();
	b. setprice(price);
	
	System.out.println("enter choice");
	int choice=sc.nextInt();
	b. setprice(choice);
	break;
    }
	case 2:{
		System.out.println(b);
		break;
	}
	
	case 3:{
		istrue=false;
		System.out.println("Nandri");
		break;
	}
	default:{
		System.out.println("enter correct choice");
		break;
		
	}
   }
  }
 }
}

