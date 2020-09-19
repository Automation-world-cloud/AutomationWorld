package autoLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleFindind {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	@Test
	public void findTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		String exptitle="Register";
		//Assert.assertEquals(acttitle, exptitle);
		Assert.assertTrue(acttitle.equalsIgnoreCase(exptitle));
		System.out.println("test passed");
	}

}
