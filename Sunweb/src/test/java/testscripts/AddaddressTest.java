package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genricutility.Readproperty;
import baseclass.base;

public class AddaddressTest extends base {
	
	@Test

	public void addaddress(){
		
     driver.findElement(By.xpath("//span[@class = 'BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
	 driver.findElement(By.xpath("//li[text()= 'My Profile']")).click();
	 driver.findElement(By.xpath("//div[normalize-space()='My Addresses']")).click();
	 driver.findElement(By.xpath("//button[normalize-space()='Add Address']")).click();
		
		
		
		Readproperty properties=new Readproperty();
		String name= properties.fetchproperty("name");
		String houseno= properties.fetchproperty("houseno");
		String street= properties.fetchproperty("street");
		String landmark= properties.fetchproperty("landmark");
		String pincode= properties.fetchproperty("pincode");
		String phone= properties.fetchproperty("phone");
		
		
		driver.findElement(By.name("Name")).sendKeys(name);
		driver.findElement(By.name("House/Office Info")).sendKeys(houseno);
		driver.findElement(By.name("Street Info")).sendKeys(street);
		driver.findElement(By.name("Landmark")).sendKeys(landmark);
		WebElement countryDropdown = driver.findElement(By.id("Country"));
		Select countrySelect=new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		
		
		 WebElement stateWebElement = driver.findElement(By.id("State"));
		 Select State =new Select (stateWebElement);
		 State.selectByIndex(4);
		 
	WebElement cityDropdown =	driver.findElement(By.id("City"));
	Select citySelect=new Select(cityDropdown);
	citySelect.selectByIndex(4);
	
		 
		 
		 
		 
		 
		
		
		driver.findElement(By.name("Pincode")).sendKeys(pincode);
		driver.findElement(By.id("Phone Number")).sendKeys(phone);
		driver.findElement(By.id("addAddress")).click();
		Reporter.log("address successfully",true);
		
		
	}
	
	

}
