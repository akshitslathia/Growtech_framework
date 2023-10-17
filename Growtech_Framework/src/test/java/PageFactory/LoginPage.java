package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userid;
	
	@FindBy(xpath="//input[contains(@name,\"pass\")]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@name,\"Login\")]")
	WebElement loginbtn;
	
	public void enteruserid(String text) 
	{
		userid.sendKeys(text);
	}
	
	public void enterpassword(String text1) 
	{
		password.sendKeys(text1);
	}
	public void clickloginBtn()
	{
		loginbtn.click();
	}
	
	
	
	
	

}

