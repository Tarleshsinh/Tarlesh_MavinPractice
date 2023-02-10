package CheckBox_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sukumar {

	WebDriver driver;
	
	
	@Test
	public void method () throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("HDMI splitter");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.quit();
		
		
		
	}
	
	
	
}
