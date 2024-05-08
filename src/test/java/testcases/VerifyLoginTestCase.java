package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.CommonMethods;

public class VerifyLoginTestCase extends BaseClass {
	@Test
	public void VerifyLoginWithValidData() throws IOException
	{
		driverInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.clickOnEmail().sendKeys("");
		lpo.clickOnPassword().sendKeys("");
		lpo.clickOnLoginButton().click();
		//Assertions
//        SoftAssert sa = new SoftAssert();
//        WebElement actual = driver.findElement(By.xpath("//h2[text()='My Account'] "));
//        String expected = "My Account";
//		sa.assertEquals(actual, expected);
//		sa.assertAll();
	}
	//@Test
//	public void VerifyLoginWithInValidData() throws IOException
//	{
//		driverInitilization();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		LoginPageObjects lpo =new LoginPageObjects(driver);
//		lpo.clickOnEmail().sendKeys("");
//		lpo.clickOnPassword().sendKeys("");
//		lpo.clickOnLoginButton().click();
		//Assertions
//        SoftAssert sa = new SoftAssert();
//        WebElement actual = driver.findElement(By.xpath("//h2[text()='My Account'] "));
//        String expected = "My Account";
//		sa.assertEquals(actual, expected);
//		sa.assertAll();
//		CommonMethods.HandleAssertion(actual, expected);
	}
	

