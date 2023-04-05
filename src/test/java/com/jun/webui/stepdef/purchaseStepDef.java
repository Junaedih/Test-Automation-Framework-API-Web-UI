package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class purchaseStepDef extends baseTest {

    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
    cartPage CartPage;
    placeOrderPage PlaceOrderPage;


    @Given("user is on place order page")
    public void userIsOnPlaceOrderPage() throws InterruptedException {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        CartPage = new cartPage(driver);
        PlaceOrderPage = new placeOrderPage(driver);


        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_Login();
        LoginPage.validateOnLoginPages();
        LoginPage.inputUsername("Alghazali");
        LoginPage.inputPassword("P@ssw0rd");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();
        HomePage.clickLinkTextPhones();
        HomePage.clickLinkTextSamsungGalaxyS6();
        HomePage.clickAddToCartButton();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        HomePage.clickLinkTextCart();
        CartPage.clickPlaceOrderButton();

    }

    @And("user input name place order with {string}")
    public void userInputNamePlaceOrderWith(String name) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputName(name);


    }

    @And("user input country place order with {string}")
    public void userInputCountryPlaceOrderWith(String country) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputCountry(country);

    }

    @And("user input city place order with {string}")
    public void userInputCityPlaceOrderWith(String city) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputCity(city);
    }

    @And("user input credit card place order with {string}")
    public void userInputCreditCardPlaceOrderWith(String creditCard) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputCreditCard(creditCard);

    }

    @And("user input month place order with {string}")
    public void userInputMonthPlaceOrderWith(String month) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputMonth(month);
    }

    @And("user input year place order with {string}")
    public void userInputYearPlaceOrderWith(String year) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.inputYear(year);
    }

    @When("user click purchase button")
    public void userClickPurchaseButton() {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.clickPurchaseButton();
    }

    @Then("product already process place order Purchase")
    public void productAlreadyProcessPlaceOrder() {
        PlaceOrderPage = new placeOrderPage(driver);
        HomePage = new homePage(driver);
        HomePage.validateOnHomePage();


    }

    @When("user click closed button")
    public void userClickClosedButton() {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.clickCloseButton();

    }

    @Then("user is stay on cart page")
    public void userIsStayOnCartPage() {

        CartPage = new cartPage(driver);
        CartPage.validateOnCartPage();

    }

    @Then("user get message alert {string}")
    public void userGetMessageAlert(String alert_message) {
        PlaceOrderPage = new placeOrderPage(driver);
        PlaceOrderPage.validateAlertMessage(alert_message);

    }
}
