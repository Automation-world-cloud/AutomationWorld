package autoLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage2 {
	WebDriver driver;
	@FindBy(id = "email")
	WebElement mail;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="u_0_b")
	WebElement clicking;
	
	RegPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//additional method
		}
	public void setUserid(String uname)
	{
		mail.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
    public void setLogin()
{
	clicking.click();
}

}
