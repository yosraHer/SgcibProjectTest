package com.Sgcib.account;

import com.Sgcib.models.Client;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OperatingAccountSteps {
	private Client client;
    private OperatingAccount operatingAccount;
 
	@Given("^an existing client named \"([^\"]*)\" with (\\d+\\.\\d+) EUR in his account$")
	public void an_existing_client_named_with_EUR_in_his_account(String name , double account) throws Throwable {
	    client = new Client(name, account);
	}
    
    @When("^he withdraws (\\d+\\.\\d+) EUR from his account$")
    public void he_withdraws_EUR_from_his_account(double amountWithdrawn) throws Throwable {
    	operatingAccount = new OperatingAccount();
    	operatingAccount.withdraw(client, amountWithdrawn);
    }

    @Then("^the new balance is (\\d+\\.\\d+) EUR$")
    public void the_new_balance_is_EUR(double remainingAmount) throws Throwable {
      Assert.assertEquals(client.getAccount(), remainingAmount);
    }
}
