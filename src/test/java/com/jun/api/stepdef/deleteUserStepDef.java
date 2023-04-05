package com.jun.api.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class deleteUserStepDef {
    @When("send request deleted user with id: {string}")
    public void sendRequestDeletedUserWithId(String listID) {

        //define baseURI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to delete
        String userIDToDelete = listID;

        //test delete api user
        given().log().all()
                .when().delete("https://reqres.in/api/users/" + userIDToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }

    @Then("get response code 204 No Content, user already deleted")

    public void getResponseCodeNoContentUserAlreadyDeleted() {

    }

    @When("send request deleted user with id: {string} get response code {int} No Content")
    public void sendRequestDeletedUserWithIdGetResponseCodeNoContent(String listID, int valueResponseCode) {

        //define baseURI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to delete
        String userIDToDelete = listID;
        int textResponseCode = valueResponseCode;

        //test delete api user
        given().log().all()
                .when().delete("https://reqres.in/api/users/" + userIDToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(textResponseCode);

    }
}
