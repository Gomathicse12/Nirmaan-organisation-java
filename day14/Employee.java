package day14;

public class Employee {
	private String EmpName;
	private String EmpDep;
	private  long EmpNum;
	private int EmpId;
	
	public Employee(){
		
	}

	public Employee(String empName, String empDep, long empNum, int empId) {
		super();
		EmpName = empName;
		EmpDep = empDep;
		EmpNum = empNum;
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDep() {
		return EmpDep;
	}

	public void setEmpDep(String empDep) {
		EmpDep = empDep;
	}

	public long getEmpNum() {
		return EmpNum;
	}

	public void setEmpNum(long empNum) {
		EmpNum = empNum;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpDep=" + EmpDep + ", EmpNum=" + EmpNum + ", EmpId=" + EmpId + "]";
	}
	
}
