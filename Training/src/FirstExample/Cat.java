package FirstExample;

public class Cat {
	private String color;
	private double weight ;
	private String ownerName;
	
	public Cat(String colorName,double funt,String owner) {
		this.color = colorName;
		this.weight = funt;
		this.ownerName = owner;
	}
	
	public String toString() {
		return color + "," + weight + "," + ownerName;
	}
}
