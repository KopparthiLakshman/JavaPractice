package compareTo;

public class Laptop /* implements Comparable<Laptop> */{

	private String Brand;
	private int Ram;
	private int Price;
	
	public Laptop(String Brand, int Ram, int Price) {
		
		this.Brand = Brand;
		this.Ram = Ram;
		this.Price = Price;
		
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	
	public String toString() {
		return "Laptop " + Brand+ " price "+Price+" and ram  "+Ram;
	}
	
//	@Override
//	public int compareTo(Laptop lap2) {
//		return this.getBrand().compareTo(lap2.getBrand());
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Laptop))
//			return false;
//		if(obj == this)
//			return true;
//		return this.Brand == ((Laptop)obj).Brand 
//				&& this.Price == ((Laptop)obj).Price
//				&& this.Ram == ((Laptop)obj).Ram;
//	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		return result = prime * result + ((Brand == null ) ? 0 : Brand.hashCode());
//	}
	
	
	
	
	
}
