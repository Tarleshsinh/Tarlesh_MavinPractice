package TestNG_Framework;

import org.testng.annotations.Test;

public class ExceptionTimeoutTEst {

//@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
public void infiniteloop() {
	int i = 1;
	while (i==1) {
		System.out.println(i);
	}
	
}
	
@Test(expectedExceptions=NumberFormatException.class)
public void test1() {
	String a= "100A";
	Integer.parseInt(a);
}
	
	
	
}
