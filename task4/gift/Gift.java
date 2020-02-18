package epam.Epam;

import epam.Epam.CoffeByte;
import epam.Epam.Gift;
import epam.Epam.MangoByte;

public class Gift {
	String name ="";
	int totalWeight=0;
	Gift(String name, int x, int y)
	{
		this.name = name;
		CoffeByte c = new CoffeByte();
		MangoByte m = new MangoByte();
		this.totalWeight = (int)c.getWeight()*(int)x + (int)m.getWeight()*(int)y ;
	}
	
	public String toString(){
		 return (name+" "+totalWeight);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalWeight() {
		return totalWeight;
	}
	
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	public int compareTo(Gift o) {
		
		return (int)(o.totalWeight);
	}
}