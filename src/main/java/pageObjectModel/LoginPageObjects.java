package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	// We will store locators  here ---
		By email = By.xpath("//input[@name='email']");
		By password = By.xpath("//input[@name='password']");
		By loginButton = By.xpath("//input[@type='submit']");
		
		public LoginPageObjects(WebDriver driver2) {
			this.driver=driver2;
		}
		public WebElement clickOnEmail()
		{
			return driver.findElement(email);
		}
		public WebElement clickOnPassword()
		{
			return driver.findElement(password);
		}
		public WebElement clickOnLoginButton()
		{
			return driver.findElement(loginButton);
		}


}
