package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SumOfTwo {
	
	@Given("^two numbers$")
	public void two_numbers() throws Throwable {
		System.out.println("Adding two numbers :");
	   
	}
	
	@When("^performed addition$")
	public void performed_addition() throws Throwable {
		
	}
	
	@When("^entered \"([^\"]*)\" and entered \"([^\"]*)\"$")
	public void entered_and_entered(int number1, int number2) throws Throwable {
		int number3=number1+number2;
		System.out.println("Sum of two number :"+number3);
		
	}
	
	@Then("^user should see sum of two numbers$")
	public void user_should_see_sum_of_two_numbers() throws Throwable {
		System.out.println("User can see sum of two number :");
		
	}


	
}
