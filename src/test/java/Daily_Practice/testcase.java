package Daily_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase {

	public static WebDriver driver;
	public static SoftAssert softassert;
	 
	public static void main(String[] args) {
		
		 WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com");
	
		 softassert = new SoftAssert();
		
		softassert.assertTrue(driver.findElement(By.xpath("//a[@class='signin']")).isEnabled());
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='login1']")).isEnabled());
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@class='signinbtn']")).isDisplayed());
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		softassert.assertTrue(driver.findElement(By.xpath("//a[@class='rd_logout']")).isDisplayed());
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
		
		driver.quit();
		
		softassert.assertAll();
		
		
		
		
		
	}

}
