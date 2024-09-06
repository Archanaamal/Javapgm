package oopspgms;
class Employeedetails
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}

public class Encapsulationn {

	public static void main(String[] args) {
		
		Employeedetails emp=new Employeedetails();
		emp.setEmpid(1002);
		emp.setEmpname("Anu");
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());

	}

}
