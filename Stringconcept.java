package Day5;

import java.util.Scanner;

public class Stringconcept{
	public static void main(String argd[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println(name. substring(0,7));
		
		System.out.println(name.charAt(8));		
	}

}
