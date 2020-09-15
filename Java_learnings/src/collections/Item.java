package collections;

public class Item {
	String name;
	String college;

	public Item(String name, String college) {
		this.name = name;
		this.college=college;
	}

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
