package autoLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
}
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/FileUpload.html");
	WebElement ele = driver.findElement(By.xpath("//input[@id='input-4']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).click().build().perform();
	Runtime.getRuntime().exec("C:\\Users\\anush\\Desktop\\java desk\\autoit\\fileupload.exe");
}
}
