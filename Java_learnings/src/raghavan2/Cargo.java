package raghavan2;
public class Cargo {
	
	protected int length;
	protected int width;
	protected int height;
	protected int weight;
	
	public Cargo(int length, int width, int height, int weight) {
		this.length = length;
		this.height = height;
		this.width = width;
		this.weight = weight;
	}
	
	/*
	 * public int getLength() { return length; } public void setLength(int length) {
	 * this.length = length; } public int getWidth() { return width; } public void
	 * setWidth(int width) { this.width = width; } public int getHeight() { return
	 * height; } public void setHeight(int height) { this.height = height; } public
	 * int getWeight() { return weight; }
	 * 
	 * public void setWeight(int weight) { this.weight = weight; }
	 */

	@Override
	public String toString() {
		return  "length  : "+length; 
	}
}
