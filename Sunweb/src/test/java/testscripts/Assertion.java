package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	
	public void test() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.partialLinkText("Log in")).click();
		
		WebElement aboutlogin =d.findElement(By.tagName("h2"));
		
		Assert.assertEquals(aboutlogin.isDisplayed(), true);
		Reporter.log("Login page is displayed",true);
		d.quit();
	}
	
}
