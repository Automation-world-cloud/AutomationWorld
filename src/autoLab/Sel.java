package autoLab;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/java%20desk/month.html");
	WebElement list = driver.findElement(By.id("month"));
	Select se=new Select(list);
	List<WebElement> opt = se.getOptions();
	int size = opt.size();
	for(int i=1;i<size;i++)
	{
		WebElement we = opt.get(i);
		String text = we.getText();
		System.out.println(text);
	}
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
}
}
