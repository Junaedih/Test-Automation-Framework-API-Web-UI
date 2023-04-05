package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import com.jun.webui.page.cartPage;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.homePage;
import com.jun.webui.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class deleteProductAtListCartStepDef extends baseTest {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;
    cartPage CartPage;


    @When("user click link-text deleted product")
    public void userClickLinkTextDeletedProduct() {
        HomePage= new homePage(driver);
        CartPage = new cartPage(driver);

        CartPage.deletedlist1Cart();
        CartPage.clickLinkTextHome();
        HomePage.clickLinkTextCart();


    }

    @Then("product deleted from list cart")
    public void productDeletedFromListCart() {
        CartPage = new cartPage(driver);
        CartPage.validateListCartEmpty();
    }

    @Given("product {string} already added to list cart")
    public void productAlreadyAddedToListCart(String listProductName2) {

        LoginPage = new loginPage(driver);
        FirstPage = new firstPage(driver);
        HomePage = new homePage(driver);
        CartPage = new cartPage(driver);


        FirstPage.goToFirstPage();
        FirstPage.click_hyperlinkText_Login();
        LoginPage.validateOnLoginPages();
        LoginPage.inputUsername("user_test_5");
        LoginPage.inputPassword("P@ssw0rd");
        LoginPage.clickLoginButton();
        HomePage.validateOnHomePage();



        switch (listProductName2) {
            case "Samsung galaxy s6":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextSamsungGalaxyS6();
                break;

            case "Nokia lumia 1520":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextNokiaLumia1520();
                break;

            case "Nexus 6":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextNexus6();
                break;

            case "Samsung galaxy s7":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextSamsungGalaxyS7();
                break;

            case "Iphone 6 32gb":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextIphone6_32gb();
                break;

            case "Sony xperia z5":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextSonyXperiaZ5();
                break;

            case "HTC One M9":
                HomePage.clickLinkTextPhones();
                HomePage.clickLinkTextHTCOneM9();
                break;

            case "Apple monitor 24":
                HomePage.clickLinTextMonitors();
                HomePage.clickLinkTextAppleMonitor24();
                break;

            case "ASUS Full HD":
                HomePage.clickLinTextMonitors();
                HomePage.clickLinkTextASUSFullHD();
                break;

            case "Sony vaio i5":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkTextSonyVaioI5();
                break;

            case "Sony vaio i7":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkTextSonyVaioI7();
                break;

            case "MacBook air":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkTextMacBookAir();
                break;

            case "Dell i7 8gb":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkTextDellI78gb();
                break;

            case "2017 Dell 15.6 Inch":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkText2017Dell156Inch();
                break;

            case "MacBook Pro":
                HomePage.clickLinkTextLaptops();
                HomePage.clickLinkTextMacBookPro();
                break;
        }

        HomePage.clickAddToCartButton();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        HomePage.clickLinkTextCart();


    }
}
