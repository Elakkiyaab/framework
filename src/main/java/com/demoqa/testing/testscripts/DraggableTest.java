package com.demoqa.testing.testscripts;


import com.demoqa.testing.pageobjects.DraggablePage;
import com.demoqa.testing.pageobjects.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DraggableTest extends BaseClass {
    String screenShotPath="D:/Project/framework/src/main/resources/screenshots/draggable_test/TestResults_";
    @BeforeTest
    public void openUrl() {
        driver.get(TEST_URL);
        draggablepage = new DraggablePage(driver);
        homepage = new HomePage(driver);
        homepage.clickDraggable();
        waitUntillPageLoad();
    }
    @Test
    public void draggableFunction()  {

        Actions act = new Actions(driver);
        WebElement source=draggablepage.clickDrag();
        captureScreenShot(screenShotPath);
        act.dragAndDropBy(source, 140, 18).perform();
        captureScreenShot(screenShotPath);

        //act.dragAndDropBy(from, xoffset, yoffset).perform();

    }

    }


