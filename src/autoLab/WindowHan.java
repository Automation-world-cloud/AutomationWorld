package autoLab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHan {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	String title = driver.getTitle();
	System.out.println(title);
	//String windowHandle = driver.getWindowHandle();
	//System.out.println(windowHandle);
	Set<String> whandles = driver.getWindowHandles();
	int size = whandles.size();
	System.out.println(size);
	
	for(String wh:whandles) {
		String t = driver.switchTo().window(wh).getTitle();
		System.out.println(t);
		
		driver.close();
			
		
	}

}

}
