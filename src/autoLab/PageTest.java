package autoLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest {
	@Test
	public void verifyLogin()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		RegPage1 p1=new RegPage1(driver);
		driver.get("https://www.facebook.com/");
		p1.setUserid("anush505@gmail.com");
		p1.setPassword("@sai1234#");
		p1.setlogin();
	
	
	}

}
