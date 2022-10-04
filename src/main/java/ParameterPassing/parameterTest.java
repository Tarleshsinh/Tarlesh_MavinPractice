package ParameterPassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterTest {
	public static WebDriver driver;
	SoftAssert softassert= new SoftAssert();
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void redifflogintest(String browser, String url, String username, String password) {
		if (browser.equals("chrome")) { 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else if (browser.equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
		} else if (browser.equals("safari")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.getTitle();
		System.out.println("This is a Title of Page");
		
	
		
		
		softassert.assertTrue(driver.findElement(By.xpath("//a[@class='signin']")).isEnabled());
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='login1']")).isEnabled());
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(username);
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		softassert.assertTrue(driver.findElement(By.xpath("//input[@class='signinbtn']")).isDisplayed());
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		softassert.assertTrue(driver.findElement(By.xpath("//a[@class='rd_logout']")).isDisplayed());
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
		
		driver.quit();
		
		softassert.assertAll();
		
	}
	
	
	
	
}
