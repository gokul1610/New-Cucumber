package org.Stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends BaseClass {
	WebDriver driver;
	
	@Given("user has to be in Facebook login page")
	public void user_has_to_be_in_Facebook_login_page() {
		LoadUrl("https://www.facebook.com/");
		
			}
	@When("user has to fill the Valid username and Valid password")
	public void user_has_to_fill_the_Valid_username_and_Valid_password(io.cucumber.datatable.DataTable d) {
//		 List<String> li=d.asList();
//			List<List<String>>li=d.asLists();
//			Map<String, String> mp = d.asMap(String.class, String.class);
			 List<Map<String, String>> mp = d.asMaps();
			LoginPojoClass lp=new LoginPojoClass();
			fill(lp.getUsername(), mp.get(1).get("username"));
			fill(lp.getPassword(), mp.get(0).get("password"));
	}	
	@When("user needs to click the login button")
	public void user_needs_to_click_the_login_button() {
		LoginPojoClass lp=new LoginPojoClass();
		BtnClick(lp.getLoginBtn());
	}
	@Then("user has to navigate to homepage")
	public void user_has_to_navigate_to_homepage() {
		System.out.println("Display homepage");
	}
	@When("user has to fill the Invalid username and Invalid password")
	public void user_has_to_fill_the_Invalid_username_and_Invalid_password() {
		LoginPojoClass lp=new LoginPojoClass();
		fill(lp.getUsername(), "adadada");
		fill(lp.getPassword(), "bbbbbb");
		BtnClick(lp.getLoginBtn());
	}

	@Then("user must not navigate to Homepage")
	public void user_must_not_navigate_to_Homepage() {
	    System.out.println("Invalid username/Password");
	}

}

