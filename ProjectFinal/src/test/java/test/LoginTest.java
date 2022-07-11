package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage lp;
	
	
	@BeforeClass
	public void initObject() {
		
		lp=new LoginPage(driver);
		
	}
	
	@Test (priority=1)
	public void verifyButton() {
		System.out.println(lp.isButtonPresent());
		Assert.assertTrue(lp.isButtonPresent());
	}

	@Test (priority=2)
	public void login() {
		
		lp.login("Admin", "admin123");
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	

}
