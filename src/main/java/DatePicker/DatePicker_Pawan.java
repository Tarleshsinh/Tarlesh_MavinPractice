package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Pawan {
public WebDriver driver;


@Test
public void pawanDatePicker() {
	
	

	
	//WebDriverManager.chromedriver().driverVersion("118.0.5993.118").setup(); // Manually specify version
	//WebDriver driver = new ChromeDriver();
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
	//WebDriverManager.chromedriver().setup();
	//driver= new ChromeDriver(options);
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
