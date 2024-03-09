package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Genricutility.Readproperty;

public class base {
	
  public WebDriver driver;
	
	@BeforeClass
	
	public void openBrowser() {
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 Readproperty properties= new Readproperty();
		 String url=properties.fetchproperty("url");
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Reporter.log("Browser opened",true);
		 }

	@AfterClass
	
	public void closeBrowser() {
	//	driver.quit();
		//Reporter.log("Browserclosed successfully",true);
			}
	
	@BeforeMethod
	
	public void Login() {
		Readproperty properties=new Readproperty();
		String username= properties.fetchproperty("username");
		String password= properties.fetchproperty("password");
		driver.findElement(By.name("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		Reporter.log("Login successfully",true);
		
		}

	@AfterMethod
	
	public void logout() {
				
//		driver.findElement(By.xpath("//span[@class = 'BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
//		
//	    driver.findElement(By.xpath("//li[text()= 'Logout']")).click();
//		Reporter.log("Logout successfully",true);
			}
	

}
