package july_27th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngWork_3 {
	WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	Reporter.log("Running setup",true);
}
@Test(priority=0)
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
@Test(priority=1,enabled=false)
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
@Test(enabled=false)
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
@Test(enabled=true)
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
@AfterTest
public void teardown() {
	driver.close();
	Reporter.log("Running teardown");
}



}
