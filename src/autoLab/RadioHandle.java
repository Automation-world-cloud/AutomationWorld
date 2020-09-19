package autoLab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioHandle {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio' and @name='lang' ]"));
		int size = elements.size();
		for(int i=0;i<size;i++) {
			WebElement ele = elements.get(i);
			//String text = ele.getText();
			//System.out.println(text);
			String val = ele.getAttribute("value");
			System.out.println(val);
			if(val.equalsIgnoreCase("ruby"))
			{
				ele.click();
			}
			}
		 List<WebElement> list = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		int size2 = list.size();
		for(int i=0;i<size2;i++)
		{
			WebElement val1 = list.get(i);
			String val3 = val1.getAttribute("value");
			if(val3.equalsIgnoreCase("Coding"))
			{
				val1.click();
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
