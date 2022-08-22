package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*By enter = By.id("srchword");
	By search = By.className("newsrchbtn");*/
	@FindBy(id="srchword")
	WebElement enter;
	@FindBy(className="newsrchbtn")
	WebElement search;
	
	
	public WebElement Enter()
	{
		//return driver.findElement(enter);
		return enter;//using Page factory
	}
	public WebElement Search()
	{
		//return driver.findElement(search);
		return search;//using  page factory
	}
	
	
}
