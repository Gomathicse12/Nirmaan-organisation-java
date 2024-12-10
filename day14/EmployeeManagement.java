package day14;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String args []) {
	Employee emp=new Employee();
	boolean istrue=true;{
	while (istrue) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for add Employeedetails");
		System.out.println("Enter 2 for update Employeedetails");
		System.out.println("Enter 3 for show Employeedetils");
		System.out.println("Enter 0 for exit");
		int key=sc.nextInt();
		sc.nextLine();
		
		switch (key) {
		
		case 1:{
			emp=new Employee("kaviya","science" , 2034567891, 11);
			break;
		}
		case 2: {
			System.out.println("Enter EmpName");
			String EmpName=sc.nextLine();
			emp.setEmpName(EmpName);
			
			System.out.println("Enter EmpDep");
			String EmpDep=sc.nextLine();
			emp.setEmpDep(EmpDep);
			
			System.out.println("Enter EmpNum");
			long EmpNum=sc.nextLong();
			emp.setEmpNum(EmpNum);
			
			System.out.println("Enter EmpId");
			int  EmpId=sc.nextInt();
			emp.setEmpId(EmpId);
			break;
			}
	
		
		case 3:{
			System.out.println(emp);
			break;
		}
		
		case 0:{
			istrue=false;
			System.out.println("EXIT");
			break;
			}
	
	   default: {
		   System.out.println("enter correct choice");
		break;}
		}
		}
	  }
	}
}	
	
		
		
		
