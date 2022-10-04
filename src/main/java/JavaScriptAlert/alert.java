package JavaScriptAlert;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
public WebDriver driver;

@Test
public void alertPawan() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().deleteAllCookies();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	// alert with single ok button 
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
	driver.switchTo().alert().accept();
	
	
	// how to handle alert with ok and cancel button 
	
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	// Alert window with input box
	
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	Alert alertwindow= driver.switchTo().alert();
	System.out.println("The Message Displayed on alert box"+ alertwindow.getText());
	alertwindow.sendKeys("Welcome");
	alertwindow.accept();
	
	Assert.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).isDisplayed());
	driver.quit();
	
}


}
