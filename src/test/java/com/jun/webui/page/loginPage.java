package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginPage {


    WebDriver driver;

    By usernameInputText = By.id("loginusername");
    By passwordInputText = By.id("loginpassword");

    By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    By titlePageLogin = By.id("logInModalLabel");


    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public loginPage() {
    }

    public void inputUsername(String username) {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputText));

        driver.findElement(usernameInputText).sendKeys(username);

    }

    public void inputPassword(String password) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInputText));

        driver.findElement(passwordInputText).sendKeys(password);

    }

    public void clickLoginButton() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        driver.findElement(loginButton).click();
     }

    public void clickCloseButton() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));

        driver.findElement(closeButton).click();

    }


    public void validateOnLoginPages() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputText));

        assertTrue(driver.findElement(usernameInputText).isEnabled());

    }

    public void validateErrorAppear(String errorMessage) {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertLoginText = driver.switchTo().alert().getText();
        assertEquals(errorMessage, alertLoginText);
        driver.switchTo().alert().accept();


    }

    public void validateOnLoginPage() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(titlePageLogin));

        WebElement productElement = driver.findElement(usernameInputText);
        assertTrue(productElement.isDisplayed());
        assertEquals("Log In", productElement.getText());
    }

}
