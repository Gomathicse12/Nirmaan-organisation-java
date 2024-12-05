package day9;

public class car {
	String make;
	int year;
	
	 car() {
		this.make="unknown";
		this.year=2000;}
	 
		car(String make){
			this.make=make;
			this.year=2000;}
		
			car(String make,int year) {
			
				this.make=make;
				this.year=year;
				}
			 void displaycardetails() {
			 System.out.println("makeis:"+make);
			 System.out.println("yearis:"+year);
			 }
}
