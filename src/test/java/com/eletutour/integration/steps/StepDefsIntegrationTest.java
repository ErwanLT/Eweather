package com.eletutour.integration.steps;

import com.eletutour.eweather.dto.Forecast;
import com.eletutour.eweather.exceptions.ApiError;
import com.google.gson.Gson;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StepDefsIntegrationTest extends SpringIntegrationTest {

    private static final String urlLocation = "http://localhost:8080/eweather/forecast?location=";

    private static final String urlGeolocation = "http://localhost:8080/eweather/forecastLocation?";

    @When("^the client call /eweather/toto$")
    public void the_client_call_eweather_toto() throws Throwable {
        executeGet("http://localhost:8080/eweather/toto");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @When("^the client call the API with location \"([^\"]*)\"$")
    public void the_client_call_the_API_with_location(String location) throws Throwable {
        executeGet(urlLocation + location);
    }

    @When("^the client call the API with latitude \"([^\"]*)\" and longitude \"([^\"]*)\"$")
    public void the_client_call_the_API_with_latitude_and_longitude(String latitude, String longitude) throws Throwable {
        executeGet(urlGeolocation + "latitude="+latitude + "&longitude="+longitude);
    }

    @Then("^the client receive status code of (\\d+)$")
    public void the_client_receive_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @Then("^I receive valid Response$")
    public void i_receive_valid_Response() throws Throwable {
        String responseBody = latestResponse.getBody();
        Gson g = new Gson();
        Forecast f = g.fromJson(responseBody, Forecast.class);
        Assertions.assertThat(f).isNotNull();
        Assertions.assertThat(f.getLocation()).isNotNull().isNotEmpty();
        Assertions.assertThat(f.getCurrently()).isNotNull();
        Assertions.assertThat(f.getDaily()).isNotNull();
        Assertions.assertThat(f.getHourly()).isNotNull();
    }

    @Then("^I receive an error Response$")
    public void i_receive_an_error_Response() throws Throwable {
        String responseBody = latestResponse.getBody();
        Gson g = new Gson();
        ApiError error = g.fromJson(responseBody, ApiError.class);
        Assertions.assertThat(error).isNotNull();
        Assertions.assertThat(error.getStatus()).isNotNull().isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
        Assertions.assertThat(error.getMessage()).isNotNull().isNotEmpty().isEqualTo("Une erreur concernant la location est survenue.");
        Assertions.assertThat(error.getDebugMessage()).isNotNull().isNotEmpty();
    }
}