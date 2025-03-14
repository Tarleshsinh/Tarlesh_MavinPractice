package Infy_Tryout_increment_Decrement_operators;

public class Assertion_Test {

	double discount;
	public void calculateDiscount (Asertion type) {
	switch (type) {
	case Standard:
		discount = 5;
		break;
	case Gold:
		discount = 10;
		break;
	case Silver:
		discount = 12;
		break;
	case Platinum:
		discount = 90;
		break;
		default :
	//First way
		assert false;
		// Second way
		assert false : "No Configration" + type + "customer";
	}
	System.out.println("Customer has got discount of:" + discount + "%");
	}
	
	public static void main(String[] args) {
		
		Assertion_Test obj = new Assertion_Test();
		obj.calculateDiscount(Asertion.Platinum);

	}

}
