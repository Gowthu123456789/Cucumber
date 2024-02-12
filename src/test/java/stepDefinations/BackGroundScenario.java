package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundScenario {


@Given("I navigate to login page")
public void i_navigate_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
System.out.println("I navigate to login page");}
@And("I enter my user name")
public void i_enter_my_user_name() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I enter my user name");
}
@And("I enter my password")
public void i_enter_my_password() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I enter my password");
}
@When("I click on login button")
public void i_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I click on login button");
}
@Then("I should be logged in")
public void i_should_be_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("I should be logged in");
}

@Given("when i logged in")
public void when_i_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("when i logged in");
}
@When("i click on logout")
public void i_click_on_logout() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i click on logout");
}
@Then("i should be logged out")
public void i_should_be_logged_out() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i should be logged out");
}

}



