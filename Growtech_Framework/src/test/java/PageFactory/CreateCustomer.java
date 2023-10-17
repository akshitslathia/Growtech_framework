package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class CreateCustomer extends BaseClass {
	
WebDriver driver;
	
	public CreateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//a[@href='addcustomerpage.php']")
	 WebElement CreateCustomerbtn;
	 @FindBy(xpath="//input[@name='name']")
	 WebElement customername;
	 @FindBy(xpath="//div[@id='dismiss-button']")
	 WebElement closepopup;
	 @FindBy(xpath="(//tr//child::tr//child::input)[2]")
	 WebElement custgender;
	 @FindBy(xpath="//input[@id='dob']")
	 WebElement custdob;
	 @FindBy(xpath="//textarea[@name='addr']")
	 WebElement custaddress;
	 
	 public void CreateCustomerbtn()
	 {
		 CreateCustomerbtn.click();
	 }
	 public void customername(String text2)
	 {
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 customername.sendKeys(text2);
		
	 }
	 public void custgender()
	 {
		 custgender.click();
	 }
	 public void custdob(String text3)
	 {
		 custdob.sendKeys(text3);
	 }
	 public void custaddress(String text4)
	 {
		 custaddress.sendKeys(text4);
	 }

}
