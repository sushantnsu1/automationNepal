package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	
	By firstNameField = By.xpath("//input[@id='firstName']");
	By lastNameField = By.xpath("//input[@id='lastName']");
	By phoneField = By.xpath("//input[@id='userNumber']");
	By addressField = By.xpath("//textarea[@id='currentAddress']");
	By cityField = By.xpath("//div[@id='city']//div[@class=' css-1hwfws3']");
	By stateProvinceDropdown = By.xpath("//div[@id='react-select-3-option-2']");
	By HobbiesField = By.xpath("//label[@for='hobbies-checkbox-1']");
	By emailField = By.xpath("//input[@id='userEmail']");
	By GenderField = By.xpath("//label[@for='gender-radio-1']");
	By subjectsFiled = By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");

	By emailOptInCheckbox = By.name("optInAsGuest");
	By submitButton = By.xpath("//button[@id='submit']");
	By DateofBirthFieldfffcdsz = By.xpath("//input[@id='dateOfBirthInput']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 5);
	}
	
	public void enterFirstName() {
		driver.findElement(firstNameField).clear();
		driver.findElement(firstNameField).sendKeys("suchita");
	}
	
	public void enterLastName() {
		driver.findElement(lastNameField).clear();
		driver.findElement(lastNameField).sendKeys("lamichhane");
	}
	
	public void enterPhoneNumber() {
		driver.findElement(phoneField).clear();
		driver.findElement(phoneField).sendKeys("7204291003");
	}
	
	public void enterAddress() {
		driver.findElement(addressField).clear();
		driver.findElement(addressField).sendKeys("10700 e dartmouth ave");
	}
	
	public void enterCity(String city) {
		driver.findElement(cityField).clear();
		new Select(driver.findElement(stateProvinceDropdown)).selectByValue(city);
	}
	public void selectHobbies(String Sports) {
		driver.findElement(HobbiesField).clear();
		new Select(driver.findElement(HobbiesField)).selectByValue(Sports);
	}
		public void GenderField(String Male) {
			driver.findElement(GenderField).clear();
			new Select(driver.findElement(GenderField)).selectByValue(Male);

		}
	
	public void selectState(String state) {
		new Select(driver.findElement(stateProvinceDropdown)).selectByValue(state);
	}
	
	public void enterZipcode(String subjects) {
		driver.findElement(subjectsFiled).clear();
		driver.findElement(subjectsFiled).sendKeys(subjects);
	}
	
	public void enterEmail() {
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys("lamichhane@yahoo.com");
	}
	public void DateofBirthField(String DateofBirth) {
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(DateofBirth);

	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
	/*public boolean isErrorContainerDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(errorContainer)).isDisplayed();
	} 
	
	public boolean isContinueButtonEnabled() {
		return wait.until(ExpectedConditions.elementToBeClickable(continueToPaymentButton)).isDisplayed();
	}*/
	
	
}
