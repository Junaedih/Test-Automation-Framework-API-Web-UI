package com.jun.webui.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class firstPage {
    WebDriver driver;

    By hyperlinkText_Login = By.id("login2");
    By hyperlinkText_SignUp = By.id("signin2");


    public firstPage(WebDriver driver) {
        this.driver = driver;
    }

    // access to URL https://www.demoblaze.com/
    public void goToFirstPage() {
        driver.get("https://www.demoblaze.com/");

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cat")));
    }

    public void validateOnFirstPage() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // get element attribute to validation URL accessed
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cat")));

        String text = driver.findElement(By.id("cat")).getText();
        String textTitle = driver.getTitle();

        // validation https://www.demoblaze.com/ already accessed
        assertEquals("CATEGORIES", text);
        assertEquals("STORE", textTitle);

    }

    public void click_hyperlinkText_Login() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hyperlinkText_Login));

        driver.findElement(hyperlinkText_Login).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logInModalLabel")));

    }

    public void click_hyperlinkText_SignUp() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hyperlinkText_SignUp));

        driver.findElement(hyperlinkText_SignUp).click();
    }

}
