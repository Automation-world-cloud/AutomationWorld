
package autoLab;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webele {
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
}
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/java%20desk/Basictable.html");
	Dimension size = driver.findElement(By.xpath("/html/body/table/tbody/tr")).getSize();
	System.out.println(size);
}
}
