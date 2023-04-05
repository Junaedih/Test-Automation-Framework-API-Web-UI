package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class contactPage {

    WebDriver driver;

    By addressMailInputText = By.cssSelector("input#recipient-email");
    By contactNameInputText = By.cssSelector("input#recipient-name");
    By messageTextContact = By.id("message-text");
    By sendMessageButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By closeMessageButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");
    By headingTextNewMessage = By.id("exampleModalLabel");


    public contactPage(WebDriver driver) {
        this.driver = driver;
    }

    public contactPage() {
    }


    public void inputEmailAddress(String email) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(addressMailInputText));

        driver.findElement(addressMailInputText).sendKeys(email);

    }

    public void inputName(String name) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(contactNameInputText));

        driver.findElement(contactNameInputText).sendKeys(name);

    }

    public void inputMessage(String message) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(messageTextContact));

        driver.findElement(messageTextContact).sendKeys(message);

    }

    public void clickSendMessageButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageButton));

        driver.findElement(sendMessageButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        String MessageSendContact = driver.switchTo().alert().getText();
        assertEquals("Thanks for the message!!", MessageSendContact);

    }

    public void clickCloseMessageButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(closeMessageButton));

        driver.findElement(closeMessageButton).click();
    }

    public void validateIsOnContactPage() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(headingTextNewMessage));
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageButton));


        String headText = driver.findElement(headingTextNewMessage).getText();
        assertEquals("New message", headText);

    }

    public void validateMessageBox(String messageBox) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        String messageBoxPopUp = driver.switchTo().alert().getText();
        assertEquals(messageBox, messageBoxPopUp);
        driver.switchTo().alert().accept();


    }

}
