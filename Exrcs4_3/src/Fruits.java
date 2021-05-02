
public class Fruits {
protected String name;
	
	public Fruits () {
		name=null;
	}
	
	public Fruits(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // overriding
		return "We should take " + name + " as our daily intake.";
}
}
