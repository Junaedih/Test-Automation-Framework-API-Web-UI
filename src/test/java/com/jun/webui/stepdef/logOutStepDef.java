package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.homePage;
import com.jun.webui.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logOutStepDef extends baseTest {

    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;

    @Given("user is on home page")
    public void userIsOnHomePage() {
        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_Login();
        LoginPage.validateOnLoginPages();
        LoginPage.inputUsername("Alghazali");
        LoginPage.inputPassword("P@ssw0rd");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
    }

    @When("user click logout button")
    public void userClickLogoutButton() {

        HomePage = new homePage(driver);
        HomePage.clickLinkTextLogOut();

    }

    @Then("user on at first page")
    public void userOnAtFirstPage() {
        FirstPage = new firstPage(driver);
        FirstPage.validateOnFirstPage();

    }
}
