package raghavan2;
public class Cargo extends Main {
	protected Float length;
	protected Float width;
	protected Float height;
	protected Double weight;
	Cargo(){}
	public Cargo(Float length, Float width, Float height, Double weight) {
//		super.length = length;
		this.length = length;
		this.height = height;
		this.width = width;
		this.weight = weight;
	}
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
