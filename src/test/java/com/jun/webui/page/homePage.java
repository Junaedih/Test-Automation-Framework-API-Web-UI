package com.jun.webui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class homePage extends loginPage {


    WebDriver driver;

    //define object
    By linkTextLogout = By.id("logout2");
    By linkTextContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By linkTextAboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    By linkTextPhones = By.linkText("Phones");
    By linkTextLaptops = By.linkText("Laptops");
    By linkTextMonitors = By.linkText("Monitors");
    By linkTextHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");


    // define object product phones
    By linkTextSamsungGalaxyS6 = By.linkText("Samsung galaxy s6");
    By linkTextNokiaLumia1520 = By.linkText("Nokia lumia 1520");
    By linkTextNexus6 = By.linkText("Nexus 6");
    By linkTextSamsungGalaxyS7 = By.linkText("Samsung galaxy s7");
    By linkTextIphone6_32gb = By.linkText("Iphone 6 32gb");
    By linkTextSonyXperiaZ5 = By.linkText("Sony xperia z5");
    By linkTextHTCOneM9 = By.linkText("HTC One M9");


    // define object product phones monitors
    By linkTextAppleMonitor24 = By.linkText("Apple monitor 24");
    By linkTextASUSFullHD = By.linkText("ASUS Full HD");


    // Define Object Product Laptops
    By linkTextSonyVaioI5 = By.linkText("Sony vaio i5");
    By linkTextSonyVaioI7 = By.linkText("Sony vaio i7");
    By linkTextMacBookAir = By.linkText("MacBook air");
    By linkTextDellI78gb = By.linkText("Dell i7 8gb");
    By linkText2017Dell156Inch = By.linkText("2017 Dell 15.6 Inch");
    By linkTextMacBookPro = By.linkText("MacBook Pro");

    By listCategoryProduct = By.xpath(" //*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");


    By addToCartButton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By linkTextCart = By.id("cartur");


    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLogout));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nameofuser")));


        // validation proses login already success (on homePage welcome)
        String textWelcomeUser = driver.findElement(By.id("nameofuser")).getAccessibleName();
        String textWelcome = textWelcomeUser.substring(0, 7);

        assertEquals("Welcome", textWelcome);

    }

    public void clickLinkTextLogOut() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLogout));

        driver.findElement(linkTextLogout).click();
    }

    public void clickLinkTextContact() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextContact));

        driver.findElement(linkTextContact).click();
    }

    public void clickLinkTextAboutUs() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextAboutUs));

        driver.findElement(linkTextAboutUs).click();
    }

    public void clickLinkTextPhones() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));


        driver.findElement(linkTextPhones).click();
    }

    public void clickLinkTextLaptops() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));

        driver.findElement(linkTextLaptops).click();
    }

    public void clickLinTextMonitors() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));

        driver.findElement(linkTextMonitors).click();
    }

    public void clickLinkTextSamsungGalaxyS6() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS6));

        driver.findElement(linkTextSamsungGalaxyS6).click();
    }

    public void clickLinkTextNokiaLumia1520() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNokiaLumia1520));

        driver.findElement(linkTextNokiaLumia1520).click();
    }

    public void clickLinkTextNexus6() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNexus6));

        driver.findElement(linkTextNexus6).click();
    }

    public void clickLinkTextSamsungGalaxyS7() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS7));

        driver.findElement(linkTextSamsungGalaxyS7).click();
    }

    public void clickLinkTextIphone6_32gb() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextIphone6_32gb));

        driver.findElement(linkTextIphone6_32gb).click();
    }

    public void clickLinkTextSonyXperiaZ5() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyXperiaZ5));

        driver.findElement(linkTextSonyXperiaZ5).click();
    }

    public void clickLinkTextHTCOneM9() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextHTCOneM9));

        driver.findElement(linkTextHTCOneM9).click();
    }

    public void clickLinkTextAppleMonitor24() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextAppleMonitor24));

        driver.findElement(linkTextAppleMonitor24).click();
    }

    public void clickLinkTextASUSFullHD() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextASUSFullHD));

        driver.findElement(linkTextASUSFullHD).click();

    }

    public void clickLinkTextSonyVaioI5() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI5));

        driver.findElement(linkTextSonyVaioI5).click();
    }


    public void clickLinkTextSonyVaioI7() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI7));

        driver.findElement(linkTextSonyVaioI7).click();
    }

    public void clickLinkTextMacBookAir() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookAir));

        driver.findElement(linkTextMacBookAir).click();
    }

    public void clickLinkTextDellI78gb() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextDellI78gb));

        driver.findElement(linkTextDellI78gb).click();
    }

    public void clickLinkText2017Dell156Inch() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkText2017Dell156Inch));

        driver.findElement(linkText2017Dell156Inch).click();
    }

    public void clickLinkTextMacBookPro() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookPro));

        driver.findElement(linkTextMacBookPro).click();
    }

    public void clickAddToCartButton() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));

        driver.findElement(addToCartButton).click();
    }

    public void clickLinkTextCart() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextCart));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkTextCart));

        driver.findElement(linkTextCart).click();
    }

    public void validateListCategoryPhones() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(listCategoryProduct));

        String productName = driver.findElement(listCategoryProduct).getText();
        assertEquals("Samsung galaxy s6", productName);

    }

    public void validateListCategoryLaptops() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextSonyVaioI5));

        String productLaptop = driver.findElement(linkTextSonyVaioI5).getText();
        assertEquals("Sony vaio i5", productLaptop);

    }

    public void validateListCategoryMonitors() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextAppleMonitor24));

        String productName = driver.findElement(listCategoryProduct).getText();
        assertEquals("Apple monitor 24", productName);

    }

    public void clickLinkTextHome() {
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));

        driver.findElement(linkTextHome).click();

    }


    public void addProductPhonesToCart() throws InterruptedException {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // add product phone "Samsung Galaxy S6" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS6));
        driver.findElement(linkTextSamsungGalaxyS6).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "Nokia Lumia 1520" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextNokiaLumia1520));
        driver.findElement(linkTextNokiaLumia1520).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "Nexus 6" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextNexus6));
        driver.findElement(linkTextNexus6).click();


        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();


        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "Samsung Galaxy S7" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGalaxyS7));
        driver.findElement(linkTextSamsungGalaxyS7).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "Iphone 6 32gb" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextIphone6_32gb));
        driver.findElement(linkTextIphone6_32gb).click();


        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "Sony Xperia Z5" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyXperiaZ5));
        driver.findElement(linkTextSonyXperiaZ5).click();


        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();


        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product phone "HTC One M9" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        driver.findElement(linkTextPhones).click();


        wait.until(ExpectedConditions.elementToBeClickable(linkTextHTCOneM9));
        driver.findElement(linkTextHTCOneM9).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

    }


    public void addProductLaptopsToCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // add product laptop "Sony Vaio I5" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI5));
        driver.findElement(linkTextSonyVaioI5).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product laptop "Sony Vaio I7" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyVaioI7));
        driver.findElement(linkTextSonyVaioI7).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product laptop "MacBook Air" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookAir));
        driver.findElement(linkTextMacBookAir).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

        // add product laptop "Dell I7 8gb" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextDellI78gb));
        driver.findElement(linkTextDellI78gb).click();
        //Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();


        // add product laptop "2017 Dell 15.6 Inch" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkText2017Dell156Inch));
        driver.findElement(linkText2017Dell156Inch).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

        // add product laptop "MacBook Pro" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        driver.findElement(linkTextLaptops).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextMacBookPro));
        driver.findElement(linkTextMacBookPro).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

    }

    public void addProductMonitorsToCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // add product monitor "Apple Monitor 24" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));
        driver.findElement(linkTextMonitors).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextAppleMonitor24));
        driver.findElement(linkTextAppleMonitor24).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

        // add product monitor "ASUS Full HD" to cart
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));
        driver.findElement(linkTextMonitors).click();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextASUSFullHD));
        driver.findElement(linkTextASUSFullHD).click();

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.elementToBeClickable(linkTextHome));
        driver.findElement(linkTextHome).click();

    }


}



