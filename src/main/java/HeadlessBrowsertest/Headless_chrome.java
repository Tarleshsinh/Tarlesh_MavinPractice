package HeadlessBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_chrome {
	public static WebDriver driver;
	public static void main(String[] args) {
		// Executing the web application UI test without opening browseres user interface only 
		//difference is is we will not see anygraphical user interface 
		//WHEN to use headless browser once the cross browser test is completed 
		// when we hv no options it is very fast
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		System.out.println("This is the title of the page"+ driver.getTitle() );
		
	}

}
