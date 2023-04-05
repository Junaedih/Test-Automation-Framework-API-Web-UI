package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class signUpPages {

    WebDriver driver;


    By usernameInputTextSign = By.id("sign-username");
    By passwordInputTextSign = By.id("sign-password");
    By signUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    By titlePageSignUp = By.id("signInModalLabel");

    public signUpPages(WebDriver driver) {
        this.driver = driver;
    }


    public signUpPages() {

    }

    public void inputUsernameSign(String usernameSign) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputTextSign));

        driver.findElement(usernameInputTextSign).sendKeys(usernameSign);
    }

    public void inputPasswordSign(String passwordSign) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInputTextSign));

        driver.findElement(passwordInputTextSign).sendKeys(passwordSign);
    }

    public void clickSignUpButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));

        driver.findElement(signUpButton).click();


    }


    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));

        driver.findElement(closeButton).click();
    }

    public void validateOnSignUpPage() {

        // implicitly Wait(Duration 20 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInputTextSign));

        assertTrue(driver.findElement(usernameInputTextSign).isEnabled());


    }

    public void validateMessageAppear(String Message) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertSignUpText = driver.switchTo().alert().getText();
        assertEquals(Message, alertSignUpText);
        driver.switchTo().alert().accept();


    }

}
