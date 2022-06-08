package softAssert_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertpractice1 {
SoftAssert softassert= new SoftAssert();
	@Test
	public void test1() {
		
		String trisha= "Tarlesh";
		Assert.assertTrue(trisha.contains("kamini"), "Name dosesent match");
		
		
		//softassert.assertAll();
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	
}
