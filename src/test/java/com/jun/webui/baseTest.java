package com.jun.webui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class baseTest {
    protected static WebDriver driver;


    // initiate browser driver
    protected void getDriver() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--remote-allow-origins=*");
        //options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        // maximize window browser display
        //driver.manage().window().maximize();

        // implicitly Wait(Duration 20 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));


    }
}
