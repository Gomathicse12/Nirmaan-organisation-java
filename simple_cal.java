package Day2;

import java.util.Scanner;

public class simple_cal {
	public static void main (String ars[])
	
	{
		Scanner sc= new Scanner(System.in);
	
		
		System.out.println("Enter your choice");
		System.out.println("0 for addition");
		System.out.println(" 1 for sub");
		System.out.println(" 2 for mul");
		System.out.println("3 for div");
		System.out.println(" 4 for moduluds");
		 
	int key= sc.nextInt();
	int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
//		if (key==0) {
//			int total = firstNum+secondNum;
//			System.out.println("addition :"+total);
//		}else if (key==1) {
//				int total=firstNum-secondNum;
//				System.out.println(" sub:"+total);
//		}else if (key==2) {
//			int total=firstNum-secondNum;
//			System.out.println("mul:"+total);
//		}else if (key==3) {
//			int total=firstNum-secondNum;
//			System.out.println("div:"+total);
//			}else if (key==4) {
//				int total= firstNum%secondNum;
//				System.out.println(" modulus:"+total);
//		
	//	}
		switch (key) {
		case 0: {
			int total=firstNum+secondNum;
			System.out.println("add:"+total);
			break;}
		case 1: {
			int total=firstNum+secondNum;
			System.out.println("Sub:"+total);
			break;}
		case 2: {
			int total=firstNum+secondNum;
			System.out.println("mul:"+total);
			break;}
		case 3: {
			int total=firstNum+secondNum;
			System.out.println("div:"+total);
			break;}
		case 4: {
			int total=firstNum+secondNum;
			System.out.println("mod:"+total);
			break;
		}
		default:
			 System.out.println("invalid");
		}
		
		
	}
}
