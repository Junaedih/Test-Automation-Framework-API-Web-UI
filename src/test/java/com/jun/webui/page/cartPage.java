package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class cartPage {

    WebDriver driver;

    //Define object in cart Page
    By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By totalPrice = By.id("totalp");
    By listProductAtCart = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]");

    By linkTextHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");

    By deletedList1Cart = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a");

    public cartPage(WebDriver driver) {
        this.driver = driver;
    }

    public cartPage() {
    }

    public void clickPlaceOrderButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));

        driver.findElement(placeOrderButton).click();
    }

    public void validateListCart(String product_name_added) {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(listProductAtCart));

        String listTextCart = driver.findElement(listProductAtCart).getText();
        assertTrue(driver.findElement(listProductAtCart).isDisplayed());

    }

    public void validateListCartEmpty() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"tbodyid\"]")));


        // verify list cart empty, value body list cart is blank
        String bodyText = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]")).getText();
        assertEquals("", bodyText);

    }


    public void clickLinkTextHome() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkTextHome));

        driver.findElement(linkTextHome).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nameofuser")));

    }

    public void deletedAllProdutctAtListCart() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        for (int i = 1; i < 20; i++) {
            String bodyText = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]")).getText();
            if (bodyText != "") {

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")));
                driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
                //Thread.sleep(2000);
            } else {

                wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
                driver.findElement(linkTextHome).click();
            }

        }
    }


    public void deletedlist1Cart() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(deletedList1Cart));

        driver.findElement(deletedList1Cart).click();

        wait.until(ExpectedConditions.elementToBeClickable(deletedList1Cart));


    }

    public void validateOnCartPage() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));

        assertTrue(driver.findElement(placeOrderButton).isEnabled());

    }



}

