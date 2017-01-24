package com.demoqa.testing.testscripts;


import com.demoqa.testing.pageobjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ResizeTest extends BaseClass {
    String screenShotPath="D:/Project/framework/src/main/resources/screenshots/droppable_test/TestResults_";
    @BeforeTest
    public void openUrl() {
        driver.get(TEST_URL);
        homepage = new HomePage(driver);
        homepage.clickResizable();
        waitUntillPageLoad();
    }
    @Test
    public void resizeFunction() throws InterruptedException {
        Actions act = new Actions(driver);
        WebElement resizeElement=driver.findElement(By.xpath("//*[@id='resizable']"));
        act.dragAndDropBy(resizeElement, 317, 536).perform();

        captureScreenShot(screenShotPath);




    }
}
