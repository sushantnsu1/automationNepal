package tests;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import pages.BasePage;
import pages.HomePage;

@Test(groups = "Home Page Test")
public class HomePageTest extends BasePage {

	public String pageTitleExpected = "Swag Labs";
	HomePage homePage;
	
	@Test(description = "Verify Title of the page", priority = 0)
	public void verifyTitle() {
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getTitle(), pageTitleExpected, "Title does not match");
	}

	@Test(description = "Verify Logo is present in the page", priority = 1)
	public void verifyLogo() {
		assertEquals(homePage.getLogo(), true);
	}
	
	@Test(description = "Verify Sort by Name", priority = 2)
	public void sortName() {
		homePage.sortingName(1);
	}
	
	@Test(description = "Verify Add to Cart Functionality", priority = 3)
	public void addToCart() {
		homePage.addToCartFunction();
	}
}
