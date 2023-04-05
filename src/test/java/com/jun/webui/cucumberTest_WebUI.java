package com.jun.webui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.jun.webui"},
        features = {"src/test/resources/web-ui"},
        plugin = {"pretty", "html:reports/webui/cucumber.html", "json:reports/webui/cucumber.json"})

public class cucumberTest_WebUI {
}
