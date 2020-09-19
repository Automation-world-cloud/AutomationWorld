package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
	}
public static void main(String[] args)throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ANUSH");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB)
	.sendKeys("Reddy")
	.sendKeys(Keys.TAB)
	.sendKeys("94020202").build().perform();

}
}