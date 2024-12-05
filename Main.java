package day9;

public class Main {
	public static void main (String args[]) {
		car c=new car();
		c.displaycardetails();
		car c2=new car("Maruti");
		c2.displaycardetails();
		car c3=new car("BMW",2003);
		c3.displaycardetails();
	}

}
