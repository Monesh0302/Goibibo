package Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class SignOut_Methods extends TestBase {
	
	public SignOut_Methods() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='login__tab gotrible']")
	private WebElement signOut_button;
	
	@FindBy(xpath="//span[text()='View your profile']")
	private WebElement profile_click;
	
	@FindBy(xpath="//button[@class='sc-11civud-0 fzjMGi']/span[text()='LOGOUT']")
	private WebElement log_Out;
	
	@FindBy(xpath="//button[@class='sc-sypgwv-6 kkbZLK']")
	private WebElement logout_button;

	public WebElement getSignOut_button() {
		return signOut_button;
	}

	public WebElement getProfile_click() {
		return profile_click;
	}

	public WebElement getLog_Out() {
		return log_Out;
	}

	public WebElement getLogout_button() {
		return logout_button;
	}
	

}
