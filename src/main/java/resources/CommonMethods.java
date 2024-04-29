package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void HandleAssertion(WebElement actual, String expected){
		 SoftAssert sa = new SoftAssert();
	        
	        WebElement actualText = actual;
	        String fnexpectedText = expected;
			sa.assertEquals(actualText, fnexpectedText);
			sa.assertAll();
		
	}
	public static void handleWait(WebDriver driver, int time, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
}
