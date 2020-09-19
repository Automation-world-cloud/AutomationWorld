package dropDownDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownSort {
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	WebElement tools = driver.findElement(By.id("tools1"));
	Select s=new Select(tools);
	List<WebElement> name = s.getOptions();
	List actual=new ArrayList();
	List temp=new ArrayList();
	for(WebElement na:name)
	{
		String txt = na.getText();
		System.out.println(txt);
		actual.add(txt);
	}
    temp.addAll(actual);
     //Collections.sort(temp);
   System.out.println(temp);
   Assert.assertEquals(actual, temp);
}
}
