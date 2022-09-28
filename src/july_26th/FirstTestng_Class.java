package july_26th;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirstTestng_Class {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
  @Test
  public void perBanking()throws Throwable  {
	  driver.findElement(By.xpath("(//img)[4]")).click();
	  Reporter.log("Executing perbanking",true);
	  Thread.sleep(1500);
  }
  @Test
  public void corBanking() throws Throwable {
	  driver.findElement(By.xpath("(//img)[5]")).click();
	  Reporter.log("Executing corbanking",true);
	  Thread.sleep(1500);
  }
  @Test
  public void intBanking() throws Throwable {
	  driver.findElement(By.xpath("(//img)[6] ")).click();
	  Reporter.log("Executing intbanking",true);
	  Thread.sleep(1500);
  }
 
  @AfterTest
  public void afterTest() throws Throwable {
	  Thread.sleep(3400);
	  driver.close();
	  Reporter.log("Going out of Test",true);
  }

}
