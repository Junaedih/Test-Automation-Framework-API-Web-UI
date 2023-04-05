package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.signUpPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class signUpStepDef extends baseTest {


    firstPage FirstPage;
    signUpPages SignUpPages;


    @Given("user is on signUp page")
    public void userIsOnSignUpPage() {

        FirstPage = new firstPage(driver);
        SignUpPages = new signUpPages(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_SignUp();
        SignUpPages.validateOnSignUpPage();

    }

    @And("user input username SignUp with {string}")
    public void userInputUsernameSignUpWith(String usernameSign) {
        SignUpPages = new signUpPages(driver);
        SignUpPages.inputUsernameSign(usernameSign);
    }

    @And("user input password SignUp with {string}")
    public void userInputPasswordSignUpWith(String passwordSign) {
        SignUpPages = new signUpPages(driver);
        SignUpPages.inputPasswordSign(passwordSign);
    }

    @When("user click Sign Up button")
    public void userClickSignUpButton() throws InterruptedException {
        SignUpPages = new signUpPages(driver);
        SignUpPages.clickSignUpButton();
    }

    @Then("user able to see message {string}")
    public void userAbleToSeeMessage(String message) {

        SignUpPages = new signUpPages(driver);
        SignUpPages.validateMessageAppear(message);
        if (message != "Sign up successful.") {
            SignUpPages.clickCloseButton();
        }

    }

    @When("user click close sign up button")
    public void userClickCloseSignUpButton() {
        SignUpPages = new signUpPages(driver);
        SignUpPages.clickCloseButton();
    }
}
