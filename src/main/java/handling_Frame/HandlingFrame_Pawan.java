package handling_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame_Pawan {
public WebDriver driver;

@Test
public void handleframe() throws Exception {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//Switch to first Frame
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	
	// Switch to second frame 
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(2000);

	//driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
	//driver.findElement(By.cssSelector("a[title='class in org.openqa.selenium.support.pagefactory'][href='org/openqa/selenium/support/pagefactory/AbstractAnnotations.html']")).click();
		
	//switch to third frame
	driver.switchTo().frame("classFrame");
	driver.findElement(By.cssSelector("a[href='org/openqa/selenium/chromium/package-summary.html']")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chromium')]")).click();
	
	
}
	
	
	
}
