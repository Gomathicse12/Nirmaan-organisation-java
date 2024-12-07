package day12;

public class Book {
 private String bookName;
 private String authorName;
 private double price;
 private int copies;
 
 Book(){
	 
 }
 public String getBookName() {
   return bookName;
 }
  public String getauthorName() {
	  return authorName;
  }
  public double getprice() {
	  return price;
  }
  public int getcopies() {
	  return copies;
  }
 public void setauthorName (String authorName) {
	 this.authorName=authorName;
 }
 public void setprice (double price) {
	 this.price=price;
 }
 public void setbookName (String bookName) {
	 this.bookName=bookName;
 }
 public void setcopies (int copies) {
	 this.copies=copies;
 }
 public String toString() {
	 return "bookName:"+bookName+" ,authorkName: "+authorName +" ,price:"+ price +" , copies:"+ copies;
 }
 
 }
 


