package Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class SignIn_Methods extends TestBase {
	
	public SignIn_Methods() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//span[@class='logSprite icClose']")
	private WebElement close_popup;
	
	public WebElement getClose_popup() {
		return close_popup;
	}

	@FindBy(xpath="//div[@class='login__tab gotrible']")
	private WebElement Login_button;

	public WebElement getLogin_button() {
		return Login_button;
	}
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Enter_phno;

	public WebElement getEnter_phno() {
		return Enter_phno;
	}
	
	@FindBy(xpath="//span[@class='logSprite icEdit']")
	private WebElement Edit_phno;
	
	public WebElement getEdit_phno() {
		return Edit_phno;
	}

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continue_button;

	public WebElement getContinue_button() {
		return continue_button;
	}
	

}
