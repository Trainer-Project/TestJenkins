package golbaltek.ny.stepdefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import golbaltek.ny.basepage.BasePage;
import golbaltek.ny.elements.LoginPage;
import golbaltek.ny.generic.CommonUtil;
import io.cucumber.java.en.*;


public class LoginStefDef extends BasePage{
	LoginPage pf;
	
	@Given("User is able to open any browser")
	public void user_is_able_to_open_any_browser() {
		BasePage.getInitialization();	
		pf = new LoginPage();
	}
	@Given("User is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
	}
	@When("User is able to click on sign in BTN")
	public void user_is_able_to_click_on_sign_in_btn() {  
		//driver.findElement(By.xpath("//*[@class='page-wrapper']/descendant::a[2]")).click();
	   
	   //pf.getClickOnSignIn().click();	   
	   //CommonUtil.getActionClick(pf.getClickOnSignIn());
		CommonUtil.getJSClick(pf.getClickOnSignIn());
	   
	}
	@When("User is able to enter the user name")
	public void user_is_able_to_enter_the_user_name() {
		//driver.findElement(By.xpath("(//*[@class='input-text'])[2]")).sendKeys(prop.getProperty("userName"));	    
	pf.getEnterUserName().sendKeys(prop.getProperty("userName"));
	}
	@When("User is able to enter the password")
	public void user_is_able_to_enter_the_password() {
		//driver.findElement(By.xpath("(//*[@class='input-text'])[3]")).sendKeys(prop.getProperty("passWord"));   
	   pf.getEnterPassWord().sendKeys(prop.getProperty("passWord")); 
	}
	@When("User is able to click on log in BTN")
	public void user_is_able_to_click_on_log_in_btn() {
		//driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();
 	    //pf.getClickOnSubmit().click();
 	   CommonUtil.getActionClick(pf.getClickOnSubmit());
	}
	@Then("User is able to verify the user info on the screen")
	public void user_is_able_to_verify_the_user_info_on_the_screen() throws InterruptedException {
		String actual = "Welcome, Tanvir Patwary!";
		Thread.sleep(2000);
		String expected = driver.findElement(By.xpath("//*[text()='Welcome, Tanvir Patwary!']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("My expected and actual result is matched : "+ expected);
		
		 
	    
	}

}
