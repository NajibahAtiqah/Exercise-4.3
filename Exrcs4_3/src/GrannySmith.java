
public class GrannySmith extends Apple {
private double discount;
	
	public GrannySmith(int q, int p, double d) {
		super(q, p);
		discount = d;

	}
	
	public double getDiscount() {
		return quantity*price*this.discount;
	}
	
	public double getTotalDiscount() {
		return quantity*price*getDiscount();
	}
	
	public double TotalPaid() {
		return (quantity*price)-getTotalDiscount();
	}
	
	
	public String toString() { //overriding method(apple)
		return "Name: Granny Smith"
				+"\nQuantity of fruit: "+ quantity 
				+"\nPrice of fruit/unit: " + "RM" + priceperunit
				+"\nDiscount Given: "+getDiscount()+ " %"
				+"\nTotal Discount: " + "RM "+getTotalDiscount()
				+"\nTotal After Discount: RM "+TotalPaid();
}
}
