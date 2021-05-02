
public class FujiApple extends Apple{
	private int weight;
	private int tall;
	private int maxgrowth;
	private int mingrowth;

	public FujiApple(int q, int p, int w, int t, int m, int n) {
		super(q, p);
		this.weight = w;
		this.tall = t;
		this.maxgrowth = m;
		this.mingrowth = n;
	}
	
	public int getWeight() {//overloading method
		return this.weight;
	}
	
	public int getWeight(int weight) {
		return weight;
	}
	
	public double CalAgeOfAppleTreeMax() {
		return (tall*12)/maxgrowth;
	}
	
	public double CalAgeOfAppleTreeMin() {
		return (tall*12)/mingrowth;
	}
	
	public int TotalWeight() {
		return super.quantity*weight;
	}
	
	// overriding method
		public String toString() {
			return "Name: Fuji Apple"
					+"\nQuantity of fruit: "+ quantity 
					+"\nPrice of fruit/unit: " + "RM" + priceperunit
					+"\nWeight : " +weight + " grams"
					+"\nEstimated age of tree is in between: " +CalAgeOfAppleTreeMin() + " to " +CalAgeOfAppleTreeMax() + " years";
}
}
