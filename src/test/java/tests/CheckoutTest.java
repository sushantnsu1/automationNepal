package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.BasePage;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BasePage {

	@Test(priority = 0)
	public void navigateToCart() {
		HomePage homePage = new HomePage(driver);
		homePage.toolTipElehover();
		logger.log(LogStatus.INFO, "Hovering over 'Headsets'");
		homePage.clickOntoolTipbtnTab();
		logger.log(LogStatus.INFO, "Selecting toolTip btn");
	}

	@Test(priority = 1)
	public void ElementMenu() {
		CartPage cartsPage = new CartPage(driver);
		cartsPage.ElementMenu();
		logger.log(LogStatus.INFO, "ElementMenu click");
		Assert.assertTrue(cartsPage.isElementMenuclick());
	}

	@Test(priority = 2, dependsOnMethods = "verifyRemovingFromCart")
	public void verifyReadingItemToCart() {
		CartPage cartsPage = new CartPage(driver);
		cartsPage.alertMenu();
		logger.log(LogStatus.INFO, "alertMenu click");
		Assert.assertTrue(cartsPage.isalertMenuclick());
	}

	@Test(priority = 3)
	public void selectAShippingCountry() {
		CartPage cartsPage = new CartPage(driver);
		cartsPage.alertBtn("CA");
		logger.log(LogStatus.INFO, "alertBtn click");
		Assert.assertEquals(cartsPage.alertBtn(), "Canada");
	}

	@Test(priority = 4)
	public void verifyClickingFormsMenuPage() {
		CartPage cartsPage = new CartPage(driver);
		cartsPage.clickFormsMenu();
		logger.log(LogStatus.INFO, "Clicking FormsMenu ");
		Assert.assertTrue(cartsPage.isFormsMenu());
	}

	@Test(priority = 5, dependsOnMethods = "verifyClickingFormsMenuPage")
	public void enterPersonalDetails() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.enterFirstName("suchita");
		logger.log(LogStatus.INFO, "Entering first name in the First Name field");
		checkoutPage.enterLastName("lamichhane");
		logger.log(LogStatus.INFO, "Entering last name in the Last Name field");
		checkoutPage.enterPhoneNumber("7204291003");
		logger.log(LogStatus.INFO, "Entering phone number in the Phone field");
		checkoutPage.enterAddress("10700 e dartmouth ave");
		logger.log(LogStatus.INFO, "Entering address in the Address field");
		checkoutPage.enterCity("Highlands");
		logger.log(LogStatus.INFO, "Entering city in the City field");
		checkoutPage.selectState("BC");
		logger.log(LogStatus.INFO, "Selecting from state/province from dropdown");
		checkoutPage.enterZipcode("V9B 0K7");
		logger.log(LogStatus.INFO, "Entering zip code in the Zip Code field");
		checkoutPage.enterEmail("lamichhane@yahoo.com");
		logger.log(LogStatus.INFO, "Entering email in the Email field");
		try {
			Assert.assertTrue(checkoutPage.issubmitButtonEnabled());
			logger.log(LogStatus.PASS, "Continue button is enabled, all data are correct");
		} catch (Exception e) {
			logger.log(LogStatus.WARNING, "submit button was not enabled due to invalid data");
		}
	}
}
