package com.jun.api;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.jun"},
        features = {"src/test/resources"},
        plugin = {"pretty", "html:reports/api/cucumber.html", "json:reports/api/cucumber.json"})

public class cucumberTestApi {

}
