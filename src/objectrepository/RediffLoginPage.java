package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver;
	By username= By.xpath("//input[@type='text']");
	By password= By.name("passwd");
	By signin= By.xpath("(//div/input)[3]");
	//a[@href='https://www.rediff.com']
	By home = By.linkText("rediff.com");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
