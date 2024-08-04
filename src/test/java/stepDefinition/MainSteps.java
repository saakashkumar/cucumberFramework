package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("Admin is at login page of Netbaking")
	public void admin_is_at_login_page_of_netbaking() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Admin is at login page of Netbaking");
	}
	@When("Admin enters username and password and clicks login")
	public void admin_enters_username_and_password_and_clicks_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Admin enters username and password and clicks login");
	}
	@Then("home page is opened")
	public void home_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is opened");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}
}
