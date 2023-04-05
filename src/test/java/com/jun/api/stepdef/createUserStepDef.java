package com.jun.api.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.io.File;

public class createUserStepDef {
    @When("send request post create user with firstName: {string} , lastName: {string} email:{string}")
    public void sendRequestPostCreateUserWithFirstnameLastnameEmail(String valuefirstName, String valuelastName, String valueemail) {

        File jsonSchema = new File("src/test/resources/jsonSchema/postCreateUserSchema.json");

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("firstName", valuefirstName);
        bodyObj.put("lastName", valuelastName);
        bodyObj.put("email", valueemail);

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .body(bodyObj.toString())

                .when()
                .post("https://dummyapi.io/data/v1/user/create")

                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("firstName", Matchers.equalTo(valuefirstName))
                .assertThat().body("lastName", Matchers.equalTo(valuelastName))
                .assertThat().body("email", Matchers.equalTo(valueemail))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }

    @Then("get response code 200 OK, user already created")
    public void getResponseCodeOKUserAlreadyCreated() {


    }

    @When("create user with firstName: {string},lastName: {string} email existing:{string} response code {int}, error:{string},  detail error: {string}")
    public void sendRequestPostCreateUserWithFirstNameLastNameEmailExistingGetResponseCodeBadRequestErrorDetailError(String valuefirstName, String valuelastName, String valueEmail, int responseCode, String textError, String textDetailError) {


        JSONObject bodyObj = new JSONObject();
        bodyObj.put("firstName", valuefirstName);
        bodyObj.put("lastName", valuelastName);
        bodyObj.put("email", valueEmail);

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .body(bodyObj.toString())

                .when()
                .post("https://dummyapi.io/data/v1/user/create")

                .then().log().all()
                .assertThat().statusCode(responseCode)
                .assertThat().body("error", Matchers.equalTo(textError))
                .assertThat().body("data.email", Matchers.equalToObject(textDetailError));


    }

    @Then("get response code 400 Bad Request")
    public void getResponseCodeBadRequest() {
    }


    @When("create user with blank firstName: {string}, lastName: {string} email: {string} response code {int}, error: {string},  detail error: {string}")
    public void createUserWithInvalidFirstNameLastNameEmailResponseCodeErrorDetailError(String valuefirstName, String valuelastName, String valueEmail, int responseCode, String textError, String textDetailError) {

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("firstName", valuefirstName);
        bodyObj.put("lastName", valuelastName);
        bodyObj.put("email", valueEmail);

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .body(bodyObj.toString())

                .when()
                .post("https://dummyapi.io/data/v1/user/create")

                .then().log().all()
                .assertThat().statusCode(responseCode)
                .assertThat().body("error", Matchers.equalTo(textError))
                .assertThat().body("data.firstName", Matchers.equalToObject(textDetailError));

    }

    @When("create user with firstName: {string}, blank lastName: {string} email: {string} response code {int}, error: {string},  detail error: {string}")
    public void createUserWithFirstNameBlankLastNameEmailResponseCodeErrorDetailError(String valuefirstName, String valuelastName, String valueEmail, int responseCode, String textError, String textDetailError) {

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("firstName", valuefirstName);
        bodyObj.put("lastName", valuelastName);
        bodyObj.put("email", valueEmail);

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .body(bodyObj.toString())

                .when()
                .post("https://dummyapi.io/data/v1/user/create")

                .then().log().all()
                .assertThat().statusCode(responseCode)
                .assertThat().body("error", Matchers.equalTo(textError))
                .assertThat().body("data.lastName", Matchers.equalToObject(textDetailError));

    }
}


