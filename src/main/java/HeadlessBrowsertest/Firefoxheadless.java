package HeadlessBrowsertest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxheadless {

	public static FirefoxDriver driver;
	
	public static void main(String[] args) {
		
WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		//options.addArguments("--headless");
		driver= new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		System.out.println("This is the title of the page"+ driver.getTitle() );
		
		
		
	}

}
