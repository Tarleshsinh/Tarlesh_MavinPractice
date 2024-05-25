package MouseHoverAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubleclick_rightclick_alert {
public static WebDriver driver;
	//Switch to a specific window out of 100 windows and validate it in #Selenium [naveen automation link]
@Test
public static void doubleclick() {

	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/buttons");
	Actions action=new Actions(driver);
	WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	action.doubleClick(doubleclick).build().perform();
	Assert.assertTrue(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed());
	driver.close();
	
}

@Test
public static void rightclick () throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); 
	driver.manage().deleteAllCookies();
	
	  driver.get("https://demoqa.com/buttons");  
	  Actions act = new Actions(driver);
	  WebElement rightclick =
	  driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	  act.contextClick(rightclick).perform();
	  Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Right Click Me']")).isDisplayed());  
	  driver.close();
}
	  @Test
	  public static void rightclicwith_Alert () throws Exception {
		  
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act = new Actions(driver);
	WebElement rightclick1 = driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(rightclick1).perform();
	Thread.sleep(2000);
	//act.contextClick(driver.findElement(By.xpath("//span[text()='right click me"))).perform();
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	Thread.sleep(2000);
	System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept(); 
	Alert alert = driver.switchTo().alert();
	alert.accept();
	driver.quit();
}
	
}
	

