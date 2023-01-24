package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	By ElementMenu = By.xpath("//div[@class='category-cards']/div[1]");
	By alertMenu = By.xpath("//div[@class='category-cards']/div[3]");
	By alertBtn = By.xpath("(//li[@id='item-1'])[2]");
	By FormsMenu = By.xpath("//div[@class='category-cards']/div[2]");
	By widMenu = By.xpath("//div[@class='category-cards']/div[4]");
	By interactionsMenu = By.xpath("//div[@class='category-cards']/div[5]");
	By BookStoreAPI = By.xpath("//div[@class='category-cards']/div[6]");
	By selectMenudrop = By.id("oldSelectMenu");


	WebDriver driver;
	WebDriverWait wait;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 5);
	}
	public void ElementMenu() {
		driver.findElement(ElementMenu).click();
	}

	public boolean isElementMenuClick() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ElementMenu)).isDisplayed();
	}

	public void alertMenu() {
		driver.findElement(alertMenu).click();
	}

	public boolean isalertMenuclick() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(alertMenu)).isDisplayed();
	}
	public void alertBtn() {
		driver.findElement(alertBtn).click();

	}
	public void FormsMenu(){
		driver.findElement(FormsMenu).click();

	}
	public void widMenu() {
		driver.findElement(widMenu).click();

	}
	public void selectMenudrop(String oldSelectMenu) {
		new Select(driver.findElement(selectMenudrop)).selectByValue(oldSelectMenu);
		wait.until(ExpectedConditions.attributeToBe(selectMenudrop, "value", oldSelectMenu));
	}


	public void interactionsMenu() {
		driver.findElement(interactionsMenu).click();
	}

	public void BookStoreAPI() {
		 driver.findElement(BookStoreAPI).isDisplayed();
	}

}
