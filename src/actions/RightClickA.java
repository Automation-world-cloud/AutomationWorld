package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act=new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();;
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.close();
}
}
