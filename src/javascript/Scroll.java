package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
	}
	
@Test
public void scrollPage() throws Exception
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scroll(0,400)");
}
}
