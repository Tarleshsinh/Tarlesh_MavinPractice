package ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fullpage_Screenshot {
public WebDriver driver; 
	
	@Test
	public void fullpage_Screenshot () throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//Full Page screenshot
		 TakesScreenshot Shot= (TakesScreenshot)driver;
		 File src= Shot.getScreenshotAs(OutputType.FILE);
		 File target= new File(".//screenshots//homepage.png");
		 
		 FileUtils.copyFile(src, target);
		 
		 // Section of the page screen shot 
		 
		 WebElement section= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']/child::div[2]"));
		 File src1= section.getScreenshotAs(OutputType.FILE);
		 File target1 = new File(".//screenshots//featuredproducts.png");
		 FileUtils.copyFile(src1, target1);
		 
		 // Specific webelemnt screenshot
		 
		 WebElement element= driver.findElement(By.xpath("//div[@class='header-logo']/child::a/child::img"));
		 File src2= element.getScreenshotAs(OutputType.FILE);
		 File target2 = new File(".//screenshots//logo.png");
		 FileUtils.copyFile(src2, target2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 driver.quit();
		
		
		
	}
	
}
