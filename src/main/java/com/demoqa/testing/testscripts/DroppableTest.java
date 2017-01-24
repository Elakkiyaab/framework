package com.demoqa.testing.testscripts;


import com.demoqa.testing.pageobjects.DropPage;
import com.demoqa.testing.pageobjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DroppableTest extends BaseClass {
    String screenShotPath="D:/Project/framework/src/main/resources/screenshots/droppable_test/TestResults_";
    @BeforeTest
    public void openUrl() {
        driver.get(TEST_URL);
        droppablepage = new DropPage(driver);
        homepage = new HomePage(driver);
        homepage.clickDroppable();
        waitUntillPageLoad();
    }
    @Test
    public void droppableFunction()  {

        Actions act = new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//*[@id='draggableview']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droppableview']"));
        //System.out.println(target.getLocation());

        captureScreenShot(screenShotPath);
        act.dragAndDrop(source, target).build().perform();
        captureScreenShot(screenShotPath);
        String expected=driver.findElement(By.xpath("//*[@id='droppableview']/p")).getText();
        assertEquals("Dropped!",expected);

        //

    }

}
