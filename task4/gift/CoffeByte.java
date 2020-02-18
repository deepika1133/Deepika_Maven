package epam.Epam;

public class CoffeByte {
	String name = "Coffe Byte";
	String flavour = "Coffe flavour";
	int weight=5;
	
	CoffeByte(){
		
	}
	public void flavour() {
		
		System.out.print("Coffee flavour");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFlavour() {
		return flavour;
	}
	
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}