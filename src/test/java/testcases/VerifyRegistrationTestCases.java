package testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.RegistrationPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.constant;

public class VerifyRegistrationTestCases extends BaseClass{
	
	@Test
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {
		driverInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/");
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
	 
	rpo.clickOnMyAccount().click();
	rpo.clickOnRegister().click();
	rpo.clickOnFirstName().sendKeys(constant.firstname);
	rpo.clickOnLastName().sendKeys(constant.lastname);
	rpo.clickOnEmail().sendKeys(email);
	//commonMethods.handleWait(driver, 10, rpo.entertelephoneno());
	rpo.clickOnTelephone().sendKeys(constant.phone);
	rpo.clickOnpassword().sendKeys(constant.password);
	rpo.clickOnPasswordConfirm().sendKeys(constant.confirmpassword);
	rpo.clickOnCheckBox().click();
	rpo.clickOnContinue().click();
	 
	//commonMethods.handleAssertion(rpo.actualText().getText(), constant.expectedRegisteration);
	 
	}
//	@Test
//	public void VerifyRegistrationWithInValidData() throws IOException{
//		driverInitilization();
//		driver.get("https://naveenautomationlabs.com/opencart/");
//		//driver.findElement(By.xpath("//span[@class = 'caret']")).sendKeys("");
//		//here we can use its method from Page object model by Creating object to access method.
//		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
//        rpo.clickOnMyAccount().click();
//        CommonMethods.handleWait(driver, 10, rpo.clickOnTelephone());
//        rpo.clickOnRegister().click();
//        rpo.clickOnContinue().click();
        //Assertions
//      SoftAssert sa = new SoftAssert();
//        
//        String actual = rpo.actualText().getText();
//        String fnexpected = constant.ExpectedResult;
//		sa.assertEquals(actual, fnexpected);
//		sa.assertAll(); 
//       // CommonMethods.handleAssertion(rpo.actualText().getText(), constant.ExpectedResult());
	}


