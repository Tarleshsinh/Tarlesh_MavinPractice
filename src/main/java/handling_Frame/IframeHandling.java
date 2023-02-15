package handling_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {
public  WebDriver driver;
	
@Test
public void iframe() {
	WebDriverManager.chromedriver().setup();
	driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	driver.switchTo().frame("singleframe");
	driver.quit();
}
	
}
