package TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Framework2 {

	public static WebDriver diver;
	private static ChromeDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		
	}
	// group by is use to define groups in test 
	@Test(priority=1, groups="username")
	public void enterusername () {
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediff.com");
		System.out.println("Enter User Name ");
	}
	
	@Test(priority=2,groups="password")
	public void password() {
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		System.out.println("Enter Password");
	
		
	}
	@Test(priority=3,groups="logout")
	public void logout () {
		
	}
	
	@Test (priority=4,groups="click")
	public void clicksignin () {
		
		
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
		System.out.println("close the driver");
		
	}

	
	
	
	
	
}
