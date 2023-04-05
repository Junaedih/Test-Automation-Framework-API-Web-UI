package com.jun.api.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;

import java.io.File;

public class getUserByIDStepDef {


    @Given("url dummy-api.io can accessed")
    public void urlDummyapiIoCanAccessed() {
        RestAssured
                .given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when()
                .get("https://dummyapi.io/")
                .then()
                .assertThat().statusCode(200);

    }


    @When("send request get by ID {string}")
    public void sendRequestGetByID(String listID) {
        RestAssured
                .given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when()
                .get("https://dummyapi.io/data/v1/user/" + listID)
                .then()
                .assertThat().statusCode(200);

    }


    @Then("get response code 200 OK, ID: {string},  firstname: {string} , lastname: {string}")
    public void getResponseCodeSuccessfullyIDFirstnameLastname(String textListID, String firstName, String lastName) {

        File jsonSchema = new File("src/test/resources/jsonSchema/getUserByIDSchema.json");

        RestAssured
                .given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when()
                .get("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a" + textListID)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("id", Matchers.equalTo("60d0fe4f5311236168a10a" +textListID))
                .assertThat().body("firstName", Matchers.equalTo(firstName))
                .assertThat().body("lastName", Matchers.equalTo(lastName))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }


    @When("send request get by invalid ID {string}")
    public void sendRequestGetByInvalidID(String invalidID) {

        RestAssured
                .given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when()
                .get("https://dummyapi.io/data/v1/user/" + invalidID)
                .then().log().all()
                .assertThat().statusCode(400);
    }


    @Then("get response code {int} Bad Request, ID: {string}, error: {string}")
    public void getResponseCodeBadRequestIDError(int responseCode, String invalidID, String messageError) {

        RestAssured
                .given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when()
                .get("https://dummyapi.io/data/v1/user/" + invalidID)
                .then().log().all()
                .assertThat().statusCode(responseCode)
                .assertThat().body("error", Matchers.equalTo(messageError));

    }

    @When("send request get by invalid ID")
    public void sendRequestGetByInvalidID() {
    }
}
