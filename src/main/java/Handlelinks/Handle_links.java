package Handlelinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_links {
public WebDriver driver;

@Test
public void handlelinks() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.linkText("Today's Deals")).click();
	//driver.findElement(By.partialLinkText("Today's ")).click();
	//driver.findElement(By.partialLinkText("offers")).click();
	
	// how to capture total links
	List<WebElement>alllinks= driver.findElements(By.tagName("a"));
	System.out.println("Number of links :"+ alllinks.size());
	
	//print all the links in console
	
	for(int i= 0; i<=alllinks.size(); i++)
	{ System.out.println(alllinks.get(i).getText());
	System.out.println(alllinks.get(i).getAttribute("href"));}
	
	for(WebElement link: alllinks)
		{System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));}
		
		
	driver.quit();
	
}
	
	
	
	
}
