package TestNG_Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TestNG_Framework1 extends TestBase {
	//pre condition annotation starts with before 
	@BeforeSuite//1
	public void setup () {
		System.out.println("set up sytem for chrome ");
	}
	
	@BeforeTest //2
	public void launchbrowser() {
		System.out.println("launchbrowser");
		
		
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("launch chrome browser");
	}

	
	@BeforeMethod//4 
	public void enterurl() {
	System.out.println("enter url");	
	}
	
	
	
	// test cases starts with @Test 
	@Test(priority=1) //5
	public void googletitletest() {
		System.out.println("google title test case");
	}
	
	@Test(priority=2)
	public void searchtest() {
		System.out.println("search test ");
	}
	
	@Test(priority=3)
	public void googlelogotest() {
		System.out.println("google logo test ");
	}
	// post condition starts with @after 
	@AfterMethod //6
	public void logout() {
		System.out.println("logout form app");
		
	}
	
	
	@AfterTest //7
	public void deleteallcookies() {
		System.out.println("delete all cookies ");
}
	
	@AfterClass//8
	public void closebrowser()
	{	
		System.out.println("close browser");
	
}
	
	@AfterSuite//9
	public void generatetestreport() {
	System.out.println("generatetestreport");
	}
}

