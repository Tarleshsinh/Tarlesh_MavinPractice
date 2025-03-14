package Infy_Tryout_increment_Decrement_operators;

public class Refrence_Type_Array {

	public static void main(String[] args) {
		Customer [] customer = new Customer [2]; // Refrence Type Aray
		Customer customer1 = new Customer ("John","Acc12345");
		Customer customer2 = new Customer ("Pete","Acc12346");
		customer[0] = customer1;//storing in the array
		customer[1]= customer2;
		for (int i=0;i<customer.length;i++) {//traversing the array
			Customer customerObject= customer [0];//retrieving customer object
			String name = customerObject.getcustomerName();
			System.out.println("Customer name is ..."+ name);
			
		}
	}
}

class Customer {
	
 String name;
 String customerID;
Customer (String uname, String ucustomerID) {
	name = uname;
	customerID = ucustomerID;
}

public String getcustomerName () {
return name;
}
}

