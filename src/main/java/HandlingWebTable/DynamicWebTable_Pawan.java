package HandlingWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable_Pawan {
public WebDriver driver;

@Test
public void Pwan_DynamicTable() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.opencart.com/admin/");
	driver.findElement(By.name("username")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='text-end']/child::button")).click();
	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	// How to find out total no of pages 
	
	String Text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	System.out.println(Text);
	
	// How to find Total no pages 
	
	int Totalpages= Integer.valueOf(Text.substring(Text.indexOf("(")+1,Text.indexOf("Pages")-1));
	System.out.println("Total no of Pages :"+ Totalpages);
	
	// How to find total no of rows in pages 
	
	for(int p=1;p<=Totalpages;p++) {
		WebElement Activepage = driver.findElement(By.xpath("//ul[@class='pagination']/li/span[@class='page-link']"));
		System.out.println("Active Page :" + Activepage.getText());
		Activepage.click();
	
		WebElement element= mywait.until(ExpectedConditions.elementToBeClickable(Activepage));
		element.click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
		System.out.println("No of rows :" + rows);
		
		
		//Read all the rows from each page
		
		
		
		String pageno=Integer.toString(p+1);
		driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
	}
	
	
	
	
	driver.quit();
}
	
}
