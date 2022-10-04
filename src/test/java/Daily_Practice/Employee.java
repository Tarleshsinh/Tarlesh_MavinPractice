package Daily_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Employee {

	int empid;
	int dob;
	 String name;
	 String city;
	 public WebDriver driver;
	
	public void tarlesh (String bc, String CHU){
		
		driver.findElement(By.xpath("")).sendKeys(bc);
		
		
	}
	public   void department (){
		
		System.out.println(empid);
		System.out.println(dob);
		
	}
	
	public static void main (String args []) {
		
		Employee e1= new Employee();
		
		e1.empid= 100;
		e1.dob= 809;
		e1.name= "Tarlesh";
		e1.city= "Toronto";
		
		e1.department();
		
		
		
	}
	
	
		
	
}
