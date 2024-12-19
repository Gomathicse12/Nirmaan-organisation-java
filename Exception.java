package day19;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter age");
			int age=sc.nextInt();
			if(age>=20){
			System.out.println("allow to perform");
			}
			else {
				throw new ArithmeticException();
			}
		}
		catch (ArithmeticException e){
			System.out.println("error");
			
		}
		finally {
		
		
			System.out.println("hi");
		
		 
			
	}
	}
}

