package july_27th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngWork_4 {
	WebDriver driver;
@BeforeMethod
public void Setup() {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	Reporter.log("Running setup",true);
}
@Test
public void Addition() throws Throwable {
	driver.findElement(By.xpath("//input[@value='C']")).click();
	driver.findElement(By.name("display")).sendKeys("250");
	driver.findElement(By.xpath("//input[@value='+']")).click();
	driver.findElement(By.name("display")).sendKeys("250");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(4500);
	String add=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(add,true);
}
@Test
public void Subraction() throws Throwable {
	driver.findElement(By.xpath("//input[@value='C']")).click();
	driver.findElement(By.name("display")).sendKeys("250");
	driver.findElement(By.xpath("//input[@value='-']")).click();
	driver.findElement(By.name("display")).sendKeys("50");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(4500);
	String Sub=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Sub,true);
}
@Test
public void Multiplication() throws Throwable {
	driver.findElement(By.xpath("//input[@value='C']")).click();
	driver.findElement(By.name("display")).sendKeys("5");
	driver.findElement(By.xpath("//input[@value='x']")).click();
	driver.findElement(By.name("display")).sendKeys("100");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(4500);
	String Mul=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Mul,true);
}
@Test
public void Division() throws Throwable {
	driver.findElement(By.xpath("//input[@value='C']")).click();
	driver.findElement(By.name("display")).sendKeys("50");
	driver.findElement(By.xpath("//input[@value='/']")).click();
	driver.findElement(By.name("display")).sendKeys("100");
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(4500);
	String Div=driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(Div,true);
}
@AfterMethod
public void teardown() {
	driver.close();
	Reporter.log("Running teardown");
}







}
