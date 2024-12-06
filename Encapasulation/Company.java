package day10;

public class Company {
	private int Empid;
	private String Empdep;
	private String Empname;
	 
	public  int getEmpid() {
		return Empid;
	}
	public  String getEmpdep() {
		return Empdep;
	}
	public  String getEmpname() {
		return Empname;
	}
	public  void setEmpid(int Empid) {
		this.Empid=Empid;
	}
	public  void setEmpdep(String Empdep) {
		this.Empdep=Empdep;
	}
		public  void setEmpname(String Empname) {
			this.Empname=Empname;
		}
		public String toString() {
			return ("Empid is:"+ Empid+"\nEmpdep is:"+ Empdep+"\nEmpname is:"+ Empname);
	}
	Company(){
		
	}
	}
	
	
	
	


