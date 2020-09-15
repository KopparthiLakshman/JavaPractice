package raghavan2;
public class Container extends Cargo {
	private String containerNumber;
	Cargo Container(){
		return this;
	}
	public Container(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	 Container() {
	}
	public String getContainerNumber() {
		return containerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public void displayContainerDetails() {
		//fill the code
	}
}
