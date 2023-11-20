package Goibibo_Runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import POM.PageObjectManager;

public class Runner extends TestBase{
	
PageObjectManager pom = new PageObjectManager();
	
	@BeforeSuite
	private void browser_launch(){
		browserLaunch("chrome");
		staticWait(3000);
	}
	
	@BeforeTest
	private void URL() {
		launchUrl("https://www.goibibo.com/");
		staticWait(3000);
	}
	
	@Test (priority =1)
	private void close_Popup() {
		clickOnWebelement(pom.getSign_in().getClose_popup());
		
	}
	
	@Test (priority =2)
	private void login_Button() {
		clickOnWebelement(pom.getSign_in().getLogin_button());
	}

	@Test (priority =3)
	private void phone_Num(){		
		inputValues(pom.getSign_in().getEnter_phno(),"9999999999");	
		staticWait(4000);
	}
	
	@Test (priority =4)
	private void edit_Phno(){
		clickOnWebelement(pom.getSign_in().getEdit_phno());
		staticWait(2000);
	}
	
	@Test (priority =5)
	private void phone_Num1() {
		pom.getSign_in().getEnter_phno().clear();
		staticWait(2000);
		inputValues(pom.getSign_in().getEnter_phno(),"7358646168");
		staticWait(25000);
	}
	
	@Test(priority =6)
	private void from_Destination() {
		clickOnWebelement(pom.getBooking_details().getFrom_place());
		staticWait(3000);
		inputValues(pom.getBooking_details().getFrom_input(),"chennai");
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getFrom_country());
		staticWait(3000);
	}
	
	@Test(priority=7)
	private void to_Destination() {
		inputValues(pom.getBooking_details().getTo_input(),"delhi");
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getTo_country());
		staticWait(3000);
	}
	
	@Test(priority=8)
	private void departure_Date() {
		clickOnWebelement(pom.getBooking_details().getClick_arrow());
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getDate_select());
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getDate_done());
		staticWait(3000);
	}
	
	@Test(priority=9)
	private void travel_Class() {
		clickOnWebelement(pom.getBooking_details().getAdd_adult());
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getAdd_child());
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getTravel_class());
		clickOnWebelement(pom.getBooking_details().getClass_done());
		staticWait(3000);
		clickOnWebelement(pom.getBooking_details().getSearch_flight());
		staticWait(11000);	
	}
	
	@Test(priority=10)
	private void sign_Out() {
		moveToElement(pom.getSign_out().getSignOut_button());
		staticWait(2000);
		clickOnWebelement(pom.getSign_out().getProfile_click());
		staticWait(2000);
		javaScript("down");
		clickOnWebelement(pom.getSign_out().getLog_Out());
		staticWait(2000);
		clickOnWebelement(pom.getSign_out().getLogout_button());
		staticWait(5000);
	}
	

	@AfterSuite
	private void close() {
		exit();
	}

}
