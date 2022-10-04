package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepickerDropdown {
public WebDriver driver;


@Test 
public void datepicker_dropdown_Pawan () throws Exception {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	
	driver.findElement(By.xpath("//input[@id='dob']")).click();
	
	// Month and year selection 
	Select month_drop=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	month_drop.selectByVisibleText("Jan");
	
	Select year_drop= new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	year_drop.selectByVisibleText("2022");
	
	// Date selection 
	String date= "14";
	List<WebElement> alldates=driver.findElements(By.xpath("//body/div[@id='ui-datepicker-div']//td"));
	Thread.sleep(2000);
	for (WebElement ele:alldates ) {
	String dt= ele.getText();
	
	if (dt.equals(date)) {
		ele.click();
		break;}
		
	}
	
	driver.findElement(By.xpath("//input[@id='sex_2']")).click();
	//driver.quit();
	
}
}
