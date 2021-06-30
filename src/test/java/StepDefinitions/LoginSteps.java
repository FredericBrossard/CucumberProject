package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("today is Sunday")
	public void today_is_Sunday() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();

		System.out.println("today is Sunday");
	}

	@When("some other precondition")
	public void some_other_precondition( ) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("some other precondition");
	}
	@And("I complete action test")
	public void I_complete_action( ) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("complete action");
	}
	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("today is Sunday");
	}

}
