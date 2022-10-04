package MouseHoverAction;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_hover {
public WebDriver driver;
	

@Test
public void mousehoveropencart() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().deleteAllCookies();
	driver.get("https://demo.opencart.com/");
	WebElement desktopmenuitem=driver.findElement(By.xpath("//div[@id='narbar-menu']/child::ul[1]/child::li[1]/child::a[1]"));
	WebElement macmenuitem= driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(desktopmenuitem).moveToElement(macmenuitem).click().perform();
	driver.navigate().back();
	Thread.sleep(2000);
	WebElement back=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement click = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	act.moveToElement(back).moveToElement(click).click().perform();
	Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'iMac')]")).isDisplayed());
	driver.quit();
	
}
	
	
	
	
}
