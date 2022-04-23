package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;

public class UserSteps {
    @Steps
    Get get;

    @Given("I set GET api endpoints detail user")
    public void setGetApiEndpoints() {
        get.setApiEndpoint();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }

    @Given("I set GET api endpoints list user")
    public void iSetGETApiEndpointsListUser() {
        get.SetGETApiEndpointsListUser();
    }

    @And("I receive valid data for list user")
    public void iReceiveValidDataForListUser() {
    }
}
