package com.stefdepth;

import org.openqa.selenium.WebDriver;

import com.bookingpage.HomePage;
import com.bookingpage.ObjectModel;
import com.bookingpage.UserModel;
import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefDepth extends Base{
	WebDriver driver;
	UserModel um;
	ObjectModel om;
	HomePage hp;
	@Given("^I am appliocation home page$")
	public void i_am_appliocation_home_page() throws Throwable {
	   getDriver();
	   
	}

	@When("^I click booking link$")
	public void i_click_booking_link() throws Throwable {
	   hp=new HomePage(driver);
		hp.BookingPage();
	   
	}

	@When("^I entered \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_entered(String username, String password) throws Throwable {
	   um=new UserModel(driver);
		um.UserName(username);
	   um.Password(password);
	  
	   
	}

	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
	   um.Submit();
	   
	}

	@When("^I entered \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_entered(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
	   hp.BookingPage();
	   um=new UserModel(driver);
	   
		om=new ObjectModel(driver);
	   
	   om.clickround();
	   om.Passenger();
	   om.Deperting();
	   om.Month();
	   om.Date();
	   om.Arriving();
	   om.ReturnMonth();
	   om.ReturnDate();
	   om.ServiceClass();
	   om.Airline();
	}

	@Then("^I click continue button$")
	public void i_click_continue_button() throws Throwable {
	   om=new ObjectModel(driver);
	   om.ClickContinue();
	   
	}




}
