package autoLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
	}
	WebDriver driver;
	@Test(dataProvider ="creddata")
	public void login(String uname,String pwd) throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Log in to Facebook"), "unable to login");
		System.out.println("page verified");
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	
@DataProvider(name ="creddata")
public Object[][] data()
{
	Object[][] obj=new Object[3][2];
	
	obj[0][0]="anush505@gmail.com";
	obj[0][1]="@anush505";
	
	obj[1][0]="anush505@gmail.com";
	obj[1][1]="@sai1234$";
	
	obj[2][0]="anush505@gmail.com";
	obj[2][1]="@sai123$";
	return obj;
}
}
