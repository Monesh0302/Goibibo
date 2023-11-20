package POM;

import Methods.Booking_Methods;
import Methods.SignIn_Methods;
import Methods.SignOut_Methods;

public class PageObjectManager {
	
private SignIn_Methods Sign_in;
	
	public SignIn_Methods getSign_in() {
		if (Sign_in== null) {
			Sign_in = new SignIn_Methods();
		}
		return Sign_in;
	}
	
	private Booking_Methods Booking_details;

	public Booking_Methods getBooking_details() {
		if(Booking_details== null) {
			Booking_details = new Booking_Methods();
		}
		return Booking_details;
	}
	
	private SignOut_Methods Sign_out;

	public SignOut_Methods getSign_out() {
		if(Sign_out == null) {
			Sign_out = new SignOut_Methods();
		}
		return Sign_out;
	}

	private static PageObjectManager pom;

	public static PageObjectManager getPom() {
		return pom;
	}

}
