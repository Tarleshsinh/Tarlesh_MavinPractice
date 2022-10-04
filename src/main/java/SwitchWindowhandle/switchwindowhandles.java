package SwitchWindowhandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchwindowhandles {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		String parentwindow =driver.getWindowHandle();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//driver.findElement(By.xpath("//span[text()='Automated Web Testing']")).click();
		//WebElement automated = driver.findElement(By.xpath("//span[normalize-space()='Automated Testing Tools']"));
		 //utility_File.javascriptclick(automated, driver);
		  
		
		Set<String>handles = driver.getWindowHandles();
		List<String> Handleslist= new ArrayList<String>(handles);
		if(Switchtorightwindow("OrangeHRM (@orangehrm) / Twitter"
				+ "", Handleslist));
		String twitter=driver.getWindowHandle();
		System.out.println(handles + "Thisis set Strings");
		System.out.println(Handleslist +" This is list Strings");
		{System.out.println(driver.getCurrentUrl()+ "--------" + driver.getTitle());}
		
		
		System.out.println("-----------------------------------");
		
		
		//closeallwindow(Handleslist, twitter);
		switchtoparentwindow(parentwindow);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//driver.findElement(By.xpath("//a[text()='#HRSoftware']")).click();
		
		
		
		
	System.out.println(driver.getCurrentUrl()+ "------"+ driver.getTitle());
	}
	
	public static void closeallwindow(List<String> Handleslist,String twitter) {
		for(String Title: Handleslist) {
			if (!Title.equals(twitter)) {
			 driver.switchTo().window(Title).close();
			}
		}
		
	}
	public static void switchtoparentwindow (String parentwindow) {
		driver.switchTo().window(parentwindow);
		
		
	}
	
	public static boolean Switchtorightwindow(String windowTitle, List<String> Handleslist) {
		
		for(String T : Handleslist) {
			String title= driver.switchTo().window(T).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window ....");
				return true;
			}
			
		}
		return false;
		
		
	}


		

	
}
