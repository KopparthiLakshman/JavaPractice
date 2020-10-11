package collections;

public class Student {

	private int id;
	private String name;
	private String dept;
	private int totalMarks;
	public Student(int id, String name, String dept, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.totalMarks = totalMarks;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	@Override
	public String toString() {

		return this.dept+"   ::  "+this.id;
	}
}
