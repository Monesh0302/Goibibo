package Methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class Booking_Methods extends TestBase {
	
	public Booking_Methods() {
		PageFactory.initElements(driver, this);
		}
	
	//------------------->From-Departure Textbox<------------------------//
	
	@FindBy(xpath="(//p[text()='Enter city or airport'])[1]") 
	private WebElement From_place;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement from_input;
	
	@FindBy (xpath="//div[@class='sc-12foipm-45 gfqMUQ']/p/span[text()='Chennai, India']")  // select the country from the textbox -> From
	private WebElement  From_country;
	
	//------------------->To-Departure Textbox<------------------------//

	@FindBy(xpath="(//p[text()='Enter city or airport'])[2]") 
	private WebElement To_place;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement To_input;
	
	@FindBy(xpath="//span[text()='New Delhi, India']//following::p[text()='Indira Gandhi International Airport']")
	private WebElement To_country;
	
	//------------------->Departure Date select<-----------------------//
	
	@FindBy(xpath="//div[@class='sc-12foipm-34 iHoHRr']//following::span[text()='Departure']//following::span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")
	private WebElement Dep_date_selection;

	@FindBy(xpath="//span[@aria-label='Next Month']") //change nxt month -> click arrow
	private WebElement click_arrow;
	
	@FindBy(xpath="//div[@class='DayPicker-Day' and @aria-label='Wed Jan 03 2024']") //select the date
	private WebElement date_select;
	
	@FindBy(xpath="//span[@class='fswTrvl__done']") // click the done button
	private WebElement date_done;
	
	//-------------------->Adult field<-------------------------------//
	
	@FindBy(xpath="(//p[text()='Adults']//following::span[@class='sc-12foipm-64 dGRyPm'])[2]")
	private WebElement add_adult;
	
	@FindBy(xpath="(//p[text()='Children']//following::span[@class='sc-12foipm-64 dGRyPm'])[2]")
	private WebElement add_child;
	
	@FindBy(xpath="//li[text()='business']")
	private WebElement Travel_class;
	
	@FindBy(xpath="//a[text()='Done']")
	private WebElement class_done;
	
	//---------------------> Search flight<--------------------------//
	
	@FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
	private WebElement search_flight;
	
	//----------------->return type<------------------------------//

	public WebElement getFrom_place() {
		return From_place;
	}

	public WebElement getFrom_input() {
		return from_input;
	}

	public WebElement getFrom_country() {
		return From_country;
	}

	public WebElement getTo_place() {
		return To_place;
	}

	public WebElement getTo_input() {
		return To_input;
	}

	public WebElement getTo_country() {
		return To_country;
	}

	public WebElement getDep_date_selection() {
		return Dep_date_selection;
	}

	public WebElement getClick_arrow() {
		return click_arrow;
	}

	public WebElement getDate_select() {
		return date_select;
	}

	public WebElement getDate_done() {
		return date_done;
	}
	
	public WebElement getAdd_adult() {
		return add_adult;
	}

	public WebElement getAdd_child() {
		return add_child;
	}

	public WebElement getTravel_class() {
		return Travel_class;
	}

	public WebElement getClass_done() {
		return class_done;
	}
	
	public WebElement getSearch_flight() {
		return search_flight;
	}
	

}
