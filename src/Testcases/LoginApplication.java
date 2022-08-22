package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rlp = new RediffLoginPage(driver);
		RediffHomePage rhp = new RediffHomePage(driver);
		rlp.EmailId().sendKeys("harsha@gmail.com");
		rlp.Password().sendKeys("12345678");
		rlp.SignIn().click();
		rlp.Home().click();
		rhp.Enter().sendKeys("rediff");
		rhp.Search().click();
	}
	
}
