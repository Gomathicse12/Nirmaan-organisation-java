package dy15;

import java.util.Scanner;

public class UserInterface {
	public static void main( String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		System.out.println("Enter b Value");
		int b=sc.nextInt();
		Calculator cal=new Calculator();
		System.out.println ("add="+cal.add(a, b));
		System.out.println("sub="+cal.sub(a, b));
		System.out.println("div="+cal.div(a, b));
		System.out.println("mul="+cal.mul(a, b));
		System.out.println("mod="+cal.mod(a, b));
		sc.close();
		
		
	}
}
