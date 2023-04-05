package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.contactPage;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.homePage;
import com.jun.webui.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactStepDef extends baseTest {


    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
    contactPage ContactPage;


    @Given("user on contact page")
    public void userAtHomePage() {

        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        ContactPage = new contactPage(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_Login();
        LoginPage.validateOnLoginPages();
        LoginPage.inputUsername("Alghazali");
        LoginPage.inputPassword("P@ssw0rd");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        HomePage.clickLinkTextContact();
        ContactPage.validateIsOnContactPage();
    }

    @And("input email address {string}")
    public void inputEmailAddress(String email) {
        ContactPage = new contactPage(driver);
        ContactPage.inputEmailAddress(email);

    }

    @And("input name {string}")
    public void inputName(String name) {
        ContactPage = new contactPage(driver);
        ContactPage.inputName(name);
    }

    @And("input message text {string}")
    public void inputMessageText(String message) {
        ContactPage = new contactPage(driver);
        ContactPage.inputMessage(message);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        ContactPage = new contactPage(driver);
        ContactPage.clickSendMessageButton();

    }

    @Then("send message contact already success")
    public void sendMessageContactAlreadySuccess() {
        ContactPage = new contactPage(driver);
        HomePage = new homePage(driver);
        HomePage.validateOnHomePage();

    }

    @When("user click close message button")
    public void userClickCloseMessageButton() {

        ContactPage = new contactPage(driver);
        HomePage = new homePage(driver);
        ContactPage.clickCloseMessageButton();

    }

    @Then("user is on home-page")
    public void userIsOnHomePage() {
        ContactPage = new contactPage(driver);
        HomePage = new homePage(driver);

        HomePage.validateOnHomePage();


    }

    @Then("user get message box {string}")
    public void userGetMessageBox(String messageBox) {
        ContactPage = new contactPage(driver);
        ContactPage.validateMessageBox(messageBox);
    }
}
