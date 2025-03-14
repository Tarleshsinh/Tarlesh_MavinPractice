package Infy_Tryout_increment_Decrement_operators;

//Define a record class Vehicle
record Vehicle(String modelName, String type, double basicPrice) {

 // Method to calculate tax based on vehicle type
 public double getTax() {
     if (type.equalsIgnoreCase("TwoWheeler")) {
         return basicPrice * 0.08; // 8% tax for two-wheelers
     } else if (type.equalsIgnoreCase("FourWheeler")) {
         return basicPrice * 0.12; // 12% tax for four-wheelers
     } else {
         throw new IllegalArgumentException("Invalid vehicle type");
     }
 }

 // Method to calculate discount based on total price (basic price + tax)
 public double getDiscount() {
     double totalPrice = basicPrice + getTax();
     if (totalPrice <= 100000) {
         return totalPrice * 0.01; // 1% discount
     } else if (totalPrice <= 200000) {
         return totalPrice * 0.02; // 2% discount
     } else if (totalPrice <= 500000) {
         return totalPrice * 0.03; // 3% discount
     } else if (totalPrice > 500000) {
         return totalPrice * 0.04; // 4% discount
     }
     return 0;
 }

 // Method to calculate the final price after tax and discount
 public double calculateFinalPrice() {
     double totalPrice = basicPrice + getTax();
     return totalPrice - getDiscount();
 }
}

public class VehicleTester {
 public static void main(String[] args) {
     // Case 1
     Vehicle vehicle1 = new Vehicle("Wrangler", "FourWheeler", 1000000);
     System.out.println("Model: " + vehicle1.modelName() + ", Final Price: Rs." + vehicle1.calculateFinalPrice());

     // Case 2
     Vehicle vehicle2 = new Vehicle("Nexon", "FourWheeler", 1100000);
     System.out.println("Model: " + vehicle2.modelName() + ", Final Price: Rs." + vehicle2.calculateFinalPrice());

     // Case 3
     Vehicle vehicle3 = new Vehicle("Pulsar", "TwoWheeler", 100000);
     System.out.println("Model: " + vehicle3.modelName() + ", Final Price: Rs." + vehicle3.calculateFinalPrice());
     
     Vehicle vehicle4 = new Vehicle ("Rajdoot", "TwoWheeler", 5000);
     System.out.println("Model:" + vehicle4.modelName() + ", Final Price: Rd." +  vehicle4.calculateFinalPrice());
 }
}