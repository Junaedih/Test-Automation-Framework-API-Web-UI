package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class placeOrderPage {

    WebDriver driver;
    //Define object in "Place Order" Page

    By nameInputText = By.id("name");
    By countryInputText = By.id("country");
    By cityInputText = By.id("city");
    By creditCardInputText = By.id("card");
    By monthInputText = By.id("month");
    By yearInputText = By.id("year");
    By purchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");

    public placeOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public placeOrderPage() {
    }

    public void inputName(String name) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(nameInputText));

        driver.findElement(nameInputText).sendKeys(name);

    }

    public void inputCountry(String country) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryInputText));

        driver.findElement(countryInputText).sendKeys(country);

    }

    public void inputCity(String city) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cityInputText));

        driver.findElement(cityInputText).sendKeys(city);

    }

    public void inputCreditCard(String creditCard) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(creditCardInputText));

        driver.findElement(creditCardInputText).sendKeys(creditCard);

    }

    public void inputMonth(String month) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(monthInputText));

        driver.findElement(monthInputText).sendKeys(month);

    }

    public void inputYear(String year) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(yearInputText));

        driver.findElement(yearInputText).sendKeys(year);

    }

    public void clickPurchaseButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(purchaseButton));

        driver.findElement(purchaseButton).click();


    }

    public void clickCloseButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));

        driver.findElement(closeButton).click();

    }

    public void validateAlertMessage(String alert_message) {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertMessageText = driver.switchTo().alert().getText();
        assertEquals(alert_message, alertMessageText);
        driver.switchTo().alert().accept();
    }


}
