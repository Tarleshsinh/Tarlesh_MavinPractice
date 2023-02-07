package TestNG_Framework;

import org.junit.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class ExceptionTimeoutTEst extends TestBase {

//@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
public void infiniteloop() {
	int i = 1;
	while (i==1) {
		System.out.println(i);
	}
	
}
	
@Test(expectedExceptions=NumberFormatException.class)
public void test1() throws Exception {
	String a= "100A";
	Integer.parseInt(a);
	log(a);
	Thread.sleep(3000);
	log(a);
	Assert.assertTrue(false);
	System.out.println(a);
}
	
	
	
}
