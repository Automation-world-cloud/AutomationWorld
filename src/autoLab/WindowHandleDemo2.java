package autoLab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo2 {
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	//driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']//a[1]")).click();
	Set<String>handles = driver.getWindowHandles();
	System.out.println(handles.size());
	for(String han:handles) 
	{
		if(!handle.equalsIgnoreCase(han))
		{
			driver.switchTo().window(han);
			//driver.findElement(By.name("q")).sendKeys("selenium webdriver");
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.close();
			}
	}
	driver.switchTo().window(handle);
	System.out.println(driver.getTitle());
}
}
