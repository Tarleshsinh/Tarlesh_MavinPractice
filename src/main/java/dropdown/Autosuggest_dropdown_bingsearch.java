package dropdown;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggest_dropdown_bingsearch {
public WebDriver driver;




@Test
public void autosuggest_Bing () {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().deleteAllCookies();
	driver.get("https://www.bing.com/");
	driver.findElement(By.xpath("//input[@id='sb_form_q' and @class='sb_form_q']")).sendKeys("Selenium");
	
	List<WebElement>list= driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	System.out.println("This is the size of list----"+list.size());
	
	for(WebElement listitem:list)
	{
		if (listitem.getText().equals("selenium download")) {
			listitem.click();
			break;
		}
	}
	Assert.assertTrue(driver.findElement(By.xpath("//span[@class='l_ecrd_imcolheader_ttl l_ecrd_txt_heros']//a[normalize-space()='Selenium']")).isEnabled());
	String validate=driver.findElement(By.xpath("//span[@class='l_ecrd_imcolheader_ttl l_ecrd_txt_heros']//a[normalize-space()='Selenium']")).getText();
	Assert.assertTrue(validate.contains("Selenium"));
	Assert.assertEquals(validate, "Selenium");
	driver.quit();
}
	
	
	
	
}
