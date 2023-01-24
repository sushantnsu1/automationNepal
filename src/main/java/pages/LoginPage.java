package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver ldriver) { // create a constructor and pass the driver instance
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
		
	}


	
	@FindBy(id = "user-name")
	@CacheLookup
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginBtn;
		
	private static String uName= "standard_user";
	
	private static String passWord = "secret_sauce" ;



	
	public LoginPage enterUsername() { // pass a parameter so we don't hardcode values in the object class.
		username.clear();
		username.sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword() {
		password.clear();
		password.sendKeys(passWord);
		return this;
		}

	public LoginPage clickLoginBtn() {
		loginBtn.click();
		return this;
	}

	public void errorContainerDisplayed() {
	//	return wait.until(ExpectedConditions.visibilityOfElementLocated(errorContainer)).isDisplayed();
	}

	public boolean verifyNewPage() {
		wait.until(ExpectedConditions.urlToBe("https://www.oculus.com/"));
		return driver.getTitle().contains("Oculus | VR Headsets & Equipment");
	}

}
