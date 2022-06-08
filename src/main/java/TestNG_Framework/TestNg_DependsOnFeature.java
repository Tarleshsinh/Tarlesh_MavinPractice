package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_DependsOnFeature {

	public static WebDriver diver;
	private static ChromeDriver driver;
	
	
	@Test
	public void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();	
	//int i = 9/0;
		
	}
	
	@Test(dependsOnMethods="launchbrowser")
	public void launchurl() {
		driver.get("https://www.rediff.com");
		driver.close();
		System.out.println("launchurl");
	}
	
	@Test(dependsOnMethods="launchbrowser")
	public void launchurl1() {
		//driver.get("https://www.amazon.com");
		//driver.close();
		System.out.println("lauchurl1");
	}
	
	@Test(dependsOnMethods="launchbrowser")
	public void launchurl2() {
		//driver.get("https://www.google.com");
		//driver.close();
		System.out.println("launch url2");
	}
	
	@Test(dependsOnMethods="launchbrowser")
	public void launchurl3() {
		//driver.get("https://www.facebook.com");
		//driver.close();
		System.out.println("launch url 3");
	}
	
}
