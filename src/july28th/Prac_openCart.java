package july28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_openCart {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Bindureddy");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Guddala");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("bindureddy123@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Bokkareddy@123");
		//driver.findElement(By.name("agree")).isSelected();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		boolean sucesspage = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"))
				.isDisplayed();
		System.out.println("the page is sucessfull" + sucesspage);
		Thread.sleep(2500);
		driver.quit();
		
	}
}
