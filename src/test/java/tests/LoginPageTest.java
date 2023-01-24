package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import pages.BasePage;
import pages.HomePage;

@Test(groups = "Login Page Test")
public class LoginPageTest extends BasePage {

	LoginPage loginPage;

	  @BeforeTest public void loginPageDashboard() { 
		 
		  }
	 
	@Test(priority = 0)
	public void navigateToLoginPage() {
		loginPage = new LoginPage(driver);
		loginPage.enterUsername();
		loginPage.enterPassword();
		
	}
	
	@Test(priority = 1)
	public void clickToLogin() {
		loginPage.clickLoginBtn();
	}

}
