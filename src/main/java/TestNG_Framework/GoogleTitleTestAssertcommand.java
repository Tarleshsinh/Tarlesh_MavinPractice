package TestNG_Framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTitleTestAssertcommand {
WebDriver driver;

@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
