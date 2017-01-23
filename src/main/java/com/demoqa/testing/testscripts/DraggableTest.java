package com.demoqa.testing.testscripts;


import com.demoqa.testing.pageobjects.HomePage;
import org.testng.annotations.BeforeTest;

public class DraggableTest extends BaseClass {
    @BeforeTest
    public void openUrl() {
        driver.get(TEST_URL);
        huurpage = new HuurPage(driver);
        homepage = new HomePage(driver);
        homepage.clickDraggable();
        waitUntillPageLoad();
    }


}
