package golbaltek.ny.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import golbaltek.ny.basepage.BasePage;

public class LoginPage extends BasePage {

	// page factory Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='page-wrapper']/descendant::a[2]")
	@CacheLookup
	private WebElement clickOnSignIn;

	public WebElement getClickOnSignIn() {
		return clickOnSignIn;
	}

	@FindBy(xpath = "(//*[@class='input-text'])[2]")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;
	}
	
	@FindBy(xpath = "(//*[@class='input-text'])[3]")
	@CacheLookup
	private WebElement enterPassWord;

	public WebElement getEnterPassWord() {
		return enterPassWord;
	}
	
	@FindBy(xpath = "(//*[text()='Sign In'])[1]")
	@CacheLookup
	private WebElement clickOnSubmit;

	public WebElement getClickOnSubmit() {
		return clickOnSubmit;
	}

}
