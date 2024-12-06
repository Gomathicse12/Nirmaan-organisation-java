package day10;

public class Nirmaanorg {
	public static void main(String arga[]) {
		Company C1=new Company();
		C1.setEmpid(123);
		C1.setEmpdep("devloper");
		C1.setEmpname("gom");
		System.out.println(C1.getEmpid());
		System.out.println(C1.getEmpdep());
		System.out.println(C1.getEmpname());
		System.out.println(C1.toString());
	
	Company C2=new Company();
	C2.setEmpid(124);
	C2.setEmpdep("devloper");
	C2.setEmpname("abi");
	System.out.println(C2.getEmpid());
	System.out.println(C2.getEmpdep());
	System.out.println(C2.getEmpname());
	System.out.println(C2.toString());
}
}