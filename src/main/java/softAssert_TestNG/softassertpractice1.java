package softAssert_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertpractice1 {
SoftAssert softassert= new SoftAssert();
	@Test
	public void test1() {
		
		String trisha= "Tarlesh";
		//Assert.assertTrue(trisha.contains("Tarlesh"), "Name dosesent match");
		Assert.assertTrue(trisha.contains(null));
		
		
		softassert.assertAll();
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	
}
