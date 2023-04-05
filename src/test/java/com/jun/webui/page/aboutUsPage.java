package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class aboutUsPage {
    WebDriver driver;

    By headTextAboutUs = By.id("videoModalLabel");

    By playButtonVideo = By.xpath("/html/body");

    By fullScreenButton = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]/span[1]");

    By nonFullScreenVideoButton = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]/span[1]");

    By closeButtonAbout = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");

    public aboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public aboutUsPage() {
    }

    public void clickPlayButtonVideo() throws InterruptedException {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(playButtonVideo));

        driver.findElement(playButtonVideo).click();
        //play video on 5 second
        Thread.sleep(5000);
    }

    public void clickFullScreenVideo() {
        driver.findElement(fullScreenButton).click();
    }

    public void clickNonFullScreenVideo() {
        driver.findElement(nonFullScreenVideoButton).click();
    }


    public void clickCloseButtonAbout() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeButtonAbout));

        driver.findElement(closeButtonAbout).click();
    }

    public void validateOnAboutUsPage() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(headTextAboutUs));


        String textHeadAbboutUs = driver.findElement(headTextAboutUs).getText();
        assertEquals("About us", textHeadAbboutUs);

    }

}
