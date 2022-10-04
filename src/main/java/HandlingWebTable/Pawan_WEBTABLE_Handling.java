package HandlingWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pawan_WEBTABLE_Handling {
	public WebDriver driver;
	
	// How to find different rows in Table 
	
	@Test
	public void pawanWEBTABLE() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demo.guru99.com/test/web-table-element.php");
					
		
		// How many rows in table 
		int rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("----Total no of Rows------ "+  rows);
		
		// How many columns in Table 
		
		int colms=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();
		System.out.println("----Total no of Colums------ "+  colms);
		
		// Retrieve specific column and row data
		
		String value=driver.findElement(By.xpath("//table[@class='dataTable']//tr[25]/td[5]")).getText();
		//System.out.println("This the value of specific column and row-------- "+ value);
		
		// Retreive all data from colum
		
		for(int r=1;r<=rows;r++) {
			
			for(int c=1;c<=colms; c++) {
				String data=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]/td["+c+"]")).getText();
				//System.out.print(data+"--"+"--"+"--");
			}
			//System.out.println();
		}
		
		for(int a=1; a<=rows;a++) {
			String company =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+a+"]/td[1]")).getText();
			if (company.equals("Cox & Kings L")) {
				String group =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+a+"]/td[2]")).getText();
				String Previousclose =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+a+"]/td[3]")).getText();
				//String change =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+a+"]/td[4]")).getText();
				System.out.println(company+":--:"+ group+":--:"+Previousclose);
			}
		}
		

		
		driver.quit();
	}

}
