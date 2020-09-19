package dropDownDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FbLoginDropDown {
static 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
@Test
public void loginFb()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_2")).click();
	 WebElement list = driver.findElement(By.xpath("//*[@id=\"month\"]"));
     Select se=new Select(list);
     List<WebElement> month_List = se.getOptions();
     month_List.size();
     System.out.println(month_List.size());
	
}
}
