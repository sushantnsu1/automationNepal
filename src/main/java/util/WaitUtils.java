package util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	


    public static void waitForSeconds(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ignored) {
        }

    }

    public static void waitForMilliSeconds(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }



    public static void waitUntilVisible(WebDriver driver, WebElement xpath, int timeout){
        new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.
                elementToBeClickable(xpath));
    }


    public static void waitUntilDisappear(WebDriver driver,String xpath, Duration timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }


}
