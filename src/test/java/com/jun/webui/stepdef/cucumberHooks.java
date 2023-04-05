package com.jun.webui.stepdef;

import com.jun.webui.baseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks extends baseTest {
    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
