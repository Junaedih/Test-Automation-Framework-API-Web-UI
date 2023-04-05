package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.aboutUsPage;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.homePage;
import com.jun.webui.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aboutUsStepDef extends baseTest {

    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
    aboutUsPage AboutUsPage;

    @Given("User is On About Us Page")
    public void userIsOnAboutUsPage() throws InterruptedException {
        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        AboutUsPage = new aboutUsPage(driver);

        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_Login();
        LoginPage.validateOnLoginPages();
        LoginPage.inputUsername("Alghazali");
        LoginPage.inputPassword("P@ssw0rd");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        HomePage.clickLinkTextAboutUs();

    }

    @When("user click button Play Video")
    public void userClickButtonPlayVideo() throws InterruptedException {
        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickPlayButtonVideo();

        // duration play video 5 second
        Thread.sleep(5000);

    }

    @Then("About Us Video Displayed")
    public void aboutUsVideoDisplayed() {
        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickCloseButtonAbout();
    }

    @When("user click closed button Play Video")
    public void userClickClosedButtonPlayVideo() {

        AboutUsPage = new aboutUsPage(driver);
        AboutUsPage.clickCloseButtonAbout();

    }

    @Then("user is on HomePage")
    public void userIsOnHomePage() {

    }
}
