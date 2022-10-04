package Handlelinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleBrokenLink {
public WebDriver driver;


@Test
public void Pawan_BrokenLInk () throws MalformedURLException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.get("http://www.deadlinkcity.com/");
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	int BrokenLinks=0;
	
	for(WebElement element:links) {
		
		String url=element.getAttribute("href");
		if(url== null ||url.isEmpty()) {
			System.out.println("URL is Empty");
			continue;
		}
	
		URL link=new URL(url);
		try {
			HttpURLConnection httpsconn=(HttpURLConnection) link.openConnection();
			httpsconn.connect();
			if(httpsconn.getResponseCode()>=400){
				System.out.println(httpsconn.getResponseCode()+url+"is"+ "Broken Link");
				BrokenLinks++;
			}
			
			else {
			System.out.println(httpsconn.getResponseCode()+url+"is" +"Valid Link");
				
			}
			
		} catch (Exception e) {
			
			
		}
		
		
	}
	
	System.out.println("Number of Broken Links" + BrokenLinks);
	
	driver.quit();
	
}




}
