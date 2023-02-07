package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SectionofPageScreenshot {
public WebDriver driver;


public void Test()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
}
}
