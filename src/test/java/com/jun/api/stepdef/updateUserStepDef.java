package com.jun.api.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class updateUserStepDef {
    @When("send request put update user with id: {string} , newFirstName: {string}")
    public void sendRequestPutUpdateUserWithIdNewFirstName(String listID, String newFirstName) {

        File jsonSchema = new File("src/test/resources/jsonSchema/putUpdateUserSchema.json");

        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = listID;
        String txtfirstName = newFirstName;

        // put update user id  --> update firstname
        // first, get attribute user

        String id = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.id");
        String title = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.title");
        String firstName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.firstName");
        String lastName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.lastName");
        String picture = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.picture");
        String gender = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.gender");
        String email = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.email");
        String dateOfBirth = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.dateOfBirth");
        String phone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.phone");
        String location = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.location");
        String street = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.street");
        String city = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.city");
        String state = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.state");
        String country = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.country");
        String timezone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.timezone");
        String registerDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.registerDate");
        String updatedDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.updatedDate");


        // change the first name to ""
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("title", title);
        bodyMap.put("firstName", txtfirstName);
        bodyMap.put("lastName", lastName);
        bodyMap.put("picture", picture);
        bodyMap.put("gender", gender);
        bodyMap.put("email", email);
        bodyMap.put("dateOfBirth", dateOfBirth);
        bodyMap.put("phone", phone);
        bodyMap.put("location", location);
        bodyMap.put("street", street);
        bodyMap.put("city", city);
        bodyMap.put("state", state);
        bodyMap.put("country", country);
        bodyMap.put("timezone", timezone);
        bodyMap.put("registerDate", registerDate);
        bodyMap.put("updatedDate", updatedDate);



        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")


                .body(jsonObject.toString())
                .put("https://dummyapi.io/data/v1/user/" + userId)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("firstName", Matchers.equalTo(txtfirstName))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));


    }

    @Then("get response code 200 OK, firstName already updated")
    public void getResponseCodeOKFirstNameAlreadyUpdated() {
    }

    @When("send request put update user with id: {string} , newFirstName: {string}, get response code {int}")
    public void sendRequestPutUpdateUserWithIdNewFirstNameGetResponseCode(String listID, String newFirstName, int valueResponseCode) {

        File jsonSchema = new File("src/test/resources/jsonSchema/putUpdateUserSchema.json");


        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = listID;
        String txtfirstName = newFirstName;
        int textResponseCode = valueResponseCode;
                // put update user id  --> update firstname
        // first, get attribute user

        String id = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.id");
        String title = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.title");
        String firstName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.firstName");
        String lastName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.lastName");
        String picture = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.picture");
        String gender = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.gender");
        String email = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.email");
        String dateOfBirth = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.dateOfBirth");
        String phone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.phone");
        String location = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.location");
        String street = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.street");
        String city = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.city");
        String state = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.state");
        String country = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.country");
        String timezone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.timezone");
        String registerDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.registerDate");
        String updatedDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.updatedDate");


        // change the first name to ""
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("title", title);
        bodyMap.put("firstName", txtfirstName);
        bodyMap.put("lastName", lastName);
        bodyMap.put("picture", picture);
        bodyMap.put("gender", gender);
        bodyMap.put("email", email);
        bodyMap.put("dateOfBirth", dateOfBirth);
        bodyMap.put("phone", phone);
        bodyMap.put("location", location);
        bodyMap.put("street", street);
        bodyMap.put("city", city);
        bodyMap.put("state", state);
        bodyMap.put("country", country);
        bodyMap.put("timezone", timezone);
        bodyMap.put("registerDate", registerDate);
        bodyMap.put("updatedDate", updatedDate);



        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")


                .body(jsonObject.toString())
                .put("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a" + userId)
                .then().log().all()
                .assertThat().statusCode(textResponseCode)
                .assertThat().body("firstName", Matchers.equalTo(txtfirstName))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));


    }

    @When("send request put update user with id: {string} , newLastName: {string}, get response code {int}")
    public void sendRequestPutUpdateUserWithIdNewLastNameGetResponseCode(String listID, String newlastName, int valueResponseCode) {

        File jsonSchema = new File("src/test/resources/jsonSchema/putUpdateUserSchema.json");

        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = listID;
        String txtlastName = newlastName;
        int textResponseCode = valueResponseCode;
        // put update user id  --> update firstname
        // first, get attribute user

        String id = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.id");
        String title = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.title");
        String firstName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.firstName");
        String lastName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.lastName");
        String picture = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.picture");
        String gender = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.gender");
        String email = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.email");
        String dateOfBirth = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.dateOfBirth");
        String phone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.phone");
        String location = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.location");
        String street = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.street");
        String city = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.city");
        String state = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.state");
        String country = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.country");
        String timezone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.timezone");
        String registerDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.registerDate");
        String updatedDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.updatedDate");


        // change the first name to ""
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("title", title);
        bodyMap.put("firstName", firstName);
        bodyMap.put("lastName", txtlastName);
        bodyMap.put("picture", picture);
        bodyMap.put("gender", gender);
        bodyMap.put("email", email);
        bodyMap.put("dateOfBirth", dateOfBirth);
        bodyMap.put("phone", phone);
        bodyMap.put("location", location);
        bodyMap.put("street", street);
        bodyMap.put("city", city);
        bodyMap.put("state", state);
        bodyMap.put("country", country);
        bodyMap.put("timezone", timezone);
        bodyMap.put("registerDate", registerDate);
        bodyMap.put("updatedDate", updatedDate);



        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")


                .body(jsonObject.toString())
                .put("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a" + userId)
                .then().log().all()
                .assertThat().statusCode(textResponseCode)
                .assertThat().body("lastName", Matchers.equalTo(txtlastName))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));


    }


    @When("send request put update user with id: {string} , newFirstName: {string}, newLastName: {string}, get response code {int}")
    public void sendRequestPutUpdateUserWithIdNewFirstNameNewLastNameGetResponseCode(String listID, String newfirstName, String newlastName, int valueResponseCode) {

        File jsonSchema = new File("src/test/resources/jsonSchema/putUpdateUserSchema.json");

        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = listID;
        String txtfirstName = newfirstName;
        String txtlastName = newlastName;
        int textResponseCode = valueResponseCode;
        // put update user id  --> update firstname
        // first, get attribute user

        String id = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.id");
        String title = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.title");
        String firstName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.firstName");
        String lastName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.lastName");
        String picture = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.picture");
        String gender = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.gender");
        String email = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.email");
        String dateOfBirth = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.dateOfBirth");
        String phone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.phone");
        String location = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.location");
        String street = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.street");
        String city = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.city");
        String state = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.state");
        String country = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.country");
        String timezone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.timezone");
        String registerDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.registerDate");
        String updatedDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.updatedDate");


        // change the first name to ""
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("title", title);
        bodyMap.put("firstName", txtfirstName);
        bodyMap.put("lastName", txtlastName);
        bodyMap.put("picture", picture);
        bodyMap.put("gender", gender);
        bodyMap.put("email", email);
        bodyMap.put("dateOfBirth", dateOfBirth);
        bodyMap.put("phone", phone);
        bodyMap.put("location", location);
        bodyMap.put("street", street);
        bodyMap.put("city", city);
        bodyMap.put("state", state);
        bodyMap.put("country", country);
        bodyMap.put("timezone", timezone);
        bodyMap.put("registerDate", registerDate);
        bodyMap.put("updatedDate", updatedDate);



        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")


                .body(jsonObject.toString())
                .put("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a" + userId)
                .then().log().all()
                .assertThat().statusCode(textResponseCode)
                .assertThat().body("firstName", Matchers.equalTo(txtfirstName))
                .assertThat().body("lastName", Matchers.equalTo(txtlastName))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }

    @Then("get response code 404 Not Found, firstName already updated")
    public void getResponseCodeNotFoundFirstNameAlreadyUpdated() {
    }

    @When("send request put update user with id: {string} , newLastName: {string}, get response code {int} get message error {string}")
    public void sendRequestPutUpdateUserWithIdNewLastNameGetResponseCodeGetMessageError(String listID, String newlastName, int valueResponseCode, String messageError) {

        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = listID;
        String txtlastName = newlastName;
        int textResponseCode = valueResponseCode;

        // put update user id  --> update
        // first, get attribute user

        String id = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.id");
        String title = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.title");
        String firstName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.firstName");
        String lastName = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.lastName");
        String picture = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.picture");
        String gender = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.gender");
        String email = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.email");
        String dateOfBirth = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.dateOfBirth");
        String phone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.phone");
        String location = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.location");
        String street = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.street");
        String city = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.city");
        String state = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.state");
        String country = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.country");
        String timezone = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.timezone");
        String registerDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.registerDate");
        String updatedDate = given().when().get("https://dummyapi.io/data/v1/user/" + userId).getBody().jsonPath().get("data.updatedDate");


        // change the first name to ""
        //create body request with hashMap and convert it to json

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("title", title);
        bodyMap.put("firstName", firstName);
        bodyMap.put("lastName", txtlastName);
        bodyMap.put("picture", picture);
        bodyMap.put("gender", gender);
        bodyMap.put("email", email);
        bodyMap.put("dateOfBirth", dateOfBirth);
        bodyMap.put("phone", phone);
        bodyMap.put("location", location);
        bodyMap.put("street", street);
        bodyMap.put("city", city);
        bodyMap.put("state", state);
        bodyMap.put("country", country);
        bodyMap.put("timezone", timezone);
        bodyMap.put("registerDate", registerDate);
        bodyMap.put("updatedDate", updatedDate);



        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6427c183dcfa443a03f27bf7")


                .body(jsonObject.toString())
                .put("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a" + userId)
                .then().log().all()
                .assertThat().statusCode(textResponseCode)
                .assertThat().body("error", Matchers.equalTo(messageError));

    }
}
