package TestNG_Framework;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.TestBase;

public class GoogleTitleTestAssertcommand extends TestBase {
WebDriver driver;

@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
}

@Test 
public void googletitletest() {
	
	String title= driver.getTitle(); 
	//System.out.println(title);
	
	Assert.assertEquals(title, "Google", "Title is not matched");
	
}

@Test
public void gogglelogoTest () {
   boolean b = driver.findElement(By.className("lnXdpd")).isDisplayed();
	//Assert.assertTrue(b);
	Assert.assertEquals(b, true);
	
}
	
@AfterMethod
public void quitbrowser() {
	driver.quit();
}
	
	
	
}
