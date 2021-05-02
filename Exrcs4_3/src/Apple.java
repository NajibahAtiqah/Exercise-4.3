
public class Apple extends Fruits{
	protected int quantity;
	protected double price;
	protected double priceperunit;
	protected double total;
	
	public Apple() {//constructor with no argument
		super();
		price = 0;
		quantity = 0;
	}
	public Apple(double p,int q) {
		price=p;
		quantity=q;
		TotalPrice(p);	
		TotalPrice(p,q);
	}
	
		public double TotalPrice() {
		return total= 0;
		
	}
		
		public double TotalPrice(double p) {
		return priceperunit= p;
	}
	
		public double TotalPrice(double p, int q) {
			total = p*q;
			return total;
			
	}
		
		
		
		public String toString() {//overriding method(Fruits)
				return "Name: Apple"
					+"\nQuantity of fruit: "+ quantity 
					+"\nPrice of fruit/unit: " + "RM" + priceperunit
					+"\nTotal Price: " + "RM" + total;

					
			}
		{
	}	
}
