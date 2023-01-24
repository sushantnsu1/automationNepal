package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForumsPage {
	
	By selectMenu = By.xpath("(//li[@id='item-8'])[2]");
	By selectMenudrop = By.id("oldSelectMenu");
	By selectOption1 = By.xpath("//div[contains(text(),'Select Option')]");
	By selectOption2 = By.xpath("react-select-2-option-0-1");
	By selectOne = By.xpath("//div[@class=' css-1pahdxg-control']//div[@class=' css-1hwfws3");
	By selectOne1 = By.xpath("//div[@id='react-select-6-option-0-0']");
	By selectOne2 = By.xpath("//div[@id='react-select-6-option-0-1']");
	By droppable = By.xpath("(//li[@id='item-3'])[4]");
	By Dragme = By.xpath("//div[@id='draggable' and text()='Drag me']");
	By dropHere = By.id("droppable");


	WebDriver driver;
	WebDriverWait wait;
	
	public ForumsPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 10);
	}

	public boolean isselectMenuPresent() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectMenu)).isDisplayed();
	}

	public boolean selectMenudrop() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectOption1)).isDisplayed();
	}
	
	public boolean selectOption2() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectOption2)).isDisplayed();
	}
	
	public boolean selectOne() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectOne)).isDisplayed();
	}
	
	public boolean selectOne1() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectOne1)).isDisplayed();
	}
	public boolean selectOne2() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(selectOne2)).isDisplayed();
	}
	public void droppable() {
		 driver.findElement(droppable).isDisplayed();
	}
	public void Dragme() {
		 driver.findElement(Dragme).isDisplayed();

	}
	public void dropHere() {
		 driver.findElement(dropHere).isDisplayed();

	}
}
