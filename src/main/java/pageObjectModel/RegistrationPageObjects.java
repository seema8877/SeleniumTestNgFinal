package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	//for accessing the driver no need to inherit so here we are using getter setter method in encapsulation.
	public WebDriver driver;
// We will store locators  here ---
	By myAccount = By.xpath("//span[@class = 'caret']");
	By Register = By.xpath("//a[text()= 'Register']");
	By FirtName = By.xpath("//input[@name = 'firstname']");
	By LastName = By.xpath("//input[@name = 'lastname']");
	By Email = By.xpath("//input[@name = 'email']");
	By Telephone = By.xpath("//input[@name = 'telephone']");
	By password = By.xpath("//input[@name = 'password']");
	By PasswordConfirm = By.xpath("//input[@name = 'confirm']");
	By CheckBox = By.xpath("//input[@type= 'checkbox']");
	By Continue = By.xpath("//input[@value='Continue']");
	private By actual = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	
	public RegistrationPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		//We gave scope above from parameterized driver to the driver of same class
	}
	public WebElement clickOnMyAccount()
	{
		return driver.findElement(myAccount);
	}
	public WebElement clickOnRegister()
	{
		return driver.findElement(Register);
	}
	public WebElement clickOnFirstName()
	{
		return driver.findElement(FirtName);
	}
	public WebElement clickOnLastName()
	{
		return driver.findElement(LastName);
	}
	public WebElement clickOnEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement clickOnTelephone()
	{
		return driver.findElement(Telephone);
	}
	public WebElement clickOnpassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickOnPasswordConfirm()
	{
		return driver.findElement(PasswordConfirm);
	}
	public WebElement clickOnCheckBox()
	{
		return driver.findElement(CheckBox);
	}
	public WebElement clickOnContinue()
	{
		return driver.findElement(Continue);
	}
	public WebElement actualText()
	{
		return driver.findElement(actual);
	}
	
		
			
}
