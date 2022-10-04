package dropdown;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion_googlesearch {
public WebDriver driver;


@Test(invocationCount=3)
public void googlesearch () throws Exception {
WebDriverManager.firefoxdriver().setup();
driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

driver.get("https://www.google.com");
driver.findElement(By.xpath("//input[@name='q'and @class = 'gLFyf gsfi']")).sendKeys("switzerlandholiday Package");
Thread.sleep(2000);

List<WebElement>list= driver.findElements(By.xpath("//li[@class='sbct']//div[@class='eIPGRd']//div[1]/span"));
	System.out.println("Size of Autosuggestion list------" + list.size());
	
	for(WebElement switzerlandpkg:list)
	{
		if (switzerlandpkg.getText().contains ("switzerland holiday packages from south africa")) {
			switzerlandpkg.click();
			break;
		}
	}
	
	//WebElement Validate= driver.findElement(By.xpath("//div[@class='a4bIc']//input[@type='text']"));
	 Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Switzerland Holidays & Tours from South Africa')]")).isDisplayed());
	 String validation= driver.findElement(By.xpath("//h3[contains(text(),'Switzerland Holidays & Tours from South Africa')]")).getText();
	 Assert.assertEquals("Switzerland Holidays & Tours from South Africa", validation);
	 Assert.assertTrue(validation.contains("Switzerland Holidays & Tours from South Africa"));
	driver.quit();
	
}
}
