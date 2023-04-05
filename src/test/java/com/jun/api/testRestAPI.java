package com.jun.api;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class testRestAPI {

    @Test
    public void testGetUserByID() {

        File jsonSchema = new File("src/test/resources/jsonSchema/getUserByIDSchema.json");

        given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when().get("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a10a03")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("id", Matchers.equalTo("60d0fe4f5311236168a10a03"))
                .assertThat().body("firstName", Matchers.equalTo("Andri"))
                .assertThat().body("lastName", Matchers.equalTo("Leclerc"))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Test
    public void testPostCreateUser() {

        File jsonSchema = new File("src/test/resources/jsonSchema/postCreateUserSchema.json");

        String valuefirstName = "Junaedih";
        String valuelastName = "Alghazali";
        String valueEmail = "junaedih.alghazalix1@gmail.com";


        JSONObject bodyObj = new JSONObject();
        bodyObj.put("firstName", valuefirstName);
        bodyObj.put("lastName", valuelastName);
        bodyObj.put("email", valueEmail);


        given()
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
                .assertThat().body("email", Matchers.equalTo(valueEmail))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Test
    public void testPutUpdateUser() {

        File jsonSchema = new File("src/test/resources/jsonSchema/putUpdateUserSchema.json");

        //define base URI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to update
        String userId = "6428f2c742fa6b7f7b44e3c9";
        String txtfirstName = "Rahmansyah";
        // put update user id 6428f2c742fa6b7f7b44e3c9 --> update firstname
        // first, get attribute user id 6428f2c742fa6b7f7b44e3c9

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


        // change the first name to "Junaedih"
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


    @Test
    public void testDeleteUser() {
        //define baseURI
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";

        //data to delete
        String userIDToDelete = "6428f2c742fa6b7f7b44e3c9";

        //test delete api user
        given().log().all()
                .when().delete("https://reqres.in/api/users/" + userIDToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(204);
    }

    @Test
    public void testGetListOfTag() {
        given()
                .header("app-id", "6427c183dcfa443a03f27bf7")
                .when().get("https://dummyapi.io/data/v1/tag")
                .then().log().all()
                .assertThat().statusCode(200);

    }

}
