package com.jun.api.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;

public class getListOfTagsStepDef {
    @Then("get response code 200 OK")
    public void getResponseCodeOK() {
    }

    @When("send request get list of Tags")
    public void sendRequestGetListOfTags() {
        given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when().get("https://dummyapi.io/data/v1/tag")
                .then().log().all()
                .assertThat().statusCode(200);

    }
}
