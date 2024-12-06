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
	}

}
