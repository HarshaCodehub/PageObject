package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPageFactory {
	
	public RediffLoginPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	/*By username= By.xpath("//input[@type='text']");
	By password= By.name("passwd");
	By signin= By.xpath("(//div/input)[3]");
	//a[@href='https://www.rediff.com']
	By home = By.linkText("rediff.com");*/
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(xpath="(//div/input)[3]")
	WebElement signin;
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	public WebElement EmailId()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement SignIn()
	{
		return signin;
	}
	public WebElement Home()
	{
		return home;
	}
}
