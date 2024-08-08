package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
	
	@Given("Admin is at login page of Netbaking")
	public void admin_is_at_login_page_of_netbaking() {

	    System.out.println("Admin is at login page of Netbaking");
	}
	@When("Admin enters username and password and clicks login")
	public void admin_enters_username_and_password_and_clicks_login() {

		System.out.println("Admin enters username and password and clicks login");
	}
	@Then("home page is opened")
	public void home_page_is_opened() {

		System.out.println("home page is opened");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {

		System.out.println("cards are displayed");
	}

	@Given("User is at login page of Netbaking")
	public void user_is_at_login_page_of_netbaking() {

		System.out.println("User is at login page");
	}
	@When("User enters username and password and clicks login")
	public void user_enters_username_and_password_and_clicks_login() {

			System.out.println("User enters username and password and clicks login");
		}

	@When("User enters username {string} and password {string} and clicks login")
	public void user_enters_username_and_password_and_clicks_login(String Username, String Password) {

		System.out.println("Entered user is "+ Username + " and password is "+ Password);
	}

	@Given("User is at default signup page")
	public void user_is_at_default_signup_page() {

		System.out.println("User is at default signup page");
	}
	@When("User entered all the details")
	public void user_entered_all_the_details(List<String> dataTable) {
		System.out.println(dataTable.get(0));
		System.out.println(dataTable.get(1));
		System.out.println(dataTable.get(2));
		System.out.println(dataTable.get(3));
	}

	@Given("Setup databases")
	public void setup_databases() {
		System.out.println("***************");
		System.out.println("Setup databases");
	}
	@When("launch browser from config variable")
	public void launch_browser_from_config_variable() {

		System.out.println("launch browser from config variable");
	}
	@When("hit the home page url of website")
	public void hit_the_home_page_url_of_website() {
		System.out.println("hit the home page url of website");
	}
}


