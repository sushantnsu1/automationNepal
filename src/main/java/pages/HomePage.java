package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.WaitUtils;

public class HomePage {
	
	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement logo;
	
	@FindBy(id = "//html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement addToCartBtn;
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean getLogo() {
		
		 return logo.isDisplayed();
	}
	
	public void addToCartFunction() {
		WaitUtils.waitUntilVisible(driver, addToCartBtn, 5);
		int i = driver.findElements(By.id("//button[@id='add-to-cart-sauce-labs-backpack']")).size();
		if(i == 0) {
			addToCartBtn.click();
		}
		else {
			System.out.println("Add to cart is not present");
		}
		 
	}
	public void sortingName(int number) {
		 Select drp = new Select(driver.findElement(By.className("product_sort_container")));
		 drp.selectByIndex(number);

	}
	public void permanentAddressclick() {
		 driver.findElement(permanentAddress).sendKeys("10700 e darthmouth");

	}
	public void clickemailButton() {
		 driver.findElement(email).sendKeys("lamichhanesuchita@yahoo.com");

	}
	public void clicksubmitButton() {
		 driver.findElement(submit).click();

	}
	public void clickcheckBoxButton() {
		 driver.findElement(checkBox).click();

	}
	public void clickcheckBoxHomeButton() {
		 driver.findElement(checkBoxHome).click();

	}
	public void clickcheckBoxPageTitleButton() {
		 driver.findElement(checkBoxPageTitle).click();

	}
	
	public void clickTextBoxButton() {
		 wait.until(ExpectedConditions.elementToBeClickable(TextBox));
		 driver.findElement(TextBox).click();
	}
	
	public void toolTipElehover() {
		new Actions(driver).moveToElement(driver.findElement(toolTipEle)).perform();
	}
	
	public void clickOntoolTipbtnTab() {
		driver.findElement(toolTipbtn).click();
	}
	public void clickOnradioButtonTab() {
		driver.findElement(radioButton).click();

	}
	public void clickOnYesOptionTab() {
		driver.findElement(YesOption).click();

	}
	public void clickOnimpressiveRadioOptionTab() {
		driver.findElement(impressiveRadioOption).click();

	}
	public void clickOnFramesMenuTab() {
		driver.findElement(FramesMenu).click();

	}
	public void clickOnFramesTab() {
		driver.findElement(Frames).click();

	}
	public void clickOnFrameslogoTab() {
		driver.findElement(Frameslogo).click();

	}
	
	public void switchTabs() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	
	public void hoverOvertoolTipbtn() {
		new Actions(driver).moveToElement(driver.findElement(toolTipbtn)).perform();
		
	}
	
}
