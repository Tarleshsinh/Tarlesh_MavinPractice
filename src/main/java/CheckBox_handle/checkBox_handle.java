package CheckBox_handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox_handle {
public  WebDriver driver;
public Select select;
// pawan part 14 selenium with java


@Test
public void Select_checkbox() throws Exception {
	ChromeOptions options = new ChromeOptions();
    // Add any necessary options here
    options.addArguments("--remote-allow-origins=*");
    //options.addArguments("--start-maximized"); // Maximize window
    options.addArguments("--disable-extensions"); // Disable extensions
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // Change the duration to 20 seconds
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Change the duration to 20 seconds
    driver.manage().deleteAllCookies();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.findElement(By.id("name")).sendKeys("Trisha");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("trisha@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gewurztraminer");
	driver.findElement(By.id("address")).sendKeys("7 dittmer crescent etobicoke m9e4p9");
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	//driver.findElement(By.xpath("//input[@id='sunday']")).click();
	driver.findElement(By.xpath("//input[@name='optionsRadios' and @id='male']")).click();
	List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
	System.out.println("This is the size of check boxes" +checkboxes.size());
	
	select = new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
	select.selectByVisibleText("Denmark");
	Thread.sleep(2000);
	select.selectByVisibleText("Italy");
	driver.findElement(By.xpath("//label[normalize-space()='4 years']")).click();
	driver.findElement(By.xpath("//label[normalize-space()='Selenium Webdriver']")).click();
	
	//for(int i=0; i<checkboxes.size(); i++) {
		//checkboxes.get(i).click(); }
	for(WebElement check:checkboxes)
	{ check.click();}
	
	// Select multiple check box by choice 
	
	//for(WebElement check:checkboxes)
	//{String checkboxname=  check.getAttribute("id");
	//if (checkboxname.equals("monday") || checkboxname.equals("sunday"))
	//{check.click();}
	//}
	
	 //select last 3 check boxes 
	int totalnoofcheckbox=checkboxes.size();
	//for(int i= totalnoofcheckbox-3;i<totalnoofcheckbox; i++) {
		//checkboxes.get(i).click();
	//}

	// how to check first two check box 
	
	//for(int i=0; i<totalnoofcheckbox;i++) {
		//if (i<4) {
			//checkboxes.get(i).click();
		//}
		
	//}
	
	

	driver.quit();

	

	
	
	
	
}

}

