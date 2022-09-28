package july_26th;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class TestngWork_1 {
	WebDriver driver;
	@BeforeMethod
public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@id='txtuId'])[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[@id='txtPword'])[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[@id='login'])[1]")).click();
		Reporter.log("Running Setup functionality",true);
	}
	@org.testng.annotations.Test
public void Branches() {
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executing Branches module",true);
	}
	@org.testng.annotations.Test
	public void Roles() {
			driver.findElement(By.xpath("(//img)[6]")).click();
			Reporter.log("Executing Branches module",true);
		}
	@org.testng.annotations.Test
	public void Users() {
			driver.findElement(By.xpath("(//img)[7]")).click();
			Reporter.log("Executing Branches module",true);
		}
	@org.testng.annotations.Test
	public void employes() {
			driver.findElement(By.xpath("(//img)[8]")).click();
			Reporter.log("Executing Branches module",true);
		}
@AfterMethod
public void Teardown() {
	driver.close();
	Reporter.log("Running Teardown",true);
}

}
