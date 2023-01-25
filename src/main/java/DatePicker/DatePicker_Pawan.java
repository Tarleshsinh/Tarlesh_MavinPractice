package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Pawan {
public WebDriver driver;


@Test
public void pawanDatePicker() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
	String year = "2023";
	String month = "July";
	String date = "10";
	
	driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
	
	while (true) {
		String monthyear= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		String Arr[] =monthyear.split(" ");
		String mon = Arr[0];
		String yr= Arr[1];
		
		if (mon.equalsIgnoreCase(month)&& yr.equalsIgnoreCase(year))
			break;
			else
				driver.findElement(By.xpath("//button[contains(text(),'>')]")).click();
		
		
	}
	// Date selection 
	List<WebElement>alldates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	for (WebElement ele:alldates) {
		String dt=ele.getText();
		if(dt.equals(date)) {
			ele.click();
			break;
		}
	
	
	
	}
	driver.close();
}
	
	
	
}
