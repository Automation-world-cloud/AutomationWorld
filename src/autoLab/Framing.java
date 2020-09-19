package autoLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framing {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	 driver.switchTo().frame(0);
	 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hi anush");

	
}
}
