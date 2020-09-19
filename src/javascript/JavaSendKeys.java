package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class JavaSendKeys {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	WebElement uname = driver.findElement(By.name("username"));
	WebElement clicked = driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='anush505'", uname);
	js.executeScript("arguments[0].click", clicked);


}
}
