package collections;

public class Employee {


	public int empID;
	public String empName;

	public Employee(String empName, int empID) {
		super();
		this.empName = empName;
		this.empID = empID;
	}
	
	
	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	void display(){
		System.out.println("Emp id :: "+ getEmpID() + "Emp name :: "+ getEmpName());
	}

}
