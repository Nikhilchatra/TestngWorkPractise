package july28th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPractise_1 {
WebDriver driver;
@Test
public void AssertValidation() throws Throwable {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://Google.com");
	Thread.sleep(2300);
	String exp="Google";
	String act=driver.getTitle();
	try {
	Assert.assertFalse(exp.equalsIgnoreCase(act),"Title is matching");
}catch(Throwable g)
	{
	System.out.println(g.getMessage());
	}
	driver.close();
}

}