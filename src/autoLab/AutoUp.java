package autoLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoUp {
static 
{
System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");

}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/fileupload.html");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Runtime.getRuntime().exec("C:\\Users\\anush\\Desktop\\java desk\\autoit\\fileupload.exe");
	
}

}
