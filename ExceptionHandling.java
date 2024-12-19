package day18;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		try {
			System.out.println("enter a value");
			int a=sc.nextInt();
			System.out.println("enter b value");
			int b=sc.nextInt();
			c=a/b;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("total :" +c);
		sc.close();
	}

}
