package autoLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage1 {
	WebDriver driver;
	By userid=By.id("email");
	By password=By.id("pass");
	By login=By.id("u_0_b");

	RegPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setUserid(String uname)
	{
		driver.findElement(userid).sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void setlogin()
	{
		driver.findElement(login).click();
	}
}
