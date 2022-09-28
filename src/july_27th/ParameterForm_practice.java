package july_27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterForm_practice {
	WebDriver driver;
@Parameters({"URL"})
@BeforeTest
public void setup(String appurl)throws Throwable{
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.navigate().to(appurl);
	Thread.sleep(4500);
}
@Parameters({"fname","lname","Email","mobnum","date","month","year","subj","curaddre"})
@Test
public void Validation(String firstname,String lastname,String email,String modilenumber,String date,String month,String year,String subject,String currentaddress)throws Throwable
{
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("userEmail")).sendKeys(email);
	driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("userNumber")).sendKeys(modilenumber);
	Thread.sleep(1500);
	driver.findElement(By.id("dateOfBirthInput")).click();
	//Thread.sleep(1500);
	//driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, July 27th, 2022']")).sendKeys(date);
	//Thread.sleep(1500);
	//new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText(month);
	//Thread.sleep(1500);
	//new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText(year);
	//Thread.sleep(1500);
	//driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/form[@id='userForm']/div[@id='subjectsWrapper']/div/div[@id='subjectsContainer']/div/div[1]")).sendKeys(subject);
	Thread.sleep(1500);
	driver.findElement(By.xpath("//label[normalize-space()='Music']")).isSelected();
	Thread.sleep(1500);
	driver.findElement(By.id("currentAddress")).sendKeys(currentaddress);
}
@AfterTest
public void teardown() {
	driver.close();
}
	
	

}
