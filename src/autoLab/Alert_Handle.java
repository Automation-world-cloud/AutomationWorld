package autoLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();//with one button which is accept only.
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();//with accept or dismiss button.
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	driver.switchTo().alert().accept();
	String text = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).getText();
    System.out.println(text);
	
}
}
