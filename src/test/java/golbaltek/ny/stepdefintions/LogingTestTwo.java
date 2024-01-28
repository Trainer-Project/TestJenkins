package golbaltek.ny.stepdefintions;

import org.openqa.selenium.WebDriver;

import golbaltek.ny.basepage.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogingTestTwo extends BasePage{

	
	@Given("User able to open chrome browser")
	public void user_able_to_open_chrome_browser() {
		BasePage.getInitialization();
	    
	}
	@When("User is able to click on sign in BTN and login the application")
	public void user_is_able_to_click_on_sign_in_btn_and_login_the_application() {

	}
	@Then("User is able to verify the user info")
	public void user_is_able_to_verify_the_user_info() {
	    
	    
	}
}
