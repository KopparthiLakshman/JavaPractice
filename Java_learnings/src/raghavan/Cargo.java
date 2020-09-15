package raghavan;

public class Cargo {
	
	private String name;
	private String description;
	private Float width;
	private Float length;
	private String status;
	
	public Cargo(String name, String description, Float width,  Float length, String status) {
		this.name = name;
		this.description = description;
		this.width = width;
		this.length = length;
		this.status = status;
	}

	
	
	public Cargo() {
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
		

}
