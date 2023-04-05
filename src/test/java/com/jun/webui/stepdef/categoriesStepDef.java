package com.jun.webui.stepdef;


import com.jun.webui.baseTest;
import com.jun.webui.page.firstPage;
import com.jun.webui.page.homePage;
import com.jun.webui.page.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class categoriesStepDef extends baseTest {

    firstPage FirstPage;
    loginPage LoginPage;
    homePage HomePage;

    @Given("user is on Home-page")
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


    @Then("user see display list product categories phone")
    public void userSeeDisplayListProductCategoriesPhone() {
        HomePage = new homePage(driver);
        HomePage.validateListCategoryPhones();

    }

    @When("user click link-text categories Phones")
    public void userClickLinkTextCategoriesPhones() {
        HomePage = new homePage(driver);
        HomePage.clickLinkTextPhones();
    }

    @When("user click link-text categories Laptops")
    public void userClickLinkTextCategoriesLaptops() {
        HomePage = new homePage(driver);
        HomePage.clickLinkTextLaptops();
    }

    @When("user click link-text categories Monitor")
    public void userClickLinkTextCategoriesMonitor() {
        HomePage = new homePage(driver);
        HomePage.clickLinTextMonitors();
    }

    @When("user click link-text categories {string}")
    public void userClickLinkTextCategories(String productCategory) {

        if (productCategory == "Phone") {

            HomePage = new homePage(driver);
            HomePage.clickLinkTextPhones();
        } else if (productCategory == "Laptops") {

            HomePage = new homePage(driver);
            HomePage.clickLinkTextLaptops();
        } else if (productCategory == "Monitors") {

            HomePage = new homePage(driver);
            HomePage.clickLinTextMonitors();
        }

    }


    @Then("user see display list product categories monitor")
    public void userSeeDisplayListProductCategoriesMonitor() {
        HomePage = new homePage(driver);
        HomePage.validateListCategoryMonitors();
    }

    @Then("user see display list product categories laptops")
    public void userSeeDisplayListProductCategoriesLaptops() {
        HomePage = new homePage(driver);
        HomePage.validateListCategoryLaptops();
    }

    @Then("user see display list product base category {string}")
    public void userSeeDisplayListProductBaseCategory(String productCategoryName) {

        if (productCategoryName == "Phone") {

            HomePage = new homePage(driver);
            HomePage.validateListCategoryPhones();
        } else if (productCategoryName == "Laptops") {

            HomePage = new homePage(driver);
            HomePage.validateListCategoryLaptops();
        } else if (productCategoryName == "Monitors") {

            HomePage = new homePage(driver);
            HomePage.validateListCategoryMonitors();
        }

    }
}


