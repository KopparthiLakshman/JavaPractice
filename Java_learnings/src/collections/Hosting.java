package collections;

public class Hosting {

	int id;
	String name;
	int salary;
	

	public Hosting(int id, String name, int salary) {
		this.salary=salary;
		this.id=id;
		this.name = name;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
	
}
