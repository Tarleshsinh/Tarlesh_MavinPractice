package Infy_Tryout_increment_Decrement_operators;

public class thiskeyword_method2 {

	void method1() {
		System.out.println("Inside method 1");
	}
	
	void method2 () {
		//this keyword applied on method
		this.method1();
		System.out.println("Inside Method 2");
	}
	public static void main(String[] args) {
		thiskeyword_method2 method = new thiskeyword_method2();
		method.method2();

	}

}
