package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageFactory.CreateCustomer;
import PageFactory.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 extends BaseClass{
	
	WebDriver driver = BaseClass.InitializeDriver();
	BaseClass obj0 = new BaseClass();
	LoginPage obj = new LoginPage(driver);
	CreateCustomer obj1 = new CreateCustomer(driver);
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
	    
	}

	@And("User enter the {string}")
	public void user_enter_the(String username) {
		obj.enteruserid(username);
	    
	}

	@And("User will enter the {string}")
	public void user_will_enter_the(String password) {
		obj.enterpassword(password);
	   
	}

	@When("User will click on the submit button")
	public void user_will_click_on_the_submit_button() {
		obj.clickloginBtn();
	    
	}

	@Then("User will be navigated to homepage")
	public void user_will_be_navigated_to_homepage() {
	    
	}
	@Given("user will click on the new customer link")
	public void user_will_click_on_the_new_customer_link() {
		obj1.CreateCustomerbtn();
	    
	}

	@And("user will enter the customer name as {string}")
	public void user_will_enter_the_customer_name_as(String customer_name) {
		obj1.customername(customer_name);
	    
	}

	@Then("user will select gender")
	public void user_will_select_gender() {
		obj1.custgender();
	    
	}

	@And("user will enter the date of birth as {string}")
	public void user_will_enter_the_date_of_birth_as(String date_of_birth) {
		obj1.custdob(date_of_birth);
	    
	}
	@And("user will enter the address as {string}")
	public void user_will_enter_the_address_as(String customer_address) {
		obj1.custaddress(customer_address);
	    
	}
	@Then("user will quit the browser")
	public void user_will_quit_the_browser() {
	   obj0.driverquit();
	}
	
}
