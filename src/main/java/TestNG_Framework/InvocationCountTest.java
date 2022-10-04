package TestNG_Framework;

import org.testng.annotations.Test;

import testBase.TestBase;

public class InvocationCountTest extends TestBase {

	@Test(invocationCount=5)
	public void sum() {
		
		int a= 10000;
		int b = 20;
		int c= a+b;
		System.out.println("sum is === "+ c);
		
	}
	
	
	
	
}
