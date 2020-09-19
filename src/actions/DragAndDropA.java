package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
	}
public static void main(String[] args)throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Ajax in Practice')]"));
    WebElement target = driver.findElement(By.xpath("//li[@class='dhx_list-item dhx_list-item--text dhx_list-item--selected dhx_list-item--focus dhx_list-item--drag']"));
    Actions act=new Actions(driver);
 //act.clickAndHold(src)
//.moveToElement(target)
//.release().build().perform();
    act.dragAndDrop(src, target).build().perform();

}

}