package implicitAndExplicitwait;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {
public WebDriver driver;


@Test
public void ExplicitwaitPawan () {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	driver.findElement(By.name("q")).sendKeys("Amazon");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	//driver.findElement(By.xpath("//button[@id='loginbutton']"));
	
	WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Amazon.ca: Low Prices – Fast Shipping – Millions o')]")));
	element.click();
	WebElement login= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	WebElement signin=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/child::a/child::span"));
	
	Actions act= new Actions(driver);
	act.moveToElement(login).moveToElement(signin).click().perform();
	
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("tarlesh_parmar@yahoo.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("1234eryd");
	driver.quit();
	
	


}




}
